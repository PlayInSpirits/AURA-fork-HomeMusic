.class public final Ldefpackage/bm4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final c:Ljava/util/concurrent/locks/ReentrantLock;

.field public static d:Ldefpackage/bm4;


# instance fields
.field public final a:Ljava/util/concurrent/locks/ReentrantLock;

.field public final b:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/bm4;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ldefpackage/bm4;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 10
    .line 11
    const-string v0, "com.google.android.gms.signin"

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Ldefpackage/bm4;->b:Landroid/content/SharedPreferences;

    .line 19
    .line 20
    return-void
.end method

.method public static a(Landroid/content/Context;)Ldefpackage/bm4;
    .locals 2

    .line 1
    invoke-static {p0}, Ldefpackage/ji2;->m(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ldefpackage/bm4;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 7
    .line 8
    .line 9
    :try_start_0
    sget-object v1, Ldefpackage/bm4;->d:Ldefpackage/bm4;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Ldefpackage/bm4;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v1, p0}, Ldefpackage/bm4;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    sput-object v1, Ldefpackage/bm4;->d:Ldefpackage/bm4;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    sget-object p0, Ldefpackage/bm4;->d:Ldefpackage/bm4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 30
    .line 31
    .line 32
    return-object p0

    .line 33
    :goto_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 34
    .line 35
    .line 36
    throw p0
.end method

