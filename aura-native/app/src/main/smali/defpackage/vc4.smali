.class public final synthetic Ldefpackage/vc4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/xc4;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/xc4;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/vc4;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/vc4;->o:Ldefpackage/xc4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    iget p1, p0, Ldefpackage/vc4;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/vc4;->o:Ldefpackage/xc4;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Ldefpackage/xc4;->B0:Ldefpackage/ns3;

    .line 9
    .line 10
    iget-object p1, p1, Ldefpackage/ns3;->p:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 13
    .line 14
    invoke-virtual {p1}, Ldefpackage/hg;->getText()Landroid/text/Editable;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Ldefpackage/xc4;->F0:Ljava/lang/String;

    .line 30
    .line 31
    iget-object p1, p0, Ldefpackage/xc4;->B0:Ldefpackage/ns3;

    .line 32
    .line 33
    iget-object p1, p1, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 36
    .line 37
    invoke-virtual {p1}, Ldefpackage/hg;->getText()Landroid/text/Editable;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Ldefpackage/xc4;->G0:Ljava/lang/String;

    .line 53
    .line 54
    iget-object p1, p0, Ldefpackage/xc4;->F0:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    const v0, 0x7f130112

    .line 61
    .line 62
    .line 63
    if-eqz p1, :cond_0

    .line 64
    .line 65
    iget-object p1, p0, Ldefpackage/xc4;->B0:Ldefpackage/ns3;

    .line 66
    .line 67
    iget-object p1, p1, Ldefpackage/ns3;->p:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    iget-object p1, p0, Ldefpackage/xc4;->G0:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_1

    .line 86
    .line 87
    iget-object p1, p0, Ldefpackage/xc4;->B0:Ldefpackage/ns3;

    .line 88
    .line 89
    iget-object p1, p1, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 92
    .line 93
    invoke-virtual {p0, v0}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    iget-object p1, p0, Ldefpackage/xc4;->D0:Ldefpackage/rc4;

    .line 102
    .line 103
    iget-object v0, p0, Ldefpackage/xc4;->F0:Ljava/lang/String;

    .line 104
    .line 105
    iget-wide v1, p0, Ldefpackage/xc4;->H0:J

    .line 106
    .line 107
    iget-object v3, p1, Ldefpackage/rc4;->c:Ldefpackage/hh3;

    .line 108
    .line 109
    iget-object p1, p1, Ldefpackage/rc4;->d:Lcom/eddyizm/tempus/subsonic/models/Share;

    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Share;->getId()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-static {}, Ldefpackage/ud3;->D()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-static {v2}, Lcom/eddyizm/tempus/App;->e(Ljava/lang/String;)Ldefpackage/pn4;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v2}, Ldefpackage/pn4;->i()Ldefpackage/wo0;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    const-string v3, "BrowsingClient"

    .line 138
    .line 139
    const-string v4, "updateShare()"

    .line 140
    .line 141
    invoke-static {v3, v4}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    iget-object v3, v2, Ldefpackage/wo0;->o:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v3, Ldefpackage/hd4;

    .line 147
    .line 148
    iget-object v2, v2, Ldefpackage/wo0;->n:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v2, Ldefpackage/pn4;

    .line 151
    .line 152
    invoke-virtual {v2}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-interface {v3, v2, p1, v0, v1}, Ldefpackage/hd4;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lretrofit2/Call;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    new-instance v0, Ldefpackage/hh3;

    .line 161
    .line 162
    const/16 v1, 0x19

    .line 163
    .line 164
    invoke-direct {v0, v1}, Ldefpackage/hh3;-><init>(I)V

    .line 165
    .line 166
    .line 167
    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 168
    .line 169
    .line 170
    iget-object p1, p0, Ldefpackage/xc4;->C0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 171
    .line 172
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {p1, v0}, Lcom/eddyizm/tempus/viewmodel/b;->g(Ldefpackage/ba2;)V

    .line 177
    .line 178
    .line 179
    iget-object p0, p0, Ldefpackage/pp0;->w0:Landroid/app/Dialog;

    .line 180
    .line 181
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 185
    .line 186
    .line 187
    :goto_0
    return-void

    .line 188
    :pswitch_0
    new-instance p1, Ldefpackage/cy;

    .line 189
    .line 190
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 191
    .line 192
    .line 193
    sget-wide v0, Ldefpackage/cy;->f:J

    .line 194
    .line 195
    iput-wide v0, p1, Ldefpackage/cy;->a:J

    .line 196
    .line 197
    sget-wide v0, Ldefpackage/cy;->g:J

    .line 198
    .line 199
    iput-wide v0, p1, Ldefpackage/cy;->b:J

    .line 200
    .line 201
    new-instance v0, Ldefpackage/pi0;

    .line 202
    .line 203
    const-wide/high16 v1, -0x8000000000000000L

    .line 204
    .line 205
    invoke-direct {v0, v1, v2}, Ldefpackage/pi0;-><init>(J)V

    .line 206
    .line 207
    .line 208
    iput-object v0, p1, Ldefpackage/cy;->e:Ldefpackage/pi0;

    .line 209
    .line 210
    invoke-static {}, Ldefpackage/a35;->d()Ljava/util/Calendar;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 215
    .line 216
    .line 217
    move-result-wide v0

    .line 218
    new-instance v2, Ldefpackage/pi0;

    .line 219
    .line 220
    invoke-direct {v2, v0, v1}, Ldefpackage/pi0;-><init>(J)V

    .line 221
    .line 222
    .line 223
    iput-object v2, p1, Ldefpackage/cy;->e:Ldefpackage/pi0;

    .line 224
    .line 225
    invoke-virtual {p1}, Ldefpackage/cy;->a()Ldefpackage/dy;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    iget-object v0, p1, Ldefpackage/dy;->o:Ldefpackage/ix2;

    .line 230
    .line 231
    iget-object v1, p1, Ldefpackage/dy;->n:Ldefpackage/ix2;

    .line 232
    .line 233
    new-instance v2, Ldefpackage/ze4;

    .line 234
    .line 235
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 236
    .line 237
    .line 238
    iget-wide v3, p0, Ldefpackage/xc4;->H0:J

    .line 239
    .line 240
    invoke-static {v3, v4}, Ldefpackage/a35;->a(J)J

    .line 241
    .line 242
    .line 243
    move-result-wide v3

    .line 244
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    iput-object v3, v2, Ldefpackage/ze4;->n:Ljava/lang/Long;

    .line 249
    .line 250
    iget-object v3, p1, Ldefpackage/dy;->q:Ldefpackage/ix2;

    .line 251
    .line 252
    if-nez v3, :cond_4

    .line 253
    .line 254
    invoke-virtual {v2}, Ldefpackage/ze4;->a()Ljava/util/ArrayList;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    if-nez v3, :cond_2

    .line 263
    .line 264
    invoke-virtual {v2}, Ldefpackage/ze4;->a()Ljava/util/ArrayList;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    check-cast v3, Ljava/lang/Long;

    .line 277
    .line 278
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 279
    .line 280
    .line 281
    move-result-wide v3

    .line 282
    invoke-static {v3, v4}, Ldefpackage/ix2;->c(J)Ldefpackage/ix2;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    invoke-virtual {v3, v1}, Ldefpackage/ix2;->a(Ldefpackage/ix2;)I

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    if-ltz v4, :cond_2

    .line 291
    .line 292
    invoke-virtual {v3, v0}, Ldefpackage/ix2;->a(Ldefpackage/ix2;)I

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    if-gtz v4, :cond_2

    .line 297
    .line 298
    :goto_1
    move-object v1, v3

    .line 299
    goto :goto_2

    .line 300
    :cond_2
    new-instance v3, Ldefpackage/ix2;

    .line 301
    .line 302
    invoke-static {}, Ldefpackage/a35;->d()Ljava/util/Calendar;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    invoke-direct {v3, v4}, Ldefpackage/ix2;-><init>(Ljava/util/Calendar;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v3, v1}, Ldefpackage/ix2;->a(Ldefpackage/ix2;)I

    .line 310
    .line 311
    .line 312
    move-result v4

    .line 313
    if-ltz v4, :cond_3

    .line 314
    .line 315
    invoke-virtual {v3, v0}, Ldefpackage/ix2;->a(Ldefpackage/ix2;)I

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-gtz v0, :cond_3

    .line 320
    .line 321
    goto :goto_1

    .line 322
    :cond_3
    :goto_2
    iput-object v1, p1, Ldefpackage/dy;->q:Ldefpackage/ix2;

    .line 323
    .line 324
    :cond_4
    new-instance v0, Ldefpackage/xh2;

    .line 325
    .line 326
    invoke-direct {v0}, Ldefpackage/xh2;-><init>()V

    .line 327
    .line 328
    .line 329
    new-instance v1, Landroid/os/Bundle;

    .line 330
    .line 331
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 332
    .line 333
    .line 334
    const-string v3, "OVERRIDE_THEME_RES_ID"

    .line 335
    .line 336
    const/4 v4, 0x0

    .line 337
    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 338
    .line 339
    .line 340
    const-string v3, "DATE_SELECTOR_KEY"

    .line 341
    .line 342
    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 343
    .line 344
    .line 345
    const-string v2, "CALENDAR_CONSTRAINTS_KEY"

    .line 346
    .line 347
    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 348
    .line 349
    .line 350
    const-string p1, "DAY_VIEW_DECORATOR_KEY"

    .line 351
    .line 352
    const/4 v2, 0x0

    .line 353
    invoke-virtual {v1, p1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 354
    .line 355
    .line 356
    const-string p1, "TITLE_TEXT_RES_ID_KEY"

    .line 357
    .line 358
    const v3, 0x7f13038b

    .line 359
    .line 360
    .line 361
    invoke-virtual {v1, p1, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 362
    .line 363
    .line 364
    const-string p1, "TITLE_TEXT_KEY"

    .line 365
    .line 366
    invoke-virtual {v1, p1, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 367
    .line 368
    .line 369
    const-string p1, "INPUT_MODE_KEY"

    .line 370
    .line 371
    invoke-virtual {v1, p1, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 372
    .line 373
    .line 374
    const-string p1, "POSITIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 375
    .line 376
    invoke-virtual {v1, p1, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 377
    .line 378
    .line 379
    const-string p1, "POSITIVE_BUTTON_TEXT_KEY"

    .line 380
    .line 381
    invoke-virtual {v1, p1, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 382
    .line 383
    .line 384
    const-string p1, "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 385
    .line 386
    invoke-virtual {v1, p1, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 387
    .line 388
    .line 389
    const-string p1, "NEGATIVE_BUTTON_TEXT_KEY"

    .line 390
    .line 391
    invoke-virtual {v1, p1, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0, v1}, Ldefpackage/kc1;->c0(Landroid/os/Bundle;)V

    .line 395
    .line 396
    .line 397
    iput-object v0, p0, Ldefpackage/xc4;->E0:Ldefpackage/xh2;

    .line 398
    .line 399
    new-instance p1, Ldefpackage/wc4;

    .line 400
    .line 401
    invoke-direct {p1, p0}, Ldefpackage/wc4;-><init>(Ldefpackage/xc4;)V

    .line 402
    .line 403
    .line 404
    iget-object v0, v0, Ldefpackage/xh2;->B0:Ljava/util/LinkedHashSet;

    .line 405
    .line 406
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    iget-object p1, p0, Ldefpackage/xc4;->E0:Ldefpackage/xh2;

    .line 410
    .line 411
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 412
    .line 413
    .line 414
    move-result-object p0

    .line 415
    invoke-virtual {p0}, Ldefpackage/nc1;->k()Ldefpackage/md1;

    .line 416
    .line 417
    .line 418
    move-result-object p0

    .line 419
    invoke-virtual {p1, p0, v2}, Ldefpackage/pp0;->m0(Ldefpackage/ld1;Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    return-void

    .line 423
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
