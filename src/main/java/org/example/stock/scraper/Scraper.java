package org.example.stock.scraper;

import org.example.stock.model.Company;
import org.example.stock.model.ScrapedResult;

public interface Scraper {

    Company scrapCompanyByTicker(String ticker);
    ScrapedResult scrap(Company company);
}
