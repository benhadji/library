package org.WebService.business.contract.manager;



import org.webservice.service.services.Borrow;

import java.util.List;

public interface BorrowManager {

    void updateBorrow(Borrow borrow);

    void deleteBorrow(Borrow borrow);

    Borrow getBorrow(Borrow borrow);

    List<Borrow> getBorrowByISBN(Integer ISBN);

    List<Borrow> listBorrow(Borrow borrow);

    List<Borrow> getListBorrowByTimeExceeded();
    List<Borrow> getBorrowByUserEmail(String email);

    void markAsExtended(Borrow borrow);
    Borrow getById(Integer id);



}
