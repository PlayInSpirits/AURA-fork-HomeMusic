.class public abstract Ldefpackage/df;
.super Ldefpackage/nc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/gf;


# instance fields
.field public M:Ldefpackage/bg;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ldefpackage/nc1;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/l70;->q:Ldefpackage/gp3;

    .line 5
    .line 6
    iget-object v0, v0, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ldefpackage/rm3;

    .line 9
    .line 10
    new-instance v1, Ldefpackage/bf;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Ldefpackage/bf;-><init>(Ldefpackage/df;)V

    .line 13
    .line 14
    .line 15
    const-string v2, "androidx:appcompat"

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, Ldefpackage/rm3;->L(Ljava/lang/String;Ldefpackage/i54;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Ldefpackage/cf;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Ldefpackage/cf;-><init>(Ldefpackage/df;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ldefpackage/l70;->g(Ldefpackage/d93;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/l70;->j()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/df;->m()Ldefpackage/pf;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Ldefpackage/bg;

    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/bg;->B()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Ldefpackage/bg;->N:Landroid/view/ViewGroup;

    .line 14
    .line 15
    const v1, 0x1020002

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Landroid/view/ViewGroup;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Ldefpackage/bg;->z:Ldefpackage/xf;

    .line 28
    .line 29
    iget-object p0, p0, Ldefpackage/bg;->y:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p1, p0}, Ldefpackage/xf;->a(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Ldefpackage/df;->m()Ldefpackage/pf;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ldefpackage/bg;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, v0, Ldefpackage/bg;->b0:Z

    .line 9
    .line 10
    iget v2, v0, Ldefpackage/bg;->f0:I

    .line 11
    .line 12
    const/16 v3, -0x64

    .line 13
    .line 14
    if-eq v2, v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget v2, Ldefpackage/pf;->o:I

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, p1, v2}, Ldefpackage/bg;->I(Landroid/content/Context;I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p1}, Ldefpackage/pf;->e(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-static {p1}, Ldefpackage/pf;->q(Landroid/content/Context;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-static {p1}, Ldefpackage/bg;->t(Landroid/content/Context;)Ldefpackage/wd2;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    instance-of v3, p1, Landroid/view/ContextThemeWrapper;

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    invoke-static {p1, v0, v2, v5, v4}, Ldefpackage/bg;->x(Landroid/content/Context;ILdefpackage/wd2;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    :try_start_0
    move-object v6, p1

    .line 47
    check-cast v6, Landroid/view/ContextThemeWrapper;

    .line 48
    .line 49
    invoke-virtual {v6, v3}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    goto/16 :goto_7

    .line 53
    .line 54
    :catch_0
    :cond_2
    instance-of v3, p1, Ldefpackage/ud0;

    .line 55
    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    invoke-static {p1, v0, v2, v5, v4}, Ldefpackage/bg;->x(Landroid/content/Context;ILdefpackage/wd2;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    :try_start_1
    move-object v4, p1

    .line 63
    check-cast v4, Ldefpackage/ud0;

    .line 64
    .line 65
    invoke-virtual {v4, v3}, Ldefpackage/ud0;->a(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 66
    .line 67
    .line 68
    goto/16 :goto_7

    .line 69
    .line 70
    :catch_1
    :cond_3
    sget-boolean v3, Ldefpackage/bg;->w0:Z

    .line 71
    .line 72
    if-nez v3, :cond_4

    .line 73
    .line 74
    goto/16 :goto_7

    .line 75
    .line 76
    :cond_4
    new-instance v3, Landroid/content/res/Configuration;

    .line 77
    .line 78
    invoke-direct {v3}, Landroid/content/res/Configuration;-><init>()V

    .line 79
    .line 80
    .line 81
    const/4 v4, -0x1

    .line 82
    iput v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 83
    .line 84
    const/4 v4, 0x0

    .line 85
    iput v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 86
    .line 87
    invoke-virtual {p1, v3}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 108
    .line 109
    iput v7, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 110
    .line 111
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    if-nez v7, :cond_1a

    .line 116
    .line 117
    new-instance v7, Landroid/content/res/Configuration;

    .line 118
    .line 119
    invoke-direct {v7}, Landroid/content/res/Configuration;-><init>()V

    .line 120
    .line 121
    .line 122
    iput v4, v7, Landroid/content/res/Configuration;->fontScale:F

    .line 123
    .line 124
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-nez v4, :cond_5

    .line 129
    .line 130
    goto/16 :goto_1

    .line 131
    .line 132
    :cond_5
    iget v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 133
    .line 134
    iget v8, v6, Landroid/content/res/Configuration;->fontScale:F

    .line 135
    .line 136
    cmpl-float v4, v4, v8

    .line 137
    .line 138
    if-eqz v4, :cond_6

    .line 139
    .line 140
    iput v8, v7, Landroid/content/res/Configuration;->fontScale:F

    .line 141
    .line 142
    :cond_6
    iget v4, v3, Landroid/content/res/Configuration;->mcc:I

    .line 143
    .line 144
    iget v8, v6, Landroid/content/res/Configuration;->mcc:I

    .line 145
    .line 146
    if-eq v4, v8, :cond_7

    .line 147
    .line 148
    iput v8, v7, Landroid/content/res/Configuration;->mcc:I

    .line 149
    .line 150
    :cond_7
    iget v4, v3, Landroid/content/res/Configuration;->mnc:I

    .line 151
    .line 152
    iget v8, v6, Landroid/content/res/Configuration;->mnc:I

    .line 153
    .line 154
    if-eq v4, v8, :cond_8

    .line 155
    .line 156
    iput v8, v7, Landroid/content/res/Configuration;->mnc:I

    .line 157
    .line 158
    :cond_8
    invoke-static {v3, v6, v7}, Ldefpackage/uf;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    .line 159
    .line 160
    .line 161
    iget v4, v3, Landroid/content/res/Configuration;->touchscreen:I

    .line 162
    .line 163
    iget v8, v6, Landroid/content/res/Configuration;->touchscreen:I

    .line 164
    .line 165
    if-eq v4, v8, :cond_9

    .line 166
    .line 167
    iput v8, v7, Landroid/content/res/Configuration;->touchscreen:I

    .line 168
    .line 169
    :cond_9
    iget v4, v3, Landroid/content/res/Configuration;->keyboard:I

    .line 170
    .line 171
    iget v8, v6, Landroid/content/res/Configuration;->keyboard:I

    .line 172
    .line 173
    if-eq v4, v8, :cond_a

    .line 174
    .line 175
    iput v8, v7, Landroid/content/res/Configuration;->keyboard:I

    .line 176
    .line 177
    :cond_a
    iget v4, v3, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 178
    .line 179
    iget v8, v6, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 180
    .line 181
    if-eq v4, v8, :cond_b

    .line 182
    .line 183
    iput v8, v7, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 184
    .line 185
    :cond_b
    iget v4, v3, Landroid/content/res/Configuration;->navigation:I

    .line 186
    .line 187
    iget v8, v6, Landroid/content/res/Configuration;->navigation:I

    .line 188
    .line 189
    if-eq v4, v8, :cond_c

    .line 190
    .line 191
    iput v8, v7, Landroid/content/res/Configuration;->navigation:I

    .line 192
    .line 193
    :cond_c
    iget v4, v3, Landroid/content/res/Configuration;->navigationHidden:I

    .line 194
    .line 195
    iget v8, v6, Landroid/content/res/Configuration;->navigationHidden:I

    .line 196
    .line 197
    if-eq v4, v8, :cond_d

    .line 198
    .line 199
    iput v8, v7, Landroid/content/res/Configuration;->navigationHidden:I

    .line 200
    .line 201
    :cond_d
    iget v4, v3, Landroid/content/res/Configuration;->orientation:I

    .line 202
    .line 203
    iget v8, v6, Landroid/content/res/Configuration;->orientation:I

    .line 204
    .line 205
    if-eq v4, v8, :cond_e

    .line 206
    .line 207
    iput v8, v7, Landroid/content/res/Configuration;->orientation:I

    .line 208
    .line 209
    :cond_e
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 210
    .line 211
    and-int/lit8 v4, v4, 0xf

    .line 212
    .line 213
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 214
    .line 215
    and-int/lit8 v8, v8, 0xf

    .line 216
    .line 217
    if-eq v4, v8, :cond_f

    .line 218
    .line 219
    iget v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 220
    .line 221
    or-int/2addr v4, v8

    .line 222
    iput v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 223
    .line 224
    :cond_f
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 225
    .line 226
    and-int/lit16 v4, v4, 0xc0

    .line 227
    .line 228
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 229
    .line 230
    and-int/lit16 v8, v8, 0xc0

    .line 231
    .line 232
    if-eq v4, v8, :cond_10

    .line 233
    .line 234
    iget v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 235
    .line 236
    or-int/2addr v4, v8

    .line 237
    iput v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 238
    .line 239
    :cond_10
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 240
    .line 241
    and-int/lit8 v4, v4, 0x30

    .line 242
    .line 243
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 244
    .line 245
    and-int/lit8 v8, v8, 0x30

    .line 246
    .line 247
    if-eq v4, v8, :cond_11

    .line 248
    .line 249
    iget v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 250
    .line 251
    or-int/2addr v4, v8

    .line 252
    iput v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 253
    .line 254
    :cond_11
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 255
    .line 256
    and-int/lit16 v4, v4, 0x300

    .line 257
    .line 258
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 259
    .line 260
    and-int/lit16 v8, v8, 0x300

    .line 261
    .line 262
    if-eq v4, v8, :cond_12

    .line 263
    .line 264
    iget v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 265
    .line 266
    or-int/2addr v4, v8

    .line 267
    iput v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 268
    .line 269
    :cond_12
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 270
    .line 271
    const/16 v8, 0x1a

    .line 272
    .line 273
    if-lt v4, v8, :cond_14

    .line 274
    .line 275
    invoke-static {v3}, Ldefpackage/j3;->a(Landroid/content/res/Configuration;)I

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    and-int/lit8 v4, v4, 0x3

    .line 280
    .line 281
    invoke-static {v6}, Ldefpackage/j3;->a(Landroid/content/res/Configuration;)I

    .line 282
    .line 283
    .line 284
    move-result v8

    .line 285
    and-int/lit8 v8, v8, 0x3

    .line 286
    .line 287
    if-eq v4, v8, :cond_13

    .line 288
    .line 289
    invoke-static {v7}, Ldefpackage/j3;->a(Landroid/content/res/Configuration;)I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    invoke-static {v6}, Ldefpackage/j3;->a(Landroid/content/res/Configuration;)I

    .line 294
    .line 295
    .line 296
    move-result v8

    .line 297
    and-int/lit8 v8, v8, 0x3

    .line 298
    .line 299
    or-int/2addr v4, v8

    .line 300
    invoke-static {v7, v4}, Ldefpackage/j3;->q(Landroid/content/res/Configuration;I)V

    .line 301
    .line 302
    .line 303
    :cond_13
    invoke-static {v3}, Ldefpackage/j3;->a(Landroid/content/res/Configuration;)I

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    and-int/lit8 v4, v4, 0xc

    .line 308
    .line 309
    invoke-static {v6}, Ldefpackage/j3;->a(Landroid/content/res/Configuration;)I

    .line 310
    .line 311
    .line 312
    move-result v8

    .line 313
    and-int/lit8 v8, v8, 0xc

    .line 314
    .line 315
    if-eq v4, v8, :cond_14

    .line 316
    .line 317
    invoke-static {v7}, Ldefpackage/j3;->a(Landroid/content/res/Configuration;)I

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    invoke-static {v6}, Ldefpackage/j3;->a(Landroid/content/res/Configuration;)I

    .line 322
    .line 323
    .line 324
    move-result v8

    .line 325
    and-int/lit8 v8, v8, 0xc

    .line 326
    .line 327
    or-int/2addr v4, v8

    .line 328
    invoke-static {v7, v4}, Ldefpackage/j3;->q(Landroid/content/res/Configuration;I)V

    .line 329
    .line 330
    .line 331
    :cond_14
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 332
    .line 333
    and-int/lit8 v4, v4, 0xf

    .line 334
    .line 335
    iget v8, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 336
    .line 337
    and-int/lit8 v8, v8, 0xf

    .line 338
    .line 339
    if-eq v4, v8, :cond_15

    .line 340
    .line 341
    iget v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 342
    .line 343
    or-int/2addr v4, v8

    .line 344
    iput v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 345
    .line 346
    :cond_15
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 347
    .line 348
    and-int/lit8 v4, v4, 0x30

    .line 349
    .line 350
    iget v8, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 351
    .line 352
    and-int/lit8 v8, v8, 0x30

    .line 353
    .line 354
    if-eq v4, v8, :cond_16

    .line 355
    .line 356
    iget v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 357
    .line 358
    or-int/2addr v4, v8

    .line 359
    iput v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 360
    .line 361
    :cond_16
    iget v4, v3, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 362
    .line 363
    iget v8, v6, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 364
    .line 365
    if-eq v4, v8, :cond_17

    .line 366
    .line 367
    iput v8, v7, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 368
    .line 369
    :cond_17
    iget v4, v3, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 370
    .line 371
    iget v8, v6, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 372
    .line 373
    if-eq v4, v8, :cond_18

    .line 374
    .line 375
    iput v8, v7, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 376
    .line 377
    :cond_18
    iget v4, v3, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 378
    .line 379
    iget v8, v6, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 380
    .line 381
    if-eq v4, v8, :cond_19

    .line 382
    .line 383
    iput v8, v7, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 384
    .line 385
    :cond_19
    iget v3, v3, Landroid/content/res/Configuration;->densityDpi:I

    .line 386
    .line 387
    iget v4, v6, Landroid/content/res/Configuration;->densityDpi:I

    .line 388
    .line 389
    if-eq v3, v4, :cond_1b

    .line 390
    .line 391
    iput v4, v7, Landroid/content/res/Configuration;->densityDpi:I

    .line 392
    .line 393
    goto :goto_1

    .line 394
    :cond_1a
    move-object v7, v5

    .line 395
    :cond_1b
    :goto_1
    invoke-static {p1, v0, v2, v7, v1}, Ldefpackage/bg;->x(Landroid/content/Context;ILdefpackage/wd2;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    new-instance v2, Ldefpackage/ud0;

    .line 400
    .line 401
    const v3, 0x7f140288

    .line 402
    .line 403
    .line 404
    invoke-direct {v2, p1, v3}, Ldefpackage/ud0;-><init>(Landroid/content/Context;I)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2, v0}, Ldefpackage/ud0;->a(Landroid/content/res/Configuration;)V

    .line 408
    .line 409
    .line 410
    :try_start_2
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 411
    .line 412
    .line 413
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_5

    .line 414
    if-eqz p1, :cond_1f

    .line 415
    .line 416
    invoke-virtual {v2}, Ldefpackage/ud0;->getTheme()Landroid/content/res/Resources$Theme;

    .line 417
    .line 418
    .line 419
    move-result-object p1

    .line 420
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 421
    .line 422
    const/16 v3, 0x1d

    .line 423
    .line 424
    if-lt v0, v3, :cond_1c

    .line 425
    .line 426
    invoke-static {p1}, Ldefpackage/yh;->k(Landroid/content/res/Resources$Theme;)V

    .line 427
    .line 428
    .line 429
    goto :goto_6

    .line 430
    :cond_1c
    sget-object v0, Ldefpackage/gi1;->f:Ljava/lang/Object;

    .line 431
    .line 432
    monitor-enter v0

    .line 433
    :try_start_3
    sget-boolean v3, Ldefpackage/gi1;->h:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 434
    .line 435
    if-nez v3, :cond_1d

    .line 436
    .line 437
    :try_start_4
    const-class v3, Landroid/content/res/Resources$Theme;

    .line 438
    .line 439
    const-string v4, "rebase"

    .line 440
    .line 441
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    sput-object v3, Ldefpackage/gi1;->g:Ljava/lang/reflect/Method;

    .line 446
    .line 447
    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 448
    .line 449
    .line 450
    goto :goto_2

    .line 451
    :catchall_0
    move-exception p0

    .line 452
    goto :goto_5

    .line 453
    :catch_2
    move-exception v3

    .line 454
    :try_start_5
    const-string v4, "ResourcesCompat"

    .line 455
    .line 456
    const-string v6, "Failed to retrieve rebase() method"

    .line 457
    .line 458
    invoke-static {v4, v6, v3}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 459
    .line 460
    .line 461
    :goto_2
    sput-boolean v1, Ldefpackage/gi1;->h:Z

    .line 462
    .line 463
    :cond_1d
    sget-object v1, Ldefpackage/gi1;->g:Ljava/lang/reflect/Method;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 464
    .line 465
    if-eqz v1, :cond_1e

    .line 466
    .line 467
    :try_start_6
    invoke-virtual {v1, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catch Ljava/lang/IllegalAccessException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 468
    .line 469
    .line 470
    goto :goto_4

    .line 471
    :catch_3
    move-exception p1

    .line 472
    goto :goto_3

    .line 473
    :catch_4
    move-exception p1

    .line 474
    :goto_3
    :try_start_7
    const-string v1, "ResourcesCompat"

    .line 475
    .line 476
    const-string v3, "Failed to invoke rebase() method via reflection"

    .line 477
    .line 478
    invoke-static {v1, v3, p1}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 479
    .line 480
    .line 481
    sput-object v5, Ldefpackage/gi1;->g:Ljava/lang/reflect/Method;

    .line 482
    .line 483
    :cond_1e
    :goto_4
    monitor-exit v0

    .line 484
    goto :goto_6

    .line 485
    :goto_5
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 486
    throw p0

    .line 487
    :catch_5
    :cond_1f
    :goto_6
    move-object p1, v2

    .line 488
    :goto_7
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 489
    .line 490
    .line 491
    return-void
.end method

.method public final closeOptionsMenu()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Ldefpackage/l93;->q()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0x52

    .line 10
    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ldefpackage/l93;->Q(Landroid/view/KeyEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    invoke-super {p0, p1}, Ldefpackage/k70;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/df;->m()Ldefpackage/pf;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ldefpackage/bg;

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/bg;->B()V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/bg;->y:Landroid/view/Window;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/df;->m()Ldefpackage/pf;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ldefpackage/bg;

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/bg;->B:Ldefpackage/no4;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/bg;->G()V

    .line 12
    .line 13
    .line 14
    new-instance v0, Ldefpackage/no4;

    .line 15
    .line 16
    iget-object v1, p0, Ldefpackage/bg;->A:Ldefpackage/l93;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Ldefpackage/l93;->J()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v1, p0, Ldefpackage/bg;->x:Landroid/content/Context;

    .line 26
    .line 27
    :goto_0
    invoke-direct {v0, v1}, Ldefpackage/no4;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Ldefpackage/bg;->B:Ldefpackage/no4;

    .line 31
    .line 32
    :cond_1
    iget-object p0, p0, Ldefpackage/bg;->B:Ldefpackage/no4;

    .line 33
    .line 34
    return-object p0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1

    .line 1
    sget v0, Ldefpackage/a45;->a:I

    .line 2
    .line 3
    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final invalidateOptionsMenu()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/df;->m()Ldefpackage/pf;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ldefpackage/pf;->d()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final m()Ldefpackage/pf;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/df;->M:Ldefpackage/bg;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ldefpackage/pf;->n:Ldefpackage/ia4;

    .line 6
    .line 7
    new-instance v0, Ldefpackage/bg;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1, p0, p0}, Ldefpackage/bg;-><init>(Landroid/content/Context;Landroid/view/Window;Ldefpackage/gf;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Ldefpackage/df;->M:Ldefpackage/bg;

    .line 14
    .line 15
    :cond_0
    iget-object p0, p0, Ldefpackage/df;->M:Ldefpackage/bg;

    .line 16
    .line 17
    return-object p0
.end method

.method public final n()Ldefpackage/l93;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/df;->m()Ldefpackage/pf;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ldefpackage/bg;

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/bg;->G()V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/bg;->A:Ldefpackage/l93;

    .line 11
    .line 12
    return-object p0
.end method

.method public final o(Landroidx/appcompat/widget/Toolbar;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldefpackage/df;->m()Ldefpackage/pf;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ldefpackage/bg;

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/bg;->w:Ljava/lang/Object;

    .line 8
    .line 9
    instance-of v0, v0, Landroid/app/Activity;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p0}, Ldefpackage/bg;->G()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Ldefpackage/bg;->A:Ldefpackage/l93;

    .line 18
    .line 19
    instance-of v1, v0, Ldefpackage/ia5;

    .line 20
    .line 21
    if-nez v1, :cond_4

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    iput-object v1, p0, Ldefpackage/bg;->B:Ldefpackage/no4;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Ldefpackage/l93;->O()V

    .line 29
    .line 30
    .line 31
    :cond_1
    iput-object v1, p0, Ldefpackage/bg;->A:Ldefpackage/l93;

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    new-instance v0, Ldefpackage/cv4;

    .line 36
    .line 37
    iget-object v1, p0, Ldefpackage/bg;->w:Ljava/lang/Object;

    .line 38
    .line 39
    instance-of v2, v1, Landroid/app/Activity;

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    check-cast v1, Landroid/app/Activity;

    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    iget-object v1, p0, Ldefpackage/bg;->C:Ljava/lang/CharSequence;

    .line 51
    .line 52
    :goto_0
    iget-object v2, p0, Ldefpackage/bg;->z:Ldefpackage/xf;

    .line 53
    .line 54
    invoke-direct {v0, p1, v1, v2}, Ldefpackage/cv4;-><init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Ldefpackage/xf;)V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Ldefpackage/bg;->A:Ldefpackage/l93;

    .line 58
    .line 59
    iget-object v1, p0, Ldefpackage/bg;->z:Ldefpackage/xf;

    .line 60
    .line 61
    iget-object v0, v0, Ldefpackage/cv4;->f:Ldefpackage/om1;

    .line 62
    .line 63
    iput-object v0, v1, Ldefpackage/xf;->o:Ldefpackage/om1;

    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setBackInvokedCallbackEnabled(Z)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    iget-object p1, p0, Ldefpackage/bg;->z:Ldefpackage/xf;

    .line 71
    .line 72
    iput-object v1, p1, Ldefpackage/xf;->o:Ldefpackage/om1;

    .line 73
    .line 74
    :goto_1
    invoke-virtual {p0}, Ldefpackage/bg;->d()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_4
    const-string p0, "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."

    .line 79
    .line 80
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Ldefpackage/l70;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/df;->m()Ldefpackage/pf;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Ldefpackage/bg;

    .line 9
    .line 10
    iget-boolean p1, p0, Ldefpackage/bg;->S:Z

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-boolean p1, p0, Ldefpackage/bg;->M:Z

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ldefpackage/bg;->G()V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Ldefpackage/bg;->A:Ldefpackage/l93;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Ldefpackage/l93;->N()V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-static {}, Ldefpackage/fg;->a()Ldefpackage/fg;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object v0, p0, Ldefpackage/bg;->x:Landroid/content/Context;

    .line 33
    .line 34
    monitor-enter p1

    .line 35
    :try_start_0
    iget-object v1, p1, Ldefpackage/fg;->a:Ldefpackage/c14;

    .line 36
    .line 37
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 38
    :try_start_1
    iget-object v2, v1, Ldefpackage/c14;->b:Ljava/util/WeakHashMap;

    .line 39
    .line 40
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ldefpackage/xe2;

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {v0}, Ldefpackage/xe2;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    :goto_0
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 55
    monitor-exit p1

    .line 56
    new-instance p1, Landroid/content/res/Configuration;

    .line 57
    .line 58
    iget-object v0, p0, Ldefpackage/bg;->x:Landroid/content/Context;

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-direct {p1, v0}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Ldefpackage/bg;->e0:Landroid/content/res/Configuration;

    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    invoke-virtual {p0, p1, p1}, Ldefpackage/bg;->r(ZZ)Z

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 79
    :try_start_4
    throw p0

    .line 80
    :catchall_1
    move-exception p0

    .line 81
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 82
    throw p0
.end method

.method public final onContentChanged()V
    .locals 0

    .line 1
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Ldefpackage/nc1;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/df;->m()Ldefpackage/pf;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ldefpackage/pf;->g()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v0}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0, p2}, Landroid/view/View;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    const/4 p0, 0x1

    .line 62
    return p0

    .line 63
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    return p0
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Ldefpackage/nc1;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const v1, 0x102002c

    .line 18
    .line 19
    .line 20
    if-ne p2, v1, :cond_5

    .line 21
    .line 22
    if-eqz p1, :cond_5

    .line 23
    .line 24
    invoke-virtual {p1}, Ldefpackage/l93;->I()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    and-int/lit8 p1, p1, 0x4

    .line 29
    .line 30
    if-eqz p1, :cond_5

    .line 31
    .line 32
    invoke-static {p0}, Ldefpackage/te5;->y(Ldefpackage/df;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-eqz p1, :cond_5

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Landroid/app/Activity;->shouldUpRecreateTask(Landroid/content/Intent;)Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-eqz p2, :cond_4

    .line 43
    .line 44
    new-instance p1, Ldefpackage/hr4;

    .line 45
    .line 46
    invoke-direct {p1, p0}, Ldefpackage/hr4;-><init>(Landroid/content/Context;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, Ldefpackage/te5;->y(Ldefpackage/df;)Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    if-nez p2, :cond_1

    .line 54
    .line 55
    invoke-static {p0}, Ldefpackage/te5;->y(Ldefpackage/df;)Landroid/content/Intent;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    :cond_1
    if-eqz p2, :cond_3

    .line 60
    .line 61
    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    if-nez v1, :cond_2

    .line 66
    .line 67
    iget-object v1, p1, Ldefpackage/hr4;->o:Landroid/content/Context;

    .line 68
    .line 69
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {p2, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    :cond_2
    invoke-virtual {p1, v1}, Ldefpackage/hr4;->a(Landroid/content/ComponentName;)V

    .line 78
    .line 79
    .line 80
    iget-object v1, p1, Ldefpackage/hr4;->n:Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    :cond_3
    invoke-virtual {p1}, Ldefpackage/hr4;->b()V

    .line 86
    .line 87
    .line 88
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :catch_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 93
    .line 94
    .line 95
    :goto_0
    return v0

    .line 96
    :cond_4
    invoke-virtual {p0, p1}, Landroid/app/Activity;->navigateUpTo(Landroid/content/Intent;)Z

    .line 97
    .line 98
    .line 99
    return v0

    .line 100
    :cond_5
    const/4 p0, 0x0

    .line 101
    return p0
.end method

.method public final onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/df;->m()Ldefpackage/pf;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Ldefpackage/bg;

    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/bg;->B()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onPostResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Ldefpackage/nc1;->onPostResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/df;->m()Ldefpackage/pf;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Ldefpackage/bg;

    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/bg;->G()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/bg;->A:Ldefpackage/l93;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-virtual {p0, v0}, Ldefpackage/l93;->j0(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Ldefpackage/nc1;->onStart()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/df;->m()Ldefpackage/pf;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Ldefpackage/bg;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p0, v0, v1}, Ldefpackage/bg;->r(ZZ)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, Ldefpackage/nc1;->onStop()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/df;->m()Ldefpackage/pf;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Ldefpackage/bg;

    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/bg;->G()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/bg;->A:Ldefpackage/l93;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, v0}, Ldefpackage/l93;->j0(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/df;->m()Ldefpackage/pf;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Ldefpackage/pf;->p(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final openOptionsMenu()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Ldefpackage/l93;->R()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final setContentView(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/l70;->j()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/df;->m()Ldefpackage/pf;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Ldefpackage/pf;->k(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 12
    invoke-virtual {p0}, Ldefpackage/l70;->j()V

    .line 13
    invoke-virtual {p0}, Ldefpackage/df;->m()Ldefpackage/pf;

    move-result-object p0

    invoke-virtual {p0, p1}, Ldefpackage/pf;->l(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 14
    invoke-virtual {p0}, Ldefpackage/l70;->j()V

    .line 15
    invoke-virtual {p0}, Ldefpackage/df;->m()Ldefpackage/pf;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Ldefpackage/pf;->n(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTheme(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/content/Context;->setTheme(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/df;->m()Ldefpackage/pf;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Ldefpackage/bg;

    .line 9
    .line 10
    iput p1, p0, Ldefpackage/bg;->g0:I

    .line 11
    .line 12
    return-void
.end method
