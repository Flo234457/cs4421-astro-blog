import { defineCollection, reference } from 'astro:content';
import { z } from 'astro/zod';
import { glob } from 'astro/loaders';

const authors = defineCollection({
	loader: glob({ base: './src/content/authors', pattern: '**/*.md' }),
	schema: ({ image }) =>
		z.object({
			name: z.string(),
			bio: z.string(),
			avatar: image(),
			socialLinks: z.array(
				z.object({
					label: z.string(),
					url: z.string(),
				}),
			),
		}),
});

const blog = defineCollection({
	loader: glob({ base: './src/content/blog', pattern: '**/*.{md,mdx}' }),
	schema: ({ image }) =>
		z.object({
			title: z.string(),
			description: z.string(),
			pubDate: z.coerce.date(),
			updatedDate: z.coerce.date().optional(),
			heroImage: image(),
			author: reference('authors'),
		}),
});
export const collections = { authors, blog };