package com.kirkbushman.auth.models.creds

import android.os.Parcelable
import com.kirkbushman.auth.models.base.Credentials
import kotlinx.parcelize.Parcelize

@Parcelize
class ScriptCredentials(

    val username: String,
    val password: String,

    override val clientId: String,
    val clientSecret: String

) : Parcelable, Credentials
