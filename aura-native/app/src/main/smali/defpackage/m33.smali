.class public abstract Ldefpackage/m33;
.super Landroid/view/ViewGroup;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/iv2;


# static fields
.field public static final S:[I

.field public static final T:[I


# instance fields
.field public A:I

.field public B:Z

.field public C:Landroid/graphics/drawable/Drawable;

.field public D:Landroid/content/res/ColorStateList;

.field public E:I

.field public final F:Landroid/util/SparseArray;

.field public G:I

.field public H:I

.field public I:I

.field public J:Z

.field public K:I

.field public L:I

.field public M:I

.field public N:Ldefpackage/bc4;

.field public O:Z

.field public P:Landroid/content/res/ColorStateList;

.field public Q:Ldefpackage/o33;

.field public R:Ldefpackage/qu2;

.field public final n:Ldefpackage/rn;

.field public final o:Ldefpackage/i4;

.field public final p:Ldefpackage/ko3;

.field public final q:Landroid/util/SparseArray;

.field public r:I

.field public s:[Ldefpackage/k33;

.field public t:I

.field public u:I

.field public v:Landroid/content/res/ColorStateList;

.field public w:I

.field public x:Landroid/content/res/ColorStateList;

.field public final y:Landroid/content/res/ColorStateList;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const v0, 0x10100a0

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Ldefpackage/m33;->S:[I

    .line 9
    .line 10
    const v0, -0x101009e

    .line 11
    .line 12
    .line 13
    filled-new-array {v0}, [I

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Ldefpackage/m33;->T:[I

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ldefpackage/ko3;

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    invoke-direct {p1, v0}, Ldefpackage/ko3;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ldefpackage/m33;->p:Ldefpackage/ko3;

    .line 11
    .line 12
    new-instance p1, Landroid/util/SparseArray;

    .line 13
    .line 14
    invoke-direct {p1, v0}, Landroid/util/SparseArray;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Ldefpackage/m33;->q:Landroid/util/SparseArray;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput p1, p0, Ldefpackage/m33;->t:I

    .line 21
    .line 22
    iput p1, p0, Ldefpackage/m33;->u:I

    .line 23
    .line 24
    new-instance v1, Landroid/util/SparseArray;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Landroid/util/SparseArray;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Ldefpackage/m33;->F:Landroid/util/SparseArray;

    .line 30
    .line 31
    const/4 v0, -0x1

    .line 32
    iput v0, p0, Ldefpackage/m33;->G:I

    .line 33
    .line 34
    iput v0, p0, Ldefpackage/m33;->H:I

    .line 35
    .line 36
    iput v0, p0, Ldefpackage/m33;->I:I

    .line 37
    .line 38
    iput-boolean p1, p0, Ldefpackage/m33;->O:Z

    .line 39
    .line 40
    invoke-virtual {p0}, Ldefpackage/m33;->c()Landroid/content/res/ColorStateList;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Ldefpackage/m33;->y:Landroid/content/res/ColorStateList;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    iput-object p1, p0, Ldefpackage/m33;->n:Ldefpackage/rn;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    new-instance v0, Ldefpackage/rn;

    .line 57
    .line 58
    invoke-direct {v0}, Ldefpackage/rn;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Ldefpackage/m33;->n:Ldefpackage/rn;

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Ldefpackage/kx4;->I(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const v2, 0x7f0b002b

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    const v2, 0x7f040395

    .line 82
    .line 83
    .line 84
    invoke-static {p1, v2, v1}, Ldefpackage/g12;->N(Landroid/content/Context;II)I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    int-to-long v1, p1

    .line 89
    invoke-virtual {v0, v1, v2}, Ldefpackage/kx4;->G(J)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const v1, 0x7f0403a2

    .line 97
    .line 98
    .line 99
    sget-object v2, Ldefpackage/yd;->b:Ldefpackage/a61;

    .line 100
    .line 101
    invoke-static {p1, v1, v2}, Ldefpackage/g12;->O(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {v0, p1}, Ldefpackage/kx4;->H(Landroid/animation/TimeInterpolator;)V

    .line 106
    .line 107
    .line 108
    new-instance p1, Ldefpackage/us4;

    .line 109
    .line 110
    invoke-direct {p1}, Ldefpackage/dx4;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p1}, Ldefpackage/kx4;->F(Ldefpackage/dx4;)V

    .line 114
    .line 115
    .line 116
    :goto_0
    new-instance p1, Ldefpackage/i4;

    .line 117
    .line 118
    move-object v0, p0

    .line 119
    check-cast v0, Ldefpackage/qt;

    .line 120
    .line 121
    const/16 v1, 0xb

    .line 122
    .line 123
    invoke-direct {p1, v1, v0}, Ldefpackage/i4;-><init>(ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    iput-object p1, p0, Ldefpackage/m33;->o:Ldefpackage/i4;

    .line 127
    .line 128
    sget-object p1, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 129
    .line 130
    const/4 p1, 0x1

    .line 131
    invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method private getNewItem()Ldefpackage/k33;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/m33;->p:Ldefpackage/ko3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/ko3;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldefpackage/k33;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    new-instance v0, Ldefpackage/pt;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Ldefpackage/k33;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-object v0
.end method

.method private setBadgeIfNeeded(Ldefpackage/k33;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/m33;->F:Landroid/util/SparseArray;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ldefpackage/yo;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Ldefpackage/k33;->setBadge(Ldefpackage/yo;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v0, :cond_5

    .line 10
    .line 11
    array-length v4, v0

    .line 12
    move v5, v3

    .line 13
    :goto_0
    if-ge v5, v4, :cond_5

    .line 14
    .line 15
    aget-object v6, v0, v5

    .line 16
    .line 17
    if-eqz v6, :cond_4

    .line 18
    .line 19
    iget-object v7, p0, Ldefpackage/m33;->p:Ldefpackage/ko3;

    .line 20
    .line 21
    invoke-virtual {v7, v6}, Ldefpackage/ko3;->a(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    iget-object v7, v6, Ldefpackage/k33;->A:Landroid/widget/ImageView;

    .line 25
    .line 26
    iget-object v8, v6, Ldefpackage/k33;->S:Ldefpackage/yo;

    .line 27
    .line 28
    if-eqz v8, :cond_3

    .line 29
    .line 30
    if-eqz v7, :cond_2

    .line 31
    .line 32
    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 36
    .line 37
    .line 38
    iget-object v8, v6, Ldefpackage/k33;->S:Ldefpackage/yo;

    .line 39
    .line 40
    if-nez v8, :cond_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    invoke-virtual {v8}, Ldefpackage/yo;->d()Landroid/widget/FrameLayout;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    if-eqz v9, :cond_1

    .line 48
    .line 49
    invoke-virtual {v8}, Ldefpackage/yo;->d()Landroid/widget/FrameLayout;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-virtual {v7, v1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {v7}, Landroid/view/View;->getOverlay()Landroid/view/ViewOverlay;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-virtual {v7, v8}, Landroid/view/ViewOverlay;->remove(Landroid/graphics/drawable/Drawable;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_1
    iput-object v1, v6, Ldefpackage/k33;->S:Ldefpackage/yo;

    .line 65
    .line 66
    :cond_3
    iput-object v1, v6, Ldefpackage/k33;->G:Ldefpackage/tu2;

    .line 67
    .line 68
    const/4 v7, 0x0

    .line 69
    iput v7, v6, Ldefpackage/k33;->M:F

    .line 70
    .line 71
    iput-boolean v3, v6, Ldefpackage/k33;->n:Z

    .line 72
    .line 73
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_5
    iget-object v0, p0, Ldefpackage/m33;->R:Ldefpackage/qu2;

    .line 77
    .line 78
    iget-object v0, v0, Ldefpackage/qu2;->f:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_6

    .line 85
    .line 86
    iput v3, p0, Ldefpackage/m33;->t:I

    .line 87
    .line 88
    iput v3, p0, Ldefpackage/m33;->u:I

    .line 89
    .line 90
    iput-object v1, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 91
    .line 92
    return-void

    .line 93
    :cond_6
    new-instance v0, Ljava/util/HashSet;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 96
    .line 97
    .line 98
    move v1, v3

    .line 99
    :goto_2
    iget-object v4, p0, Ldefpackage/m33;->R:Ldefpackage/qu2;

    .line 100
    .line 101
    iget-object v4, v4, Ldefpackage/qu2;->f:Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-ge v1, v4, :cond_7

    .line 108
    .line 109
    iget-object v4, p0, Ldefpackage/m33;->R:Ldefpackage/qu2;

    .line 110
    .line 111
    invoke-virtual {v4, v1}, Ldefpackage/qu2;->getItem(I)Landroid/view/MenuItem;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-interface {v4}, Landroid/view/MenuItem;->getItemId()I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    add-int/lit8 v1, v1, 0x1

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_7
    move v1, v3

    .line 130
    :goto_3
    iget-object v4, p0, Ldefpackage/m33;->F:Landroid/util/SparseArray;

    .line 131
    .line 132
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    if-ge v1, v5, :cond_9

    .line 137
    .line 138
    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    if-nez v6, :cond_8

    .line 151
    .line 152
    invoke-virtual {v4, v5}, Landroid/util/SparseArray;->delete(I)V

    .line 153
    .line 154
    .line 155
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_9
    iget-object v0, p0, Ldefpackage/m33;->R:Ldefpackage/qu2;

    .line 159
    .line 160
    iget-object v0, v0, Ldefpackage/qu2;->f:Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    new-array v0, v0, [Ldefpackage/k33;

    .line 167
    .line 168
    iput-object v0, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 169
    .line 170
    iget v0, p0, Ldefpackage/m33;->r:I

    .line 171
    .line 172
    iget-object v1, p0, Ldefpackage/m33;->R:Ldefpackage/qu2;

    .line 173
    .line 174
    invoke-virtual {v1}, Ldefpackage/qu2;->l()Ljava/util/ArrayList;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    const/4 v4, -0x1

    .line 183
    if-ne v0, v4, :cond_a

    .line 184
    .line 185
    const/4 v0, 0x3

    .line 186
    if-le v1, v0, :cond_b

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_a
    if-nez v0, :cond_b

    .line 190
    .line 191
    :goto_4
    move v0, v2

    .line 192
    goto :goto_5

    .line 193
    :cond_b
    move v0, v3

    .line 194
    :goto_5
    move v1, v3

    .line 195
    :goto_6
    iget-object v5, p0, Ldefpackage/m33;->R:Ldefpackage/qu2;

    .line 196
    .line 197
    iget-object v5, v5, Ldefpackage/qu2;->f:Ljava/util/ArrayList;

    .line 198
    .line 199
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    if-ge v1, v5, :cond_11

    .line 204
    .line 205
    iget-object v5, p0, Ldefpackage/m33;->Q:Ldefpackage/o33;

    .line 206
    .line 207
    iput-boolean v2, v5, Ldefpackage/o33;->o:Z

    .line 208
    .line 209
    iget-object v5, p0, Ldefpackage/m33;->R:Ldefpackage/qu2;

    .line 210
    .line 211
    invoke-virtual {v5, v1}, Ldefpackage/qu2;->getItem(I)Landroid/view/MenuItem;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    invoke-interface {v5, v2}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    .line 216
    .line 217
    .line 218
    iget-object v5, p0, Ldefpackage/m33;->Q:Ldefpackage/o33;

    .line 219
    .line 220
    iput-boolean v3, v5, Ldefpackage/o33;->o:Z

    .line 221
    .line 222
    invoke-direct {p0}, Ldefpackage/m33;->getNewItem()Ldefpackage/k33;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    iget-object v6, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 227
    .line 228
    aput-object v5, v6, v1

    .line 229
    .line 230
    iget-object v6, p0, Ldefpackage/m33;->v:Landroid/content/res/ColorStateList;

    .line 231
    .line 232
    invoke-virtual {v5, v6}, Ldefpackage/k33;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 233
    .line 234
    .line 235
    iget v6, p0, Ldefpackage/m33;->w:I

    .line 236
    .line 237
    invoke-virtual {v5, v6}, Ldefpackage/k33;->setIconSize(I)V

    .line 238
    .line 239
    .line 240
    iget-object v6, p0, Ldefpackage/m33;->y:Landroid/content/res/ColorStateList;

    .line 241
    .line 242
    invoke-virtual {v5, v6}, Ldefpackage/k33;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 243
    .line 244
    .line 245
    iget v6, p0, Ldefpackage/m33;->z:I

    .line 246
    .line 247
    invoke-virtual {v5, v6}, Ldefpackage/k33;->setTextAppearanceInactive(I)V

    .line 248
    .line 249
    .line 250
    iget v6, p0, Ldefpackage/m33;->A:I

    .line 251
    .line 252
    invoke-virtual {v5, v6}, Ldefpackage/k33;->setTextAppearanceActive(I)V

    .line 253
    .line 254
    .line 255
    iget-boolean v6, p0, Ldefpackage/m33;->B:Z

    .line 256
    .line 257
    invoke-virtual {v5, v6}, Ldefpackage/k33;->setTextAppearanceActiveBoldEnabled(Z)V

    .line 258
    .line 259
    .line 260
    iget-object v6, p0, Ldefpackage/m33;->x:Landroid/content/res/ColorStateList;

    .line 261
    .line 262
    invoke-virtual {v5, v6}, Ldefpackage/k33;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 263
    .line 264
    .line 265
    iget v6, p0, Ldefpackage/m33;->G:I

    .line 266
    .line 267
    if-eq v6, v4, :cond_c

    .line 268
    .line 269
    invoke-virtual {v5, v6}, Ldefpackage/k33;->setItemPaddingTop(I)V

    .line 270
    .line 271
    .line 272
    :cond_c
    iget v6, p0, Ldefpackage/m33;->H:I

    .line 273
    .line 274
    if-eq v6, v4, :cond_d

    .line 275
    .line 276
    invoke-virtual {v5, v6}, Ldefpackage/k33;->setItemPaddingBottom(I)V

    .line 277
    .line 278
    .line 279
    :cond_d
    iget v6, p0, Ldefpackage/m33;->I:I

    .line 280
    .line 281
    if-eq v6, v4, :cond_e

    .line 282
    .line 283
    invoke-virtual {v5, v6}, Ldefpackage/k33;->setActiveIndicatorLabelPadding(I)V

    .line 284
    .line 285
    .line 286
    :cond_e
    iget v6, p0, Ldefpackage/m33;->K:I

    .line 287
    .line 288
    invoke-virtual {v5, v6}, Ldefpackage/k33;->setActiveIndicatorWidth(I)V

    .line 289
    .line 290
    .line 291
    iget v6, p0, Ldefpackage/m33;->L:I

    .line 292
    .line 293
    invoke-virtual {v5, v6}, Ldefpackage/k33;->setActiveIndicatorHeight(I)V

    .line 294
    .line 295
    .line 296
    iget v6, p0, Ldefpackage/m33;->M:I

    .line 297
    .line 298
    invoke-virtual {v5, v6}, Ldefpackage/k33;->setActiveIndicatorMarginHorizontal(I)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p0}, Ldefpackage/m33;->d()Ldefpackage/fi2;

    .line 302
    .line 303
    .line 304
    move-result-object v6

    .line 305
    invoke-virtual {v5, v6}, Ldefpackage/k33;->setActiveIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 306
    .line 307
    .line 308
    iget-boolean v6, p0, Ldefpackage/m33;->O:Z

    .line 309
    .line 310
    invoke-virtual {v5, v6}, Ldefpackage/k33;->setActiveIndicatorResizeable(Z)V

    .line 311
    .line 312
    .line 313
    iget-boolean v6, p0, Ldefpackage/m33;->J:Z

    .line 314
    .line 315
    invoke-virtual {v5, v6}, Ldefpackage/k33;->setActiveIndicatorEnabled(Z)V

    .line 316
    .line 317
    .line 318
    iget-object v6, p0, Ldefpackage/m33;->C:Landroid/graphics/drawable/Drawable;

    .line 319
    .line 320
    if-eqz v6, :cond_f

    .line 321
    .line 322
    invoke-virtual {v5, v6}, Ldefpackage/k33;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 323
    .line 324
    .line 325
    goto :goto_7

    .line 326
    :cond_f
    iget v6, p0, Ldefpackage/m33;->E:I

    .line 327
    .line 328
    invoke-virtual {v5, v6}, Ldefpackage/k33;->setItemBackground(I)V

    .line 329
    .line 330
    .line 331
    :goto_7
    iget-object v6, p0, Ldefpackage/m33;->D:Landroid/content/res/ColorStateList;

    .line 332
    .line 333
    invoke-virtual {v5, v6}, Ldefpackage/k33;->setItemRippleColor(Landroid/content/res/ColorStateList;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v5, v0}, Ldefpackage/k33;->setShifting(Z)V

    .line 337
    .line 338
    .line 339
    iget v6, p0, Ldefpackage/m33;->r:I

    .line 340
    .line 341
    invoke-virtual {v5, v6}, Ldefpackage/k33;->setLabelVisibilityMode(I)V

    .line 342
    .line 343
    .line 344
    iget-object v6, p0, Ldefpackage/m33;->R:Ldefpackage/qu2;

    .line 345
    .line 346
    invoke-virtual {v6, v1}, Ldefpackage/qu2;->getItem(I)Landroid/view/MenuItem;

    .line 347
    .line 348
    .line 349
    move-result-object v6

    .line 350
    check-cast v6, Ldefpackage/tu2;

    .line 351
    .line 352
    invoke-virtual {v5, v6}, Ldefpackage/k33;->c(Ldefpackage/tu2;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v5, v1}, Ldefpackage/k33;->setItemPosition(I)V

    .line 356
    .line 357
    .line 358
    iget v6, v6, Ldefpackage/tu2;->a:I

    .line 359
    .line 360
    iget-object v7, p0, Ldefpackage/m33;->q:Landroid/util/SparseArray;

    .line 361
    .line 362
    invoke-virtual {v7, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v7

    .line 366
    check-cast v7, Landroid/view/View$OnTouchListener;

    .line 367
    .line 368
    invoke-virtual {v5, v7}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 369
    .line 370
    .line 371
    iget-object v7, p0, Ldefpackage/m33;->o:Ldefpackage/i4;

    .line 372
    .line 373
    invoke-virtual {v5, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 374
    .line 375
    .line 376
    iget v7, p0, Ldefpackage/m33;->t:I

    .line 377
    .line 378
    if-eqz v7, :cond_10

    .line 379
    .line 380
    if-ne v6, v7, :cond_10

    .line 381
    .line 382
    iput v1, p0, Ldefpackage/m33;->u:I

    .line 383
    .line 384
    :cond_10
    invoke-direct {p0, v5}, Ldefpackage/m33;->setBadgeIfNeeded(Ldefpackage/k33;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 388
    .line 389
    .line 390
    add-int/lit8 v1, v1, 0x1

    .line 391
    .line 392
    goto/16 :goto_6

    .line 393
    .line 394
    :cond_11
    iget-object v0, p0, Ldefpackage/m33;->R:Ldefpackage/qu2;

    .line 395
    .line 396
    iget-object v0, v0, Ldefpackage/qu2;->f:Ljava/util/ArrayList;

    .line 397
    .line 398
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    sub-int/2addr v0, v2

    .line 403
    iget v1, p0, Ldefpackage/m33;->u:I

    .line 404
    .line 405
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 406
    .line 407
    .line 408
    move-result v0

    .line 409
    iput v0, p0, Ldefpackage/m33;->u:I

    .line 410
    .line 411
    iget-object p0, p0, Ldefpackage/m33;->R:Ldefpackage/qu2;

    .line 412
    .line 413
    invoke-virtual {p0, v0}, Ldefpackage/qu2;->getItem(I)Landroid/view/MenuItem;

    .line 414
    .line 415
    .line 416
    move-result-object p0

    .line 417
    invoke-interface {p0, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 418
    .line 419
    .line 420
    return-void
.end method

.method public final b(Ldefpackage/qu2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/m33;->R:Ldefpackage/qu2;

    .line 2
    .line 3
    return-void
.end method

.method public final c()Landroid/content/res/ColorStateList;
    .locals 6

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const v2, 0x1010038

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget v2, v0, Landroid/util/TypedValue;->resourceId:I

    .line 30
    .line 31
    invoke-static {v1, v2}, Ldefpackage/ud3;->n(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const v2, 0x7f04012d

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-nez p0, :cond_1

    .line 51
    .line 52
    :goto_0
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_1
    iget p0, v0, Landroid/util/TypedValue;->data:I

    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    new-instance v2, Landroid/content/res/ColorStateList;

    .line 61
    .line 62
    sget-object v3, Ldefpackage/m33;->S:[I

    .line 63
    .line 64
    sget-object v4, Landroid/view/ViewGroup;->EMPTY_STATE_SET:[I

    .line 65
    .line 66
    sget-object v5, Ldefpackage/m33;->T:[I

    .line 67
    .line 68
    filled-new-array {v5, v3, v4}, [[I

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v1, v5, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    filled-new-array {v1, p0, v0}, [I

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-direct {v2, v3, p0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 81
    .line 82
    .line 83
    return-object v2
.end method

.method public final d()Ldefpackage/fi2;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/m33;->N:Ldefpackage/bc4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/m33;->P:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ldefpackage/fi2;

    .line 10
    .line 11
    iget-object v1, p0, Ldefpackage/m33;->N:Ldefpackage/bc4;

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ldefpackage/fi2;-><init>(Ldefpackage/bc4;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Ldefpackage/m33;->P:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ldefpackage/fi2;->m(Landroid/content/res/ColorStateList;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public getActiveIndicatorLabelPadding()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/m33;->I:I

    .line 2
    .line 3
    return p0
.end method

.method public getBadgeDrawables()Landroid/util/SparseArray;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "Ldefpackage/yo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Ldefpackage/m33;->F:Landroid/util/SparseArray;

    .line 2
    .line 3
    return-object p0
.end method

.method public getIconTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/m33;->v:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getItemActiveIndicatorColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/m33;->P:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getItemActiveIndicatorEnabled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ldefpackage/m33;->J:Z

    .line 2
    .line 3
    return p0
.end method

.method public getItemActiveIndicatorHeight()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/m33;->L:I

    .line 2
    .line 3
    return p0
.end method

.method public getItemActiveIndicatorMarginHorizontal()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/m33;->M:I

    .line 2
    .line 3
    return p0
.end method

.method public getItemActiveIndicatorShapeAppearance()Ldefpackage/bc4;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/m33;->N:Ldefpackage/bc4;

    .line 2
    .line 3
    return-object p0
.end method

.method public getItemActiveIndicatorWidth()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/m33;->K:I

    .line 2
    .line 3
    return p0
.end method

.method public getItemBackground()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    if-lez v1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    aget-object p0, v0, p0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object p0, p0, Ldefpackage/m33;->C:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    return-object p0
.end method

.method public getItemBackgroundRes()I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget p0, p0, Ldefpackage/m33;->E:I

    .line 2
    .line 3
    return p0
.end method

.method public getItemIconSize()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/m33;->w:I

    .line 2
    .line 3
    return p0
.end method

.method public getItemPaddingBottom()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/m33;->H:I

    .line 2
    .line 3
    return p0
.end method

.method public getItemPaddingTop()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/m33;->G:I

    .line 2
    .line 3
    return p0
.end method

.method public getItemRippleColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/m33;->D:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getItemTextAppearanceActive()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/m33;->A:I

    .line 2
    .line 3
    return p0
.end method

.method public getItemTextAppearanceInactive()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/m33;->z:I

    .line 2
    .line 3
    return p0
.end method

.method public getItemTextColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/m33;->x:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLabelVisibilityMode()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/m33;->r:I

    .line 2
    .line 3
    return p0
.end method

.method public getMenu()Ldefpackage/qu2;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/m33;->R:Ldefpackage/qu2;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSelectedItemId()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/m33;->t:I

    .line 2
    .line 3
    return p0
.end method

.method public getSelectedItemPosition()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/m33;->u:I

    .line 2
    .line 3
    return p0
.end method

.method public getWindowAnimations()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/m33;->R:Ldefpackage/qu2;

    .line 5
    .line 6
    invoke-virtual {p0}, Ldefpackage/qu2;->l()Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-static {v0, p0, v0}, Ldefpackage/t3;->a(III)Ldefpackage/t3;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, Ldefpackage/t3;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public setActiveIndicatorLabelPadding(I)V
    .locals 3

    .line 1
    iput p1, p0, Ldefpackage/m33;->I:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Ldefpackage/k33;->setActiveIndicatorLabelPadding(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 1
    iput-object p1, p0, Ldefpackage/m33;->v:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Ldefpackage/k33;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V
    .locals 4

    .line 1
    iput-object p1, p0, Ldefpackage/m33;->P:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object p1, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    array-length v0, p1

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p1, v1

    .line 12
    .line 13
    invoke-virtual {p0}, Ldefpackage/m33;->d()Ldefpackage/fi2;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v2, v3}, Ldefpackage/k33;->setActiveIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorEnabled(Z)V
    .locals 3

    .line 1
    iput-boolean p1, p0, Ldefpackage/m33;->J:Z

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Ldefpackage/k33;->setActiveIndicatorEnabled(Z)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorHeight(I)V
    .locals 3

    .line 1
    iput p1, p0, Ldefpackage/m33;->L:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Ldefpackage/k33;->setActiveIndicatorHeight(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorMarginHorizontal(I)V
    .locals 3

    .line 1
    iput p1, p0, Ldefpackage/m33;->M:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Ldefpackage/k33;->setActiveIndicatorMarginHorizontal(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorResizeable(Z)V
    .locals 3

    .line 1
    iput-boolean p1, p0, Ldefpackage/m33;->O:Z

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Ldefpackage/k33;->setActiveIndicatorResizeable(Z)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorShapeAppearance(Ldefpackage/bc4;)V
    .locals 4

    .line 1
    iput-object p1, p0, Ldefpackage/m33;->N:Ldefpackage/bc4;

    .line 2
    .line 3
    iget-object p1, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    array-length v0, p1

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p1, v1

    .line 12
    .line 13
    invoke-virtual {p0}, Ldefpackage/m33;->d()Ldefpackage/fi2;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v2, v3}, Ldefpackage/k33;->setActiveIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorWidth(I)V
    .locals 3

    .line 1
    iput p1, p0, Ldefpackage/m33;->K:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Ldefpackage/k33;->setActiveIndicatorWidth(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    iput-object p1, p0, Ldefpackage/m33;->C:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Ldefpackage/k33;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemBackgroundRes(I)V
    .locals 3

    .line 1
    iput p1, p0, Ldefpackage/m33;->E:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Ldefpackage/k33;->setItemBackground(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemIconSize(I)V
    .locals 3

    .line 1
    iput p1, p0, Ldefpackage/m33;->w:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Ldefpackage/k33;->setIconSize(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemPaddingBottom(I)V
    .locals 3

    .line 1
    iput p1, p0, Ldefpackage/m33;->H:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Ldefpackage/k33;->setItemPaddingBottom(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemPaddingTop(I)V
    .locals 3

    .line 1
    iput p1, p0, Ldefpackage/m33;->G:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Ldefpackage/k33;->setItemPaddingTop(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemRippleColor(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 1
    iput-object p1, p0, Ldefpackage/m33;->D:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Ldefpackage/k33;->setItemRippleColor(Landroid/content/res/ColorStateList;)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemTextAppearanceActive(I)V
    .locals 5

    .line 1
    iput p1, p0, Ldefpackage/m33;->A:I

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ldefpackage/k33;->setTextAppearanceActive(I)V

    .line 14
    .line 15
    .line 16
    iget-object v4, p0, Ldefpackage/m33;->x:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    invoke-virtual {v3, v4}, Ldefpackage/k33;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return-void
.end method

.method public setItemTextAppearanceActiveBoldEnabled(Z)V
    .locals 3

    .line 1
    iput-boolean p1, p0, Ldefpackage/m33;->B:Z

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Ldefpackage/k33;->setTextAppearanceActiveBoldEnabled(Z)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemTextAppearanceInactive(I)V
    .locals 5

    .line 1
    iput p1, p0, Ldefpackage/m33;->z:I

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ldefpackage/k33;->setTextAppearanceInactive(I)V

    .line 14
    .line 15
    .line 16
    iget-object v4, p0, Ldefpackage/m33;->x:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    invoke-virtual {v3, v4}, Ldefpackage/k33;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return-void
.end method

.method public setItemTextColor(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 1
    iput-object p1, p0, Ldefpackage/m33;->x:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/m33;->s:[Ldefpackage/k33;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Ldefpackage/k33;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setLabelVisibilityMode(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/m33;->r:I

    .line 2
    .line 3
    return-void
.end method

.method public setPresenter(Ldefpackage/o33;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/m33;->Q:Ldefpackage/o33;

    .line 2
    .line 3
    return-void
.end method
