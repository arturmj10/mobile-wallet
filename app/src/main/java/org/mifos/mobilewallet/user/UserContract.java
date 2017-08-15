package org.mifos.mobilewallet.user;

import org.mifos.mobilewallet.base.BasePresenter;
import org.mifos.mobilewallet.base.BaseView;

import mifos.org.mobilewallet.core.domain.model.ClientDetails;

/**
 * Created by naman on 22/6/17.
 */

public interface UserContract {

    interface  UserDetailsView extends BaseView<UserDetailsPresenter> {

        void showUserDetails(ClientDetails clientDetails);
        void showPanStatus(boolean status);
    }

    interface UserDetailsPresenter extends BasePresenter {

        void getUserDetails();
        void verifyPan(String number);
    }
}