.method public static final f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ":"

    .line 2
    .line 3
    invoke-static {p0, v0, p1}, Ldefpackage/b11;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    .locals 3

    .line 1
    const-string v0, "defaultGoogleSignInAccount"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ldefpackage/bm4;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v1, "googleSignInAccount"

    .line 16
    .line 17
    invoke-static {v1, v0}, Ldefpackage/bm4;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0, v0}, Ldefpackage/bm4;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->b(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 28
    .line 29
    .line 30
    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    return-object p0

    .line 32
    :catch_0
    :cond_1
    :goto_0
    return-object v2
.end method

.method public final c(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    .locals 9

    .line 1
    invoke-static {p1}, Ldefpackage/ji2;->m(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Ldefpackage/ji2;->m(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->v:Ljava/lang/String;

    .line 8
    .line 9
    const-string v1, "defaultGoogleSignInAccount"

    .line 10
    .line 11
    invoke-virtual {p0, v1, v0}, Ldefpackage/bm4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "googleSignInAccount"

    .line 15
    .line 16
    invoke-static {v1, v0}, Ldefpackage/bm4;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, Lorg/json/JSONObject;

    .line 21
    .line 22
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 23
    .line 24
    .line 25
    :try_start_0
    iget-object v3, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->o:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    const-string v4, "id"

    .line 30
    .line 31
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object v3, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->p:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    const-string v4, "tokenId"

    .line 39
    .line 40
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object v3, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->q:Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    const-string v4, "email"

    .line 48
    .line 49
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 50
    .line 51
    .line 52
    :cond_2
    iget-object v3, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->r:Ljava/lang/String;

    .line 53
    .line 54
    if-eqz v3, :cond_3

    .line 55
    .line 56
    const-string v4, "displayName"

    .line 57
    .line 58
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 59
    .line 60
    .line 61
    :cond_3
    iget-object v3, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->x:Ljava/lang/String;

    .line 62
    .line 63
    if-eqz v3, :cond_4

    .line 64
    .line 65
    const-string v4, "givenName"

    .line 66
    .line 67
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    .line 69
    .line 70
    :cond_4
    iget-object v3, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->y:Ljava/lang/String;

    .line 71
    .line 72
    if-eqz v3, :cond_5

    .line 73
    .line 74
    const-string v4, "familyName"

    .line 75
    .line 76
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 77
    .line 78
    .line 79
    :cond_5
    iget-object v3, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->s:Landroid/net/Uri;

    .line 80
    .line 81
    if-eqz v3, :cond_6

    .line 82
    .line 83
    const-string v4, "photoUrl"

    .line 84
    .line 85
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 90
    .line 91
    .line 92
    :cond_6
    iget-object v3, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->t:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 93
    .line 94
    const-string v4, "serverAuthCode"

    .line 95
    .line 96
    if-eqz v3, :cond_7

    .line 97
    .line 98
    :try_start_1
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 99
    .line 100
    .line 101
    :cond_7
    const-string v3, "expirationTime"

    .line 102
    .line 103
    iget-wide v5, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->u:J

    .line 104
    .line 105
    invoke-virtual {v2, v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 106
    .line 107
    .line 108
    const-string v3, "obfuscatedIdentifier"

    .line 109
    .line 110
    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 111
    .line 112
    .line 113
    new-instance v3, Lorg/json/JSONArray;

    .line 114
    .line 115
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 116
    .line 117
    .line 118
    iget-object p1, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->w:Ljava/util/List;

    .line 119
    .line 120
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    new-array v5, v5, [Lcom/google/android/gms/common/api/Scope;

    .line 125
    .line 126
    invoke-interface {p1, v5}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    check-cast p1, [Lcom/google/android/gms/common/api/Scope;

    .line 131
    .line 132
    sget-object v5, Ldefpackage/ca1;->w:Ldefpackage/ca1;

    .line 133
    .line 134
    invoke-static {p1, v5}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 135
    .line 136
    .line 137
    array-length v5, p1

    .line 138
    const/4 v6, 0x0

    .line 139
    move v7, v6

    .line 140
    :goto_0
    if-ge v7, v5, :cond_8

    .line 141
    .line 142
    aget-object v8, p1, v7

    .line 143
    .line 144
    iget-object v8, v8, Lcom/google/android/gms/common/api/Scope;->o:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {v3, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 147
    .line 148
    .line 149
    add-int/lit8 v7, v7, 0x1

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_8
    const-string p1, "grantedScopes"

    .line 153
    .line 154
    invoke-virtual {v2, p1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {p0, v1, p1}, Ldefpackage/bm4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    const-string p1, "googleSignInOptions"

    .line 168
    .line 169
    invoke-static {p1, v0}, Ldefpackage/bm4;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    iget-object v0, p2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->u:Ljava/lang/String;

    .line 174
    .line 175
    iget-object v1, p2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->t:Ljava/lang/String;

    .line 176
    .line 177
    iget-object v2, p2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->o:Ljava/util/ArrayList;

    .line 178
    .line 179
    new-instance v3, Lorg/json/JSONObject;

    .line 180
    .line 181
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 182
    .line 183
    .line 184
    :try_start_2
    new-instance v4, Lorg/json/JSONArray;

    .line 185
    .line 186
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 187
    .line 188
    .line 189
    sget-object v5, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->B:Ldefpackage/jb2;

    .line 190
    .line 191
    invoke-static {v2, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    :goto_1
    if-ge v6, v5, :cond_9

    .line 199
    .line 200
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    add-int/lit8 v6, v6, 0x1

    .line 205
    .line 206
    check-cast v7, Lcom/google/android/gms/common/api/Scope;

    .line 207
    .line 208
    iget-object v7, v7, Lcom/google/android/gms/common/api/Scope;->o:Ljava/lang/String;

    .line 209
    .line 210
    invoke-virtual {v4, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 211
    .line 212
    .line 213
    goto :goto_1

    .line 214
    :cond_9
    const-string v2, "scopes"

    .line 215
    .line 216
    invoke-virtual {v3, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 217
    .line 218
    .line 219
    iget-object v2, p2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->p:Landroid/accounts/Account;

    .line 220
    .line 221
    if-eqz v2, :cond_a

    .line 222
    .line 223
    const-string v4, "accountName"

    .line 224
    .line 225
    iget-object v2, v2, Landroid/accounts/Account;->name:Ljava/lang/String;

    .line 226
    .line 227
    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 228
    .line 229
    .line 230
    :cond_a
    const-string v2, "idTokenRequested"

    .line 231
    .line 232
    iget-boolean v4, p2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->q:Z

    .line 233
    .line 234
    invoke-virtual {v3, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 235
    .line 236
    .line 237
    const-string v2, "forceCodeForRefreshToken"

    .line 238
    .line 239
    iget-boolean v4, p2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->s:Z

    .line 240
    .line 241
    invoke-virtual {v3, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 242
    .line 243
    .line 244
    const-string v2, "serverAuthRequested"

    .line 245
    .line 246
    iget-boolean p2, p2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->r:Z

    .line 247
    .line 248
    invoke-virtual {v3, v2, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 249
    .line 250
    .line 251
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 252
    .line 253
    .line 254
    move-result p2

    .line 255
    if-nez p2, :cond_b

    .line 256
    .line 257
    const-string p2, "serverClientId"

    .line 258
    .line 259
    invoke-virtual {v3, p2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 260
    .line 261
    .line 262
    :cond_b
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 263
    .line 264
    .line 265
    move-result p2

    .line 266
    if-nez p2, :cond_c

    .line 267
    .line 268
    const-string p2, "hostedDomain"

    .line 269
    .line 270
    invoke-virtual {v3, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 271
    .line 272
    .line 273
    :cond_c
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p2

    .line 277
    invoke-virtual {p0, p1, p2}, Ldefpackage/bm4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    return-void

    .line 281
    :catch_0
    move-exception p0

    .line 282
    invoke-static {p0}, Ldefpackage/er1;->m(Ljava/lang/Throwable;)V

    .line 283
    .line 284
    .line 285
    return-void

    .line 286
    :catch_1
    move-exception p0

    .line 287
    invoke-static {p0}, Ldefpackage/er1;->m(Ljava/lang/Throwable;)V

    .line 288
    .line 289
    .line 290
    return-void
.end method

.method public final d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/bm4;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object p0, p0, Ldefpackage/bm4;->b:Landroid/content/SharedPreferences;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-interface {p0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 19
    .line 20
    .line 21
    throw p0
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/bm4;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object p0, p0, Ldefpackage/bm4;->b:Landroid/content/SharedPreferences;

    .line 7
    .line 8
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 25
    .line 26
    .line 27
    throw p0
.end method
