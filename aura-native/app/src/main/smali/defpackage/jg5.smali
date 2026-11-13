.class public final Ldefpackage/jg5;
.super Ldefpackage/ef5;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/auth/api/signin/RevocationBoundService;)V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, Ldefpackage/jg5;->f:I

    .line 31
    const-string v0, "com.google.android.gms.auth.api.signin.internal.IRevocationService"

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, Ldefpackage/ef5;-><init>(ILjava/lang/String;)V

    .line 32
    iput-object p1, p0, Ldefpackage/jg5;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/cr4;I)V
    .locals 1

    .line 1
    iput p2, p0, Ldefpackage/jg5;->f:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/jg5;->g:Ljava/lang/Object;

    .line 8
    .line 9
    const-string p1, "com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback"

    .line 10
    .line 11
    invoke-direct {p0, v0, p1}, Ldefpackage/ef5;-><init>(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    iput-object p1, p0, Ldefpackage/jg5;->g:Ljava/lang/Object;

    .line 16
    .line 17
    const-string p1, "com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback"

    .line 18
    .line 19
    invoke-direct {p0, v0, p1}, Ldefpackage/ef5;-><init>(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_1
    iput-object p1, p0, Ldefpackage/jg5;->g:Ljava/lang/Object;

    .line 24
    .line 25
    const-string p1, "com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback"

    .line 26
    .line 27
    invoke-direct {p0, v0, p1}, Ldefpackage/ef5;-><init>(ILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final N0(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 9

    .line 1
    iget p3, p0, Ldefpackage/jg5;->f:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object v2, p0, Ldefpackage/jg5;->g:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p3, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object p2, v2

    .line 11
    check-cast p2, Lcom/google/android/gms/auth/api/signin/RevocationBoundService;

    .line 12
    .line 13
    if-eq p1, v0, :cond_1

    .line 14
    .line 15
    const/4 p3, 0x2

    .line 16
    if-eq p1, p3, :cond_0

    .line 17
    .line 18
    move v0, v1

    .line 19
    goto/16 :goto_5

    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Ldefpackage/jg5;->P0()V

    .line 22
    .line 23
    .line 24
    invoke-static {p2}, Ldefpackage/zg5;->E(Landroid/content/Context;)Ldefpackage/zg5;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ldefpackage/zg5;->F()V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_5

    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0}, Ldefpackage/jg5;->P0()V

    .line 34
    .line 35
    .line 36
    invoke-static {p2}, Ldefpackage/bm4;->a(Landroid/content/Context;)Ldefpackage/bm4;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ldefpackage/bm4;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    sget-object p2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->x:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 45
    .line 46
    const/4 p3, 0x0

    .line 47
    if-eqz p1, :cond_4

    .line 48
    .line 49
    const-string p2, "defaultGoogleSignInAccount"

    .line 50
    .line 51
    invoke-virtual {p0, p2}, Ldefpackage/bm4;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const-string v3, "googleSignInOptions"

    .line 63
    .line 64
    invoke-static {v3, p2}, Ldefpackage/bm4;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {p0, p2}, Ldefpackage/bm4;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-eqz p0, :cond_3

    .line 73
    .line 74
    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->b(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 75
    .line 76
    .line 77
    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    move-object p2, p0

    .line 79
    goto :goto_1

    .line 80
    :catch_0
    :cond_3
    :goto_0
    move-object p2, p3

    .line 81
    :cond_4
    :goto_1
    move-object v7, p2

    .line 82
    move-object v4, v2

    .line 83
    check-cast v4, Lcom/google/android/gms/auth/api/signin/RevocationBoundService;

    .line 84
    .line 85
    new-instance v3, Ldefpackage/r61;

    .line 86
    .line 87
    invoke-static {v7}, Ldefpackage/ji2;->m(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    new-instance p0, Ldefpackage/pa;

    .line 91
    .line 92
    const/4 p2, 0x7

    .line 93
    invoke-direct {p0, p2}, Ldefpackage/pa;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    new-instance v8, Ldefpackage/cj1;

    .line 101
    .line 102
    invoke-direct {v8, p0, v2}, Ldefpackage/cj1;-><init>(Ldefpackage/pa;Landroid/os/Looper;)V

    .line 103
    .line 104
    .line 105
    const/4 v5, 0x0

    .line 106
    sget-object v6, Ldefpackage/fn;->a:Ldefpackage/rf2;

    .line 107
    .line 108
    invoke-direct/range {v3 .. v8}, Ldefpackage/dj1;-><init>(Landroid/content/Context;Landroidx/credentials/playservices/HiddenActivity;Ldefpackage/rf2;Ldefpackage/le;Ldefpackage/cj1;)V

    .line 109
    .line 110
    .line 111
    const/4 p0, 0x3

    .line 112
    iget-object v2, v3, Ldefpackage/dj1;->a:Landroid/content/Context;

    .line 113
    .line 114
    iget-object v4, v3, Ldefpackage/dj1;->h:Ldefpackage/if5;

    .line 115
    .line 116
    if-eqz p1, :cond_9

    .line 117
    .line 118
    invoke-virtual {v3}, Ldefpackage/r61;->c()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-ne p1, p0, :cond_5

    .line 123
    .line 124
    move v1, v0

    .line 125
    :cond_5
    sget-object p1, Ldefpackage/yg5;->a:Ldefpackage/ge2;

    .line 126
    .line 127
    iget v3, p1, Ldefpackage/ge2;->c:I

    .line 128
    .line 129
    if-gt v3, p0, :cond_6

    .line 130
    .line 131
    iget-object p0, p1, Ldefpackage/ge2;->a:Ljava/lang/String;

    .line 132
    .line 133
    iget-object p1, p1, Ldefpackage/ge2;->b:Ljava/lang/String;

    .line 134
    .line 135
    const-string v3, "Revoking access"

    .line 136
    .line 137
    invoke-virtual {p1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-static {p0, p1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    :cond_6
    invoke-static {v2}, Ldefpackage/bm4;->a(Landroid/content/Context;)Ldefpackage/bm4;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    const-string p1, "refreshToken"

    .line 149
    .line 150
    invoke-virtual {p0, p1}, Ldefpackage/bm4;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {v2}, Ldefpackage/yg5;->a(Landroid/content/Context;)V

    .line 155
    .line 156
    .line 157
    if-eqz v1, :cond_8

    .line 158
    .line 159
    if-nez p0, :cond_7

    .line 160
    .line 161
    sget-object p0, Ldefpackage/ng5;->p:Ldefpackage/ge2;

    .line 162
    .line 163
    new-instance p0, Lcom/google/android/gms/common/api/Status;

    .line 164
    .line 165
    const/4 p1, 0x4

    .line 166
    invoke-direct {p0, p1, p3, p3, p3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Ldefpackage/ka0;)V

    .line 167
    .line 168
    .line 169
    const/4 p1, 0x0

    .line 170
    xor-int/2addr p1, v0

    .line 171
    const-string p3, "Status code must not be SUCCESS"

    .line 172
    .line 173
    invoke-static {p3, p1}, Ldefpackage/ji2;->h(Ljava/lang/String;Z)V

    .line 174
    .line 175
    .line 176
    new-instance p1, Ldefpackage/zf5;

    .line 177
    .line 178
    invoke-direct {p1, p0}, Ldefpackage/zf5;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->e(Ldefpackage/t14;)V

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_7
    new-instance p1, Ldefpackage/ng5;

    .line 186
    .line 187
    invoke-direct {p1, p0}, Ldefpackage/ng5;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    new-instance p0, Ljava/lang/Thread;

    .line 191
    .line 192
    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 196
    .line 197
    .line 198
    iget-object p1, p1, Ldefpackage/ng5;->o:Ldefpackage/zl4;

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_8
    new-instance p1, Ldefpackage/wg5;

    .line 202
    .line 203
    invoke-direct {p1, v4, v0}, Ldefpackage/wg5;-><init>(Ldefpackage/if5;I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4, p1}, Ldefpackage/if5;->a(Ldefpackage/wg5;)Ldefpackage/wg5;

    .line 207
    .line 208
    .line 209
    :goto_2
    new-instance p0, Ldefpackage/z45;

    .line 210
    .line 211
    invoke-direct {p0, p2}, Ldefpackage/z45;-><init>(I)V

    .line 212
    .line 213
    .line 214
    new-instance p2, Ldefpackage/cr4;

    .line 215
    .line 216
    invoke-direct {p2}, Ldefpackage/cr4;-><init>()V

    .line 217
    .line 218
    .line 219
    new-instance p3, Ldefpackage/cf5;

    .line 220
    .line 221
    invoke-direct {p3, p1, p2, p0}, Ldefpackage/cf5;-><init>(Lcom/google/android/gms/common/api/internal/BasePendingResult;Ldefpackage/cr4;Ldefpackage/z45;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1, p3}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->a(Ldefpackage/cf5;)V

    .line 225
    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_9
    invoke-virtual {v3}, Ldefpackage/r61;->c()I

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    if-ne p1, p0, :cond_a

    .line 233
    .line 234
    move p1, v0

    .line 235
    goto :goto_3

    .line 236
    :cond_a
    move p1, v1

    .line 237
    :goto_3
    sget-object p3, Ldefpackage/yg5;->a:Ldefpackage/ge2;

    .line 238
    .line 239
    iget v3, p3, Ldefpackage/ge2;->c:I

    .line 240
    .line 241
    if-gt v3, p0, :cond_b

    .line 242
    .line 243
    iget-object p0, p3, Ldefpackage/ge2;->a:Ljava/lang/String;

    .line 244
    .line 245
    iget-object p3, p3, Ldefpackage/ge2;->b:Ljava/lang/String;

    .line 246
    .line 247
    const-string v3, "Signing out"

    .line 248
    .line 249
    invoke-virtual {p3, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p3

    .line 253
    invoke-static {p0, p3}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 254
    .line 255
    .line 256
    :cond_b
    invoke-static {v2}, Ldefpackage/yg5;->a(Landroid/content/Context;)V

    .line 257
    .line 258
    .line 259
    if-eqz p1, :cond_c

    .line 260
    .line 261
    new-instance p0, Ldefpackage/zl4;

    .line 262
    .line 263
    invoke-direct {p0, v4}, Lcom/google/android/gms/common/api/internal/BasePendingResult;-><init>(Ldefpackage/if5;)V

    .line 264
    .line 265
    .line 266
    sget-object p1, Lcom/google/android/gms/common/api/Status;->r:Lcom/google/android/gms/common/api/Status;

    .line 267
    .line 268
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->e(Ldefpackage/t14;)V

    .line 269
    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_c
    new-instance p0, Ldefpackage/wg5;

    .line 273
    .line 274
    invoke-direct {p0, v4, v1}, Ldefpackage/wg5;-><init>(Ldefpackage/if5;I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v4, p0}, Ldefpackage/if5;->a(Ldefpackage/wg5;)Ldefpackage/wg5;

    .line 278
    .line 279
    .line 280
    :goto_4
    new-instance p1, Ldefpackage/z45;

    .line 281
    .line 282
    invoke-direct {p1, p2}, Ldefpackage/z45;-><init>(I)V

    .line 283
    .line 284
    .line 285
    new-instance p2, Ldefpackage/cr4;

    .line 286
    .line 287
    invoke-direct {p2}, Ldefpackage/cr4;-><init>()V

    .line 288
    .line 289
    .line 290
    new-instance p3, Ldefpackage/cf5;

    .line 291
    .line 292
    invoke-direct {p3, p0, p2, p1}, Ldefpackage/cf5;-><init>(Lcom/google/android/gms/common/api/internal/BasePendingResult;Ldefpackage/cr4;Ldefpackage/z45;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p0, p3}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->a(Ldefpackage/cf5;)V

    .line 296
    .line 297
    .line 298
    :goto_5
    return v0

    .line 299
    :pswitch_0
    if-ne p1, v0, :cond_d

    .line 300
    .line 301
    sget-object p0, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 302
    .line 303
    invoke-static {p2, p0}, Ldefpackage/pg5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    check-cast p0, Lcom/google/android/gms/common/api/Status;

    .line 308
    .line 309
    sget-object p1, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 310
    .line 311
    invoke-static {p2, p1}, Ldefpackage/pg5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    check-cast p1, Landroid/app/PendingIntent;

    .line 316
    .line 317
    invoke-static {p2}, Ldefpackage/pg5;->b(Landroid/os/Parcel;)V

    .line 318
    .line 319
    .line 320
    check-cast v2, Ldefpackage/cr4;

    .line 321
    .line 322
    invoke-static {p0, p1, v2}, Ldefpackage/g12;->R(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Ldefpackage/cr4;)V

    .line 323
    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_d
    move v0, v1

    .line 327
    :goto_6
    return v0

    .line 328
    :pswitch_1
    if-ne p1, v0, :cond_e

    .line 329
    .line 330
    sget-object p0, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 331
    .line 332
    invoke-static {p2, p0}, Ldefpackage/pg5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    check-cast p0, Lcom/google/android/gms/common/api/Status;

    .line 337
    .line 338
    sget-object p1, Ldefpackage/ds;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 339
    .line 340
    invoke-static {p2, p1}, Ldefpackage/pg5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    check-cast p1, Ldefpackage/ds;

    .line 345
    .line 346
    invoke-static {p2}, Ldefpackage/pg5;->b(Landroid/os/Parcel;)V

    .line 347
    .line 348
    .line 349
    check-cast v2, Ldefpackage/cr4;

    .line 350
    .line 351
    invoke-static {p0, p1, v2}, Ldefpackage/g12;->R(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Ldefpackage/cr4;)V

    .line 352
    .line 353
    .line 354
    goto :goto_7

    .line 355
    :cond_e
    move v0, v1

    .line 356
    :goto_7
    return v0

    .line 357
    :pswitch_2
    if-ne p1, v0, :cond_f

    .line 358
    .line 359
    sget-object p0, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 360
    .line 361
    invoke-static {p2, p0}, Ldefpackage/pg5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    check-cast p0, Lcom/google/android/gms/common/api/Status;

    .line 366
    .line 367
    sget-object p1, Ldefpackage/s44;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 368
    .line 369
    invoke-static {p2, p1}, Ldefpackage/pg5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    check-cast p1, Ldefpackage/s44;

    .line 374
    .line 375
    invoke-static {p2}, Ldefpackage/pg5;->b(Landroid/os/Parcel;)V

    .line 376
    .line 377
    .line 378
    check-cast v2, Ldefpackage/cr4;

    .line 379
    .line 380
    invoke-static {p0, p1, v2}, Ldefpackage/g12;->R(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Ldefpackage/cr4;)V

    .line 381
    .line 382
    .line 383
    goto :goto_8

    .line 384
    :cond_f
    move v0, v1

    .line 385
    :goto_8
    return v0

    .line 386
    nop

    .line 387
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public P0()V
    .locals 5

    .line 1
    iget-object p0, p0, Ldefpackage/jg5;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/gms/auth/api/signin/RevocationBoundService;

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, "com.google.android.gms"

    .line 10
    .line 11
    invoke-static {p0}, Ldefpackage/ae5;->a(Landroid/content/Context;)Ldefpackage/si1;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    :try_start_0
    iget-object v2, v2, Ldefpackage/si1;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Landroid/content/Context;

    .line 21
    .line 22
    const-string v3, "appops"

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Landroid/app/AppOpsManager;

    .line 29
    .line 30
    if-eqz v2, :cond_5

    .line 31
    .line 32
    invoke-virtual {v2, v0, v1}, Landroid/app/AppOpsManager;->checkPackage(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/16 v2, 0x40

    .line 40
    .line 41
    :try_start_1
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 42
    .line 43
    .line 44
    move-result-object v0
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 45
    invoke-static {p0}, Ldefpackage/oj1;->b(Landroid/content/Context;)Ldefpackage/oj1;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    if-eqz v0, :cond_6

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-static {v0, v3}, Ldefpackage/oj1;->d(Landroid/content/pm/PackageInfo;Z)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_0

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_0
    const/4 v4, 0x1

    .line 63
    invoke-static {v0, v4}, Ldefpackage/oj1;->d(Landroid/content/pm/PackageInfo;Z)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_6

    .line 68
    .line 69
    iget-object p0, p0, Ldefpackage/oj1;->n:Landroid/content/Context;

    .line 70
    .line 71
    sget-boolean v0, Ldefpackage/lj1;->c:Z

    .line 72
    .line 73
    if-nez v0, :cond_2

    .line 74
    .line 75
    :try_start_2
    invoke-static {p0}, Ldefpackage/ae5;->a(Landroid/content/Context;)Ldefpackage/si1;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object v0, v0, Ldefpackage/si1;->o:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Landroid/content/Context;

    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {p0}, Ldefpackage/oj1;->b(Landroid/content/Context;)Ldefpackage/oj1;

    .line 92
    .line 93
    .line 94
    if-eqz v0, :cond_1

    .line 95
    .line 96
    invoke-static {v0, v3}, Ldefpackage/oj1;->d(Landroid/content/pm/PackageInfo;Z)Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-nez p0, :cond_1

    .line 101
    .line 102
    invoke-static {v0, v4}, Ldefpackage/oj1;->d(Landroid/content/pm/PackageInfo;Z)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-eqz p0, :cond_1

    .line 107
    .line 108
    sput-boolean v4, Ldefpackage/lj1;->b:Z

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :catchall_0
    move-exception p0

    .line 112
    goto :goto_2

    .line 113
    :catch_0
    move-exception p0

    .line 114
    goto :goto_1

    .line 115
    :cond_1
    sput-boolean v3, Ldefpackage/lj1;->b:Z
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 116
    .line 117
    :goto_0
    sput-boolean v4, Ldefpackage/lj1;->c:Z

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :goto_1
    :try_start_3
    const-string v0, "GooglePlayServicesUtil"

    .line 121
    .line 122
    const-string v1, "Cannot find Google Play services package name."

    .line 123
    .line 124
    invoke-static {v0, v1, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 125
    .line 126
    .line 127
    sput-boolean v4, Ldefpackage/lj1;->c:Z

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :goto_2
    sput-boolean v4, Ldefpackage/lj1;->c:Z

    .line 131
    .line 132
    throw p0

    .line 133
    :cond_2
    :goto_3
    sget-boolean p0, Ldefpackage/lj1;->b:Z

    .line 134
    .line 135
    if-nez p0, :cond_4

    .line 136
    .line 137
    const-string p0, "user"

    .line 138
    .line 139
    sget-object v0, Landroid/os/Build;->TYPE:Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    if-nez p0, :cond_3

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_3
    const-string p0, "GoogleSignatureVerifier"

    .line 149
    .line 150
    const-string v0, "Test-keys aren\'t accepted on this build."

    .line 151
    .line 152
    invoke-static {p0, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_4
    :goto_4
    return-void

    .line 157
    :catch_1
    const/4 p0, 0x3

    .line 158
    const-string v0, "UidVerifier"

    .line 159
    .line 160
    invoke-static {v0, p0}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    if-eqz p0, :cond_6

    .line 165
    .line 166
    const-string p0, "Package manager can\'t find google play services package, defaulting to false"

    .line 167
    .line 168
    invoke-static {v0, p0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_5
    :try_start_4
    new-instance p0, Ljava/lang/NullPointerException;

    .line 173
    .line 174
    const-string v0, "context.getSystemService(Context.APP_OPS_SERVICE) is null"

    .line 175
    .line 176
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw p0
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_2

    .line 180
    :catch_2
    :cond_6
    :goto_5
    new-instance p0, Ljava/lang/SecurityException;

    .line 181
    .line 182
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    const-string v1, "Calling UID "

    .line 187
    .line 188
    const-string v2, " is not Google Play services."

    .line 189
    .line 190
    invoke-static {v0, v1, v2}, Ldefpackage/b11;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-direct {p0, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw p0
.end method
