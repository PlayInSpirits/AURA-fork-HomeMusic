.class public final Ldefpackage/qv3;
.super Ldefpackage/ep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/wf1;


# instance fields
.field public final synthetic o:I

.field public p:Ljava/lang/Object;

.field public q:I

.field public r:Ljava/lang/Object;

.field public s:Ljava/lang/Object;

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldefpackage/gf1;Ldefpackage/vd0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ldefpackage/qv3;->o:I

    .line 14
    iput-object p1, p0, Ldefpackage/qv3;->u:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ldefpackage/ep4;-><init>(ILdefpackage/vd0;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V
    .locals 0

    .line 1
    iput p5, p0, Ldefpackage/qv3;->o:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/qv3;->s:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ldefpackage/qv3;->t:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Ldefpackage/qv3;->u:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p4}, Ldefpackage/ep4;-><init>(ILdefpackage/vd0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;
    .locals 9

    .line 1
    iget v0, p0, Ldefpackage/qv3;->o:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/qv3;->u:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, Ldefpackage/qv3;

    .line 9
    .line 10
    iget-object v0, p0, Ldefpackage/qv3;->s:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, v0

    .line 13
    check-cast v3, Ldefpackage/hw4;

    .line 14
    .line 15
    iget-object p0, p0, Ldefpackage/qv3;->t:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v4, p0

    .line 18
    check-cast v4, Ldefpackage/g74;

    .line 19
    .line 20
    move-object v5, v1

    .line 21
    check-cast v5, Ldefpackage/jx3;

    .line 22
    .line 23
    const/4 v7, 0x2

    .line 24
    move-object v6, p2

    .line 25
    invoke-direct/range {v2 .. v7}, Ldefpackage/qv3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, v2, Ldefpackage/qv3;->p:Ljava/lang/Object;

    .line 29
    .line 30
    return-object v2

    .line 31
    :pswitch_0
    move-object v6, p2

    .line 32
    new-instance p0, Ldefpackage/qv3;

    .line 33
    .line 34
    check-cast v1, Ldefpackage/gf1;

    .line 35
    .line 36
    invoke-direct {p0, v1, v6}, Ldefpackage/qv3;-><init>(Ldefpackage/gf1;Ldefpackage/vd0;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Ldefpackage/qv3;->t:Ljava/lang/Object;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_1
    move-object v6, p2

    .line 43
    new-instance v3, Ldefpackage/qv3;

    .line 44
    .line 45
    iget-object p2, p0, Ldefpackage/qv3;->s:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v4, p2

    .line 48
    check-cast v4, Ldefpackage/tv3;

    .line 49
    .line 50
    iget-object p0, p0, Ldefpackage/qv3;->t:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v5, p0

    .line 53
    check-cast v5, Ldefpackage/sv3;

    .line 54
    .line 55
    check-cast v1, Ldefpackage/ed;

    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    move-object v7, v6

    .line 59
    move-object v6, v1

    .line 60
    invoke-direct/range {v3 .. v8}, Ldefpackage/qv3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 61
    .line 62
    .line 63
    iput-object p1, v3, Ldefpackage/qv3;->p:Ljava/lang/Object;

    .line 64
    .line 65
    return-object v3

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/qv3;->o:I

    .line 2
    .line 3
    sget-object v1, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ldefpackage/e74;

    .line 9
    .line 10
    check-cast p2, Ldefpackage/vd0;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Ldefpackage/qv3;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ldefpackage/qv3;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ldefpackage/qv3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ldefpackage/q81;

    .line 24
    .line 25
    check-cast p2, Ldefpackage/vd0;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Ldefpackage/qv3;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Ldefpackage/qv3;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Ldefpackage/qv3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    sget-object p0, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_1
    check-cast p1, Ldefpackage/we0;

    .line 40
    .line 41
    check-cast p2, Ldefpackage/vd0;

    .line 42
    .line 43
    invoke-virtual {p0, p1, p2}, Ldefpackage/qv3;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Ldefpackage/qv3;

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Ldefpackage/qv3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ldefpackage/qv3;->o:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v1, Ldefpackage/qv3;->t:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ldefpackage/g74;

    .line 14
    .line 15
    iget-object v2, v1, Ldefpackage/qv3;->u:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ldefpackage/jx3;

    .line 18
    .line 19
    iget-object v5, v1, Ldefpackage/qv3;->s:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v5, Ldefpackage/hw4;

    .line 22
    .line 23
    sget-object v6, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 24
    .line 25
    iget v7, v1, Ldefpackage/qv3;->q:I

    .line 26
    .line 27
    if-eqz v7, :cond_1

    .line 28
    .line 29
    if-ne v7, v3, :cond_0

    .line 30
    .line 31
    iget-object v7, v1, Ldefpackage/qv3;->r:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v7, Ldefpackage/jx3;

    .line 34
    .line 35
    iget-object v8, v1, Ldefpackage/qv3;->p:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v8, Ldefpackage/e74;

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object v9, v8

    .line 43
    move-object v8, v7

    .line 44
    move-object/from16 v7, p1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_2

    .line 53
    .line 54
    :cond_1
    invoke-static/range {p1 .. p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v7, v1, Ldefpackage/qv3;->p:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v7, Ldefpackage/e74;

    .line 60
    .line 61
    iget-object v8, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v8, Ldefpackage/fw4;

    .line 64
    .line 65
    iget-wide v8, v8, Ldefpackage/fw4;->a:J

    .line 66
    .line 67
    invoke-virtual {v0, v8, v9}, Ldefpackage/g74;->f(J)J

    .line 68
    .line 69
    .line 70
    move-result-wide v8

    .line 71
    invoke-virtual {v0, v8, v9}, Ldefpackage/g74;->j(J)F

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    iget-object v9, v5, Ldefpackage/ir2;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v9, Ldefpackage/g74;

    .line 78
    .line 79
    invoke-virtual {v9, v8}, Ldefpackage/g74;->e(F)F

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    invoke-virtual {v9, v8}, Ldefpackage/g74;->i(F)J

    .line 84
    .line 85
    .line 86
    move-result-wide v10

    .line 87
    invoke-virtual {v7, v3, v10, v11}, Ldefpackage/e74;->a(IJ)J

    .line 88
    .line 89
    .line 90
    move-result-wide v10

    .line 91
    invoke-virtual {v9, v10, v11}, Ldefpackage/g74;->f(J)J

    .line 92
    .line 93
    .line 94
    move-result-wide v10

    .line 95
    invoke-virtual {v9, v10, v11}, Ldefpackage/g74;->h(J)F

    .line 96
    .line 97
    .line 98
    move-object v8, v7

    .line 99
    :goto_0
    iget-object v7, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v7, Ldefpackage/fw4;

    .line 102
    .line 103
    iget-boolean v7, v7, Ldefpackage/fw4;->c:Z

    .line 104
    .line 105
    if-nez v7, :cond_4

    .line 106
    .line 107
    iget-object v7, v5, Ldefpackage/hw4;->f:Ldefpackage/aw;

    .line 108
    .line 109
    iput-object v8, v1, Ldefpackage/qv3;->p:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object v2, v1, Ldefpackage/qv3;->r:Ljava/lang/Object;

    .line 112
    .line 113
    iput v3, v1, Ldefpackage/qv3;->q:I

    .line 114
    .line 115
    new-instance v9, Ldefpackage/p;

    .line 116
    .line 117
    const/16 v10, 0xf

    .line 118
    .line 119
    invoke-direct {v9, v7, v4, v10}, Ldefpackage/p;-><init>(Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 120
    .line 121
    .line 122
    invoke-static {v9, v1}, Ldefpackage/te5;->j(Ldefpackage/wf1;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    if-ne v7, v6, :cond_2

    .line 127
    .line 128
    move-object v4, v6

    .line 129
    goto/16 :goto_2

    .line 130
    .line 131
    :cond_2
    move-object v9, v8

    .line 132
    move-object v8, v2

    .line 133
    :goto_1
    iput-object v7, v8, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 134
    .line 135
    iget-object v7, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v7, Ldefpackage/fw4;

    .line 138
    .line 139
    iget-object v8, v5, Ldefpackage/ir2;->e:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v8, Ldefpackage/rf2;

    .line 142
    .line 143
    iget-wide v10, v7, Ldefpackage/fw4;->b:J

    .line 144
    .line 145
    iget-wide v12, v7, Ldefpackage/fw4;->a:J

    .line 146
    .line 147
    iget-object v7, v8, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v7, Ldefpackage/m45;

    .line 150
    .line 151
    const/16 p1, 0x20

    .line 152
    .line 153
    shr-long v14, v12, p1

    .line 154
    .line 155
    long-to-int v14, v14

    .line 156
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 157
    .line 158
    .line 159
    move-result v14

    .line 160
    invoke-virtual {v7, v10, v11, v14}, Ldefpackage/m45;->a(JF)V

    .line 161
    .line 162
    .line 163
    iget-object v7, v8, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v7, Ldefpackage/m45;

    .line 166
    .line 167
    const-wide v14, 0xffffffffL

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    and-long/2addr v12, v14

    .line 173
    long-to-int v8, v12

    .line 174
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    invoke-virtual {v7, v10, v11, v8}, Ldefpackage/m45;->a(JF)V

    .line 179
    .line 180
    .line 181
    iget-object v7, v5, Ldefpackage/hw4;->f:Ldefpackage/aw;

    .line 182
    .line 183
    invoke-static {v7}, Ldefpackage/hw4;->G(Ldefpackage/aw;)Ldefpackage/fw4;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    if-eqz v7, :cond_3

    .line 188
    .line 189
    iget-object v8, v5, Ldefpackage/ir2;->e:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v8, Ldefpackage/rf2;

    .line 192
    .line 193
    iget-wide v10, v7, Ldefpackage/fw4;->b:J

    .line 194
    .line 195
    iget-wide v12, v7, Ldefpackage/fw4;->a:J

    .line 196
    .line 197
    move-wide/from16 v16, v14

    .line 198
    .line 199
    iget-object v14, v8, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v14, Ldefpackage/m45;

    .line 202
    .line 203
    shr-long v3, v12, p1

    .line 204
    .line 205
    long-to-int v3, v3

    .line 206
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    invoke-virtual {v14, v10, v11, v3}, Ldefpackage/m45;->a(JF)V

    .line 211
    .line 212
    .line 213
    iget-object v3, v8, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v3, Ldefpackage/m45;

    .line 216
    .line 217
    and-long v12, v12, v16

    .line 218
    .line 219
    long-to-int v4, v12

    .line 220
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    invoke-virtual {v3, v10, v11, v4}, Ldefpackage/m45;->a(JF)V

    .line 225
    .line 226
    .line 227
    iget-object v3, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v3, Ldefpackage/fw4;

    .line 230
    .line 231
    invoke-virtual {v3, v7}, Ldefpackage/fw4;->a(Ldefpackage/fw4;)Ldefpackage/fw4;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    iput-object v3, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 236
    .line 237
    :cond_3
    iget-object v3, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v3, Ldefpackage/fw4;

    .line 240
    .line 241
    iget-wide v3, v3, Ldefpackage/fw4;->a:J

    .line 242
    .line 243
    invoke-virtual {v0, v3, v4}, Ldefpackage/g74;->f(J)J

    .line 244
    .line 245
    .line 246
    move-result-wide v3

    .line 247
    invoke-virtual {v0, v3, v4}, Ldefpackage/g74;->j(J)F

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    iget-object v4, v5, Ldefpackage/ir2;->b:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v4, Ldefpackage/g74;

    .line 254
    .line 255
    invoke-virtual {v4, v3}, Ldefpackage/g74;->e(F)F

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    invoke-virtual {v4, v3}, Ldefpackage/g74;->i(F)J

    .line 260
    .line 261
    .line 262
    move-result-wide v7

    .line 263
    const/4 v3, 0x1

    .line 264
    invoke-virtual {v9, v3, v7, v8}, Ldefpackage/e74;->a(IJ)J

    .line 265
    .line 266
    .line 267
    move-result-wide v7

    .line 268
    invoke-virtual {v4, v7, v8}, Ldefpackage/g74;->f(J)J

    .line 269
    .line 270
    .line 271
    move-result-wide v7

    .line 272
    invoke-virtual {v4, v7, v8}, Ldefpackage/g74;->h(J)F

    .line 273
    .line 274
    .line 275
    move-object v8, v9

    .line 276
    const/4 v3, 0x1

    .line 277
    const/4 v4, 0x0

    .line 278
    goto/16 :goto_0

    .line 279
    .line 280
    :cond_4
    sget-object v4, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 281
    .line 282
    :goto_2
    return-object v4

    .line 283
    :pswitch_0
    iget-object v0, v1, Ldefpackage/qv3;->u:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v0, Ldefpackage/gf1;

    .line 286
    .line 287
    sget-object v3, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 288
    .line 289
    iget v4, v1, Ldefpackage/qv3;->q:I

    .line 290
    .line 291
    const/4 v5, 0x3

    .line 292
    const/4 v6, 0x2

    .line 293
    if-eqz v4, :cond_8

    .line 294
    .line 295
    const/4 v7, 0x1

    .line 296
    if-eq v4, v7, :cond_5

    .line 297
    .line 298
    if-eq v4, v6, :cond_7

    .line 299
    .line 300
    if-ne v4, v5, :cond_6

    .line 301
    .line 302
    :cond_5
    iget-object v2, v1, Ldefpackage/qv3;->p:Ljava/lang/Object;

    .line 303
    .line 304
    iget-object v4, v1, Ldefpackage/qv3;->s:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v4, Ldefpackage/y00;

    .line 307
    .line 308
    iget-object v7, v1, Ldefpackage/qv3;->r:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v7, Ldefpackage/pz1;

    .line 311
    .line 312
    iget-object v8, v1, Ldefpackage/qv3;->t:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v8, Ldefpackage/q81;

    .line 315
    .line 316
    :try_start_0
    invoke-static/range {p1 .. p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 317
    .line 318
    .line 319
    goto :goto_3

    .line 320
    :catchall_0
    move-exception v0

    .line 321
    goto/16 :goto_7

    .line 322
    .line 323
    :cond_6
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 324
    .line 325
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    const/4 v4, 0x0

    .line 329
    goto/16 :goto_6

    .line 330
    .line 331
    :cond_7
    iget-object v2, v1, Ldefpackage/qv3;->p:Ljava/lang/Object;

    .line 332
    .line 333
    iget-object v4, v1, Ldefpackage/qv3;->s:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v4, Ldefpackage/y00;

    .line 336
    .line 337
    iget-object v7, v1, Ldefpackage/qv3;->r:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v7, Ldefpackage/pz1;

    .line 340
    .line 341
    iget-object v8, v1, Ldefpackage/qv3;->t:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v8, Ldefpackage/q81;

    .line 344
    .line 345
    :try_start_1
    invoke-static/range {p1 .. p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 346
    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_8
    invoke-static/range {p1 .. p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    iget-object v4, v1, Ldefpackage/qv3;->t:Ljava/lang/Object;

    .line 353
    .line 354
    move-object v8, v4

    .line 355
    check-cast v8, Ldefpackage/q81;

    .line 356
    .line 357
    new-instance v7, Ldefpackage/pz1;

    .line 358
    .line 359
    const/16 v4, 0x16

    .line 360
    .line 361
    invoke-direct {v7, v4, v2}, Ldefpackage/pz1;-><init>(IZ)V

    .line 362
    .line 363
    .line 364
    new-instance v2, Ldefpackage/jf4;

    .line 365
    .line 366
    invoke-direct {v2}, Ldefpackage/jf4;-><init>()V

    .line 367
    .line 368
    .line 369
    iput-object v2, v7, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 370
    .line 371
    const/4 v2, 0x6

    .line 372
    const/4 v4, 0x1

    .line 373
    const/4 v15, 0x0

    .line 374
    invoke-static {v4, v2, v15}, Ldefpackage/su3;->a(IILdefpackage/wv;)Ldefpackage/aw;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    :try_start_2
    invoke-virtual {v7, v2, v0}, Ldefpackage/pz1;->H(Ldefpackage/y00;Ldefpackage/gf1;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    iput-object v8, v1, Ldefpackage/qv3;->t:Ljava/lang/Object;

    .line 383
    .line 384
    iput-object v7, v1, Ldefpackage/qv3;->r:Ljava/lang/Object;

    .line 385
    .line 386
    iput-object v2, v1, Ldefpackage/qv3;->s:Ljava/lang/Object;

    .line 387
    .line 388
    iput-object v4, v1, Ldefpackage/qv3;->p:Ljava/lang/Object;

    .line 389
    .line 390
    const/4 v9, 0x1

    .line 391
    iput v9, v1, Ldefpackage/qv3;->q:I

    .line 392
    .line 393
    invoke-interface {v8, v4, v1}, Ldefpackage/q81;->b(Ljava/lang/Object;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 397
    if-ne v9, v3, :cond_9

    .line 398
    .line 399
    goto :goto_5

    .line 400
    :cond_9
    move-object/from16 v18, v4

    .line 401
    .line 402
    move-object v4, v2

    .line 403
    move-object/from16 v2, v18

    .line 404
    .line 405
    :cond_a
    :goto_3
    :try_start_3
    iput-object v8, v1, Ldefpackage/qv3;->t:Ljava/lang/Object;

    .line 406
    .line 407
    iput-object v7, v1, Ldefpackage/qv3;->r:Ljava/lang/Object;

    .line 408
    .line 409
    iput-object v4, v1, Ldefpackage/qv3;->s:Ljava/lang/Object;

    .line 410
    .line 411
    iput-object v2, v1, Ldefpackage/qv3;->p:Ljava/lang/Object;

    .line 412
    .line 413
    iput v6, v1, Ldefpackage/qv3;->q:I

    .line 414
    .line 415
    invoke-interface {v4, v1}, Ldefpackage/y00;->h(Ldefpackage/ep4;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v9

    .line 419
    if-ne v9, v3, :cond_b

    .line 420
    .line 421
    goto :goto_5

    .line 422
    :cond_b
    :goto_4
    invoke-virtual {v7, v4, v0}, Ldefpackage/pz1;->H(Ldefpackage/y00;Ldefpackage/gf1;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v9

    .line 426
    invoke-static {v9, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result v10

    .line 430
    if-nez v10, :cond_a

    .line 431
    .line 432
    iput-object v8, v1, Ldefpackage/qv3;->t:Ljava/lang/Object;

    .line 433
    .line 434
    iput-object v7, v1, Ldefpackage/qv3;->r:Ljava/lang/Object;

    .line 435
    .line 436
    iput-object v4, v1, Ldefpackage/qv3;->s:Ljava/lang/Object;

    .line 437
    .line 438
    iput-object v9, v1, Ldefpackage/qv3;->p:Ljava/lang/Object;

    .line 439
    .line 440
    iput v5, v1, Ldefpackage/qv3;->q:I

    .line 441
    .line 442
    invoke-interface {v8, v9, v1}, Ldefpackage/q81;->b(Ljava/lang/Object;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 446
    if-ne v2, v3, :cond_c

    .line 447
    .line 448
    :goto_5
    move-object v4, v3

    .line 449
    :goto_6
    return-object v4

    .line 450
    :cond_c
    move-object v2, v9

    .line 451
    goto :goto_3

    .line 452
    :catchall_1
    move-exception v0

    .line 453
    move-object v4, v2

    .line 454
    :goto_7
    iget-object v1, v7, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v1, Ldefpackage/rp;

    .line 457
    .line 458
    if-eqz v1, :cond_d

    .line 459
    .line 460
    invoke-virtual {v1, v4}, Ldefpackage/rp;->n(Ldefpackage/y00;)V

    .line 461
    .line 462
    .line 463
    :cond_d
    iget-object v1, v7, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast v1, Ldefpackage/rp;

    .line 466
    .line 467
    if-eqz v1, :cond_e

    .line 468
    .line 469
    goto :goto_8

    .line 470
    :cond_e
    const-string v2, "Called dispose on a manager that has been disposed of"

    .line 471
    .line 472
    invoke-static {v2}, Ldefpackage/oo3;->b(Ljava/lang/String;)V

    .line 473
    .line 474
    .line 475
    :goto_8
    invoke-virtual {v1}, Ldefpackage/rp;->h()V

    .line 476
    .line 477
    .line 478
    const/4 v15, 0x0

    .line 479
    iput-object v15, v7, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 480
    .line 481
    throw v0

    .line 482
    :pswitch_1
    sget-object v0, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 483
    .line 484
    iget v3, v1, Ldefpackage/qv3;->q:I

    .line 485
    .line 486
    if-eqz v3, :cond_10

    .line 487
    .line 488
    const/4 v4, 0x1

    .line 489
    if-ne v3, v4, :cond_f

    .line 490
    .line 491
    iget-object v0, v1, Ldefpackage/qv3;->r:Ljava/lang/Object;

    .line 492
    .line 493
    move-object v2, v0

    .line 494
    check-cast v2, Ldefpackage/ss2;

    .line 495
    .line 496
    iget-object v0, v1, Ldefpackage/qv3;->p:Ljava/lang/Object;

    .line 497
    .line 498
    move-object v3, v0

    .line 499
    check-cast v3, Ldefpackage/s22;

    .line 500
    .line 501
    :try_start_4
    invoke-static/range {p1 .. p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 502
    .line 503
    .line 504
    goto/16 :goto_f

    .line 505
    .line 506
    :catchall_2
    move-exception v0

    .line 507
    goto/16 :goto_13

    .line 508
    .line 509
    :cond_f
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 510
    .line 511
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    const/4 v4, 0x0

    .line 515
    goto/16 :goto_11

    .line 516
    .line 517
    :cond_10
    invoke-static/range {p1 .. p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    iget-object v3, v1, Ldefpackage/qv3;->p:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v3, Ldefpackage/we0;

    .line 523
    .line 524
    invoke-interface {v3}, Ldefpackage/we0;->e()Ldefpackage/ne0;

    .line 525
    .line 526
    .line 527
    move-result-object v3

    .line 528
    invoke-static {v3}, Ldefpackage/gb;->D(Ldefpackage/ne0;)Ldefpackage/s22;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    iget-object v4, v1, Ldefpackage/qv3;->s:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v4, Ldefpackage/tv3;

    .line 535
    .line 536
    iget-object v5, v4, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 537
    .line 538
    monitor-enter v5

    .line 539
    :try_start_5
    iget-object v6, v4, Ldefpackage/tv3;->e:Ljava/lang/Throwable;

    .line 540
    .line 541
    if-nez v6, :cond_21

    .line 542
    .line 543
    iget-object v6, v4, Ldefpackage/tv3;->u:Ldefpackage/nl4;

    .line 544
    .line 545
    invoke-virtual {v6}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v6

    .line 549
    check-cast v6, Ldefpackage/ov3;

    .line 550
    .line 551
    sget-object v7, Ldefpackage/ov3;->o:Ldefpackage/ov3;

    .line 552
    .line 553
    invoke-virtual {v6, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 554
    .line 555
    .line 556
    move-result v6

    .line 557
    if-lez v6, :cond_20

    .line 558
    .line 559
    iget-object v6, v4, Ldefpackage/tv3;->d:Ldefpackage/s22;

    .line 560
    .line 561
    if-nez v6, :cond_1f

    .line 562
    .line 563
    iput-object v3, v4, Ldefpackage/tv3;->d:Ldefpackage/s22;

    .line 564
    .line 565
    invoke-virtual {v4}, Ldefpackage/tv3;->y()Ldefpackage/az;

    .line 566
    .line 567
    .line 568
    move-result-object v4

    .line 569
    if-eqz v4, :cond_11

    .line 570
    .line 571
    const-string v4, "called outside of runRecomposeAndApplyChanges"

    .line 572
    .line 573
    invoke-static {v4}, Ldefpackage/l80;->a(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 574
    .line 575
    .line 576
    goto :goto_9

    .line 577
    :catchall_3
    move-exception v0

    .line 578
    goto/16 :goto_16

    .line 579
    .line 580
    :cond_11
    :goto_9
    monitor-exit v5

    .line 581
    iget-object v4, v1, Ldefpackage/qv3;->s:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v4, Ldefpackage/tv3;

    .line 584
    .line 585
    new-instance v5, Ldefpackage/z;

    .line 586
    .line 587
    const/16 v6, 0xa

    .line 588
    .line 589
    invoke-direct {v5, v6, v4}, Ldefpackage/z;-><init>(ILjava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    sget-object v4, Ldefpackage/jh4;->a:Ldefpackage/o54;

    .line 593
    .line 594
    invoke-static {v4}, Ldefpackage/jh4;->e(Ldefpackage/if1;)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    sget-object v4, Ldefpackage/jh4;->c:Ljava/lang/Object;

    .line 598
    .line 599
    monitor-enter v4

    .line 600
    :try_start_6
    sget-object v7, Ldefpackage/jh4;->h:Ljava/util/List;

    .line 601
    .line 602
    invoke-static {v5, v7}, Ldefpackage/q40;->F0(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 603
    .line 604
    .line 605
    move-result-object v7

    .line 606
    sput-object v7, Ldefpackage/jh4;->h:Ljava/util/List;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_8

    .line 607
    .line 608
    monitor-exit v4

    .line 609
    new-instance v4, Ldefpackage/ss2;

    .line 610
    .line 611
    const/16 v7, 0x12

    .line 612
    .line 613
    invoke-direct {v4, v7, v5}, Ldefpackage/ss2;-><init>(ILjava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    sget-object v5, Ldefpackage/tv3;->z:Ldefpackage/nl4;

    .line 617
    .line 618
    iget-object v5, v1, Ldefpackage/qv3;->s:Ljava/lang/Object;

    .line 619
    .line 620
    check-cast v5, Ldefpackage/tv3;

    .line 621
    .line 622
    iget-object v5, v5, Ldefpackage/tv3;->y:Ldefpackage/hh3;

    .line 623
    .line 624
    :cond_12
    sget-object v7, Ldefpackage/tv3;->z:Ldefpackage/nl4;

    .line 625
    .line 626
    invoke-virtual {v7}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v8

    .line 630
    check-cast v8, Ldefpackage/vf3;

    .line 631
    .line 632
    sget-object v9, Ldefpackage/fz0;->Z:Ldefpackage/fz0;

    .line 633
    .line 634
    iget-object v10, v8, Ldefpackage/vf3;->p:Ldefpackage/nf3;

    .line 635
    .line 636
    invoke-virtual {v10, v5}, Ldefpackage/nf3;->containsKey(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    move-result v11

    .line 640
    if-eqz v11, :cond_13

    .line 641
    .line 642
    move-object v10, v8

    .line 643
    goto :goto_a

    .line 644
    :cond_13
    invoke-virtual {v8}, Ldefpackage/y;->isEmpty()Z

    .line 645
    .line 646
    .line 647
    move-result v11

    .line 648
    if-eqz v11, :cond_14

    .line 649
    .line 650
    new-instance v11, Ldefpackage/ob2;

    .line 651
    .line 652
    invoke-direct {v11, v9, v9}, Ldefpackage/ob2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v10, v5, v11}, Ldefpackage/nf3;->a(Ljava/lang/Object;Ldefpackage/ob2;)Ldefpackage/nf3;

    .line 656
    .line 657
    .line 658
    move-result-object v9

    .line 659
    new-instance v10, Ldefpackage/vf3;

    .line 660
    .line 661
    invoke-direct {v10, v5, v5, v9}, Ldefpackage/vf3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/nf3;)V

    .line 662
    .line 663
    .line 664
    goto :goto_a

    .line 665
    :cond_14
    iget-object v11, v8, Ldefpackage/vf3;->o:Ljava/lang/Object;

    .line 666
    .line 667
    invoke-virtual {v10, v11}, Ldefpackage/nf3;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v12

    .line 671
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 672
    .line 673
    .line 674
    check-cast v12, Ldefpackage/ob2;

    .line 675
    .line 676
    new-instance v13, Ldefpackage/ob2;

    .line 677
    .line 678
    iget-object v12, v12, Ldefpackage/ob2;->a:Ljava/lang/Object;

    .line 679
    .line 680
    invoke-direct {v13, v12, v5}, Ldefpackage/ob2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v10, v11, v13}, Ldefpackage/nf3;->a(Ljava/lang/Object;Ldefpackage/ob2;)Ldefpackage/nf3;

    .line 684
    .line 685
    .line 686
    move-result-object v10

    .line 687
    new-instance v12, Ldefpackage/ob2;

    .line 688
    .line 689
    invoke-direct {v12, v11, v9}, Ldefpackage/ob2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v10, v5, v12}, Ldefpackage/nf3;->a(Ljava/lang/Object;Ldefpackage/ob2;)Ldefpackage/nf3;

    .line 693
    .line 694
    .line 695
    move-result-object v9

    .line 696
    new-instance v10, Ldefpackage/vf3;

    .line 697
    .line 698
    iget-object v11, v8, Ldefpackage/vf3;->n:Ljava/lang/Object;

    .line 699
    .line 700
    invoke-direct {v10, v11, v5, v9}, Ldefpackage/vf3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/nf3;)V

    .line 701
    .line 702
    .line 703
    :goto_a
    if-eq v8, v10, :cond_15

    .line 704
    .line 705
    invoke-virtual {v7, v8, v10}, Ldefpackage/nl4;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 706
    .line 707
    .line 708
    move-result v7

    .line 709
    if-eqz v7, :cond_12

    .line 710
    .line 711
    :cond_15
    :try_start_7
    iget-object v5, v1, Ldefpackage/qv3;->s:Ljava/lang/Object;

    .line 712
    .line 713
    check-cast v5, Ldefpackage/tv3;

    .line 714
    .line 715
    iget-object v7, v5, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 716
    .line 717
    monitor-enter v7
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 718
    :try_start_8
    invoke-virtual {v5}, Ldefpackage/tv3;->D()Ljava/util/List;

    .line 719
    .line 720
    .line 721
    move-result-object v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 722
    :try_start_9
    monitor-exit v7

    .line 723
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 724
    .line 725
    .line 726
    move-result v7

    .line 727
    move v8, v2

    .line 728
    :goto_b
    if-ge v8, v7, :cond_19

    .line 729
    .line 730
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v9

    .line 734
    check-cast v9, Ldefpackage/z80;

    .line 735
    .line 736
    iget-object v9, v9, Ldefpackage/z80;->s:Ldefpackage/ig4;

    .line 737
    .line 738
    iget-object v9, v9, Ldefpackage/ig4;->p:[Ljava/lang/Object;

    .line 739
    .line 740
    array-length v10, v9

    .line 741
    move v11, v2

    .line 742
    :goto_c
    if-ge v11, v10, :cond_18

    .line 743
    .line 744
    aget-object v12, v9, v11

    .line 745
    .line 746
    instance-of v13, v12, Ldefpackage/lv3;

    .line 747
    .line 748
    if-eqz v13, :cond_16

    .line 749
    .line 750
    check-cast v12, Ldefpackage/lv3;

    .line 751
    .line 752
    goto :goto_d

    .line 753
    :cond_16
    const/4 v12, 0x0

    .line 754
    :goto_d
    if-eqz v12, :cond_17

    .line 755
    .line 756
    iget-object v13, v12, Ldefpackage/lv3;->a:Ldefpackage/z80;

    .line 757
    .line 758
    if-eqz v13, :cond_17

    .line 759
    .line 760
    const/4 v15, 0x0

    .line 761
    invoke-virtual {v13, v12, v15}, Ldefpackage/z80;->s(Ldefpackage/lv3;Ljava/lang/Object;)Ldefpackage/p12;

    .line 762
    .line 763
    .line 764
    :cond_17
    add-int/lit8 v11, v11, 0x1

    .line 765
    .line 766
    goto :goto_c

    .line 767
    :cond_18
    add-int/lit8 v8, v8, 0x1

    .line 768
    .line 769
    goto :goto_b

    .line 770
    :goto_e
    move-object v2, v4

    .line 771
    goto :goto_13

    .line 772
    :catchall_4
    move-exception v0

    .line 773
    goto :goto_e

    .line 774
    :cond_19
    new-instance v2, Ldefpackage/r;

    .line 775
    .line 776
    iget-object v5, v1, Ldefpackage/qv3;->t:Ljava/lang/Object;

    .line 777
    .line 778
    check-cast v5, Ldefpackage/sv3;

    .line 779
    .line 780
    iget-object v7, v1, Ldefpackage/qv3;->u:Ljava/lang/Object;

    .line 781
    .line 782
    check-cast v7, Ldefpackage/ed;

    .line 783
    .line 784
    const/4 v15, 0x0

    .line 785
    invoke-direct {v2, v5, v7, v15, v6}, Ldefpackage/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 786
    .line 787
    .line 788
    iput-object v3, v1, Ldefpackage/qv3;->p:Ljava/lang/Object;

    .line 789
    .line 790
    iput-object v4, v1, Ldefpackage/qv3;->r:Ljava/lang/Object;

    .line 791
    .line 792
    const/4 v7, 0x1

    .line 793
    iput v7, v1, Ldefpackage/qv3;->q:I

    .line 794
    .line 795
    invoke-static {v2, v1}, Ldefpackage/te5;->j(Ldefpackage/wf1;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 799
    if-ne v2, v0, :cond_1a

    .line 800
    .line 801
    move-object v4, v0

    .line 802
    goto :goto_11

    .line 803
    :cond_1a
    move-object v2, v4

    .line 804
    :goto_f
    invoke-virtual {v2}, Ldefpackage/ss2;->d()V

    .line 805
    .line 806
    .line 807
    iget-object v0, v1, Ldefpackage/qv3;->s:Ljava/lang/Object;

    .line 808
    .line 809
    check-cast v0, Ldefpackage/tv3;

    .line 810
    .line 811
    iget-object v2, v0, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 812
    .line 813
    monitor-enter v2

    .line 814
    :try_start_a
    iget-object v4, v0, Ldefpackage/tv3;->d:Ldefpackage/s22;

    .line 815
    .line 816
    if-ne v4, v3, :cond_1b

    .line 817
    .line 818
    const/4 v15, 0x0

    .line 819
    iput-object v15, v0, Ldefpackage/tv3;->d:Ldefpackage/s22;

    .line 820
    .line 821
    goto :goto_10

    .line 822
    :catchall_5
    move-exception v0

    .line 823
    goto :goto_12

    .line 824
    :cond_1b
    :goto_10
    invoke-virtual {v0}, Ldefpackage/tv3;->y()Ldefpackage/az;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    if-eqz v0, :cond_1c

    .line 829
    .line 830
    const-string v0, "called outside of runRecomposeAndApplyChanges"

    .line 831
    .line 832
    invoke-static {v0}, Ldefpackage/l80;->a(Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 833
    .line 834
    .line 835
    :cond_1c
    monitor-exit v2

    .line 836
    sget-object v0, Ldefpackage/tv3;->z:Ldefpackage/nl4;

    .line 837
    .line 838
    iget-object v0, v1, Ldefpackage/qv3;->s:Ljava/lang/Object;

    .line 839
    .line 840
    check-cast v0, Ldefpackage/tv3;

    .line 841
    .line 842
    iget-object v0, v0, Ldefpackage/tv3;->y:Ldefpackage/hh3;

    .line 843
    .line 844
    invoke-static {v0}, Ldefpackage/hh3;->f(Ldefpackage/hh3;)V

    .line 845
    .line 846
    .line 847
    sget-object v4, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 848
    .line 849
    :goto_11
    return-object v4

    .line 850
    :goto_12
    monitor-exit v2

    .line 851
    throw v0

    .line 852
    :catchall_6
    move-exception v0

    .line 853
    :try_start_b
    monitor-exit v7

    .line 854
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 855
    :goto_13
    invoke-virtual {v2}, Ldefpackage/ss2;->d()V

    .line 856
    .line 857
    .line 858
    iget-object v2, v1, Ldefpackage/qv3;->s:Ljava/lang/Object;

    .line 859
    .line 860
    check-cast v2, Ldefpackage/tv3;

    .line 861
    .line 862
    iget-object v4, v2, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 863
    .line 864
    monitor-enter v4

    .line 865
    :try_start_c
    iget-object v5, v2, Ldefpackage/tv3;->d:Ldefpackage/s22;

    .line 866
    .line 867
    if-ne v5, v3, :cond_1d

    .line 868
    .line 869
    const/4 v15, 0x0

    .line 870
    iput-object v15, v2, Ldefpackage/tv3;->d:Ldefpackage/s22;

    .line 871
    .line 872
    goto :goto_14

    .line 873
    :catchall_7
    move-exception v0

    .line 874
    goto :goto_15

    .line 875
    :cond_1d
    :goto_14
    invoke-virtual {v2}, Ldefpackage/tv3;->y()Ldefpackage/az;

    .line 876
    .line 877
    .line 878
    move-result-object v2

    .line 879
    if-eqz v2, :cond_1e

    .line 880
    .line 881
    const-string v2, "called outside of runRecomposeAndApplyChanges"

    .line 882
    .line 883
    invoke-static {v2}, Ldefpackage/l80;->a(Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 884
    .line 885
    .line 886
    :cond_1e
    monitor-exit v4

    .line 887
    sget-object v2, Ldefpackage/tv3;->z:Ldefpackage/nl4;

    .line 888
    .line 889
    iget-object v1, v1, Ldefpackage/qv3;->s:Ljava/lang/Object;

    .line 890
    .line 891
    check-cast v1, Ldefpackage/tv3;

    .line 892
    .line 893
    iget-object v1, v1, Ldefpackage/tv3;->y:Ldefpackage/hh3;

    .line 894
    .line 895
    invoke-static {v1}, Ldefpackage/hh3;->f(Ldefpackage/hh3;)V

    .line 896
    .line 897
    .line 898
    throw v0

    .line 899
    :goto_15
    monitor-exit v4

    .line 900
    throw v0

    .line 901
    :catchall_8
    move-exception v0

    .line 902
    monitor-exit v4

    .line 903
    throw v0

    .line 904
    :cond_1f
    :try_start_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 905
    .line 906
    const-string v1, "Recomposer already running"

    .line 907
    .line 908
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 909
    .line 910
    .line 911
    throw v0

    .line 912
    :cond_20
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 913
    .line 914
    const-string v1, "Recomposer shut down"

    .line 915
    .line 916
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 917
    .line 918
    .line 919
    throw v0

    .line 920
    :cond_21
    throw v6
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 921
    :goto_16
    monitor-exit v5

    .line 922
    throw v0

    .line 923
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
