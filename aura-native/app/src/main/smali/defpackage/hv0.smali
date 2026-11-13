.class public final Ldefpackage/hv0;
.super Ldefpackage/ep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/wf1;


# instance fields
.field public final synthetic o:I

.field public p:Ldefpackage/jx3;

.field public q:Ldefpackage/jx3;

.field public r:I

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ldefpackage/z64;


# direct methods
.method public constructor <init>(Ldefpackage/jx3;Ldefpackage/z64;Ldefpackage/vd0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ldefpackage/hv0;->o:I

    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/hv0;->q:Ldefpackage/jx3;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/hv0;->t:Ldefpackage/z64;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p3}, Ldefpackage/ep4;-><init>(ILdefpackage/vd0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ldefpackage/z64;Ldefpackage/vd0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ldefpackage/hv0;->o:I

    .line 13
    iput-object p1, p0, Ldefpackage/hv0;->t:Ldefpackage/z64;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ldefpackage/ep4;-><init>(ILdefpackage/vd0;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/hv0;->o:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/hv0;->t:Ldefpackage/z64;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, Ldefpackage/hv0;

    .line 9
    .line 10
    invoke-direct {p0, v1, p2}, Ldefpackage/hv0;-><init>(Ldefpackage/z64;Ldefpackage/vd0;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ldefpackage/hv0;->s:Ljava/lang/Object;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    new-instance v0, Ldefpackage/hv0;

    .line 17
    .line 18
    iget-object p0, p0, Ldefpackage/hv0;->q:Ldefpackage/jx3;

    .line 19
    .line 20
    invoke-direct {v0, p0, v1, p2}, Ldefpackage/hv0;-><init>(Ldefpackage/jx3;Ldefpackage/z64;Ldefpackage/vd0;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, Ldefpackage/hv0;->s:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/hv0;->o:I

    .line 2
    .line 3
    sget-object v1, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ldefpackage/we0;

    .line 9
    .line 10
    check-cast p2, Ldefpackage/vd0;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Ldefpackage/hv0;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ldefpackage/hv0;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ldefpackage/hv0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ldefpackage/if1;

    .line 24
    .line 25
    check-cast p2, Ldefpackage/vd0;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Ldefpackage/hv0;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Ldefpackage/hv0;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Ldefpackage/hv0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Ldefpackage/hv0;->o:I

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    sget-object v2, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 6
    .line 7
    iget-object v3, p0, Ldefpackage/hv0;->t:Ldefpackage/z64;

    .line 8
    .line 9
    sget-object v4, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget v0, p0, Ldefpackage/hv0;->r:I

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_1

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    move-object v2, v6

    .line 25
    goto/16 :goto_a

    .line 26
    .line 27
    :pswitch_0
    iget-object v0, p0, Ldefpackage/hv0;->s:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ldefpackage/we0;

    .line 30
    .line 31
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :pswitch_1
    iget-object v0, p0, Ldefpackage/hv0;->s:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ldefpackage/we0;

    .line 38
    .line 39
    :goto_0
    :try_start_0
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :pswitch_2
    iget-object v0, p0, Ldefpackage/hv0;->s:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Ldefpackage/we0;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    :goto_1
    move-object v7, v0

    .line 49
    goto :goto_2

    .line 50
    :pswitch_3
    iget-object v0, p0, Ldefpackage/hv0;->p:Ldefpackage/jx3;

    .line 51
    .line 52
    iget-object v1, p0, Ldefpackage/hv0;->s:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Ldefpackage/we0;

    .line 55
    .line 56
    :try_start_1
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 57
    .line 58
    .line 59
    :cond_1
    move-object v7, v1

    .line 60
    goto/16 :goto_8

    .line 61
    .line 62
    :catch_0
    move-object v0, v1

    .line 63
    goto/16 :goto_9

    .line 64
    .line 65
    :pswitch_4
    iget-object v0, p0, Ldefpackage/hv0;->p:Ldefpackage/jx3;

    .line 66
    .line 67
    iget-object v1, p0, Ldefpackage/hv0;->s:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, Ldefpackage/we0;

    .line 70
    .line 71
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_6

    .line 75
    .line 76
    :pswitch_5
    iget-object v0, p0, Ldefpackage/hv0;->q:Ldefpackage/jx3;

    .line 77
    .line 78
    iget-object v1, p0, Ldefpackage/hv0;->p:Ldefpackage/jx3;

    .line 79
    .line 80
    iget-object v7, p0, Ldefpackage/hv0;->s:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v7, Ldefpackage/we0;

    .line 83
    .line 84
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_4

    .line 88
    :pswitch_6
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Ldefpackage/hv0;->s:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p1, Ldefpackage/we0;

    .line 94
    .line 95
    move-object v7, p1

    .line 96
    :cond_2
    :goto_2
    invoke-interface {v7}, Ldefpackage/we0;->e()Ldefpackage/ne0;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    sget-object v0, Ldefpackage/fz0;->h0:Ldefpackage/fz0;

    .line 101
    .line 102
    invoke-interface {p1, v0}, Ldefpackage/ne0;->K(Ldefpackage/me0;)Ldefpackage/le0;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    check-cast p1, Ldefpackage/s22;

    .line 107
    .line 108
    if-eqz p1, :cond_3

    .line 109
    .line 110
    invoke-interface {p1}, Ldefpackage/s22;->b()Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    goto :goto_3

    .line 115
    :cond_3
    move p1, v5

    .line 116
    :goto_3
    if-eqz p1, :cond_9

    .line 117
    .line 118
    new-instance v0, Ldefpackage/jx3;

    .line 119
    .line 120
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 121
    .line 122
    .line 123
    iget-object p1, v3, Ldefpackage/z64;->H:Ldefpackage/aw;

    .line 124
    .line 125
    if-eqz p1, :cond_5

    .line 126
    .line 127
    iput-object v7, p0, Ldefpackage/hv0;->s:Ljava/lang/Object;

    .line 128
    .line 129
    iput-object v0, p0, Ldefpackage/hv0;->p:Ldefpackage/jx3;

    .line 130
    .line 131
    iput-object v0, p0, Ldefpackage/hv0;->q:Ldefpackage/jx3;

    .line 132
    .line 133
    iput v5, p0, Ldefpackage/hv0;->r:I

    .line 134
    .line 135
    invoke-static {p1, p0}, Ldefpackage/aw;->H(Ldefpackage/aw;Ldefpackage/ep4;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-ne p1, v2, :cond_4

    .line 140
    .line 141
    goto/16 :goto_a

    .line 142
    .line 143
    :cond_4
    move-object v1, v0

    .line 144
    :goto_4
    check-cast p1, Ldefpackage/av0;

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_5
    move-object v1, v0

    .line 148
    move-object p1, v6

    .line 149
    :goto_5
    iput-object p1, v0, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 150
    .line 151
    iget-object p1, v1, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 152
    .line 153
    instance-of v0, p1, Ldefpackage/yu0;

    .line 154
    .line 155
    if-eqz v0, :cond_2

    .line 156
    .line 157
    check-cast p1, Ldefpackage/yu0;

    .line 158
    .line 159
    iput-object v7, p0, Ldefpackage/hv0;->s:Ljava/lang/Object;

    .line 160
    .line 161
    iput-object v1, p0, Ldefpackage/hv0;->p:Ldefpackage/jx3;

    .line 162
    .line 163
    iput-object v6, p0, Ldefpackage/hv0;->q:Ldefpackage/jx3;

    .line 164
    .line 165
    const/4 v0, 0x2

    .line 166
    iput v0, p0, Ldefpackage/hv0;->r:I

    .line 167
    .line 168
    invoke-static {v3, p1, p0}, Ldefpackage/z64;->u0(Ldefpackage/z64;Ldefpackage/yu0;Ldefpackage/wd0;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    if-ne p1, v2, :cond_6

    .line 173
    .line 174
    goto :goto_a

    .line 175
    :cond_6
    move-object v0, v1

    .line 176
    move-object v1, v7

    .line 177
    :goto_6
    :try_start_2
    new-instance p1, Ldefpackage/hv0;

    .line 178
    .line 179
    invoke-direct {p1, v0, v3, v6}, Ldefpackage/hv0;-><init>(Ldefpackage/jx3;Ldefpackage/z64;Ldefpackage/vd0;)V

    .line 180
    .line 181
    .line 182
    iput-object v1, p0, Ldefpackage/hv0;->s:Ljava/lang/Object;

    .line 183
    .line 184
    iput-object v0, p0, Ldefpackage/hv0;->p:Ldefpackage/jx3;

    .line 185
    .line 186
    const/4 v7, 0x3

    .line 187
    iput v7, p0, Ldefpackage/hv0;->r:I

    .line 188
    .line 189
    iget-object v7, v3, Ldefpackage/z64;->e0:Ldefpackage/g74;

    .line 190
    .line 191
    sget-object v8, Ldefpackage/h13;->o:Ldefpackage/h13;

    .line 192
    .line 193
    new-instance v9, Ldefpackage/r;

    .line 194
    .line 195
    const/16 v10, 0xc

    .line 196
    .line 197
    invoke-direct {v9, p1, v7, v6, v10}, Ldefpackage/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v7, v8, v9, p0}, Ldefpackage/g74;->g(Ldefpackage/h13;Ldefpackage/wf1;Ldefpackage/wd0;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p1
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 204
    if-ne p1, v2, :cond_7

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_7
    move-object p1, v4

    .line 208
    :goto_7
    if-ne p1, v2, :cond_1

    .line 209
    .line 210
    goto :goto_a

    .line 211
    :goto_8
    :try_start_3
    iget-object p1, v0, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 212
    .line 213
    instance-of v0, p1, Ldefpackage/zu0;

    .line 214
    .line 215
    if-eqz v0, :cond_8

    .line 216
    .line 217
    check-cast p1, Ldefpackage/zu0;

    .line 218
    .line 219
    iput-object v7, p0, Ldefpackage/hv0;->s:Ljava/lang/Object;

    .line 220
    .line 221
    iput-object v6, p0, Ldefpackage/hv0;->p:Ldefpackage/jx3;

    .line 222
    .line 223
    const/4 v0, 0x4

    .line 224
    iput v0, p0, Ldefpackage/hv0;->r:I

    .line 225
    .line 226
    invoke-static {v3, p1, p0}, Ldefpackage/z64;->v0(Ldefpackage/z64;Ldefpackage/zu0;Ldefpackage/wd0;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    if-ne p1, v2, :cond_2

    .line 231
    .line 232
    goto :goto_a

    .line 233
    :catch_1
    move-object v0, v7

    .line 234
    goto :goto_9

    .line 235
    :cond_8
    instance-of p1, p1, Ldefpackage/wu0;

    .line 236
    .line 237
    if-eqz p1, :cond_2

    .line 238
    .line 239
    iput-object v7, p0, Ldefpackage/hv0;->s:Ljava/lang/Object;

    .line 240
    .line 241
    iput-object v6, p0, Ldefpackage/hv0;->p:Ldefpackage/jx3;

    .line 242
    .line 243
    const/4 p1, 0x5

    .line 244
    iput p1, p0, Ldefpackage/hv0;->r:I

    .line 245
    .line 246
    invoke-static {v3, p0}, Ldefpackage/z64;->t0(Ldefpackage/z64;Ldefpackage/wd0;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p1
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    .line 250
    if-ne p1, v2, :cond_2

    .line 251
    .line 252
    goto :goto_a

    .line 253
    :catch_2
    :goto_9
    iput-object v0, p0, Ldefpackage/hv0;->s:Ljava/lang/Object;

    .line 254
    .line 255
    iput-object v6, p0, Ldefpackage/hv0;->p:Ldefpackage/jx3;

    .line 256
    .line 257
    const/4 p1, 0x6

    .line 258
    iput p1, p0, Ldefpackage/hv0;->r:I

    .line 259
    .line 260
    invoke-static {v3, p0}, Ldefpackage/z64;->t0(Ldefpackage/z64;Ldefpackage/wd0;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    if-ne p1, v2, :cond_0

    .line 265
    .line 266
    goto :goto_a

    .line 267
    :cond_9
    move-object v2, v4

    .line 268
    :goto_a
    return-object v2

    .line 269
    :pswitch_7
    iget-object v0, p0, Ldefpackage/hv0;->q:Ldefpackage/jx3;

    .line 270
    .line 271
    iget v7, p0, Ldefpackage/hv0;->r:I

    .line 272
    .line 273
    if-eqz v7, :cond_b

    .line 274
    .line 275
    if-ne v7, v5, :cond_a

    .line 276
    .line 277
    iget-object v1, p0, Ldefpackage/hv0;->p:Ldefpackage/jx3;

    .line 278
    .line 279
    iget-object v7, p0, Ldefpackage/hv0;->s:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v7, Ldefpackage/if1;

    .line 282
    .line 283
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    goto :goto_d

    .line 287
    :cond_a
    invoke-static {v1}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    move-object v2, v6

    .line 291
    goto :goto_f

    .line 292
    :cond_b
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    iget-object p1, p0, Ldefpackage/hv0;->s:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast p1, Ldefpackage/if1;

    .line 298
    .line 299
    move-object v7, p1

    .line 300
    :goto_b
    iget-object p1, v0, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 301
    .line 302
    instance-of v1, p1, Ldefpackage/zu0;

    .line 303
    .line 304
    if-nez v1, :cond_10

    .line 305
    .line 306
    instance-of v1, p1, Ldefpackage/wu0;

    .line 307
    .line 308
    if-nez v1, :cond_10

    .line 309
    .line 310
    instance-of v1, p1, Ldefpackage/xu0;

    .line 311
    .line 312
    if-eqz v1, :cond_c

    .line 313
    .line 314
    check-cast p1, Ldefpackage/xu0;

    .line 315
    .line 316
    goto :goto_c

    .line 317
    :cond_c
    move-object p1, v6

    .line 318
    :goto_c
    if-eqz p1, :cond_d

    .line 319
    .line 320
    invoke-interface {v7, p1}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    :cond_d
    iget-object p1, v3, Ldefpackage/z64;->H:Ldefpackage/aw;

    .line 324
    .line 325
    if-eqz p1, :cond_f

    .line 326
    .line 327
    iput-object v7, p0, Ldefpackage/hv0;->s:Ljava/lang/Object;

    .line 328
    .line 329
    iput-object v0, p0, Ldefpackage/hv0;->p:Ldefpackage/jx3;

    .line 330
    .line 331
    iput v5, p0, Ldefpackage/hv0;->r:I

    .line 332
    .line 333
    invoke-static {p1, p0}, Ldefpackage/aw;->H(Ldefpackage/aw;Ldefpackage/ep4;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    if-ne p1, v2, :cond_e

    .line 338
    .line 339
    goto :goto_f

    .line 340
    :cond_e
    move-object v1, v0

    .line 341
    :goto_d
    check-cast p1, Ldefpackage/av0;

    .line 342
    .line 343
    goto :goto_e

    .line 344
    :cond_f
    move-object v1, v0

    .line 345
    move-object p1, v6

    .line 346
    :goto_e
    iput-object p1, v1, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 347
    .line 348
    goto :goto_b

    .line 349
    :cond_10
    move-object v2, v4

    .line 350
    :goto_f
    return-object v2

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
    .end packed-switch

    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
