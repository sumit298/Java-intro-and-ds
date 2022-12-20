public class _733_Flood_Fill {
    public static int[][] floodFill(int [][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor != newColor) {
            dfs(image, sr, sc, oldColor, newColor);
        }
        return image;
    }

    public static void dfs(int [][] image, int sr, int sc, int oldColor, int newColor) {
        if (image[sr][sc] == oldColor) {
            image[sr][sc] = newColor;
            if (sr >= 1) {
                dfs(image, sr - 1, sc, oldColor, newColor);
            }
            if (sc >= 1) {
                dfs(image, sr, sc - 1, oldColor, newColor);
            }
            if (sr + 1 < image.length) {
                dfs(image, sr + 1, sc, oldColor, newColor);
            }
            if (sc + 1 < image[0].length) {
                dfs(image, sr, sc + 1, oldColor, newColor);
            }
        }
    }
}
