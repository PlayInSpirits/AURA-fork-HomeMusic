.class public final synthetic Ldefpackage/yo1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/cp1;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/cp1;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/yo1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/yo1;->o:Ldefpackage/cp1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 6

    .line 1
    iget p1, p0, Ldefpackage/yo1;->n:I

    .line 2
    .line 3
    const/16 v0, 0xa

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/16 v3, 0x14

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/yo1;->o:Ldefpackage/cp1;

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    packed-switch p1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Ldefpackage/cp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 16
    .line 17
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object v0, p1, Lcom/eddyizm/tempus/viewmodel/b;->e:Ldefpackage/pa;

    .line 22
    .line 23
    invoke-virtual {v0, v3, v4}, Ldefpackage/pa;->y(IZ)Ldefpackage/k03;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object p1, p1, Lcom/eddyizm/tempus/viewmodel/b;->p:Ldefpackage/k03;

    .line 28
    .line 29
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    new-instance v1, Ldefpackage/g7;

    .line 33
    .line 34
    invoke-direct {v1, p1, v2}, Ldefpackage/g7;-><init>(Ldefpackage/k03;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p0, v1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 38
    .line 39
    .line 40
    return v4

    .line 41
    :pswitch_0
    iget-object p1, p0, Ldefpackage/cp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 42
    .line 43
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iget-object v0, p1, Lcom/eddyizm/tempus/viewmodel/b;->e:Ldefpackage/pa;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    new-instance v1, Ldefpackage/k03;

    .line 53
    .line 54
    invoke-direct {v1}, Ldefpackage/ad2;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-static {v2}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v3}, Ldefpackage/pn4;->a()Ldefpackage/xc5;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v3}, Ldefpackage/xc5;->s()Lretrofit2/Call;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    new-instance v5, Ldefpackage/r8;

    .line 70
    .line 71
    invoke-direct {v5, v0, v1, v4}, Ldefpackage/r8;-><init>(Ljava/lang/Object;Ldefpackage/k03;I)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v3, v5}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p1, Lcom/eddyizm/tempus/viewmodel/b;->o:Ldefpackage/k03;

    .line 78
    .line 79
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    new-instance v0, Ldefpackage/g7;

    .line 83
    .line 84
    invoke-direct {v0, p1, v2}, Ldefpackage/g7;-><init>(Ldefpackage/k03;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, p0, v0}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 88
    .line 89
    .line 90
    return v4

    .line 91
    :pswitch_1
    iget-object p1, p0, Ldefpackage/cp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 92
    .line 93
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    iget-object v1, p1, Lcom/eddyizm/tempus/viewmodel/b;->c:Ldefpackage/xi4;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {v0, v4, v4}, Ldefpackage/xi4;->s(IZZ)Ldefpackage/k03;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-object p1, p1, Lcom/eddyizm/tempus/viewmodel/b;->n:Ldefpackage/k03;

    .line 107
    .line 108
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    new-instance v1, Ldefpackage/g7;

    .line 112
    .line 113
    invoke-direct {v1, p1, v2}, Ldefpackage/g7;-><init>(Ldefpackage/k03;I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, p0, v1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 117
    .line 118
    .line 119
    return v4

    .line 120
    :pswitch_2
    iget-object p1, p0, Ldefpackage/cp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 121
    .line 122
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-virtual {p1, p0}, Lcom/eddyizm/tempus/viewmodel/b;->g(Ldefpackage/ba2;)V

    .line 127
    .line 128
    .line 129
    return v4

    .line 130
    :pswitch_3
    iget-object p1, p0, Ldefpackage/cp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 131
    .line 132
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    iget-object v0, p1, Lcom/eddyizm/tempus/viewmodel/b;->d:Ldefpackage/rv2;

    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    const-string v0, "newest"

    .line 142
    .line 143
    invoke-static {v0, v3, v1, v1}, Ldefpackage/rv2;->m(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)Ldefpackage/k03;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iget-object v1, p1, Lcom/eddyizm/tempus/viewmodel/b;->w:Ldefpackage/k03;

    .line 148
    .line 149
    invoke-virtual {p1, v1}, Lcom/eddyizm/tempus/viewmodel/b;->h(Ldefpackage/k03;)Ldefpackage/mp1;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {v0, p0, p1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 154
    .line 155
    .line 156
    return v4

    .line 157
    :pswitch_4
    iget-object p1, p0, Ldefpackage/cp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 158
    .line 159
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    iget-object v0, p1, Lcom/eddyizm/tempus/viewmodel/b;->d:Ldefpackage/rv2;

    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    const-string v0, "frequent"

    .line 169
    .line 170
    invoke-static {v0, v3, v1, v1}, Ldefpackage/rv2;->m(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)Ldefpackage/k03;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget-object v1, p1, Lcom/eddyizm/tempus/viewmodel/b;->t:Ldefpackage/k03;

    .line 175
    .line 176
    invoke-virtual {p1, v1}, Lcom/eddyizm/tempus/viewmodel/b;->h(Ldefpackage/k03;)Ldefpackage/mp1;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-virtual {v0, p0, p1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 181
    .line 182
    .line 183
    return v4

    .line 184
    :pswitch_5
    iget-object p1, p0, Ldefpackage/cp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 185
    .line 186
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    iget-object v0, p1, Lcom/eddyizm/tempus/viewmodel/b;->d:Ldefpackage/rv2;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    const-string v0, "recent"

    .line 196
    .line 197
    invoke-static {v0, v3, v1, v1}, Ldefpackage/rv2;->m(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)Ldefpackage/k03;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    iget-object v1, p1, Lcom/eddyizm/tempus/viewmodel/b;->u:Ldefpackage/k03;

    .line 202
    .line 203
    invoke-virtual {p1, v1}, Lcom/eddyizm/tempus/viewmodel/b;->h(Ldefpackage/k03;)Ldefpackage/mp1;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {v0, p0, p1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 208
    .line 209
    .line 210
    return v4

    .line 211
    :pswitch_6
    iget-object p1, p0, Ldefpackage/cp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 212
    .line 213
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    iget-object v0, p1, Lcom/eddyizm/tempus/viewmodel/b;->e:Ldefpackage/pa;

    .line 218
    .line 219
    invoke-virtual {v0, v3, v4}, Ldefpackage/pa;->y(IZ)Ldefpackage/k03;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    iget-object p1, p1, Lcom/eddyizm/tempus/viewmodel/b;->s:Ldefpackage/k03;

    .line 224
    .line 225
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    new-instance v1, Ldefpackage/g7;

    .line 229
    .line 230
    invoke-direct {v1, p1, v2}, Ldefpackage/g7;-><init>(Ldefpackage/k03;I)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, p0, v1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 234
    .line 235
    .line 236
    return v4

    .line 237
    :pswitch_7
    iget-object p1, p0, Ldefpackage/cp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 238
    .line 239
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    iget-object v0, p1, Lcom/eddyizm/tempus/viewmodel/b;->d:Ldefpackage/rv2;

    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    invoke-static {v3, v4}, Ldefpackage/rv2;->o(IZ)Ldefpackage/k03;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    iget-object p1, p1, Lcom/eddyizm/tempus/viewmodel/b;->r:Ldefpackage/k03;

    .line 253
    .line 254
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    new-instance v1, Ldefpackage/g7;

    .line 258
    .line 259
    invoke-direct {v1, p1, v2}, Ldefpackage/g7;-><init>(Ldefpackage/k03;I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, p0, v1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 263
    .line 264
    .line 265
    return v4

    .line 266
    :pswitch_8
    iget-object p1, p0, Ldefpackage/cp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 267
    .line 268
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    iget-object v0, p1, Lcom/eddyizm/tempus/viewmodel/b;->c:Ldefpackage/xi4;

    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    invoke-static {v3, v4, v4}, Ldefpackage/xi4;->s(IZZ)Ldefpackage/k03;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    iget-object p1, p1, Lcom/eddyizm/tempus/viewmodel/b;->q:Ldefpackage/k03;

    .line 282
    .line 283
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    new-instance v1, Ldefpackage/g7;

    .line 287
    .line 288
    invoke-direct {v1, p1, v2}, Ldefpackage/g7;-><init>(Ldefpackage/k03;I)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, p0, v1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 292
    .line 293
    .line 294
    return v4

    .line 295
    :pswitch_9
    iget-object p1, p0, Ldefpackage/cp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 296
    .line 297
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    iget-object v2, p1, Lcom/eddyizm/tempus/viewmodel/b;->c:Ldefpackage/xi4;

    .line 302
    .line 303
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    invoke-static {v0, v1, v1}, Ldefpackage/xi4;->q(ILjava/lang/Integer;Ljava/lang/Integer;)Ldefpackage/k03;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    iget-object v1, p1, Lcom/eddyizm/tempus/viewmodel/b;->l:Ldefpackage/k03;

    .line 311
    .line 312
    invoke-virtual {p1, v1}, Lcom/eddyizm/tempus/viewmodel/b;->h(Ldefpackage/k03;)Ldefpackage/mp1;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    invoke-virtual {v0, p0, p1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 317
    .line 318
    .line 319
    return v4

    .line 320
    nop

    .line 321
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
