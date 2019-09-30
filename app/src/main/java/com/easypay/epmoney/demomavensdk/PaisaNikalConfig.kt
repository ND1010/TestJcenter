/**
 *Created by dhruv on 12-09-2019.
 */
package com.easypay.epmoney.demomavensdk

/**
 *Created by dhruv on 12-09-2019.
 */
class PaisaNikalConfig {

    interface ApiHeaders {
        companion object {

            const val API_TYPE_JSON = "application/json"
            const val AUTHORIZATION = "authorization"
        }
    }

    interface ApiResponse {
        companion object {
            const val RES_STATUS_OK: Int = 200
            const val RES_STATUS_OK_300: Int = 300
            const val RES_STATUS_OK_301: Int = 301
            const val RES_STATUS_ERROR_501: Int = 501
            const val RES_STATUS_ERROR_601: Int = 601
        }
    }

    interface ApiMethods {
        companion object {
            const val CHEKC_AGENT = "web-mpm/guest/android/agentsdklogin"
            const val GET_BANK_LIST = "aepsappctx/guest/mobileapp/getallbank"
            const val CHEKC_AEPS_BALANCE = "aepsappctx/guest/mobileapp/txn/aeps-balanceinfo"
            const val AEPS_BALANCE_WITHDRAWAL = "aepsappctx/guest/mobileapp/txn/aeps-accountwithdrawal"
            const val ATM_BALANCE_CHECk = "aepsappctx/guest/mobileapp/txn/finomicroatm-balanceinfo"
            const val ATM_CASH_WITHDRAWAL = "aepsappctx/guest/mobileapp/txn/finomicroatm-withdrawal"
            const val FINO_AEPS_BALANCE_CHECk = "aepsappctx/guest/mobileapp/txn/finoaeps-balnceinfo"
            const val FINO_AEPS_CASH_WITHDRAWAL = "aepsappctx/guest/mobileapp/txn/finoaeps-withdrawal"
        }
    }

    interface UI {
        companion object {
            val SCREEN_TRANSACTION_FAIL: String ="SCREEN_TRANSACTION_FAIL"
            val MICRO_ATM_BALANCE: String ="MICRO_ATM_BALANCE"
            val MICRO_ATM_WITHDRAWAL: String ="MICRO_ATM_WITHDRAWAL"
            val MICRO_AEPS_BALANCE_INQUIRY: String ="MICRO_AEPS_BALANCE_INQUIRY"
            val MICRO_AEPS_CASH_WITHDRAWAL: String ="MICRO_AEPS_CASH_WITHDRAWAL"
            val TRANSACTION_ID: String ="TRANSACTION_ID"
            const val AEPSBALANCECHECKDETAILINFO = "AepsBalanceCheckDetailInfo"
            const val AEPSWITHDRAWCHECKDETAILINFO = "AepsWithdrawCheckDetailInfo"
            const val CONFIG = "config"
            const val API_REQUEST = "api_request"
            const val MY_PERMISSIONS_REQUEST_CAMERA = 101
            const val SCREEN_QR_CODE_SCAN = 102
            const val CODE_SELECT_BANK = 103
            const val FINGERSCAN_CODE = 104
            const val REQUEST_FOR_AEPS = 105
            const val REQUEST_FOR_MICRO_ATM = 106
            const val AEPS_RESPONSE = "aeps_response"
            const val SELECT_BANK = "SelectedBank"
            const val AEPS_TRANSACTION = "AEPS_TRANSACTION"
            const val AEPS_TRANSACTION_TYPE = "AEPS_TRANSACTION_TYPE"
            const val AEPS_WITHDRAWAL = "AEPS_WITHDRAWAL"
            const val MOBILE_NUMBER = "MOBILE_NUMBER"
            const val FINO_TRANSACTION_RESPONSE = "FINO_TRANSACTION_RESPONSE"
        }
    }

    interface ApiServices {
        companion object {
            const val AEPS_CASH_WITHDRAW: Int = 1
            const val AEPS_BALANCE_INQUIRY = 2
            const val MATM_CREDIT_DEBIT_TRANSACTION = 3
            const val MATM_CARD_BALANCE_INQUIRY = 4
            const val YBL_AEPS__BALANCE_INQUIRY = 10
            const val YBL_AEPS__CASH_WITHDRAW = 11
        }
    }

    interface Config {
        companion object {
            const val ENVIRONMENT_SAND_BOX = "network_sand_box"
            const val ENVIRONMENT_PRODUCTION = "network_production"

            const val PAISA_NIKAL_CONFIG ="paisa_nikal_config"
            const val PAISA_NIKAL_REQUEST ="paisa_nikal_request"
        }
    }

    interface ApiTransactionId{
        companion object {
             const val AEPS_CASH_WITHDRAW = "AW"
             const val AEPS_BALANCE_INQUIRY = "AB"
             const val MATM_CREDIT_DEBIT_TRANSACTION = "MAW"
             const val MATM_CARD_BALANCE_INQUIRY = "MAB"
             const val YBL_AEPS__BALANCE_INQUIRY = "AB"
             const val YBL_AEPS__CASH_WITHDRAW = "AW"
        }
    }

    interface FINO_API_PARAM_VALUES {
        companion object {
            val CLIENT_REQUEST_ENCRYPTION_KEY = "75fc2c89-93aa-4a3a-a88b-c4670d05677b"
            val CLIENT_HEADER_ENCRYPTION_KEY = "982b0d01-b262-4ece-a2a2-45be82212ba1"
            //Merchant id provided by FINO
            val MERCHANT_ID = "9033891671"//9408684448
            val RETURN_URL = "http://uat5yesmoney.easypay.co.in:5050/web-mpm/rest/finomatm/withdrawalcallback"
            val VERSION = "1000"
            val CLIENTID = "76"
            val AUTHKEY = "11b4c321-27ed-4f59-ae03-a0a3dee6bd15"
        }
    }

}
