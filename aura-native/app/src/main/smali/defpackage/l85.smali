.class public abstract Ldefpackage/l85;
.super Ldefpackage/dx4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final L:[Ljava/lang/String;


# instance fields
.field public K:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "android:visibility:visibility"

    .line 2
    .line 3
    const-string v1, "android:visibility:parent"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Ldefpackage/l85;->L:[Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldefpackage/dx4;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    iput v0, p0, Ldefpackage/l85;->K:I

    .line 6
    .line 7
    return-void
.end method

.method public static F(Ldefpackage/mx4;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/mx4;->b:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object p0, p0, Ldefpackage/mx4;->a:Ljava/util/HashMap;

    .line 8
    .line 9
    const-string v2, "android:visibility:visibility"

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    const-string v1, "android:visibility:parent"

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    new-array v1, v1, [I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 31
    .line 32
    .line 33
    const-string v0, "android:visibility:screenLocation"

    .line 34
    .line 35
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static G(Ldefpackage/mx4;Ldefpackage/mx4;)Ldefpackage/ez3;
    .locals 8

    .line 1
    new-instance v0, Ldefpackage/ez3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-boolean v1, v0, Ldefpackage/ez3;->a:Z

    .line 8
    .line 9
    iput-boolean v1, v0, Ldefpackage/ez3;->b:Z

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, -0x1

    .line 13
    const-string v4, "android:visibility:parent"

    .line 14
    .line 15
    const-string v5, "android:visibility:visibility"

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    iget-object v6, p0, Ldefpackage/mx4;->a:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    check-cast v7, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    iput v7, v0, Ldefpackage/ez3;->c:I

    .line 38
    .line 39
    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    check-cast v6, Landroid/view/ViewGroup;

    .line 44
    .line 45
    iput-object v6, v0, Ldefpackage/ez3;->e:Ljava/lang/Object;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iput v3, v0, Ldefpackage/ez3;->c:I

    .line 49
    .line 50
    iput-object v2, v0, Ldefpackage/ez3;->e:Ljava/lang/Object;

    .line 51
    .line 52
    :goto_0
    if-eqz p1, :cond_1

    .line 53
    .line 54
    iget-object v6, p1, Ldefpackage/mx4;->a:Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_1

    .line 61
    .line 62
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    iput v2, v0, Ldefpackage/ez3;->d:I

    .line 73
    .line 74
    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Landroid/view/ViewGroup;

    .line 79
    .line 80
    iput-object v2, v0, Ldefpackage/ez3;->f:Ljava/lang/Object;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    iput v3, v0, Ldefpackage/ez3;->d:I

    .line 84
    .line 85
    iput-object v2, v0, Ldefpackage/ez3;->f:Ljava/lang/Object;

    .line 86
    .line 87
    :goto_1
    const/4 v2, 0x1

    .line 88
    if-eqz p0, :cond_6

    .line 89
    .line 90
    if-eqz p1, :cond_6

    .line 91
    .line 92
    iget p0, v0, Ldefpackage/ez3;->c:I

    .line 93
    .line 94
    iget p1, v0, Ldefpackage/ez3;->d:I

    .line 95
    .line 96
    if-ne p0, p1, :cond_2

    .line 97
    .line 98
    iget-object v3, v0, Ldefpackage/ez3;->e:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v3, Landroid/view/ViewGroup;

    .line 101
    .line 102
    iget-object v4, v0, Ldefpackage/ez3;->f:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v4, Landroid/view/ViewGroup;

    .line 105
    .line 106
    if-ne v3, v4, :cond_2

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_2
    if-eq p0, p1, :cond_4

    .line 110
    .line 111
    if-nez p0, :cond_3

    .line 112
    .line 113
    iput-boolean v1, v0, Ldefpackage/ez3;->b:Z

    .line 114
    .line 115
    iput-boolean v2, v0, Ldefpackage/ez3;->a:Z

    .line 116
    .line 117
    return-object v0

    .line 118
    :cond_3
    if-nez p1, :cond_8

    .line 119
    .line 120
    iput-boolean v2, v0, Ldefpackage/ez3;->b:Z

    .line 121
    .line 122
    iput-boolean v2, v0, Ldefpackage/ez3;->a:Z

    .line 123
    .line 124
    return-object v0

    .line 125
    :cond_4
    iget-object p0, v0, Ldefpackage/ez3;->f:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p0, Landroid/view/ViewGroup;

    .line 128
    .line 129
    if-nez p0, :cond_5

    .line 130
    .line 131
    iput-boolean v1, v0, Ldefpackage/ez3;->b:Z

    .line 132
    .line 133
    iput-boolean v2, v0, Ldefpackage/ez3;->a:Z

    .line 134
    .line 135
    return-object v0

    .line 136
    :cond_5
    iget-object p0, v0, Ldefpackage/ez3;->e:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p0, Landroid/view/ViewGroup;

    .line 139
    .line 140
    if-nez p0, :cond_8

    .line 141
    .line 142
    iput-boolean v2, v0, Ldefpackage/ez3;->b:Z

    .line 143
    .line 144
    iput-boolean v2, v0, Ldefpackage/ez3;->a:Z

    .line 145
    .line 146
    return-object v0

    .line 147
    :cond_6
    if-nez p0, :cond_7

    .line 148
    .line 149
    iget p0, v0, Ldefpackage/ez3;->d:I

    .line 150
    .line 151
    if-nez p0, :cond_7

    .line 152
    .line 153
    iput-boolean v2, v0, Ldefpackage/ez3;->b:Z

    .line 154
    .line 155
    iput-boolean v2, v0, Ldefpackage/ez3;->a:Z

    .line 156
    .line 157
    return-object v0

    .line 158
    :cond_7
    if-nez p1, :cond_8

    .line 159
    .line 160
    iget p0, v0, Ldefpackage/ez3;->c:I

    .line 161
    .line 162
    if-nez p0, :cond_8

    .line 163
    .line 164
    iput-boolean v1, v0, Ldefpackage/ez3;->b:Z

    .line 165
    .line 166
    iput-boolean v2, v0, Ldefpackage/ez3;->a:Z

    .line 167
    .line 168
    :cond_8
    :goto_2
    return-object v0
.end method


# virtual methods
.method public abstract H(Landroid/view/ViewGroup;Landroid/view/View;Ldefpackage/mx4;Ldefpackage/mx4;)Landroid/animation/ObjectAnimator;
.end method

.method public abstract I(Landroid/view/ViewGroup;Landroid/view/View;Ldefpackage/mx4;)Landroid/animation/ObjectAnimator;
.end method

.method public c(Ldefpackage/mx4;)V
    .locals 0

    .line 1
    invoke-static {p1}, Ldefpackage/l85;->F(Ldefpackage/mx4;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final j(Landroid/view/ViewGroup;Ldefpackage/mx4;Ldefpackage/mx4;)Landroid/animation/Animator;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-static/range {p2 .. p3}, Ldefpackage/l85;->G(Ldefpackage/mx4;Ldefpackage/mx4;)Ldefpackage/ez3;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    iget-boolean v5, v4, Ldefpackage/ez3;->a:Z

    .line 14
    .line 15
    if-eqz v5, :cond_0

    .line 16
    .line 17
    iget-object v5, v4, Ldefpackage/ez3;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, Landroid/view/ViewGroup;

    .line 20
    .line 21
    if-nez v5, :cond_1

    .line 22
    .line 23
    iget-object v5, v4, Ldefpackage/ez3;->f:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v5, Landroid/view/ViewGroup;

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    const/16 v16, 0x0

    .line 31
    .line 32
    goto/16 :goto_e

    .line 33
    .line 34
    :cond_1
    :goto_1
    iget-boolean v5, v4, Ldefpackage/ez3;->b:Z

    .line 35
    .line 36
    const/4 v7, 0x1

    .line 37
    const/4 v8, 0x0

    .line 38
    if-eqz v5, :cond_4

    .line 39
    .line 40
    iget v4, v0, Ldefpackage/l85;->K:I

    .line 41
    .line 42
    and-int/2addr v4, v7

    .line 43
    if-ne v4, v7, :cond_0

    .line 44
    .line 45
    if-nez v3, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    iget-object v4, v3, Ldefpackage/mx4;->b:Landroid/view/View;

    .line 49
    .line 50
    if-nez v2, :cond_3

    .line 51
    .line 52
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Landroid/view/View;

    .line 57
    .line 58
    invoke-virtual {v0, v5, v8}, Ldefpackage/dx4;->m(Landroid/view/View;Z)Ldefpackage/mx4;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-virtual {v0, v5, v8}, Ldefpackage/dx4;->p(Landroid/view/View;Z)Ldefpackage/mx4;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-static {v7, v5}, Ldefpackage/l85;->G(Ldefpackage/mx4;Ldefpackage/mx4;)Ldefpackage/ez3;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    iget-boolean v5, v5, Ldefpackage/ez3;->a:Z

    .line 71
    .line 72
    if-eqz v5, :cond_3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    invoke-virtual {v0, v1, v4, v2, v3}, Ldefpackage/l85;->H(Landroid/view/ViewGroup;Landroid/view/View;Ldefpackage/mx4;Ldefpackage/mx4;)Landroid/animation/ObjectAnimator;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    return-object v0

    .line 80
    :cond_4
    iget v4, v4, Ldefpackage/ez3;->d:I

    .line 81
    .line 82
    iget v5, v0, Ldefpackage/l85;->K:I

    .line 83
    .line 84
    const/4 v9, 0x2

    .line 85
    and-int/2addr v5, v9

    .line 86
    if-eq v5, v9, :cond_5

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    if-nez v2, :cond_6

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_6
    iget-object v5, v2, Ldefpackage/mx4;->b:Landroid/view/View;

    .line 93
    .line 94
    if-eqz v3, :cond_7

    .line 95
    .line 96
    iget-object v3, v3, Ldefpackage/mx4;->b:Landroid/view/View;

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_7
    const/4 v3, 0x0

    .line 100
    :goto_2
    const v10, 0x7f0a052c

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5, v10}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v11

    .line 107
    check-cast v11, Landroid/view/View;

    .line 108
    .line 109
    if-eqz v11, :cond_8

    .line 110
    .line 111
    move/from16 v19, v4

    .line 112
    .line 113
    move/from16 v17, v7

    .line 114
    .line 115
    move/from16 v18, v8

    .line 116
    .line 117
    const/4 v6, 0x0

    .line 118
    const/16 v16, 0x0

    .line 119
    .line 120
    goto/16 :goto_d

    .line 121
    .line 122
    :cond_8
    if-eqz v3, :cond_c

    .line 123
    .line 124
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    if-nez v11, :cond_9

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_9
    const/4 v11, 0x4

    .line 132
    if-ne v4, v11, :cond_a

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_a
    if-ne v5, v3, :cond_b

    .line 136
    .line 137
    :goto_3
    move-object v11, v3

    .line 138
    move v12, v8

    .line 139
    const/4 v3, 0x0

    .line 140
    goto :goto_6

    .line 141
    :cond_b
    move v12, v7

    .line 142
    const/4 v3, 0x0

    .line 143
    :goto_4
    const/4 v11, 0x0

    .line 144
    goto :goto_6

    .line 145
    :cond_c
    :goto_5
    if-eqz v3, :cond_b

    .line 146
    .line 147
    move v12, v8

    .line 148
    goto :goto_4

    .line 149
    :goto_6
    if-eqz v12, :cond_16

    .line 150
    .line 151
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 152
    .line 153
    .line 154
    move-result-object v12

    .line 155
    if-nez v12, :cond_d

    .line 156
    .line 157
    move/from16 v19, v4

    .line 158
    .line 159
    move/from16 v17, v7

    .line 160
    .line 161
    move v7, v8

    .line 162
    move/from16 v18, v7

    .line 163
    .line 164
    move-object v6, v11

    .line 165
    const/16 v16, 0x0

    .line 166
    .line 167
    move-object v11, v5

    .line 168
    goto/16 :goto_d

    .line 169
    .line 170
    :cond_d
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 171
    .line 172
    .line 173
    move-result-object v12

    .line 174
    instance-of v12, v12, Landroid/view/View;

    .line 175
    .line 176
    if-eqz v12, :cond_16

    .line 177
    .line 178
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 179
    .line 180
    .line 181
    move-result-object v12

    .line 182
    check-cast v12, Landroid/view/View;

    .line 183
    .line 184
    invoke-virtual {v0, v12, v7}, Ldefpackage/dx4;->p(Landroid/view/View;Z)Ldefpackage/mx4;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    invoke-virtual {v0, v12, v7}, Ldefpackage/dx4;->m(Landroid/view/View;Z)Ldefpackage/mx4;

    .line 189
    .line 190
    .line 191
    move-result-object v14

    .line 192
    invoke-static {v13, v14}, Ldefpackage/l85;->G(Ldefpackage/mx4;Ldefpackage/mx4;)Ldefpackage/ez3;

    .line 193
    .line 194
    .line 195
    move-result-object v13

    .line 196
    iget-boolean v13, v13, Ldefpackage/ez3;->a:Z

    .line 197
    .line 198
    if-nez v13, :cond_15

    .line 199
    .line 200
    sget-boolean v3, Ldefpackage/lx4;->a:Z

    .line 201
    .line 202
    new-instance v3, Landroid/graphics/Matrix;

    .line 203
    .line 204
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12}, Landroid/view/View;->getScrollX()I

    .line 208
    .line 209
    .line 210
    move-result v13

    .line 211
    neg-int v13, v13

    .line 212
    int-to-float v13, v13

    .line 213
    invoke-virtual {v12}, Landroid/view/View;->getScrollY()I

    .line 214
    .line 215
    .line 216
    move-result v12

    .line 217
    neg-int v12, v12

    .line 218
    int-to-float v12, v12

    .line 219
    invoke-virtual {v3, v13, v12}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 220
    .line 221
    .line 222
    sget-object v12, Ldefpackage/d85;->a:Ldefpackage/f85;

    .line 223
    .line 224
    invoke-virtual {v12, v5, v3}, Ldefpackage/f85;->X(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v1, v3}, Ldefpackage/f85;->Y(Landroid/view/ViewGroup;Landroid/graphics/Matrix;)V

    .line 228
    .line 229
    .line 230
    new-instance v12, Landroid/graphics/RectF;

    .line 231
    .line 232
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 233
    .line 234
    .line 235
    move-result v13

    .line 236
    int-to-float v13, v13

    .line 237
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 238
    .line 239
    .line 240
    move-result v14

    .line 241
    int-to-float v14, v14

    .line 242
    const/4 v15, 0x0

    .line 243
    invoke-direct {v12, v15, v15, v13, v14}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v3, v12}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 247
    .line 248
    .line 249
    iget v13, v12, Landroid/graphics/RectF;->left:F

    .line 250
    .line 251
    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    .line 252
    .line 253
    .line 254
    move-result v13

    .line 255
    iget v14, v12, Landroid/graphics/RectF;->top:F

    .line 256
    .line 257
    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    .line 258
    .line 259
    .line 260
    move-result v14

    .line 261
    iget v15, v12, Landroid/graphics/RectF;->right:F

    .line 262
    .line 263
    invoke-static {v15}, Ljava/lang/Math;->round(F)I

    .line 264
    .line 265
    .line 266
    move-result v15

    .line 267
    const/16 v16, 0x0

    .line 268
    .line 269
    iget v6, v12, Landroid/graphics/RectF;->bottom:F

    .line 270
    .line 271
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 272
    .line 273
    .line 274
    move-result v6

    .line 275
    move/from16 v17, v7

    .line 276
    .line 277
    new-instance v7, Landroid/widget/ImageView;

    .line 278
    .line 279
    move/from16 v18, v8

    .line 280
    .line 281
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    invoke-direct {v7, v8}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 286
    .line 287
    .line 288
    sget-object v8, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 289
    .line 290
    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    .line 294
    .line 295
    .line 296
    move-result v8

    .line 297
    if-nez v1, :cond_e

    .line 298
    .line 299
    move/from16 v19, v18

    .line 300
    .line 301
    goto :goto_7

    .line 302
    :cond_e
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 303
    .line 304
    .line 305
    move-result v19

    .line 306
    :goto_7
    if-nez v8, :cond_10

    .line 307
    .line 308
    if-nez v19, :cond_f

    .line 309
    .line 310
    move/from16 v19, v4

    .line 311
    .line 312
    move-object/from16 v21, v11

    .line 313
    .line 314
    move-object/from16 v0, v16

    .line 315
    .line 316
    goto/16 :goto_a

    .line 317
    .line 318
    :cond_f
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 319
    .line 320
    .line 321
    move-result-object v19

    .line 322
    move-object/from16 v10, v19

    .line 323
    .line 324
    check-cast v10, Landroid/view/ViewGroup;

    .line 325
    .line 326
    invoke-virtual {v10, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 327
    .line 328
    .line 329
    move-result v19

    .line 330
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 331
    .line 332
    .line 333
    move-result-object v9

    .line 334
    invoke-virtual {v9, v5}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    .line 335
    .line 336
    .line 337
    move/from16 v9, v19

    .line 338
    .line 339
    goto :goto_8

    .line 340
    :cond_10
    move-object/from16 v10, v16

    .line 341
    .line 342
    move/from16 v9, v18

    .line 343
    .line 344
    :goto_8
    invoke-virtual {v12}, Landroid/graphics/RectF;->width()F

    .line 345
    .line 346
    .line 347
    move-result v19

    .line 348
    move/from16 v20, v8

    .line 349
    .line 350
    invoke-static/range {v19 .. v19}, Ljava/lang/Math;->round(F)I

    .line 351
    .line 352
    .line 353
    move-result v8

    .line 354
    invoke-virtual {v12}, Landroid/graphics/RectF;->height()F

    .line 355
    .line 356
    .line 357
    move-result v19

    .line 358
    move-object/from16 v21, v11

    .line 359
    .line 360
    invoke-static/range {v19 .. v19}, Ljava/lang/Math;->round(F)I

    .line 361
    .line 362
    .line 363
    move-result v11

    .line 364
    if-lez v8, :cond_12

    .line 365
    .line 366
    if-lez v11, :cond_12

    .line 367
    .line 368
    move/from16 v19, v4

    .line 369
    .line 370
    mul-int v4, v8, v11

    .line 371
    .line 372
    int-to-float v4, v4

    .line 373
    const/high16 v22, 0x49800000    # 1048576.0f

    .line 374
    .line 375
    div-float v4, v22, v4

    .line 376
    .line 377
    const/high16 v0, 0x3f800000    # 1.0f

    .line 378
    .line 379
    invoke-static {v0, v4}, Ljava/lang/Math;->min(FF)F

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    int-to-float v4, v8

    .line 384
    mul-float/2addr v4, v0

    .line 385
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    int-to-float v8, v11

    .line 390
    mul-float/2addr v8, v0

    .line 391
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 392
    .line 393
    .line 394
    move-result v8

    .line 395
    iget v11, v12, Landroid/graphics/RectF;->left:F

    .line 396
    .line 397
    neg-float v11, v11

    .line 398
    iget v12, v12, Landroid/graphics/RectF;->top:F

    .line 399
    .line 400
    neg-float v12, v12

    .line 401
    invoke-virtual {v3, v11, v12}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 402
    .line 403
    .line 404
    invoke-virtual {v3, v0, v0}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 405
    .line 406
    .line 407
    sget-boolean v0, Ldefpackage/lx4;->a:Z

    .line 408
    .line 409
    if-eqz v0, :cond_11

    .line 410
    .line 411
    new-instance v0, Landroid/graphics/Picture;

    .line 412
    .line 413
    invoke-direct {v0}, Landroid/graphics/Picture;-><init>()V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0, v4, v8}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    .line 417
    .line 418
    .line 419
    move-result-object v4

    .line 420
    invoke-virtual {v4, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v5, v4}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v0}, Landroid/graphics/Picture;->endRecording()V

    .line 427
    .line 428
    .line 429
    invoke-static {v0}, Ldefpackage/vl4;->b(Landroid/graphics/Picture;)Landroid/graphics/Bitmap;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    goto :goto_9

    .line 434
    :cond_11
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 435
    .line 436
    invoke-static {v4, v8, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    new-instance v4, Landroid/graphics/Canvas;

    .line 441
    .line 442
    invoke-direct {v4, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v4, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v5, v4}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 449
    .line 450
    .line 451
    goto :goto_9

    .line 452
    :cond_12
    move/from16 v19, v4

    .line 453
    .line 454
    move-object/from16 v0, v16

    .line 455
    .line 456
    :goto_9
    if-nez v20, :cond_13

    .line 457
    .line 458
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 459
    .line 460
    .line 461
    move-result-object v3

    .line 462
    invoke-virtual {v3, v5}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v10, v5, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 466
    .line 467
    .line 468
    :cond_13
    :goto_a
    if-eqz v0, :cond_14

    .line 469
    .line 470
    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 471
    .line 472
    .line 473
    :cond_14
    sub-int v0, v15, v13

    .line 474
    .line 475
    const/high16 v3, 0x40000000    # 2.0f

    .line 476
    .line 477
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    sub-int v4, v6, v14

    .line 482
    .line 483
    invoke-static {v4, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 484
    .line 485
    .line 486
    move-result v3

    .line 487
    invoke-virtual {v7, v0, v3}, Landroid/view/View;->measure(II)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v7, v13, v14, v15, v6}, Landroid/view/View;->layout(IIII)V

    .line 491
    .line 492
    .line 493
    move-object v11, v7

    .line 494
    :goto_b
    move/from16 v7, v18

    .line 495
    .line 496
    move-object/from16 v6, v21

    .line 497
    .line 498
    goto :goto_d

    .line 499
    :cond_15
    move/from16 v19, v4

    .line 500
    .line 501
    move/from16 v17, v7

    .line 502
    .line 503
    move/from16 v18, v8

    .line 504
    .line 505
    move-object/from16 v21, v11

    .line 506
    .line 507
    const/16 v16, 0x0

    .line 508
    .line 509
    invoke-virtual {v12}, Landroid/view/View;->getId()I

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    invoke-virtual {v12}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 514
    .line 515
    .line 516
    move-result-object v4

    .line 517
    if-nez v4, :cond_17

    .line 518
    .line 519
    const/4 v4, -0x1

    .line 520
    if-eq v0, v4, :cond_17

    .line 521
    .line 522
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 523
    .line 524
    .line 525
    goto :goto_c

    .line 526
    :cond_16
    move/from16 v19, v4

    .line 527
    .line 528
    move/from16 v17, v7

    .line 529
    .line 530
    move/from16 v18, v8

    .line 531
    .line 532
    move-object/from16 v21, v11

    .line 533
    .line 534
    const/16 v16, 0x0

    .line 535
    .line 536
    :cond_17
    :goto_c
    move-object v11, v3

    .line 537
    goto :goto_b

    .line 538
    :goto_d
    if-eqz v11, :cond_1b

    .line 539
    .line 540
    if-nez v7, :cond_18

    .line 541
    .line 542
    iget-object v0, v2, Ldefpackage/mx4;->a:Ljava/util/HashMap;

    .line 543
    .line 544
    const-string v3, "android:visibility:screenLocation"

    .line 545
    .line 546
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    check-cast v0, [I

    .line 551
    .line 552
    aget v3, v0, v18

    .line 553
    .line 554
    aget v0, v0, v17

    .line 555
    .line 556
    const/4 v4, 0x2

    .line 557
    new-array v4, v4, [I

    .line 558
    .line 559
    invoke-virtual {v1, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 560
    .line 561
    .line 562
    aget v6, v4, v18

    .line 563
    .line 564
    sub-int/2addr v3, v6

    .line 565
    invoke-virtual {v11}, Landroid/view/View;->getLeft()I

    .line 566
    .line 567
    .line 568
    move-result v6

    .line 569
    sub-int/2addr v3, v6

    .line 570
    invoke-virtual {v11, v3}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 571
    .line 572
    .line 573
    aget v3, v4, v17

    .line 574
    .line 575
    sub-int/2addr v0, v3

    .line 576
    invoke-virtual {v11}, Landroid/view/View;->getTop()I

    .line 577
    .line 578
    .line 579
    move-result v3

    .line 580
    sub-int/2addr v0, v3

    .line 581
    invoke-virtual {v11, v0}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    invoke-virtual {v0, v11}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    .line 589
    .line 590
    .line 591
    :cond_18
    move-object/from16 v0, p0

    .line 592
    .line 593
    invoke-virtual {v0, v1, v11, v2}, Ldefpackage/l85;->I(Landroid/view/ViewGroup;Landroid/view/View;Ldefpackage/mx4;)Landroid/animation/ObjectAnimator;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    if-nez v7, :cond_1a

    .line 598
    .line 599
    if-nez v2, :cond_19

    .line 600
    .line 601
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    invoke-virtual {v0, v11}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    .line 606
    .line 607
    .line 608
    return-object v2

    .line 609
    :cond_19
    const v3, 0x7f0a052c

    .line 610
    .line 611
    .line 612
    invoke-virtual {v5, v3, v11}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 613
    .line 614
    .line 615
    new-instance v3, Ldefpackage/j85;

    .line 616
    .line 617
    invoke-direct {v3, v0, v1, v11, v5}, Ldefpackage/j85;-><init>(Ldefpackage/l85;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v0, v3}, Ldefpackage/dx4;->a(Ldefpackage/bx4;)V

    .line 621
    .line 622
    .line 623
    :cond_1a
    return-object v2

    .line 624
    :cond_1b
    move-object/from16 v0, p0

    .line 625
    .line 626
    if-eqz v6, :cond_1d

    .line 627
    .line 628
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 629
    .line 630
    .line 631
    move-result v3

    .line 632
    sget-object v4, Ldefpackage/d85;->a:Ldefpackage/f85;

    .line 633
    .line 634
    move/from16 v5, v18

    .line 635
    .line 636
    invoke-virtual {v4, v6, v5}, Ldefpackage/f85;->W(Landroid/view/View;I)V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v0, v1, v6, v2}, Ldefpackage/l85;->I(Landroid/view/ViewGroup;Landroid/view/View;Ldefpackage/mx4;)Landroid/animation/ObjectAnimator;

    .line 640
    .line 641
    .line 642
    move-result-object v1

    .line 643
    if-eqz v1, :cond_1c

    .line 644
    .line 645
    new-instance v2, Ldefpackage/k85;

    .line 646
    .line 647
    move/from16 v3, v19

    .line 648
    .line 649
    invoke-direct {v2, v6, v3}, Ldefpackage/k85;-><init>(Landroid/view/View;I)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addPauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v0, v2}, Ldefpackage/dx4;->a(Ldefpackage/bx4;)V

    .line 659
    .line 660
    .line 661
    return-object v1

    .line 662
    :cond_1c
    invoke-virtual {v4, v6, v3}, Ldefpackage/f85;->W(Landroid/view/View;I)V

    .line 663
    .line 664
    .line 665
    return-object v1

    .line 666
    :cond_1d
    :goto_e
    return-object v16
.end method

.method public final o()[Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Ldefpackage/l85;->L:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final q(Ldefpackage/mx4;Ldefpackage/mx4;)Z
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    iget-object p0, p2, Ldefpackage/mx4;->a:Ljava/util/HashMap;

    .line 11
    .line 12
    const-string v0, "android:visibility:visibility"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    iget-object v1, p1, Ldefpackage/mx4;->a:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eq p0, v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-static {p1, p2}, Ldefpackage/l85;->G(Ldefpackage/mx4;Ldefpackage/mx4;)Ldefpackage/ez3;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-boolean p1, p0, Ldefpackage/ez3;->a:Z

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    iget p1, p0, Ldefpackage/ez3;->c:I

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p0, p0, Ldefpackage/ez3;->d:I

    .line 40
    .line 41
    if-nez p0, :cond_3

    .line 42
    .line 43
    :cond_2
    const/4 p0, 0x1

    .line 44
    return p0

    .line 45
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 46
    return p0
.end method
