package io.ptrojan.paginationHelper;

import java.util.List;

public class PaginationHelper<I> {
    private final int itemsPerPage;
    private final int itemCount;
    private final int pageCount;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
        this.itemCount = collection != null ? collection.size() : 0;
        this.pageCount = itemCount % itemsPerPage == 0 ? itemCount / itemsPerPage : (itemCount / itemsPerPage) + 1;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return itemCount;
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return pageCount;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        int pageNumber = pageIndex + 1;
        if (pageNumber > pageCount || pageNumber <= 0) {
            return -1;
        }
        if (pageNumber < pageCount) {
            return itemsPerPage;
        }
        int result = itemCount % itemsPerPage;
        return result == 0 ? itemsPerPage : result;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        int itemNumber = itemIndex + 1;
        if (itemNumber > itemCount || itemNumber <= 0) {
            return -1;
        }
        int pageNumber = itemNumber % itemsPerPage == 0 ? itemNumber / itemsPerPage : (itemNumber / itemsPerPage) + 1;
        return pageNumber - 1;
    }
}