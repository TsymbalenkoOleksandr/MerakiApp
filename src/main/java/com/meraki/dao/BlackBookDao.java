package com.meraki.dao;

import com.meraki.entity.BlackBook;

import java.util.List;

/**
 * Created by Verlamov on 20.03.17.
 */
public interface BlackBookDao {

    long createBlackBook(BlackBook blackBook);

    BlackBook updateBlackBook(BlackBook blackBook);

    void deleteBlackBook(long id);

    List<BlackBook> getAllBlackBooks();

    BlackBook getBlackBook(long id);


}