import express, { Request, Response } from "express";

const app = express();

const port = 3000;

app.get("/", (req: Request, res: Response) => {
	return res.status(200).json({
		success: true,
		message: "API is running",
	});
});

app.listen(port, () => {
	console.log(`API is running on http://localhost:${port}`);
});
