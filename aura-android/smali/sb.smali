.class public final Lsb;
.super Lr14;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic o:I

.field public p:I

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lvd0;I)V
    .locals 0

    .line 1
    iput p3, p0, Lsb;->o:I

    .line 2
    .line 3
    iput-object p1, p0, Lsb;->r:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Lr14;-><init>(Lvd0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvd0;)Lvd0;
    .locals 2

    .line 1
    iget v0, p0, Lsb;->o:I

    .line 2
    .line 3
    iget-object p0, p0, Lsb;->r:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lsb;

    .line 9
    .line 10
    check-cast p0, Landroid/view/View;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, p0, p2, v1}, Lsb;-><init>(Ljava/lang/Object;Lvd0;I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, Lsb;->q:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, Lsb;

    .line 20
    .line 21
    check-cast p0, Ltb;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, p0, p2, v1}, Lsb;-><init>(Ljava/lang/Object;Lvd0;I)V

    .line 25
    .line 26
    .line 27
    iput-object p1, v0, Lsb;->q:Ljava/lang/Object;

    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lsb;->o:I

    .line 2
    .line 3
    sget-object v1, Lj15;->a:Lj15;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lba4;

    .line 9
    .line 10
    check-cast p2, Lvd0;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lsb;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lsb;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lsb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lhp4;

    .line 24
    .line 25
    check-cast p2, Lvd0;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lsb;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lsb;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lsb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 14

    .line 1
    iget v0, p0, Lsb;->o:I

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    sget-object v2, Lxe0;->n:Lxe0;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, p0, Lsb;->r:Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v6, Lj15;->a:Lj15;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v5, Landroid/view/View;

    .line 18
    .line 19
    iget v0, p0, Lsb;->p:I

    .line 20
    .line 21
    if-eqz v0, :cond_5

    .line 22
    .line 23
    if-eq v0, v4, :cond_2

    .line 24
    .line 25
    if-ne v0, v3, :cond_1

    .line 26
    .line 27
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    move-object v2, v6

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-static {v1}, Lkf2;->o(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    move-object v2, v7

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    iget-object v0, p0, Lsb;->q:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lba4;

    .line 40
    .line 41
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    instance-of p1, v5, Landroid/view/ViewGroup;

    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    check-cast v5, Landroid/view/ViewGroup;

    .line 49
    .line 50
    iput-object v7, p0, Lsb;->q:Ljava/lang/Object;

    .line 51
    .line 52
    iput v3, p0, Lsb;->p:I

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance p1, Lzw4;

    .line 58
    .line 59
    new-instance v1, Lx0;

    .line 60
    .line 61
    const/4 v4, 0x3

    .line 62
    invoke-direct {v1, v4, v5}, Lx0;-><init>(ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-direct {p1, v1}, Lzw4;-><init>(Lx0;)V

    .line 66
    .line 67
    .line 68
    iget-object v1, p1, Lzw4;->o:Ljava/util/Iterator;

    .line 69
    .line 70
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_3

    .line 75
    .line 76
    move-object p0, v6

    .line 77
    goto :goto_0

    .line 78
    :cond_3
    iput-object p1, v0, Lba4;->p:Ljava/util/Iterator;

    .line 79
    .line 80
    iput v3, v0, Lba4;->n:I

    .line 81
    .line 82
    iput-object p0, v0, Lba4;->q:Lvd0;

    .line 83
    .line 84
    move-object p0, v2

    .line 85
    :goto_0
    if-ne p0, v2, :cond_4

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    move-object p0, v6

    .line 89
    :goto_1
    if-ne p0, v2, :cond_0

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lsb;->q:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p1, Lba4;

    .line 98
    .line 99
    iput-object p1, p0, Lsb;->q:Ljava/lang/Object;

    .line 100
    .line 101
    iput v4, p0, Lsb;->p:I

    .line 102
    .line 103
    invoke-virtual {p1, p0, v5}, Lba4;->b(Lvd0;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :goto_2
    return-object v2

    .line 107
    :pswitch_0
    check-cast v5, Ltb;

    .line 108
    .line 109
    iget v0, p0, Lsb;->p:I

    .line 110
    .line 111
    sget-object v8, Lln3;->o:Lln3;

    .line 112
    .line 113
    if-eqz v0, :cond_8

    .line 114
    .line 115
    if-eq v0, v4, :cond_7

    .line 116
    .line 117
    if-ne v0, v3, :cond_6

    .line 118
    .line 119
    iget-object v0, p0, Lsb;->q:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, Lhp4;

    .line 122
    .line 123
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_6
    invoke-static {v1}, Lkf2;->o(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    move-object v2, v7

    .line 131
    goto/16 :goto_8

    .line 132
    .line 133
    :cond_7
    iget-object v0, p0, Lsb;->q:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, Lhp4;

    .line 136
    .line 137
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_8
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    iget-object p1, p0, Lsb;->q:Ljava/lang/Object;

    .line 145
    .line 146
    move-object v0, p1

    .line 147
    check-cast v0, Lhp4;

    .line 148
    .line 149
    iput-object v0, p0, Lsb;->q:Ljava/lang/Object;

    .line 150
    .line 151
    iput v4, p0, Lsb;->p:I

    .line 152
    .line 153
    sget p1, Lvq4;->a:I

    .line 154
    .line 155
    invoke-static {v0, v8, p0}, Lvq4;->a(Lhp4;Lln3;Ljp;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    if-ne p1, v2, :cond_9

    .line 160
    .line 161
    goto/16 :goto_8

    .line 162
    .line 163
    :cond_9
    :goto_3
    check-cast p1, Lon3;

    .line 164
    .line 165
    iget-wide v9, p1, Lon3;->a:J

    .line 166
    .line 167
    iput-wide v9, v5, Ltb;->h:J

    .line 168
    .line 169
    iget-wide v9, p1, Lon3;->c:J

    .line 170
    .line 171
    iput-wide v9, v5, Ltb;->b:J

    .line 172
    .line 173
    :cond_a
    iput-object v0, p0, Lsb;->q:Ljava/lang/Object;

    .line 174
    .line 175
    iput v3, p0, Lsb;->p:I

    .line 176
    .line 177
    invoke-virtual {v0, v8, p0}, Lhp4;->a(Lln3;Ljp;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    if-ne p1, v2, :cond_b

    .line 182
    .line 183
    goto :goto_8

    .line 184
    :cond_b
    :goto_4
    check-cast p1, Lkn3;

    .line 185
    .line 186
    iget-object p1, p1, Lkn3;->a:Ljava/util/List;

    .line 187
    .line 188
    new-instance v1, Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 195
    .line 196
    .line 197
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    const/4 v9, 0x0

    .line 202
    move v10, v9

    .line 203
    :goto_5
    if-ge v10, v4, :cond_d

    .line 204
    .line 205
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    move-object v12, v11

    .line 210
    check-cast v12, Lon3;

    .line 211
    .line 212
    iget-boolean v12, v12, Lon3;->d:Z

    .line 213
    .line 214
    if-eqz v12, :cond_c

    .line 215
    .line 216
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    :cond_c
    add-int/lit8 v10, v10, 0x1

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_d
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    :goto_6
    if-ge v9, p1, :cond_f

    .line 227
    .line 228
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    move-object v10, v4

    .line 233
    check-cast v10, Lon3;

    .line 234
    .line 235
    iget-wide v10, v10, Lon3;->a:J

    .line 236
    .line 237
    iget-wide v12, v5, Ltb;->h:J

    .line 238
    .line 239
    invoke-static {v10, v11, v12, v13}, Lvr1;->n(JJ)Z

    .line 240
    .line 241
    .line 242
    move-result v10

    .line 243
    if-eqz v10, :cond_e

    .line 244
    .line 245
    goto :goto_7

    .line 246
    :cond_e
    add-int/lit8 v9, v9, 0x1

    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_f
    move-object v4, v7

    .line 250
    :goto_7
    check-cast v4, Lon3;

    .line 251
    .line 252
    if-nez v4, :cond_10

    .line 253
    .line 254
    invoke-static {v1}, Lq40;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    move-object v4, p1

    .line 259
    check-cast v4, Lon3;

    .line 260
    .line 261
    :cond_10
    if-eqz v4, :cond_11

    .line 262
    .line 263
    iget-wide v9, v4, Lon3;->a:J

    .line 264
    .line 265
    iput-wide v9, v5, Ltb;->h:J

    .line 266
    .line 267
    iget-wide v9, v4, Lon3;->c:J

    .line 268
    .line 269
    iput-wide v9, v5, Ltb;->b:J

    .line 270
    .line 271
    :cond_11
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 272
    .line 273
    .line 274
    move-result p1

    .line 275
    if-eqz p1, :cond_a

    .line 276
    .line 277
    const-wide/16 p0, -0x1

    .line 278
    .line 279
    iput-wide p0, v5, Ltb;->h:J

    .line 280
    .line 281
    move-object v2, v6

    .line 282
    :goto_8
    return-object v2

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
