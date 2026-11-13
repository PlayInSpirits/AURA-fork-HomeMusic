.class public final Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/xj0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final getChallenge(Lorg/json/JSONObject;)[B
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_CHALLENGE$credentials_play_services_auth_release()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->b64Decode(Ljava/lang/String;)[B

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_0
    new-instance p0, Lorg/json/JSONException;

    .line 26
    .line 27
    const-string p1, "Challenge not found in request or is unexpectedly empty"

    .line 28
    .line 29
    invoke-direct {p0, p1}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p0
.end method

.method private final isDeviceGMSVersionOlderThan(Landroid/content/Context;J)Z
    .locals 3

    .line 1
    sget-object p0, Ldefpackage/ej1;->c:Ldefpackage/ej1;

    .line 2
    .line 3
    sget v0, Ldefpackage/fj1;->a:I

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Ldefpackage/fj1;->b(Landroid/content/Context;I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    const/16 v1, 0x1c

    .line 23
    .line 24
    const-string v2, "com.google.android.gms"

    .line 25
    .line 26
    if-lt p1, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, v2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$GetGMSVersion;->getVersionLong(Landroid/content/pm/PackageInfo;)J

    .line 36
    .line 37
    .line 38
    move-result-wide p0

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p0, v2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 45
    .line 46
    int-to-long p0, p0

    .line 47
    :goto_0
    cmp-long p0, p0, p2

    .line 48
    .line 49
    if-lez p0, :cond_2

    .line 50
    .line 51
    const/4 p0, 0x1

    .line 52
    return p0

    .line 53
    :cond_2
    return v0
.end method


# virtual methods
.method public final addAuthenticatorAttestationResponse$credentials_play_services_auth_release([B[B[Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, Lorg/json/JSONObject;

    .line 14
    .line 15
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p0, p1}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->b64Encode([B)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0, p2}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->b64Encode([B)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-instance p2, Lorg/json/JSONArray;

    .line 45
    .line 46
    invoke-direct {p2, p3}, Lorg/json/JSONArray;-><init>(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_RESPONSE$credentials_play_services_auth_release()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p4, p0, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final b64Decode(Ljava/lang/String;)[B
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 p0, 0xb

    .line 5
    .line 6
    invoke-static {p1, p0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public final b64Encode([B)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 p0, 0xb

    .line 5
    .line 6
    invoke-static {p1, p0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public final beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(Ldefpackage/c21;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getOrderedErrorCodeToExceptions$credentials_play_services_auth_release()Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ldefpackage/h;

    .line 13
    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    new-instance p0, Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;

    .line 17
    .line 18
    new-instance p1, Ldefpackage/h;

    .line 19
    .line 20
    const/16 v0, 0x1a

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ldefpackage/h;-><init>(I)V

    .line 23
    .line 24
    .line 25
    const-string v0, "unknown fido gms exception - "

    .line 26
    .line 27
    invoke-static {v0, p2}, Ldefpackage/xa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-direct {p0, p1, p2}, Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;-><init>(Ldefpackage/h;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    sget-object v0, Ldefpackage/c21;->y:Ldefpackage/c21;

    .line 36
    .line 37
    if-ne p1, v0, :cond_1

    .line 38
    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    const-string p1, "Unable to get sync account"

    .line 42
    .line 43
    invoke-static {p2, p1}, Ldefpackage/qm4;->o0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    const/4 v0, 0x1

    .line 48
    if-ne p1, v0, :cond_1

    .line 49
    .line 50
    new-instance p0, Landroidx/credentials/exceptions/GetCredentialCancellationException;

    .line 51
    .line 52
    const-string p1, "Passkey retrieval was cancelled by the user."

    .line 53
    .line 54
    invoke-direct {p0, p1}, Landroidx/credentials/exceptions/GetCredentialCancellationException;-><init>(Ljava/lang/CharSequence;)V

    .line 55
    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_1
    new-instance p1, Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;

    .line 59
    .line 60
    invoke-direct {p1, p0, p2}, Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;-><init>(Ldefpackage/h;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object p1
.end method

.method public final checkAlgSupported(I)Z
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p1}, Ldefpackage/bx;->a(I)Ldefpackage/bx;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0

    .line 6
    :catchall_0
    const/4 p0, 0x0

    .line 7
    return p0
.end method

.method public final convert(Ldefpackage/of0;Landroid/content/Context;)Ldefpackage/xr3;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public final convertJSON$credentials_play_services_auth_release(Lorg/json/JSONObject;)Ldefpackage/xr3;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v2, Ldefpackage/wr3;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->parseRequiredChallengeAndUser$credentials_play_services_auth_release(Lorg/json/JSONObject;Ldefpackage/wr3;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->parseRequiredRpAndParams$credentials_play_services_auth_release(Lorg/json/JSONObject;Ldefpackage/wr3;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(Lorg/json/JSONObject;Ldefpackage/wr3;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->parseOptionalTimeout$credentials_play_services_auth_release(Lorg/json/JSONObject;Ldefpackage/wr3;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(Lorg/json/JSONObject;Ldefpackage/wr3;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->parseOptionalExtensions$credentials_play_services_auth_release(Lorg/json/JSONObject;Ldefpackage/wr3;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Ldefpackage/xr3;

    .line 32
    .line 33
    iget-object v4, v2, Ldefpackage/wr3;->a:Ldefpackage/as3;

    .line 34
    .line 35
    iget-object v5, v2, Ldefpackage/wr3;->b:Ldefpackage/cs3;

    .line 36
    .line 37
    iget-object v6, v2, Ldefpackage/wr3;->c:[B

    .line 38
    .line 39
    iget-object v7, v2, Ldefpackage/wr3;->d:Ljava/util/ArrayList;

    .line 40
    .line 41
    iget-object v8, v2, Ldefpackage/wr3;->e:Ljava/lang/Double;

    .line 42
    .line 43
    iget-object v9, v2, Ldefpackage/wr3;->f:Ljava/util/ArrayList;

    .line 44
    .line 45
    iget-object v10, v2, Ldefpackage/wr3;->g:Ldefpackage/nn;

    .line 46
    .line 47
    iget-object v0, v2, Ldefpackage/wr3;->h:Ldefpackage/hl;

    .line 48
    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    :goto_0
    move-object v13, v0

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    iget-object v0, v0, Ldefpackage/hl;->n:Ljava/lang/String;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :goto_1
    iget-object v14, v2, Ldefpackage/wr3;->i:Ldefpackage/gn;

    .line 58
    .line 59
    const/4 v15, 0x0

    .line 60
    const/16 v16, 0x0

    .line 61
    .line 62
    const/4 v11, 0x0

    .line 63
    const/4 v12, 0x0

    .line 64
    invoke-direct/range {v3 .. v16}, Ldefpackage/xr3;-><init>(Ldefpackage/as3;Ldefpackage/cs3;[BLjava/util/ArrayList;Ljava/lang/Double;Ljava/util/ArrayList;Ldefpackage/nn;Ljava/lang/Integer;Ldefpackage/su4;Ljava/lang/String;Ldefpackage/gn;Ljava/lang/String;Landroid/os/ResultReceiver;)V

    .line 65
    .line 66
    .line 67
    return-object v3
.end method

.method public final convertToPlayAuthPasskeyJsonRequest(Ldefpackage/ph1;)Ldefpackage/zr;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public final convertToPlayAuthPasskeyRequest(Ldefpackage/ph1;)Ldefpackage/as;
    .locals 0
    .annotation runtime Ldefpackage/zo0;
    .end annotation

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public final getJSON_KEY_ALG$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_ALG$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_APPID$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_APPID$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_ATTESTATION$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_ATTESTATION$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_ATTESTATION_OBJ$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_AUTH_ATTACHMENT$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_AUTH_DATA$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_AUTH_SELECTION$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_CHALLENGE$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_CHALLENGE$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_CLIENT_DATA$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_CLIENT_EXTENSION_RESULTS$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_CRED_PROPS$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_DISPLAY_NAME$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_EXCLUDE_CREDENTIALS$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_EXTENSTIONS$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_ICON$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_ICON$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_ID$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_ID$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_KEY_PROTECTION_TYPE$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_MATCHER_PROTECTION_TYPE$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_NAME$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_NAME$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_PUB_KEY_CRED_PARAMS$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_RAW_ID$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_RAW_ID$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_REQUIRE_RES_KEY$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_RESPONSE$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_RESPONSE$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_RES_KEY$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_RES_KEY$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_RK$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_RK$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_RP$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_RP$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_RPID$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_RPID$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_SIGNATURE$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_SIGNATURE$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_THIRD_PARTY_PAYMENT$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_TIMEOUT$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_TIMEOUT$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_TRANSPORTS$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_TYPE$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_TYPE$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_USER$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_USER$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_USER_HANDLE$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getJSON_KEY_USER_VERIFICATION_METHOD$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getOrderedErrorCodeToExceptions$credentials_play_services_auth_release()Ljava/util/LinkedHashMap;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashMap<",
            "Ldefpackage/c21;",
            "Ldefpackage/h;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->access$getOrderedErrorCodeToExceptions$cp()Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(Lorg/json/JSONObject;Ldefpackage/wr3;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_RES_KEY$credentials_play_services_auth_release()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v2, ""

    .line 39
    .line 40
    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v4, 0x0

    .line 52
    if-lez v3, :cond_0

    .line 53
    .line 54
    invoke-static {v1}, Ldefpackage/l04;->a(Ljava/lang/String;)Ldefpackage/l04;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move-object v1, v4

    .line 60
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p1, p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-lez p1, :cond_1

    .line 80
    .line 81
    invoke-static {p0}, Ldefpackage/gl;->a(Ljava/lang/String;)Ldefpackage/gl;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    goto :goto_1

    .line 86
    :cond_1
    move-object p0, v4

    .line 87
    :goto_1
    new-instance p1, Ldefpackage/nn;

    .line 88
    .line 89
    if-nez p0, :cond_2

    .line 90
    .line 91
    move-object p0, v4

    .line 92
    goto :goto_2

    .line 93
    :cond_2
    iget-object p0, p0, Ldefpackage/gl;->n:Ljava/lang/String;

    .line 94
    .line 95
    :goto_2
    if-nez v1, :cond_3

    .line 96
    .line 97
    move-object v1, v4

    .line 98
    goto :goto_3

    .line 99
    :cond_3
    iget-object v1, v1, Ldefpackage/l04;->n:Ljava/lang/String;

    .line 100
    .line 101
    :goto_3
    invoke-direct {p1, p0, v0, v4, v1}, Ldefpackage/nn;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iput-object p1, p2, Ldefpackage/wr3;->g:Ldefpackage/nn;

    .line 105
    .line 106
    :cond_4
    return-void
.end method

.method public final parseOptionalExtensions$credentials_play_services_auth_release(Lorg/json/JSONObject;Ldefpackage/wr3;)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p0 .. p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    invoke-virtual/range {p0 .. p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual/range {p0 .. p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_APPID$credentials_play_services_auth_release()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, ""

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const/4 v3, 0x0

    .line 45
    if-lez v2, :cond_0

    .line 46
    .line 47
    new-instance v2, Ldefpackage/s61;

    .line 48
    .line 49
    invoke-direct {v2, v1}, Ldefpackage/s61;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    move-object v5, v2

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move-object v5, v3

    .line 55
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    const/4 v4, 0x1

    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    new-instance v1, Ldefpackage/pj1;

    .line 68
    .line 69
    invoke-direct {v1, v4}, Ldefpackage/pj1;-><init>(Z)V

    .line 70
    .line 71
    .line 72
    move-object v13, v1

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    move-object v13, v3

    .line 75
    :goto_1
    const-string v1, "uvm"

    .line 76
    .line 77
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    new-instance v3, Ldefpackage/y25;

    .line 84
    .line 85
    invoke-direct {v3, v4}, Ldefpackage/y25;-><init>(Z)V

    .line 86
    .line 87
    .line 88
    :cond_2
    move-object v7, v3

    .line 89
    new-instance v4, Ldefpackage/gn;

    .line 90
    .line 91
    const/16 v16, 0x0

    .line 92
    .line 93
    const/4 v6, 0x0

    .line 94
    const/4 v8, 0x0

    .line 95
    const/4 v9, 0x0

    .line 96
    const/4 v10, 0x0

    .line 97
    const/4 v11, 0x0

    .line 98
    const/4 v12, 0x0

    .line 99
    const/4 v14, 0x0

    .line 100
    const/4 v15, 0x0

    .line 101
    invoke-direct/range {v4 .. v16}, Ldefpackage/gn;-><init>(Ldefpackage/s61;Ldefpackage/rk5;Ldefpackage/y25;Ldefpackage/wk5;Ldefpackage/gh5;Ldefpackage/hh5;Ldefpackage/uk5;Ldefpackage/kh5;Ldefpackage/pj1;Ldefpackage/mh5;Ldefpackage/nh5;Ldefpackage/lh5;)V

    .line 102
    .line 103
    .line 104
    move-object/from16 v0, p2

    .line 105
    .line 106
    iput-object v4, v0, Ldefpackage/wr3;->i:Ldefpackage/gn;

    .line 107
    .line 108
    :cond_3
    return-void
.end method

.method public final parseOptionalTimeout$credentials_play_services_auth_release(Lorg/json/JSONObject;Ldefpackage/wr3;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_TIMEOUT$credentials_play_services_auth_release()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_TIMEOUT$credentials_play_services_auth_release()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 22
    .line 23
    .line 24
    move-result-wide p0

    .line 25
    long-to-double p0, p0

    .line 26
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    div-double/2addr p0, v0

    .line 32
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    iput-object p0, p2, Ldefpackage/wr3;->e:Ljava/lang/Double;

    .line 37
    .line 38
    :cond_0
    return-void
.end method

.method public final parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(Lorg/json/JSONObject;Ldefpackage/wr3;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_4

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v3, 0x0

    .line 35
    move v4, v3

    .line 36
    :goto_0
    if-ge v4, v2, :cond_4

    .line 37
    .line 38
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_ID$credentials_play_services_auth_release()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v6}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->b64Decode(Ljava/lang/String;)[B

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_TYPE$credentials_play_services_auth_release()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    if-eqz v8, :cond_3

    .line 73
    .line 74
    array-length v8, v6

    .line 75
    if-eqz v8, :cond_2

    .line 76
    .line 77
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-eqz v8, :cond_0

    .line 86
    .line 87
    new-instance v8, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    invoke-virtual {v5, v9}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 101
    .line 102
    .line 103
    move-result v9

    .line 104
    move v10, v3

    .line 105
    :goto_1
    if-ge v10, v9, :cond_1

    .line 106
    .line 107
    :try_start_0
    invoke-virtual {v5, v10}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    invoke-static {v11}, Lcom/google/android/gms/fido/common/Transport;->a(Ljava/lang/String;)Lcom/google/android/gms/fido/common/Transport;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/android/gms/fido/common/Transport$UnsupportedTransportException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    .line 117
    .line 118
    add-int/lit8 v10, v10, 0x1

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :catch_0
    move-exception p0

    .line 122
    new-instance p1, Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;

    .line 123
    .line 124
    new-instance p2, Ldefpackage/h;

    .line 125
    .line 126
    const/4 v0, 0x4

    .line 127
    invoke-direct {p2, v0}, Ldefpackage/h;-><init>(I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-direct {p1, p2, p0}, Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;-><init>(Ldefpackage/h;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw p1

    .line 138
    :cond_0
    const/4 v8, 0x0

    .line 139
    :cond_1
    new-instance v5, Ldefpackage/yr3;

    .line 140
    .line 141
    invoke-direct {v5, v7, v6, v8}, Ldefpackage/yr3;-><init>(Ljava/lang/String;[BLjava/util/ArrayList;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    add-int/lit8 v4, v4, 0x1

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_2
    new-instance p0, Lorg/json/JSONException;

    .line 151
    .line 152
    const-string p1, "PublicKeyCredentialDescriptor id value is not found or unexpectedly empty"

    .line 153
    .line 154
    invoke-direct {p0, p1}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p0

    .line 158
    :cond_3
    new-instance p0, Lorg/json/JSONException;

    .line 159
    .line 160
    const-string p1, "PublicKeyCredentialDescriptor type value is not found or unexpectedly empty"

    .line 161
    .line 162
    invoke-direct {p0, p1}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw p0

    .line 166
    :cond_4
    iput-object v0, p2, Ldefpackage/wr3;->f:Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_ATTESTATION$credentials_play_services_auth_release()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    const-string v0, "none"

    .line 173
    .line 174
    invoke-virtual {p1, p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    if-nez p1, :cond_5

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_5
    move-object v0, p0

    .line 189
    :goto_2
    invoke-static {v0}, Ldefpackage/hl;->a(Ljava/lang/String;)Ldefpackage/hl;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    iput-object p0, p2, Ldefpackage/wr3;->h:Ldefpackage/hl;

    .line 194
    .line 195
    return-void
.end method

.method public final parseRequiredChallengeAndUser$credentials_play_services_auth_release(Lorg/json/JSONObject;Ldefpackage/wr3;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getChallenge(Lorg/json/JSONObject;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ldefpackage/ji2;->m(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p2, Ldefpackage/wr3;->c:[B

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_USER$credentials_play_services_auth_release()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_ID$credentials_play_services_auth_release()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->b64Decode(Ljava/lang/String;)[B

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_NAME$credentials_play_services_auth_release()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_ICON$credentials_play_services_auth_release()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const-string v3, ""

    .line 60
    .line 61
    invoke-virtual {p1, p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    array-length p1, v0

    .line 75
    if-eqz p1, :cond_1

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_0

    .line 85
    .line 86
    new-instance p1, Ldefpackage/cs3;

    .line 87
    .line 88
    invoke-direct {p1, v1, p0, v2, v0}, Ldefpackage/cs3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 89
    .line 90
    .line 91
    iput-object p1, p2, Ldefpackage/wr3;->b:Ldefpackage/cs3;

    .line 92
    .line 93
    return-void

    .line 94
    :cond_0
    new-instance p0, Lorg/json/JSONException;

    .line 95
    .line 96
    const-string p1, "PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty"

    .line 97
    .line 98
    invoke-direct {p0, p1}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p0

    .line 102
    :cond_1
    new-instance p0, Lorg/json/JSONException;

    .line 103
    .line 104
    const-string p1, "PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty"

    .line 105
    .line 106
    invoke-direct {p0, p1}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p0

    .line 110
    :cond_2
    new-instance p0, Lorg/json/JSONException;

    .line 111
    .line 112
    const-string p1, "PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty"

    .line 113
    .line 114
    invoke-direct {p0, p1}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p0
.end method

.method public final parseRequiredRpAndParams$credentials_play_services_auth_release(Lorg/json/JSONObject;Ldefpackage/wr3;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_RP$credentials_play_services_auth_release()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_ID$credentials_play_services_auth_release()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_NAME$credentials_play_services_auth_release()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, ""

    .line 28
    .line 29
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_ICON$credentials_play_services_auth_release()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-nez v4, :cond_0

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_5

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_4

    .line 68
    .line 69
    new-instance v4, Ldefpackage/as3;

    .line 70
    .line 71
    invoke-direct {v4, v1, v2, v0}, Ldefpackage/as3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iput-object v4, p2, Ldefpackage/wr3;->a:Ldefpackage/as3;

    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    const/4 v2, 0x0

    .line 94
    :goto_0
    if-ge v2, v1, :cond_3

    .line 95
    .line 96
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_ALG$credentials_play_services_auth_release()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 105
    .line 106
    .line 107
    move-result-wide v5

    .line 108
    long-to-int v5, v5

    .line 109
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getJSON_KEY_TYPE$credentials_play_services_auth_release()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-virtual {v4, v6, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-eqz v6, :cond_2

    .line 125
    .line 126
    invoke-virtual {p0, v5}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->checkAlgSupported(I)Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-eqz v6, :cond_1

    .line 131
    .line 132
    new-instance v6, Ldefpackage/zr3;

    .line 133
    .line 134
    invoke-direct {v6, v5, v4}, Ldefpackage/zr3;-><init>(ILjava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_2
    new-instance p0, Lorg/json/JSONException;

    .line 144
    .line 145
    const-string p1, "PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty"

    .line 146
    .line 147
    invoke-direct {p0, p1}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw p0

    .line 151
    :cond_3
    iput-object v0, p2, Ldefpackage/wr3;->d:Ljava/util/ArrayList;

    .line 152
    .line 153
    return-void

    .line 154
    :cond_4
    new-instance p0, Lorg/json/JSONException;

    .line 155
    .line 156
    const-string p1, "PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty"

    .line 157
    .line 158
    invoke-direct {p0, p1}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw p0

    .line 162
    :cond_5
    new-instance p0, Lorg/json/JSONException;

    .line 163
    .line 164
    const-string p1, "PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty"

    .line 165
    .line 166
    invoke-direct {p0, p1}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p0
.end method

.method public final publicKeyCredentialResponseContainsError(Ldefpackage/vr3;)Landroidx/credentials/exceptions/CreateCredentialException;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ldefpackage/vr3;->q:Ldefpackage/kn;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p1, Ldefpackage/vr3;->r:Ldefpackage/jn;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    iget-object v0, p1, Ldefpackage/vr3;->s:Ldefpackage/ln;

    .line 16
    .line 17
    if-eqz v0, :cond_5

    .line 18
    .line 19
    :goto_0
    instance-of p1, v0, Ldefpackage/ln;

    .line 20
    .line 21
    if-eqz p1, :cond_4

    .line 22
    .line 23
    check-cast v0, Ldefpackage/ln;

    .line 24
    .line 25
    iget-object p1, v0, Ldefpackage/ln;->n:Ldefpackage/c21;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->getOrderedErrorCodeToExceptions$credentials_play_services_auth_release()Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ldefpackage/h;

    .line 39
    .line 40
    iget-object v0, v0, Ldefpackage/ln;->o:Ljava/lang/String;

    .line 41
    .line 42
    if-nez p0, :cond_2

    .line 43
    .line 44
    new-instance p0, Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;

    .line 45
    .line 46
    new-instance p1, Ldefpackage/h;

    .line 47
    .line 48
    const/16 v1, 0x1a

    .line 49
    .line 50
    invoke-direct {p1, v1}, Ldefpackage/h;-><init>(I)V

    .line 51
    .line 52
    .line 53
    const-string v1, "unknown fido gms exception - "

    .line 54
    .line 55
    invoke-static {v1, v0}, Ldefpackage/xa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-direct {p0, p1, v0}, Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;-><init>(Ldefpackage/h;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_2
    sget-object v1, Ldefpackage/c21;->y:Ldefpackage/c21;

    .line 64
    .line 65
    if-ne p1, v1, :cond_3

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    const-string p1, "Unable to get sync account"

    .line 70
    .line 71
    invoke-static {v0, p1}, Ldefpackage/qm4;->o0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    const/4 v1, 0x1

    .line 76
    if-ne p1, v1, :cond_3

    .line 77
    .line 78
    new-instance p0, Landroidx/credentials/exceptions/CreateCredentialCancellationException;

    .line 79
    .line 80
    const-string p1, "Passkey registration was cancelled by the user."

    .line 81
    .line 82
    invoke-direct {p0, p1}, Landroidx/credentials/exceptions/CreateCredentialCancellationException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_3
    new-instance p1, Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;

    .line 87
    .line 88
    invoke-direct {p1, p0, v0}, Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;-><init>(Ldefpackage/h;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object p1

    .line 92
    :cond_4
    return-object v1

    .line 93
    :cond_5
    const-string p0, "No response set."

    .line 94
    .line 95
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-object v1
.end method

.method public final toAssertPasskeyResponse(Ldefpackage/td4;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/json/JSONObject;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, Ldefpackage/td4;->v:Ldefpackage/vr3;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz p1, :cond_3

    .line 13
    .line 14
    iget-object v2, p1, Ldefpackage/vr3;->q:Ldefpackage/kn;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v2, p1, Ldefpackage/vr3;->r:Ldefpackage/jn;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v2, p1, Ldefpackage/vr3;->s:Ldefpackage/ln;

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    const-string p0, "No response set."

    .line 30
    .line 31
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_3
    move-object v2, v1

    .line 36
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    instance-of v3, v2, Ldefpackage/ln;

    .line 40
    .line 41
    if-nez v3, :cond_10

    .line 42
    .line 43
    instance-of p0, v2, Ldefpackage/jn;

    .line 44
    .line 45
    if-eqz p0, :cond_f

    .line 46
    .line 47
    :try_start_0
    const-string p0, "clientExtensionResults"

    .line 48
    .line 49
    iget-object v0, p1, Ldefpackage/vr3;->s:Ldefpackage/ln;

    .line 50
    .line 51
    iget-object v2, p1, Ldefpackage/vr3;->p:Ldefpackage/rj5;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    :try_start_1
    new-instance v3, Lorg/json/JSONObject;

    .line 54
    .line 55
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 56
    .line 57
    .line 58
    if-eqz v2, :cond_4

    .line 59
    .line 60
    invoke-virtual {v2}, Ldefpackage/rj5;->j()[B

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    array-length v4, v4

    .line 65
    if-lez v4, :cond_4

    .line 66
    .line 67
    const-string v4, "rawId"

    .line 68
    .line 69
    invoke-virtual {v2}, Ldefpackage/rj5;->j()[B

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v2}, Ldefpackage/ya4;->n([B)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 78
    .line 79
    .line 80
    :cond_4
    iget-object v2, p1, Ldefpackage/vr3;->u:Ljava/lang/String;

    .line 81
    .line 82
    if-eqz v2, :cond_5

    .line 83
    .line 84
    const-string v4, "authenticatorAttachment"

    .line 85
    .line 86
    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 87
    .line 88
    .line 89
    :cond_5
    iget-object v2, p1, Ldefpackage/vr3;->o:Ljava/lang/String;

    .line 90
    .line 91
    if-eqz v2, :cond_6

    .line 92
    .line 93
    if-nez v0, :cond_6

    .line 94
    .line 95
    const-string v4, "type"

    .line 96
    .line 97
    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 98
    .line 99
    .line 100
    :cond_6
    iget-object v2, p1, Ldefpackage/vr3;->n:Ljava/lang/String;

    .line 101
    .line 102
    if-eqz v2, :cond_7

    .line 103
    .line 104
    const-string v4, "id"

    .line 105
    .line 106
    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 107
    .line 108
    .line 109
    :cond_7
    const-string v2, "response"

    .line 110
    .line 111
    iget-object v4, p1, Ldefpackage/vr3;->r:Ldefpackage/jn;

    .line 112
    .line 113
    const/4 v5, 0x1

    .line 114
    if-eqz v4, :cond_8

    .line 115
    .line 116
    invoke-virtual {v4}, Ldefpackage/jn;->b()Lorg/json/JSONObject;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    goto :goto_1

    .line 121
    :cond_8
    iget-object v4, p1, Ldefpackage/vr3;->q:Ldefpackage/kn;

    .line 122
    .line 123
    if-eqz v4, :cond_9

    .line 124
    .line 125
    invoke-virtual {v4}, Ldefpackage/kn;->b()Lorg/json/JSONObject;

    .line 126
    .line 127
    .line 128
    move-result-object v1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 129
    goto :goto_1

    .line 130
    :cond_9
    const/4 v5, 0x0

    .line 131
    if-eqz v0, :cond_b

    .line 132
    .line 133
    :try_start_2
    new-instance v1, Lorg/json/JSONObject;

    .line 134
    .line 135
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 136
    .line 137
    .line 138
    const-string v2, "code"

    .line 139
    .line 140
    iget-object v4, v0, Ldefpackage/ln;->n:Ldefpackage/c21;

    .line 141
    .line 142
    iget v4, v4, Ldefpackage/c21;->n:I

    .line 143
    .line 144
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 145
    .line 146
    .line 147
    iget-object v0, v0, Ldefpackage/ln;->o:Ljava/lang/String;

    .line 148
    .line 149
    if-eqz v0, :cond_a

    .line 150
    .line 151
    const-string v2, "message"

    .line 152
    .line 153
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 154
    .line 155
    .line 156
    :cond_a
    :try_start_3
    const-string v2, "error"

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :catch_0
    move-exception p0

    .line 160
    new-instance p1, Ljava/lang/RuntimeException;

    .line 161
    .line 162
    const-string v0, "Error encoding AuthenticatorErrorResponse to JSON object"

    .line 163
    .line 164
    invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    throw p1

    .line 168
    :cond_b
    :goto_1
    if-eqz v1, :cond_c

    .line 169
    .line 170
    invoke-virtual {v3, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 171
    .line 172
    .line 173
    :cond_c
    iget-object p1, p1, Ldefpackage/vr3;->t:Ldefpackage/hn;

    .line 174
    .line 175
    if-eqz p1, :cond_d

    .line 176
    .line 177
    invoke-virtual {p1}, Ldefpackage/hn;->b()Lorg/json/JSONObject;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-virtual {v3, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_d
    if-eqz v5, :cond_e

    .line 186
    .line 187
    new-instance p1, Lorg/json/JSONObject;

    .line 188
    .line 189
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v3, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 193
    .line 194
    .line 195
    :cond_e
    :goto_2
    :try_start_4
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    return-object p0

    .line 203
    :catchall_0
    move-exception p0

    .line 204
    goto :goto_3

    .line 205
    :catch_1
    move-exception p0

    .line 206
    new-instance p1, Ljava/lang/RuntimeException;

    .line 207
    .line 208
    const-string v0, "Error encoding PublicKeyCredential to JSON object"

    .line 209
    .line 210
    invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 211
    .line 212
    .line 213
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 214
    :goto_3
    new-instance p1, Landroidx/credentials/exceptions/GetCredentialUnknownException;

    .line 215
    .line 216
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    new-instance v0, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    const-string v1, "The PublicKeyCredential response json had an unexpected exception when parsing: "

    .line 223
    .line 224
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    invoke-direct {p1, p0}, Landroidx/credentials/exceptions/GetCredentialUnknownException;-><init>(Ljava/lang/CharSequence;)V

    .line 235
    .line 236
    .line 237
    throw p1

    .line 238
    :cond_f
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    const-string p1, "AuthenticatorResponse expected assertion response but got: "

    .line 247
    .line 248
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    const-string p1, "PublicKeyUtility"

    .line 253
    .line 254
    invoke-static {p1, p0}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    return-object p0

    .line 265
    :cond_10
    check-cast v2, Ldefpackage/ln;

    .line 266
    .line 267
    iget-object p1, v2, Ldefpackage/ln;->n:Ldefpackage/c21;

    .line 268
    .line 269
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    iget-object v0, v2, Ldefpackage/ln;->o:Ljava/lang/String;

    .line 273
    .line 274
    invoke-virtual {p0, p1, v0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(Ldefpackage/c21;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    throw p0
.end method
