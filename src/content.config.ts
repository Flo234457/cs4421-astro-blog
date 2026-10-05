import { defineCollection } from 'astro:content';
import { z } from 'astro/zod';
const blog = defineCollection({
schema: z.object({
title: z.string(),
pubDate: z.date(),
author: z.string(),
// tags: z.array(z.string()).default([]),
}),
});
export const collections = { blog };