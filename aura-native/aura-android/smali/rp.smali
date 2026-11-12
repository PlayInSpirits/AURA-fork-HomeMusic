.class public abstract Lrp;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ljava/util/ArrayDeque;

    .line 8
    .line 9
    const/16 v0, 0x14

    .line 10
    .line 11
    invoke-direct {p1, v0}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lrp;->a:Ljava/lang/Object;

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance p1, Ljava/util/HashSet;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lrp;->a:Ljava/lang/Object;

    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance p1, Ljava/lang/Object;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lrp;->a:Ljava/lang/Object;

    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance p1, Lkd4;

    .line 43
    .line 44
    invoke-direct {p1}, Lkd4;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lrp;->a:Ljava/lang/Object;

    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    new-instance p1, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lrp;->a:Ljava/lang/Object;

    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(Lwv4;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lrp;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(ILtg1;Ljava/lang/Object;)Z
    .locals 7

    .line 1
    iget-object v0, p2, Ltg1;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 p3, 0x0

    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lrp;->b(ILtg1;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :goto_0
    if-ge v4, v2, :cond_5

    .line 18
    .line 19
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    instance-of v6, v5, Lmg1;

    .line 24
    .line 25
    if-eqz v6, :cond_2

    .line 26
    .line 27
    if-eq v5, p3, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-virtual {p0, v3, p2, v5}, Lrp;->b(ILtg1;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return v1

    .line 34
    :cond_2
    instance-of v6, v5, Ltg1;

    .line 35
    .line 36
    if-eqz v6, :cond_4

    .line 37
    .line 38
    move-object v6, v5

    .line 39
    check-cast v6, Ltg1;

    .line 40
    .line 41
    invoke-virtual {p0, p1, v6, p3}, Lrp;->a(ILtg1;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0, v3, p2, v5}, Lrp;->b(ILtg1;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return v1

    .line 51
    :cond_3
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_4
    const-string p0, "Unexpected child source info "

    .line 55
    .line 56
    invoke-static {v5, p0}, Lmj0;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_5
    return v3
.end method

.method public b(ILtg1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    new-instance p2, Ld80;

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    invoke-direct {p2, p1, p3, p3}, Ld80;-><init>(ILgb;Ljava/lang/Integer;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lrp;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public abstract c(Lgc;)V
.end method

.method public d()Lkd4;
    .locals 9

    .line 1
    iget-object p0, p0, Lrp;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lkd4;

    .line 4
    .line 5
    iget v0, p0, Lkd4;->f:I

    .line 6
    .line 7
    iget-object v1, p0, Lkd4;->b:[I

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    const/4 v3, 0x2

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-eq v0, v5, :cond_0

    .line 14
    .line 15
    iget v6, p0, Lkd4;->e:I

    .line 16
    .line 17
    aput v6, v1, v4

    .line 18
    .line 19
    iget v7, p0, Lkd4;->d:I

    .line 20
    .line 21
    aput v7, v1, v5

    .line 22
    .line 23
    aput v7, v1, v3

    .line 24
    .line 25
    aput v6, v1, v2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget v6, p0, Lkd4;->d:I

    .line 29
    .line 30
    aput v6, v1, v4

    .line 31
    .line 32
    aput v6, v1, v5

    .line 33
    .line 34
    iget v6, p0, Lkd4;->e:I

    .line 35
    .line 36
    aput v6, v1, v3

    .line 37
    .line 38
    aput v6, v1, v2

    .line 39
    .line 40
    :goto_0
    iget-object v1, p0, Lkd4;->a:[F

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    const/high16 v7, 0x3f800000    # 1.0f

    .line 44
    .line 45
    if-eq v0, v5, :cond_1

    .line 46
    .line 47
    iget v0, p0, Lkd4;->k:F

    .line 48
    .line 49
    sub-float v0, v7, v0

    .line 50
    .line 51
    iget v8, p0, Lkd4;->l:F

    .line 52
    .line 53
    sub-float/2addr v0, v8

    .line 54
    const/high16 v8, 0x40000000    # 2.0f

    .line 55
    .line 56
    div-float/2addr v0, v8

    .line 57
    invoke-static {v0, v6}, Ljava/lang/Math;->max(FF)F

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    aput v0, v1, v4

    .line 62
    .line 63
    iget v0, p0, Lkd4;->k:F

    .line 64
    .line 65
    sub-float v0, v7, v0

    .line 66
    .line 67
    const v4, 0x3a83126f    # 0.001f

    .line 68
    .line 69
    .line 70
    sub-float/2addr v0, v4

    .line 71
    div-float/2addr v0, v8

    .line 72
    invoke-static {v0, v6}, Ljava/lang/Math;->max(FF)F

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    aput v0, v1, v5

    .line 77
    .line 78
    iget v0, p0, Lkd4;->k:F

    .line 79
    .line 80
    add-float/2addr v0, v7

    .line 81
    add-float/2addr v0, v4

    .line 82
    div-float/2addr v0, v8

    .line 83
    invoke-static {v0, v7}, Ljava/lang/Math;->min(FF)F

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    aput v0, v1, v3

    .line 88
    .line 89
    iget v0, p0, Lkd4;->k:F

    .line 90
    .line 91
    add-float/2addr v0, v7

    .line 92
    iget v3, p0, Lkd4;->l:F

    .line 93
    .line 94
    add-float/2addr v0, v3

    .line 95
    div-float/2addr v0, v8

    .line 96
    invoke-static {v0, v7}, Ljava/lang/Math;->min(FF)F

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    aput v0, v1, v2

    .line 101
    .line 102
    return-object p0

    .line 103
    :cond_1
    aput v6, v1, v4

    .line 104
    .line 105
    iget v0, p0, Lkd4;->k:F

    .line 106
    .line 107
    invoke-static {v0, v7}, Ljava/lang/Math;->min(FF)F

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    aput v0, v1, v5

    .line 112
    .line 113
    iget v0, p0, Lkd4;->k:F

    .line 114
    .line 115
    iget v4, p0, Lkd4;->l:F

    .line 116
    .line 117
    add-float/2addr v0, v4

    .line 118
    invoke-static {v0, v7}, Ljava/lang/Math;->min(FF)F

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    aput v0, v1, v3

    .line 123
    .line 124
    aput v7, v1, v2

    .line 125
    .line 126
    return-object p0
.end method

.method public abstract e(Ly94;)V
.end method

.method public abstract f()V
.end method

.method public g(Landroid/content/res/TypedArray;)Lrp;
    .locals 13

    .line 1
    iget-object v0, p0, Lrp;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkd4;

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iget-boolean v2, v0, Lkd4;->n:Z

    .line 13
    .line 14
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iput-boolean v2, v0, Lkd4;->n:Z

    .line 19
    .line 20
    :cond_0
    const/4 v2, 0x0

    .line 21
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    iget-boolean v3, v0, Lkd4;->o:Z

    .line 28
    .line 29
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    iput-boolean v3, v0, Lkd4;->o:Z

    .line 34
    .line 35
    :cond_1
    const/4 v3, 0x1

    .line 36
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const v5, 0xffffff

    .line 41
    .line 42
    .line 43
    const/high16 v6, 0x437f0000    # 255.0f

    .line 44
    .line 45
    const/high16 v7, 0x3f800000    # 1.0f

    .line 46
    .line 47
    const/4 v8, 0x0

    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    const v4, 0x3e99999a    # 0.3f

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-static {v8, v4}, Ljava/lang/Math;->max(FF)F

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-static {v7, v4}, Ljava/lang/Math;->min(FF)F

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    mul-float/2addr v4, v6

    .line 66
    float-to-int v4, v4

    .line 67
    shl-int/lit8 v4, v4, 0x18

    .line 68
    .line 69
    iget v9, v0, Lkd4;->e:I

    .line 70
    .line 71
    and-int/2addr v9, v5

    .line 72
    or-int/2addr v4, v9

    .line 73
    iput v4, v0, Lkd4;->e:I

    .line 74
    .line 75
    :cond_2
    const/16 v4, 0xb

    .line 76
    .line 77
    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-eqz v9, :cond_3

    .line 82
    .line 83
    invoke-virtual {p1, v4, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    invoke-static {v8, v4}, Ljava/lang/Math;->max(FF)F

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    invoke-static {v7, v4}, Ljava/lang/Math;->min(FF)F

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    mul-float/2addr v4, v6

    .line 96
    float-to-int v4, v4

    .line 97
    shl-int/lit8 v4, v4, 0x18

    .line 98
    .line 99
    iget v6, v0, Lkd4;->d:I

    .line 100
    .line 101
    and-int/2addr v5, v6

    .line 102
    or-int/2addr v4, v5

    .line 103
    iput v4, v0, Lkd4;->d:I

    .line 104
    .line 105
    :cond_3
    const/4 v4, 0x7

    .line 106
    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    const/4 v6, 0x0

    .line 111
    const-wide/16 v9, 0x0

    .line 112
    .line 113
    if-eqz v5, :cond_5

    .line 114
    .line 115
    iget-wide v11, v0, Lkd4;->s:J

    .line 116
    .line 117
    long-to-int v5, v11

    .line 118
    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    int-to-long v4, v4

    .line 123
    cmp-long v7, v4, v9

    .line 124
    .line 125
    if-ltz v7, :cond_4

    .line 126
    .line 127
    iput-wide v4, v0, Lkd4;->s:J

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_4
    const-string p0, "Given a negative duration: "

    .line 131
    .line 132
    invoke-static {p0, v4, v5}, Lb11;->k(Ljava/lang/String;J)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-object v6

    .line 140
    :cond_5
    :goto_0
    const/16 v4, 0xe

    .line 141
    .line 142
    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    if-eqz v5, :cond_6

    .line 147
    .line 148
    iget v5, v0, Lkd4;->q:I

    .line 149
    .line 150
    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    iput v4, v0, Lkd4;->q:I

    .line 155
    .line 156
    :cond_6
    const/16 v4, 0xf

    .line 157
    .line 158
    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    if-eqz v5, :cond_8

    .line 163
    .line 164
    iget-wide v11, v0, Lkd4;->t:J

    .line 165
    .line 166
    long-to-int v5, v11

    .line 167
    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    int-to-long v4, v4

    .line 172
    cmp-long v7, v4, v9

    .line 173
    .line 174
    if-ltz v7, :cond_7

    .line 175
    .line 176
    iput-wide v4, v0, Lkd4;->t:J

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_7
    const-string p0, "Given a negative repeat delay: "

    .line 180
    .line 181
    invoke-static {p0, v4, v5}, Lb11;->k(Ljava/lang/String;J)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    return-object v6

    .line 189
    :cond_8
    :goto_1
    const/16 v4, 0x10

    .line 190
    .line 191
    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-eqz v5, :cond_9

    .line 196
    .line 197
    iget v5, v0, Lkd4;->r:I

    .line 198
    .line 199
    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    iput v4, v0, Lkd4;->r:I

    .line 204
    .line 205
    :cond_9
    const/4 v4, 0x5

    .line 206
    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    if-eqz v5, :cond_d

    .line 211
    .line 212
    iget v5, v0, Lkd4;->c:I

    .line 213
    .line 214
    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    if-eq v4, v3, :cond_c

    .line 219
    .line 220
    const/4 v5, 0x2

    .line 221
    if-eq v4, v5, :cond_b

    .line 222
    .line 223
    if-eq v4, v1, :cond_a

    .line 224
    .line 225
    iput v2, v0, Lkd4;->c:I

    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_a
    iput v1, v0, Lkd4;->c:I

    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_b
    iput v5, v0, Lkd4;->c:I

    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_c
    iput v3, v0, Lkd4;->c:I

    .line 235
    .line 236
    :cond_d
    :goto_2
    const/16 v1, 0x11

    .line 237
    .line 238
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    if-eqz v4, :cond_f

    .line 243
    .line 244
    iget v4, v0, Lkd4;->f:I

    .line 245
    .line 246
    invoke-virtual {p1, v1, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    if-eq v1, v3, :cond_e

    .line 251
    .line 252
    iput v2, v0, Lkd4;->f:I

    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_e
    iput v3, v0, Lkd4;->f:I

    .line 256
    .line 257
    :cond_f
    :goto_3
    const/4 v1, 0x6

    .line 258
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    if-eqz v2, :cond_11

    .line 263
    .line 264
    iget v2, v0, Lkd4;->l:F

    .line 265
    .line 266
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    cmpg-float v2, v1, v8

    .line 271
    .line 272
    if-ltz v2, :cond_10

    .line 273
    .line 274
    iput v1, v0, Lkd4;->l:F

    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_10
    const-string p0, "Given invalid dropoff value: "

    .line 278
    .line 279
    invoke-static {p0, v1}, Ltb4;->f(Ljava/lang/String;F)V

    .line 280
    .line 281
    .line 282
    return-object v6

    .line 283
    :cond_11
    :goto_4
    const/16 v1, 0x9

    .line 284
    .line 285
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-eqz v2, :cond_13

    .line 290
    .line 291
    iget v2, v0, Lkd4;->g:I

    .line 292
    .line 293
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    if-ltz v1, :cond_12

    .line 298
    .line 299
    iput v1, v0, Lkd4;->g:I

    .line 300
    .line 301
    goto :goto_5

    .line 302
    :cond_12
    const-string p0, "Given invalid width: "

    .line 303
    .line 304
    invoke-static {v1, p0}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    return-object v6

    .line 312
    :cond_13
    :goto_5
    const/16 v1, 0x8

    .line 313
    .line 314
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    if-eqz v2, :cond_15

    .line 319
    .line 320
    iget v2, v0, Lkd4;->h:I

    .line 321
    .line 322
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    if-ltz v1, :cond_14

    .line 327
    .line 328
    iput v1, v0, Lkd4;->h:I

    .line 329
    .line 330
    goto :goto_6

    .line 331
    :cond_14
    const-string p0, "Given invalid height: "

    .line 332
    .line 333
    invoke-static {v1, p0}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    return-object v6

    .line 341
    :cond_15
    :goto_6
    const/16 v1, 0xd

    .line 342
    .line 343
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    if-eqz v2, :cond_17

    .line 348
    .line 349
    iget v2, v0, Lkd4;->k:F

    .line 350
    .line 351
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    cmpg-float v2, v1, v8

    .line 356
    .line 357
    if-ltz v2, :cond_16

    .line 358
    .line 359
    iput v1, v0, Lkd4;->k:F

    .line 360
    .line 361
    goto :goto_7

    .line 362
    :cond_16
    const-string p0, "Given invalid intensity value: "

    .line 363
    .line 364
    invoke-static {p0, v1}, Ltb4;->f(Ljava/lang/String;F)V

    .line 365
    .line 366
    .line 367
    return-object v6

    .line 368
    :cond_17
    :goto_7
    const/16 v1, 0x13

    .line 369
    .line 370
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 371
    .line 372
    .line 373
    move-result v2

    .line 374
    if-eqz v2, :cond_19

    .line 375
    .line 376
    iget v2, v0, Lkd4;->i:F

    .line 377
    .line 378
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 379
    .line 380
    .line 381
    move-result v1

    .line 382
    cmpg-float v2, v1, v8

    .line 383
    .line 384
    if-ltz v2, :cond_18

    .line 385
    .line 386
    iput v1, v0, Lkd4;->i:F

    .line 387
    .line 388
    goto :goto_8

    .line 389
    :cond_18
    const-string p0, "Given invalid width ratio: "

    .line 390
    .line 391
    invoke-static {p0, v1}, Ltb4;->f(Ljava/lang/String;F)V

    .line 392
    .line 393
    .line 394
    return-object v6

    .line 395
    :cond_19
    :goto_8
    const/16 v1, 0xa

    .line 396
    .line 397
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    if-eqz v2, :cond_1b

    .line 402
    .line 403
    iget v2, v0, Lkd4;->j:F

    .line 404
    .line 405
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    cmpg-float v2, v1, v8

    .line 410
    .line 411
    if-ltz v2, :cond_1a

    .line 412
    .line 413
    iput v1, v0, Lkd4;->j:F

    .line 414
    .line 415
    goto :goto_9

    .line 416
    :cond_1a
    const-string p0, "Given invalid height ratio: "

    .line 417
    .line 418
    invoke-static {p0, v1}, Ltb4;->f(Ljava/lang/String;F)V

    .line 419
    .line 420
    .line 421
    return-object v6

    .line 422
    :cond_1b
    :goto_9
    const/16 v1, 0x12

    .line 423
    .line 424
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    if-eqz v2, :cond_1c

    .line 429
    .line 430
    iget v2, v0, Lkd4;->m:F

    .line 431
    .line 432
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 433
    .line 434
    .line 435
    move-result p1

    .line 436
    iput p1, v0, Lkd4;->m:F

    .line 437
    .line 438
    :cond_1c
    invoke-virtual {p0}, Lrp;->j()Lrp;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    return-object p0
.end method

.method public abstract h()V
.end method

.method public i()Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public abstract j()Lrp;
.end method

.method public k(Lxn3;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lrp;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x14

    .line 10
    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public l(ILjava/lang/Object;Ltg1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    sget-object p4, Lj80;->a:Li80;

    .line 2
    .line 3
    invoke-static {p2, p4}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 p2, 0x0

    .line 11
    invoke-virtual {p0, p1, p3, p2}, Lrp;->b(ILtg1;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public abstract m(Ly94;)Lif1;
.end method

.method public abstract n(Ly00;)V
.end method

.method public varargs o([Ljava/lang/reflect/Type;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lrp;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    array-length v1, p1

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_7

    .line 8
    .line 9
    aget-object v3, p1, v2

    .line 10
    .line 11
    if-eqz v3, :cond_6

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    :try_start_0
    instance-of v4, v3, Ljava/lang/reflect/TypeVariable;

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    move-object v4, v3

    .line 25
    check-cast v4, Ljava/lang/reflect/TypeVariable;

    .line 26
    .line 27
    invoke-virtual {p0, v4}, Lrp;->s(Ljava/lang/reflect/TypeVariable;)V

    .line 28
    .line 29
    .line 30
    goto :goto_2

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    instance-of v4, v3, Ljava/lang/reflect/WildcardType;

    .line 34
    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    move-object v4, v3

    .line 38
    check-cast v4, Ljava/lang/reflect/WildcardType;

    .line 39
    .line 40
    invoke-virtual {p0, v4}, Lrp;->t(Ljava/lang/reflect/WildcardType;)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    instance-of v4, v3, Ljava/lang/reflect/ParameterizedType;

    .line 45
    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    move-object v4, v3

    .line 49
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 50
    .line 51
    invoke-virtual {p0, v4}, Lrp;->r(Ljava/lang/reflect/ParameterizedType;)V

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_3
    instance-of v4, v3, Ljava/lang/Class;

    .line 56
    .line 57
    if-eqz v4, :cond_4

    .line 58
    .line 59
    move-object v4, v3

    .line 60
    check-cast v4, Ljava/lang/Class;

    .line 61
    .line 62
    invoke-virtual {p0, v4}, Lrp;->p(Ljava/lang/Class;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    instance-of v4, v3, Ljava/lang/reflect/GenericArrayType;

    .line 67
    .line 68
    if-eqz v4, :cond_5

    .line 69
    .line 70
    move-object v4, v3

    .line 71
    check-cast v4, Ljava/lang/reflect/GenericArrayType;

    .line 72
    .line 73
    invoke-virtual {p0, v4}, Lrp;->q(Ljava/lang/reflect/GenericArrayType;)V

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_5
    new-instance p0, Ljava/lang/AssertionError;

    .line 78
    .line 79
    new-instance p1, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v1, "Unknown type: "

    .line 85
    .line 86
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    :goto_1
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    throw p0

    .line 104
    :cond_6
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_7
    return-void
.end method

.method public p(Ljava/lang/Class;)V
    .locals 0

    .line 1
    return-void
.end method

.method public q(Ljava/lang/reflect/GenericArrayType;)V
    .locals 0

    .line 1
    return-void
.end method

.method public r(Ljava/lang/reflect/ParameterizedType;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract s(Ljava/lang/reflect/TypeVariable;)V
.end method

.method public abstract t(Ljava/lang/reflect/WildcardType;)V
.end method
