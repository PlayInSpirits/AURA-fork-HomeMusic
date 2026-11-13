.class public final Ldefpackage/oe2;
.super Ldefpackage/kc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public l0:Ldefpackage/pc1;

.field public m0:Ldefpackage/ta4;

.field public n0:Ljava/util/ArrayList;

.field public o0:I

.field public p0:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldefpackage/kc1;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final h0(Ldefpackage/oe2;ILjava/lang/String;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, v0, Ldefpackage/pc1;->q:Landroid/view/View;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-nez p2, :cond_1

    .line 19
    .line 20
    const-string p2, ""

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const-string v0, "\n"

    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0}, Ldefpackage/kc1;->n()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0, p1, p3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public static k0(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/webkit/URLUtil;->isValidUrl(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :try_start_0
    new-instance v1, Ldefpackage/fr1;

    .line 10
    .line 11
    invoke-direct {v1}, Ldefpackage/fr1;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v0, p0}, Ldefpackage/fr1;->e(Ldefpackage/gr1;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ldefpackage/fr1;->b()Ldefpackage/gr1;

    .line 18
    .line 19
    .line 20
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    :catch_0
    if-nez v0, :cond_1

    .line 22
    .line 23
    :goto_0
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_1
    const/4 p0, 0x1

    .line 26
    return p0
.end method


# virtual methods
.method public final F(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ldefpackage/kc1;->F(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/kc1;->s:Landroid/os/Bundle;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-string p1, "single_page_mode"

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const v1, 0x7f0d007c

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    move-object/from16 v3, p1

    .line 11
    .line 12
    move-object/from16 v4, p2

    .line 13
    .line 14
    invoke-virtual {v3, v1, v4, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const v3, 0x7f0a0132

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    move-object v7, v4

    .line 26
    check-cast v7, Lcom/google/android/material/button/MaterialButton;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    if-eqz v7, :cond_2

    .line 30
    .line 31
    const v3, 0x7f0a0138

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    check-cast v5, Landroid/widget/LinearLayout;

    .line 39
    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    const v3, 0x7f0a018e

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    move-object v8, v5

    .line 50
    check-cast v8, Lcom/google/android/material/button/MaterialButton;

    .line 51
    .line 52
    if-eqz v8, :cond_2

    .line 53
    .line 54
    const v3, 0x7f0a019d

    .line 55
    .line 56
    .line 57
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    move-object v9, v5

    .line 62
    check-cast v9, Lcom/google/android/material/button/MaterialButton;

    .line 63
    .line 64
    if-eqz v9, :cond_2

    .line 65
    .line 66
    const v3, 0x7f0a025e

    .line 67
    .line 68
    .line 69
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Landroid/widget/LinearLayout;

    .line 74
    .line 75
    if-eqz v5, :cond_2

    .line 76
    .line 77
    move-object v6, v1

    .line 78
    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 79
    .line 80
    const v3, 0x7f0a04f4

    .line 81
    .line 82
    .line 83
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    check-cast v5, Lcom/google/android/material/divider/MaterialDivider;

    .line 88
    .line 89
    if-eqz v5, :cond_2

    .line 90
    .line 91
    const v3, 0x7f0a0534

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    check-cast v5, Landroid/widget/ScrollView;

    .line 99
    .line 100
    if-eqz v5, :cond_2

    .line 101
    .line 102
    const v3, 0x7f0a0559

    .line 103
    .line 104
    .line 105
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    move-object v10, v5

    .line 110
    check-cast v10, Lcom/google/android/material/textfield/TextInputEditText;

    .line 111
    .line 112
    if-eqz v10, :cond_2

    .line 113
    .line 114
    const v3, 0x7f0a055a

    .line 115
    .line 116
    .line 117
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    move-object v11, v5

    .line 122
    check-cast v11, Lcom/google/android/material/textfield/TextInputLayout;

    .line 123
    .line 124
    if-eqz v11, :cond_2

    .line 125
    .line 126
    const v3, 0x7f0a055b

    .line 127
    .line 128
    .line 129
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    move-object v12, v5

    .line 134
    check-cast v12, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 135
    .line 136
    if-eqz v12, :cond_2

    .line 137
    .line 138
    const v3, 0x7f0a055e

    .line 139
    .line 140
    .line 141
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    move-object v13, v5

    .line 146
    check-cast v13, Lcom/google/android/material/textfield/TextInputEditText;

    .line 147
    .line 148
    if-eqz v13, :cond_2

    .line 149
    .line 150
    const v3, 0x7f0a055f

    .line 151
    .line 152
    .line 153
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    move-object v14, v5

    .line 158
    check-cast v14, Lcom/google/android/material/textfield/TextInputLayout;

    .line 159
    .line 160
    if-eqz v14, :cond_2

    .line 161
    .line 162
    const v3, 0x7f0a0560

    .line 163
    .line 164
    .line 165
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    move-object v15, v5

    .line 170
    check-cast v15, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 171
    .line 172
    if-eqz v15, :cond_2

    .line 173
    .line 174
    const v3, 0x7f0a0561

    .line 175
    .line 176
    .line 177
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    move-object/from16 v16, v5

    .line 182
    .line 183
    check-cast v16, Lcom/google/android/material/textfield/TextInputEditText;

    .line 184
    .line 185
    if-eqz v16, :cond_2

    .line 186
    .line 187
    const v3, 0x7f0a0562

    .line 188
    .line 189
    .line 190
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    check-cast v5, Lcom/google/android/material/textfield/TextInputLayout;

    .line 195
    .line 196
    if-eqz v5, :cond_2

    .line 197
    .line 198
    const v3, 0x7f0a0564

    .line 199
    .line 200
    .line 201
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    move-object/from16 v17, v5

    .line 206
    .line 207
    check-cast v17, Lcom/google/android/material/textfield/TextInputEditText;

    .line 208
    .line 209
    if-eqz v17, :cond_2

    .line 210
    .line 211
    const v3, 0x7f0a0565

    .line 212
    .line 213
    .line 214
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    check-cast v5, Lcom/google/android/material/textfield/TextInputLayout;

    .line 219
    .line 220
    if-eqz v5, :cond_2

    .line 221
    .line 222
    const v3, 0x7f0a0557

    .line 223
    .line 224
    .line 225
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    move-object/from16 v18, v5

    .line 230
    .line 231
    check-cast v18, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 232
    .line 233
    if-eqz v18, :cond_2

    .line 234
    .line 235
    const v3, 0x7f0a0566

    .line 236
    .line 237
    .line 238
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    move-object/from16 v19, v5

    .line 243
    .line 244
    check-cast v19, Lcom/google/android/material/textfield/TextInputEditText;

    .line 245
    .line 246
    if-eqz v19, :cond_2

    .line 247
    .line 248
    const v3, 0x7f0a0567

    .line 249
    .line 250
    .line 251
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    check-cast v5, Lcom/google/android/material/textfield/TextInputLayout;

    .line 256
    .line 257
    if-eqz v5, :cond_2

    .line 258
    .line 259
    const v3, 0x7f0a0569

    .line 260
    .line 261
    .line 262
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    move-object/from16 v20, v5

    .line 267
    .line 268
    check-cast v20, Lcom/google/android/material/textfield/TextInputEditText;

    .line 269
    .line 270
    if-eqz v20, :cond_2

    .line 271
    .line 272
    const v3, 0x7f0a056a

    .line 273
    .line 274
    .line 275
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    check-cast v5, Lcom/google/android/material/textfield/TextInputLayout;

    .line 280
    .line 281
    if-eqz v5, :cond_2

    .line 282
    .line 283
    const v3, 0x7f0a056b

    .line 284
    .line 285
    .line 286
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    move-object/from16 v21, v5

    .line 291
    .line 292
    check-cast v21, Landroid/widget/AutoCompleteTextView;

    .line 293
    .line 294
    if-eqz v21, :cond_2

    .line 295
    .line 296
    const v3, 0x7f0a056c

    .line 297
    .line 298
    .line 299
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    check-cast v5, Lcom/google/android/material/textfield/TextInputLayout;

    .line 304
    .line 305
    if-eqz v5, :cond_2

    .line 306
    .line 307
    const v3, 0x7f0a05f4

    .line 308
    .line 309
    .line 310
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    move-object/from16 v22, v5

    .line 315
    .line 316
    check-cast v22, Lcom/google/android/material/button/MaterialButton;

    .line 317
    .line 318
    if-eqz v22, :cond_2

    .line 319
    .line 320
    new-instance v5, Ldefpackage/pc1;

    .line 321
    .line 322
    invoke-direct/range {v5 .. v22}, Ldefpackage/pc1;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/google/android/material/button/MaterialButton;Lcom/google/android/material/button/MaterialButton;Lcom/google/android/material/button/MaterialButton;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;Landroid/widget/AutoCompleteTextView;Lcom/google/android/material/button/MaterialButton;)V

    .line 323
    .line 324
    .line 325
    iput-object v5, v0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 326
    .line 327
    invoke-virtual {v0}, Ldefpackage/kc1;->d()Ldefpackage/e75;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-static {v0}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    invoke-static {v0}, Ldefpackage/gh0;->q(Ldefpackage/f75;)Ldefpackage/tf0;

    .line 336
    .line 337
    .line 338
    move-result-object v5

    .line 339
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    new-instance v6, Ldefpackage/bq4;

    .line 346
    .line 347
    invoke-direct {v6, v1, v3, v5}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 348
    .line 349
    .line 350
    const-class v1, Ldefpackage/ta4;

    .line 351
    .line 352
    invoke-static {v1}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    invoke-virtual {v1}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    if-eqz v3, :cond_1

    .line 361
    .line 362
    const-string v5, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 363
    .line 364
    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    invoke-virtual {v6, v1, v3}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    check-cast v1, Ldefpackage/ta4;

    .line 373
    .line 374
    iput-object v1, v0, Ldefpackage/oe2;->m0:Ldefpackage/ta4;

    .line 375
    .line 376
    new-instance v5, Lcom/eddyizm/tempus/model/Server;

    .line 377
    .line 378
    const/4 v14, 0x0

    .line 379
    const-string v15, ""

    .line 380
    .line 381
    const-string v6, "Unselected"

    .line 382
    .line 383
    const-string v7, "Add new server"

    .line 384
    .line 385
    const-string v8, ""

    .line 386
    .line 387
    const-string v9, ""

    .line 388
    .line 389
    const-string v10, ""

    .line 390
    .line 391
    const-string v11, ""

    .line 392
    .line 393
    const-wide/16 v12, 0x0

    .line 394
    .line 395
    invoke-direct/range {v5 .. v15}, Lcom/eddyizm/tempus/model/Server;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;)V

    .line 396
    .line 397
    .line 398
    iget-object v1, v0, Ldefpackage/oe2;->m0:Ldefpackage/ta4;

    .line 399
    .line 400
    if-eqz v1, :cond_0

    .line 401
    .line 402
    iget-object v1, v1, Ldefpackage/ta4;->d:Ldefpackage/t24;

    .line 403
    .line 404
    invoke-virtual {v0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    new-instance v4, Ldefpackage/o;

    .line 409
    .line 410
    const/16 v6, 0x11

    .line 411
    .line 412
    invoke-direct {v4, v6, v0, v5}, Ldefpackage/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    new-instance v5, Ldefpackage/wd1;

    .line 416
    .line 417
    const/4 v6, 0x6

    .line 418
    invoke-direct {v5, v4, v6}, Ldefpackage/wd1;-><init>(Ldefpackage/if1;I)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v1, v3, v5}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 422
    .line 423
    .line 424
    iget-object v1, v0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 425
    .line 426
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    iget-object v1, v1, Ldefpackage/pc1;->p:Landroid/view/View;

    .line 430
    .line 431
    check-cast v1, Landroid/widget/AutoCompleteTextView;

    .line 432
    .line 433
    new-instance v3, Ldefpackage/ne2;

    .line 434
    .line 435
    invoke-direct {v3, v2, v0}, Ldefpackage/ne2;-><init>(ILdefpackage/kc1;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v1, v3}, Landroid/widget/AutoCompleteTextView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 439
    .line 440
    .line 441
    iget-object v1, v0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 442
    .line 443
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    iget-object v1, v1, Ldefpackage/pc1;->q:Landroid/view/View;

    .line 447
    .line 448
    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    .line 449
    .line 450
    new-instance v3, Ldefpackage/q6;

    .line 451
    .line 452
    const/16 v4, 0xc

    .line 453
    .line 454
    invoke-direct {v3, v4, v0}, Ldefpackage/q6;-><init>(ILjava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 458
    .line 459
    .line 460
    iget-object v1, v0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 461
    .line 462
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    iget-object v1, v1, Ldefpackage/pc1;->q:Landroid/view/View;

    .line 466
    .line 467
    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    .line 468
    .line 469
    new-instance v3, Ldefpackage/me2;

    .line 470
    .line 471
    const/4 v4, 0x3

    .line 472
    invoke-direct {v3, v0, v4}, Ldefpackage/me2;-><init>(Ldefpackage/oe2;I)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 476
    .line 477
    .line 478
    iget-object v1, v0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 479
    .line 480
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    iget-object v1, v1, Ldefpackage/pc1;->c:Landroid/widget/TextView;

    .line 484
    .line 485
    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    .line 486
    .line 487
    new-instance v3, Ldefpackage/me2;

    .line 488
    .line 489
    const/4 v4, 0x1

    .line 490
    invoke-direct {v3, v0, v4}, Ldefpackage/me2;-><init>(Ldefpackage/oe2;I)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 494
    .line 495
    .line 496
    iget-object v1, v0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 497
    .line 498
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    iget-object v1, v1, Ldefpackage/pc1;->d:Landroid/widget/TextView;

    .line 502
    .line 503
    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    .line 504
    .line 505
    new-instance v3, Ldefpackage/me2;

    .line 506
    .line 507
    invoke-direct {v3, v0, v2}, Ldefpackage/me2;-><init>(Ldefpackage/oe2;I)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 511
    .line 512
    .line 513
    iget-object v1, v0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 514
    .line 515
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 516
    .line 517
    .line 518
    iget-object v1, v1, Ldefpackage/pc1;->b:Landroid/view/View;

    .line 519
    .line 520
    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    .line 521
    .line 522
    new-instance v2, Ldefpackage/me2;

    .line 523
    .line 524
    const/4 v3, 0x5

    .line 525
    invoke-direct {v2, v0, v3}, Ldefpackage/me2;-><init>(Ldefpackage/oe2;I)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 529
    .line 530
    .line 531
    iget-object v1, v0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 532
    .line 533
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    iget-object v1, v1, Ldefpackage/pc1;->j:Landroid/view/View;

    .line 537
    .line 538
    check-cast v1, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 539
    .line 540
    new-instance v2, Ldefpackage/me2;

    .line 541
    .line 542
    const/4 v3, 0x2

    .line 543
    invoke-direct {v2, v0, v3}, Ldefpackage/me2;-><init>(Ldefpackage/oe2;I)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 547
    .line 548
    .line 549
    iget-object v1, v0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 550
    .line 551
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    iget-object v1, v1, Ldefpackage/pc1;->g:Landroid/widget/TextView;

    .line 555
    .line 556
    check-cast v1, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 557
    .line 558
    new-instance v2, Ldefpackage/me2;

    .line 559
    .line 560
    const/4 v3, 0x4

    .line 561
    invoke-direct {v2, v0, v3}, Ldefpackage/me2;-><init>(Ldefpackage/oe2;I)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 565
    .line 566
    .line 567
    iget-object v0, v0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 568
    .line 569
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    iget-object v0, v0, Ldefpackage/pc1;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 573
    .line 574
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    return-object v0

    .line 578
    :cond_0
    const-string v0, "serverViewModel"

    .line 579
    .line 580
    invoke-static {v0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    throw v4

    .line 584
    :cond_1
    const-string v0, "Local and anonymous classes can not be ViewModels"

    .line 585
    .line 586
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    return-object v4

    .line 590
    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    const-string v1, "Missing required view with ID: "

    .line 599
    .line 600
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    invoke-static {v0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    return-object v4
.end method

.method public final J()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 6
    .line 7
    return-void
.end method

.method public final i0()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Ldefpackage/pc1;->c:Landroid/widget/TextView;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 9
    .line 10
    const v1, 0x7f13027b

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v1}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v0, v0, Ldefpackage/pc1;->d:Landroid/widget/TextView;

    .line 26
    .line 27
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v0, v0, Ldefpackage/pc1;->q:Landroid/view/View;

    .line 39
    .line 40
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object v0, v0, Ldefpackage/pc1;->k:Landroid/view/View;

    .line 51
    .line 52
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 53
    .line 54
    const-string v1, ""

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v0, v0, Ldefpackage/pc1;->o:Landroid/view/View;

    .line 65
    .line 66
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object v0, v0, Ldefpackage/pc1;->l:Landroid/widget/TextView;

    .line 77
    .line 78
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget-object v0, v0, Ldefpackage/pc1;->n:Landroid/view/View;

    .line 89
    .line 90
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    iget-object v0, v0, Ldefpackage/pc1;->h:Landroid/widget/TextView;

    .line 101
    .line 102
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    .line 106
    .line 107
    iget-object p0, p0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object p0, p0, Ldefpackage/pc1;->e:Landroid/widget/TextView;

    .line 113
    .line 114
    check-cast p0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 115
    .line 116
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public final j0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldefpackage/oe2;->i0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ldefpackage/oe2;->o0:I

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v1, Ldefpackage/pc1;->p:Landroid/view/View;

    .line 13
    .line 14
    check-cast v1, Landroid/widget/AutoCompleteTextView;

    .line 15
    .line 16
    iget-object v2, p0, Ldefpackage/oe2;->n0:Ljava/util/ArrayList;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lcom/eddyizm/tempus/model/Server;

    .line 25
    .line 26
    invoke-virtual {v2}, Lcom/eddyizm/tempus/model/Server;->getServerName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v1, v2, v0}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;Z)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Ldefpackage/pc1;->p:Landroid/view/View;

    .line 39
    .line 40
    check-cast p0, Landroid/widget/AutoCompleteTextView;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->performCompletion()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    const-string p0, "serverList"

    .line 47
    .line 48
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    throw p0
.end method
