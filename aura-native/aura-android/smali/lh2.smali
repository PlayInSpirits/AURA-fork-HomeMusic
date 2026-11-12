.class public final Llh2;
.super Lkw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/util/Calendar;

.field public final b:Ljava/util/Calendar;

.field public final synthetic c:Lnh2;


# direct methods
.method public constructor <init>(Lnh2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llh2;->c:Lnh2;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-static {p1}, La35;->e(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Llh2;->a:Ljava/util/Calendar;

    .line 12
    .line 13
    invoke-static {p1}, La35;->e(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Llh2;->b:Ljava/util/Calendar;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final g(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ldw3;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    instance-of v1, v1, Lke5;

    .line 8
    .line 9
    if-eqz v1, :cond_6

    .line 10
    .line 11
    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lmw3;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    instance-of v1, v1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_6

    .line 20
    .line 21
    :cond_0
    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ldw3;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lke5;

    .line 26
    .line 27
    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lmw3;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 32
    .line 33
    iget-object v3, v0, Llh2;->c:Lnh2;

    .line 34
    .line 35
    iget-object v4, v3, Lnh2;->n0:Lze4;

    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v4, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    const/4 v7, 0x0

    .line 50
    :goto_0
    if-ge v7, v5, :cond_6

    .line 51
    .line 52
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    add-int/lit8 v7, v7, 0x1

    .line 57
    .line 58
    check-cast v8, Lld3;

    .line 59
    .line 60
    iget-object v9, v8, Lld3;->a:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v8, v8, Lld3;->b:Ljava/lang/Object;

    .line 63
    .line 64
    if-eqz v9, :cond_5

    .line 65
    .line 66
    if-nez v8, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    check-cast v9, Ljava/lang/Long;

    .line 70
    .line 71
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 72
    .line 73
    .line 74
    move-result-wide v9

    .line 75
    iget-object v11, v0, Llh2;->a:Ljava/util/Calendar;

    .line 76
    .line 77
    invoke-virtual {v11, v9, v10}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 78
    .line 79
    .line 80
    check-cast v8, Ljava/lang/Long;

    .line 81
    .line 82
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 83
    .line 84
    .line 85
    move-result-wide v8

    .line 86
    iget-object v10, v0, Llh2;->b:Ljava/util/Calendar;

    .line 87
    .line 88
    invoke-virtual {v10, v8, v9}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 89
    .line 90
    .line 91
    const/4 v8, 0x1

    .line 92
    invoke-virtual {v11, v8}, Ljava/util/Calendar;->get(I)I

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    iget-object v11, v1, Lke5;->q:Lnh2;

    .line 97
    .line 98
    iget-object v11, v11, Lnh2;->o0:Ldy;

    .line 99
    .line 100
    iget-object v11, v11, Ldy;->n:Lix2;

    .line 101
    .line 102
    iget v11, v11, Lix2;->p:I

    .line 103
    .line 104
    sub-int/2addr v9, v11

    .line 105
    invoke-virtual {v10, v8}, Ljava/util/Calendar;->get(I)I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    iget-object v10, v1, Lke5;->q:Lnh2;

    .line 110
    .line 111
    iget-object v10, v10, Lnh2;->o0:Ldy;

    .line 112
    .line 113
    iget-object v10, v10, Ldy;->n:Lix2;

    .line 114
    .line 115
    iget v10, v10, Lix2;->p:I

    .line 116
    .line 117
    sub-int/2addr v8, v10

    .line 118
    invoke-virtual {v2, v9}, Landroidx/recyclerview/widget/LinearLayoutManager;->q(I)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    invoke-virtual {v2, v8}, Landroidx/recyclerview/widget/LinearLayoutManager;->q(I)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    iget v12, v2, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 127
    .line 128
    div-int/2addr v9, v12

    .line 129
    div-int/2addr v8, v12

    .line 130
    move v12, v9

    .line 131
    :goto_1
    if-gt v12, v8, :cond_5

    .line 132
    .line 133
    iget v13, v2, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 134
    .line 135
    mul-int/2addr v13, v12

    .line 136
    invoke-virtual {v2, v13}, Landroidx/recyclerview/widget/LinearLayoutManager;->q(I)Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object v13

    .line 140
    if-nez v13, :cond_2

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_2
    invoke-virtual {v13}, Landroid/view/View;->getTop()I

    .line 144
    .line 145
    .line 146
    move-result v14

    .line 147
    iget-object v15, v3, Lnh2;->r0:Ley;

    .line 148
    .line 149
    iget-object v15, v15, Ley;->d:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v15, Lc6;

    .line 152
    .line 153
    iget-object v15, v15, Lc6;->b:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v15, Landroid/graphics/Rect;

    .line 156
    .line 157
    iget v15, v15, Landroid/graphics/Rect;->top:I

    .line 158
    .line 159
    add-int/2addr v14, v15

    .line 160
    invoke-virtual {v13}, Landroid/view/View;->getBottom()I

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    iget-object v15, v3, Lnh2;->r0:Ley;

    .line 165
    .line 166
    iget-object v15, v15, Ley;->d:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v15, Lc6;

    .line 169
    .line 170
    iget-object v15, v15, Lc6;->b:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v15, Landroid/graphics/Rect;

    .line 173
    .line 174
    iget v15, v15, Landroid/graphics/Rect;->bottom:I

    .line 175
    .line 176
    sub-int/2addr v13, v15

    .line 177
    if-ne v12, v9, :cond_3

    .line 178
    .line 179
    if-eqz v10, :cond_3

    .line 180
    .line 181
    invoke-virtual {v10}, Landroid/view/View;->getLeft()I

    .line 182
    .line 183
    .line 184
    move-result v15

    .line 185
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    .line 186
    .line 187
    .line 188
    move-result v16

    .line 189
    div-int/lit8 v16, v16, 0x2

    .line 190
    .line 191
    add-int v16, v16, v15

    .line 192
    .line 193
    move/from16 v15, v16

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_3
    const/4 v15, 0x0

    .line 197
    :goto_2
    if-ne v12, v8, :cond_4

    .line 198
    .line 199
    if-eqz v11, :cond_4

    .line 200
    .line 201
    invoke-virtual {v11}, Landroid/view/View;->getLeft()I

    .line 202
    .line 203
    .line 204
    move-result v16

    .line 205
    invoke-virtual {v11}, Landroid/view/View;->getWidth()I

    .line 206
    .line 207
    .line 208
    move-result v17

    .line 209
    div-int/lit8 v17, v17, 0x2

    .line 210
    .line 211
    add-int v17, v17, v16

    .line 212
    .line 213
    :goto_3
    move/from16 v6, v17

    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_4
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getWidth()I

    .line 217
    .line 218
    .line 219
    move-result v17

    .line 220
    goto :goto_3

    .line 221
    :goto_4
    int-to-float v15, v15

    .line 222
    int-to-float v14, v14

    .line 223
    int-to-float v6, v6

    .line 224
    int-to-float v13, v13

    .line 225
    iget-object v0, v3, Lnh2;->r0:Ley;

    .line 226
    .line 227
    iget-object v0, v0, Ley;->h:Ljava/lang/Object;

    .line 228
    .line 229
    move-object/from16 v22, v0

    .line 230
    .line 231
    check-cast v22, Landroid/graphics/Paint;

    .line 232
    .line 233
    move-object/from16 v17, p1

    .line 234
    .line 235
    move/from16 v20, v6

    .line 236
    .line 237
    move/from16 v21, v13

    .line 238
    .line 239
    move/from16 v19, v14

    .line 240
    .line 241
    move/from16 v18, v15

    .line 242
    .line 243
    invoke-virtual/range {v17 .. v22}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 244
    .line 245
    .line 246
    :goto_5
    add-int/lit8 v12, v12, 0x1

    .line 247
    .line 248
    move-object/from16 v0, p0

    .line 249
    .line 250
    goto :goto_1

    .line 251
    :cond_5
    move-object/from16 v0, p0

    .line 252
    .line 253
    goto/16 :goto_0

    .line 254
    .line 255
    :cond_6
    :goto_6
    return-void
.end method
