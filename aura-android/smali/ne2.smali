.class public final synthetic Lne2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lkc1;


# direct methods
.method public synthetic constructor <init>(ILkc1;)V
    .locals 0

    .line 1
    iput p1, p0, Lne2;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Lne2;->o:Lkc1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3

    .line 1
    iget p1, p0, Lne2;->n:I

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    const/4 p4, 0x0

    .line 5
    iget-object p0, p0, Lne2;->o:Lkc1;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Leu3;

    .line 11
    .line 12
    iget-object p1, p0, Leu3;->M0:Landroid/widget/ArrayAdapter;

    .line 13
    .line 14
    invoke-virtual {p1, p3}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/String;

    .line 19
    .line 20
    iput-boolean p2, p0, Leu3;->N0:Z

    .line 21
    .line 22
    iget-object p2, p0, Leu3;->J0:Lw12;

    .line 23
    .line 24
    iget-object p2, p2, Lw12;->e:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p2, Lcom/google/android/material/textfield/TextInputEditText;

    .line 27
    .line 28
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    iget-object p2, p0, Leu3;->J0:Lw12;

    .line 32
    .line 33
    iget-object p2, p2, Lw12;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p2, Lcom/google/android/material/textfield/TextInputEditText;

    .line 36
    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move p1, p4

    .line 45
    :goto_0
    invoke-virtual {p2, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 46
    .line 47
    .line 48
    iput-boolean p4, p0, Leu3;->N0:Z

    .line 49
    .line 50
    iget-object p0, p0, Leu3;->J0:Lw12;

    .line 51
    .line 52
    if-eqz p0, :cond_1

    .line 53
    .line 54
    iget-object p0, p0, Lw12;->g:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, Landroid/widget/ListView;

    .line 57
    .line 58
    const/16 p1, 0x8

    .line 59
    .line 60
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void

    .line 64
    :pswitch_0
    check-cast p0, Loe2;

    .line 65
    .line 66
    iput p3, p0, Loe2;->o0:I

    .line 67
    .line 68
    if-nez p3, :cond_2

    .line 69
    .line 70
    invoke-virtual {p0}, Loe2;->i0()V

    .line 71
    .line 72
    .line 73
    goto/16 :goto_4

    .line 74
    .line 75
    :cond_2
    iget-object p1, p0, Loe2;->l0:Lpc1;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object p1, p1, Lpc1;->c:Landroid/widget/TextView;

    .line 81
    .line 82
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 83
    .line 84
    const p5, 0x7f13027f

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p5}, Lkc1;->s(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p5

    .line 91
    invoke-virtual {p1, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Loe2;->l0:Lpc1;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object p1, p1, Lpc1;->d:Landroid/widget/TextView;

    .line 100
    .line 101
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 102
    .line 103
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Loe2;->l0:Lpc1;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object p1, p1, Lpc1;->q:Landroid/view/View;

    .line 112
    .line 113
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 114
    .line 115
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, Loe2;->l0:Lpc1;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget-object p1, p1, Lpc1;->k:Landroid/view/View;

    .line 124
    .line 125
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 126
    .line 127
    iget-object p5, p0, Loe2;->n0:Ljava/util/ArrayList;

    .line 128
    .line 129
    const/4 v0, 0x0

    .line 130
    const-string v1, "serverList"

    .line 131
    .line 132
    if-eqz p5, :cond_c

    .line 133
    .line 134
    invoke-virtual {p5, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p5

    .line 138
    check-cast p5, Lcom/eddyizm/tempus/model/Server;

    .line 139
    .line 140
    invoke-virtual {p5}, Lcom/eddyizm/tempus/model/Server;->getServerName()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p5

    .line 144
    invoke-virtual {p1, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    .line 146
    .line 147
    iget-object p1, p0, Loe2;->l0:Lpc1;

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    iget-object p1, p1, Lpc1;->o:Landroid/view/View;

    .line 153
    .line 154
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 155
    .line 156
    iget-object p5, p0, Loe2;->n0:Ljava/util/ArrayList;

    .line 157
    .line 158
    if-eqz p5, :cond_b

    .line 159
    .line 160
    invoke-virtual {p5, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p5

    .line 164
    check-cast p5, Lcom/eddyizm/tempus/model/Server;

    .line 165
    .line 166
    invoke-virtual {p5}, Lcom/eddyizm/tempus/model/Server;->getUsername()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p5

    .line 170
    invoke-virtual {p1, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    .line 172
    .line 173
    iget-object p1, p0, Loe2;->l0:Lpc1;

    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    iget-object p1, p1, Lpc1;->l:Landroid/widget/TextView;

    .line 179
    .line 180
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 181
    .line 182
    iget-object p5, p0, Loe2;->n0:Ljava/util/ArrayList;

    .line 183
    .line 184
    if-eqz p5, :cond_a

    .line 185
    .line 186
    invoke-virtual {p5, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p5

    .line 190
    check-cast p5, Lcom/eddyizm/tempus/model/Server;

    .line 191
    .line 192
    invoke-virtual {p5}, Lcom/eddyizm/tempus/model/Server;->getPassword()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p5

    .line 196
    invoke-virtual {p1, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 197
    .line 198
    .line 199
    iget-object p1, p0, Loe2;->l0:Lpc1;

    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    iget-object p1, p1, Lpc1;->n:Landroid/view/View;

    .line 205
    .line 206
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 207
    .line 208
    iget-object p5, p0, Loe2;->n0:Ljava/util/ArrayList;

    .line 209
    .line 210
    if-eqz p5, :cond_9

    .line 211
    .line 212
    invoke-virtual {p5, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p5

    .line 216
    check-cast p5, Lcom/eddyizm/tempus/model/Server;

    .line 217
    .line 218
    invoke-virtual {p5}, Lcom/eddyizm/tempus/model/Server;->getAddress()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p5

    .line 222
    invoke-virtual {p1, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 223
    .line 224
    .line 225
    iget-object p1, p0, Loe2;->n0:Ljava/util/ArrayList;

    .line 226
    .line 227
    if-eqz p1, :cond_8

    .line 228
    .line 229
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    check-cast p1, Lcom/eddyizm/tempus/model/Server;

    .line 234
    .line 235
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Server;->getLocalAddress()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    const-string p5, ""

    .line 240
    .line 241
    if-eqz p1, :cond_4

    .line 242
    .line 243
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    if-nez v2, :cond_3

    .line 248
    .line 249
    goto :goto_1

    .line 250
    :cond_3
    iget-object v2, p0, Loe2;->l0:Lpc1;

    .line 251
    .line 252
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    iget-object v2, v2, Lpc1;->j:Landroid/view/View;

    .line 256
    .line 257
    check-cast v2, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 258
    .line 259
    invoke-virtual {v2, p2}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 260
    .line 261
    .line 262
    iget-object v2, p0, Loe2;->l0:Lpc1;

    .line 263
    .line 264
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    iget-object v2, v2, Lpc1;->i:Landroid/view/View;

    .line 268
    .line 269
    check-cast v2, Lcom/google/android/material/textfield/TextInputLayout;

    .line 270
    .line 271
    invoke-virtual {v2, p4}, Landroid/view/View;->setVisibility(I)V

    .line 272
    .line 273
    .line 274
    iget-object v2, p0, Loe2;->l0:Lpc1;

    .line 275
    .line 276
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    iget-object v2, v2, Lpc1;->h:Landroid/widget/TextView;

    .line 280
    .line 281
    check-cast v2, Lcom/google/android/material/textfield/TextInputEditText;

    .line 282
    .line 283
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 284
    .line 285
    .line 286
    goto :goto_2

    .line 287
    :cond_4
    :goto_1
    iget-object p1, p0, Loe2;->l0:Lpc1;

    .line 288
    .line 289
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    iget-object p1, p1, Lpc1;->h:Landroid/widget/TextView;

    .line 293
    .line 294
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 295
    .line 296
    invoke-virtual {p1, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 297
    .line 298
    .line 299
    :goto_2
    iget-object p1, p0, Loe2;->n0:Ljava/util/ArrayList;

    .line 300
    .line 301
    if-eqz p1, :cond_7

    .line 302
    .line 303
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    check-cast p1, Lcom/eddyizm/tempus/model/Server;

    .line 308
    .line 309
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Server;->getClientCert()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    if-eqz p1, :cond_6

    .line 314
    .line 315
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 316
    .line 317
    .line 318
    move-result p3

    .line 319
    if-nez p3, :cond_5

    .line 320
    .line 321
    goto :goto_3

    .line 322
    :cond_5
    iget-object p3, p0, Loe2;->l0:Lpc1;

    .line 323
    .line 324
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    iget-object p3, p3, Lpc1;->g:Landroid/widget/TextView;

    .line 328
    .line 329
    check-cast p3, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 330
    .line 331
    invoke-virtual {p3, p2}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 332
    .line 333
    .line 334
    iget-object p2, p0, Loe2;->l0:Lpc1;

    .line 335
    .line 336
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    iget-object p2, p2, Lpc1;->f:Landroid/view/View;

    .line 340
    .line 341
    check-cast p2, Lcom/google/android/material/textfield/TextInputLayout;

    .line 342
    .line 343
    invoke-virtual {p2, p4}, Landroid/view/View;->setVisibility(I)V

    .line 344
    .line 345
    .line 346
    iget-object p0, p0, Loe2;->l0:Lpc1;

    .line 347
    .line 348
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    iget-object p0, p0, Lpc1;->e:Landroid/widget/TextView;

    .line 352
    .line 353
    check-cast p0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 354
    .line 355
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 356
    .line 357
    .line 358
    goto :goto_4

    .line 359
    :cond_6
    :goto_3
    iget-object p0, p0, Loe2;->l0:Lpc1;

    .line 360
    .line 361
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    iget-object p0, p0, Lpc1;->e:Landroid/widget/TextView;

    .line 365
    .line 366
    check-cast p0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 367
    .line 368
    invoke-virtual {p0, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 369
    .line 370
    .line 371
    :goto_4
    return-void

    .line 372
    :cond_7
    invoke-static {v1}, Lh12;->Q(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    throw v0

    .line 376
    :cond_8
    invoke-static {v1}, Lh12;->Q(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    throw v0

    .line 380
    :cond_9
    invoke-static {v1}, Lh12;->Q(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    throw v0

    .line 384
    :cond_a
    invoke-static {v1}, Lh12;->Q(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    throw v0

    .line 388
    :cond_b
    invoke-static {v1}, Lh12;->Q(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    throw v0

    .line 392
    :cond_c
    invoke-static {v1}, Lh12;->Q(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    throw v0

    .line 396
    nop

    .line 397
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
