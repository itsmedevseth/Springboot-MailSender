package com.mailrestapi.mailrestapi.Service;

import com.mailrestapi.mailrestapi.Model.Email;
import com.mailrestapi.mailrestapi.Model.Respone;

public interface EmailService {
    Respone sendEmail(Email email);
}
