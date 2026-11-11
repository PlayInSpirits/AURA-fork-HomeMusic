.class public final Lde1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Lq80;

.field public b:Lce1;

.field public c:Lvv3;

.field public d:Landroidx/viewpager2/widget/ViewPager2;

.field public e:J

.field public final synthetic f:Lee1;


# direct methods
.method public constructor <init>(Lee1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lde1;->f:Lee1;

    .line 5
    .line 6
    const-wide/16 v0, -0x1

    .line 7
    .line 8
    iput-wide v0, p0, Lde1;->e:J

    .line 9
    .line 10
    return-void
.end method

.method public static a(Landroidx/recyclerview/widget/RecyclerView;)Landroidx/viewpager2/widget/ViewPager2;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string v0, "Expected ViewPager2 instance. Got: "

    .line 13
    .line 14
    invoke-static {p0, v0}, Ler1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method


# virtual methods
.method public final b(Z)V
    .locals 12

    .line 1
    iget-object v0, p0, Lde1;->f:Lee1;

    .line 2
    .line 3
    iget-object v1, v0, Lee1;->w:Lzh0;

    .line 4
    .line 5
    iget-object v2, v0, Lee1;->s:Lxe2;

    .line 6
    .line 7
    iget-object v3, v0, Lee1;->r:Lld1;

    .line 8
    .line 9
    invoke-virtual {v3}, Lld1;->N()Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    goto/16 :goto_6

    .line 16
    .line 17
    :cond_0
    iget-object v4, p0, Lde1;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 18
    .line 19
    invoke-virtual {v4}, Landroidx/viewpager2/widget/ViewPager2;->getScrollState()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    goto/16 :goto_6

    .line 26
    .line 27
    :cond_1
    invoke-virtual {v2}, Lxe2;->d()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-nez v4, :cond_d

    .line 32
    .line 33
    invoke-virtual {v0}, Ldw3;->a()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-nez v4, :cond_2

    .line 38
    .line 39
    goto/16 :goto_6

    .line 40
    .line 41
    :cond_2
    iget-object v4, p0, Lde1;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 42
    .line 43
    invoke-virtual {v4}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-virtual {v0}, Ldw3;->a()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-lt v4, v0, :cond_3

    .line 52
    .line 53
    goto/16 :goto_6

    .line 54
    .line 55
    :cond_3
    int-to-long v4, v4

    .line 56
    iget-wide v6, p0, Lde1;->e:J

    .line 57
    .line 58
    cmp-long v0, v4, v6

    .line 59
    .line 60
    if-nez v0, :cond_4

    .line 61
    .line 62
    if-nez p1, :cond_4

    .line 63
    .line 64
    goto/16 :goto_6

    .line 65
    .line 66
    :cond_4
    invoke-virtual {v2, v4, v5}, Lxe2;->b(J)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Lkc1;

    .line 71
    .line 72
    if-eqz p1, :cond_d

    .line 73
    .line 74
    invoke-virtual {p1}, Lkc1;->y()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_5

    .line 79
    .line 80
    goto/16 :goto_6

    .line 81
    .line 82
    :cond_5
    iput-wide v4, p0, Lde1;->e:J

    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance p1, Lpo;

    .line 88
    .line 89
    invoke-direct {p1, v3}, Lpo;-><init>(Lld1;)V

    .line 90
    .line 91
    .line 92
    new-instance v0, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    const/4 v3, 0x0

    .line 98
    const/4 v4, 0x0

    .line 99
    move v5, v3

    .line 100
    :goto_0
    invoke-virtual {v2}, Lxe2;->h()I

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-ge v5, v6, :cond_a

    .line 105
    .line 106
    invoke-virtual {v2, v5}, Lxe2;->e(I)J

    .line 107
    .line 108
    .line 109
    move-result-wide v6

    .line 110
    invoke-virtual {v2, v5}, Lxe2;->i(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    check-cast v8, Lkc1;

    .line 115
    .line 116
    invoke-virtual {v8}, Lkc1;->y()Z

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    if-nez v9, :cond_6

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_6
    iget-wide v9, p0, Lde1;->e:J

    .line 124
    .line 125
    cmp-long v9, v6, v9

    .line 126
    .line 127
    if-eqz v9, :cond_8

    .line 128
    .line 129
    sget-object v9, Lr92;->q:Lr92;

    .line 130
    .line 131
    invoke-virtual {p1, v8, v9}, Lpo;->k(Lkc1;Lr92;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    new-instance v9, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 140
    .line 141
    .line 142
    iget-object v10, v1, Lzh0;->o:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v10, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 145
    .line 146
    invoke-virtual {v10}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v10

    .line 150
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    if-nez v11, :cond_7

    .line 155
    .line 156
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_7
    invoke-static {v10}, Lxa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    throw p0

    .line 165
    :cond_8
    move-object v4, v8

    .line 166
    :goto_1
    iget-wide v9, p0, Lde1;->e:J

    .line 167
    .line 168
    cmp-long v6, v6, v9

    .line 169
    .line 170
    if-nez v6, :cond_9

    .line 171
    .line 172
    const/4 v6, 0x1

    .line 173
    goto :goto_2

    .line 174
    :cond_9
    move v6, v3

    .line 175
    :goto_2
    invoke-virtual {v8, v6}, Lkc1;->e0(Z)V

    .line 176
    .line 177
    .line 178
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 179
    .line 180
    goto :goto_0

    .line 181
    :cond_a
    if-eqz v4, :cond_c

    .line 182
    .line 183
    sget-object p0, Lr92;->r:Lr92;

    .line 184
    .line 185
    invoke-virtual {p1, v4, p0}, Lpo;->k(Lkc1;Lr92;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    new-instance p0, Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 194
    .line 195
    .line 196
    iget-object v2, v1, Lzh0;->o:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 199
    .line 200
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-nez v4, :cond_b

    .line 209
    .line 210
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_b
    invoke-static {v2}, Lxa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    throw p0

    .line 219
    :cond_c
    :goto_4
    iget-object p0, p1, Lpo;->a:Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 222
    .line 223
    .line 224
    move-result p0

    .line 225
    if-nez p0, :cond_d

    .line 226
    .line 227
    invoke-virtual {p1}, Lpo;->f()V

    .line 228
    .line 229
    .line 230
    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 234
    .line 235
    .line 236
    move-result p0

    .line 237
    :goto_5
    if-ge v3, p0, :cond_d

    .line 238
    .line 239
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    add-int/lit8 v3, v3, 0x1

    .line 244
    .line 245
    check-cast p1, Ljava/util/List;

    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-static {p1}, Lzh0;->B(Ljava/util/List;)V

    .line 251
    .line 252
    .line 253
    goto :goto_5

    .line 254
    :cond_d
    :goto_6
    return-void
.end method
