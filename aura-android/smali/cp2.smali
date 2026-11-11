.class public final Lcp2;
.super Landroid/view/View;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final B:Landroid/util/SparseArray;

.field public static final C:[I

.field public static final D:[I


# instance fields
.field public A:Z

.field public final n:Lyq2;

.field public final o:Lap2;

.field public p:Lrq2;

.field public q:Ltp2;

.field public r:Z

.field public s:Lbp2;

.field public t:Landroid/graphics/drawable/Drawable;

.field public u:I

.field public v:I

.field public w:I

.field public final x:Landroid/content/res/ColorStateList;

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/util/SparseArray;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcp2;->B:Landroid/util/SparseArray;

    .line 8
    .line 9
    const v0, 0x10100a0

    .line 10
    .line 11
    .line 12
    filled-new-array {v0}, [I

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lcp2;->C:[I

    .line 17
    .line 18
    const v0, 0x101009f

    .line 19
    .line 20
    .line 21
    filled-new-array {v0}, [I

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcp2;->D:[I

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    .line 1
    new-instance v0, Landroid/view/ContextThemeWrapper;

    .line 2
    .line 3
    invoke-static {p1}, Lfu;->z(Landroid/content/Context;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, p1, v1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 8
    .line 9
    .line 10
    const p1, 0x7f040375

    .line 11
    .line 12
    .line 13
    invoke-static {v0, p1}, Lfu;->B(Landroid/content/Context;I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 20
    .line 21
    invoke-direct {v1, v0, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 22
    .line 23
    .line 24
    move-object v0, v1

    .line 25
    :cond_0
    const/4 v4, 0x0

    .line 26
    const v6, 0x7f040369

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, v4, v6}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Lrq2;->c:Lrq2;

    .line 33
    .line 34
    iput-object p1, p0, Lcp2;->p:Lrq2;

    .line 35
    .line 36
    sget-object p1, Ltp2;->a:Ltp2;

    .line 37
    .line 38
    iput-object p1, p0, Lcp2;->q:Ltp2;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    sget-object v3, Lqt3;->a:[I

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    invoke-virtual {v2, v4, v3, v6, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    const/4 v7, 0x0

    .line 52
    move-object v1, p0

    .line 53
    invoke-static/range {v1 .. v7}, Lj65;->n(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/view/View;->isInEditMode()Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    const/4 v0, 0x3

    .line 61
    if-eqz p0, :cond_1

    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    iput-object p0, v1, Lcp2;->n:Lyq2;

    .line 65
    .line 66
    iput-object p0, v1, Lcp2;->o:Lap2;

    .line 67
    .line 68
    invoke-virtual {v5, v0, p1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    invoke-static {v2, p0}, Lzz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    iput-object p0, v1, Lcp2;->t:Landroid/graphics/drawable/Drawable;

    .line 77
    .line 78
    return-void

    .line 79
    :cond_1
    invoke-static {v2}, Lyq2;->d(Landroid/content/Context;)Lyq2;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    iput-object p0, v1, Lcp2;->n:Lyq2;

    .line 84
    .line 85
    new-instance p0, Lap2;

    .line 86
    .line 87
    invoke-direct {p0, v1, p1}, Lap2;-><init>(Landroid/view/KeyEvent$Callback;I)V

    .line 88
    .line 89
    .line 90
    iput-object p0, v1, Lcp2;->o:Lap2;

    .line 91
    .line 92
    invoke-static {}, Lyq2;->b()V

    .line 93
    .line 94
    .line 95
    invoke-static {}, Lyq2;->c()Lui1;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p0}, Lui1;->g()Lwq2;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {p0}, Lwq2;->d()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-nez v2, :cond_2

    .line 108
    .line 109
    iget p0, p0, Lwq2;->i:I

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_2
    move p0, p1

    .line 113
    :goto_0
    iput p0, v1, Lcp2;->w:I

    .line 114
    .line 115
    iput p0, v1, Lcp2;->v:I

    .line 116
    .line 117
    const/4 p0, 0x4

    .line 118
    invoke-virtual {v5, p0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    iput-object p0, v1, Lcp2;->x:Landroid/content/res/ColorStateList;

    .line 123
    .line 124
    invoke-virtual {v5, p1, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    iput p0, v1, Lcp2;->y:I

    .line 129
    .line 130
    const/4 p0, 0x1

    .line 131
    invoke-virtual {v5, p0, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    iput v2, v1, Lcp2;->z:I

    .line 136
    .line 137
    invoke-virtual {v5, v0, p1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    const/4 v2, 0x2

    .line 142
    invoke-virtual {v5, v2, p1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    iput v2, v1, Lcp2;->u:I

    .line 147
    .line 148
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 149
    .line 150
    .line 151
    iget v2, v1, Lcp2;->u:I

    .line 152
    .line 153
    sget-object v3, Lcp2;->B:Landroid/util/SparseArray;

    .line 154
    .line 155
    if-eqz v2, :cond_3

    .line 156
    .line 157
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    check-cast v2, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 162
    .line 163
    if-eqz v2, :cond_3

    .line 164
    .line 165
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v1, v2}, Lcp2;->setRemoteIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 170
    .line 171
    .line 172
    :cond_3
    iget-object v2, v1, Lcp2;->t:Landroid/graphics/drawable/Drawable;

    .line 173
    .line 174
    if-nez v2, :cond_6

    .line 175
    .line 176
    if-eqz v0, :cond_5

    .line 177
    .line 178
    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    check-cast v2, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 183
    .line 184
    if-eqz v2, :cond_4

    .line 185
    .line 186
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {v1, p1}, Lcp2;->setRemoteIndicatorDrawableInternal(Landroid/graphics/drawable/Drawable;)V

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_4
    new-instance v2, Lbp2;

    .line 195
    .line 196
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-direct {v2, v1, v0, v3}, Lbp2;-><init>(Lcp2;ILandroid/content/Context;)V

    .line 201
    .line 202
    .line 203
    iput-object v2, v1, Lcp2;->s:Lbp2;

    .line 204
    .line 205
    sget-object v0, Landroid/os/AsyncTask;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 206
    .line 207
    new-array p1, p1, [Ljava/lang/Void;

    .line 208
    .line 209
    invoke-virtual {v2, v0, p1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_5
    invoke-virtual {v1}, Lcp2;->a()V

    .line 214
    .line 215
    .line 216
    :cond_6
    :goto_1
    invoke-virtual {v1}, Lcp2;->d()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1, p0}, Landroid/view/View;->setClickable(Z)V

    .line 220
    .line 221
    .line 222
    return-void
.end method

.method private getActivity()Landroid/app/Activity;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    instance-of v0, p0, Landroid/app/Activity;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, Landroid/app/Activity;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    check-cast p0, Landroid/content/ContextWrapper;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method private getFragmentManager()Lld1;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcp2;->getActivity()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Lnc1;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Lnc1;

    .line 10
    .line 11
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget v0, p0, Lcp2;->u:I

    .line 2
    .line 3
    if-lez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcp2;->s:Lbp2;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    new-instance v0, Lbp2;

    .line 14
    .line 15
    iget v2, p0, Lcp2;->u:I

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-direct {v0, p0, v2, v3}, Lbp2;-><init>(Lcp2;ILandroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcp2;->s:Lbp2;

    .line 25
    .line 26
    iput v1, p0, Lcp2;->u:I

    .line 27
    .line 28
    sget-object p0, Landroid/os/AsyncTask;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 29
    .line 30
    new-array v1, v1, [Ljava/lang/Void;

    .line 31
    .line 32
    invoke-virtual {v0, p0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcp2;->n:Lyq2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lyq2;->b()V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lyq2;->c()Lui1;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lui1;->g()Lwq2;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lwq2;->d()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget v0, v0, Lwq2;->i:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    :goto_0
    iget v1, p0, Lcp2;->w:I

    .line 28
    .line 29
    if-eq v1, v0, :cond_1

    .line 30
    .line 31
    iput v0, p0, Lcp2;->w:I

    .line 32
    .line 33
    invoke-virtual {p0}, Lcp2;->d()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 37
    .line 38
    .line 39
    :cond_1
    const/4 v1, 0x1

    .line 40
    if-ne v0, v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0}, Lcp2;->a()V

    .line 43
    .line 44
    .line 45
    :cond_2
    return-void
.end method

.method public final c()Z
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcp2;->r:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Lcp2;->n:Lyq2;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lyq2;->b()V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lyq2;->c()Lui1;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcp2;->getFragmentManager()Lld1;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_e

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lyq2;->b()V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lyq2;->c()Lui1;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Lui1;->g()Lwq2;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lwq2;->d()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const-string v3, "selector must not be null"

    .line 47
    .line 48
    const-string v4, "selector"

    .line 49
    .line 50
    const-string v5, "MediaRouteButton"

    .line 51
    .line 52
    const/4 v6, 0x1

    .line 53
    if-eqz v0, :cond_6

    .line 54
    .line 55
    const-string v0, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment"

    .line 56
    .line 57
    invoke-virtual {v2, v0}, Lld1;->D(Ljava/lang/String;)Lkc1;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    if-eqz v7, :cond_1

    .line 62
    .line 63
    const-string p0, "showDialog(): Route chooser dialog already showing!"

    .line 64
    .line 65
    invoke-static {v5, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    return v1

    .line 69
    :cond_1
    iget-object v5, p0, Lcp2;->q:Ltp2;

    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance v5, Lfp2;

    .line 75
    .line 76
    invoke-direct {v5}, Lfp2;-><init>()V

    .line 77
    .line 78
    .line 79
    iget-object p0, p0, Lcp2;->p:Lrq2;

    .line 80
    .line 81
    if-eqz p0, :cond_5

    .line 82
    .line 83
    invoke-virtual {v5}, Lfp2;->n0()V

    .line 84
    .line 85
    .line 86
    iget-object v3, v5, Lfp2;->D0:Lrq2;

    .line 87
    .line 88
    invoke-virtual {v3, p0}, Lrq2;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-nez v3, :cond_4

    .line 93
    .line 94
    iput-object p0, v5, Lfp2;->D0:Lrq2;

    .line 95
    .line 96
    iget-object v3, v5, Lkc1;->s:Landroid/os/Bundle;

    .line 97
    .line 98
    if-nez v3, :cond_2

    .line 99
    .line 100
    new-instance v3, Landroid/os/Bundle;

    .line 101
    .line 102
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 103
    .line 104
    .line 105
    :cond_2
    iget-object v7, p0, Lrq2;->a:Landroid/os/Bundle;

    .line 106
    .line 107
    invoke-virtual {v3, v4, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5, v3}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 111
    .line 112
    .line 113
    iget-object v3, v5, Lfp2;->C0:Ldg;

    .line 114
    .line 115
    if-eqz v3, :cond_4

    .line 116
    .line 117
    iget-boolean v4, v5, Lfp2;->B0:Z

    .line 118
    .line 119
    if-eqz v4, :cond_3

    .line 120
    .line 121
    check-cast v3, Laq2;

    .line 122
    .line 123
    invoke-virtual {v3, p0}, Laq2;->j(Lrq2;)V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_3
    check-cast v3, Lep2;

    .line 128
    .line 129
    invoke-virtual {v3, p0}, Lep2;->k(Lrq2;)V

    .line 130
    .line 131
    .line 132
    :cond_4
    :goto_0
    new-instance p0, Lpo;

    .line 133
    .line 134
    invoke-direct {p0, v2}, Lpo;-><init>(Lld1;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v1, v5, v0, v6}, Lpo;->g(ILkc1;Ljava/lang/String;I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v6}, Lpo;->e(Z)I

    .line 141
    .line 142
    .line 143
    return v6

    .line 144
    :cond_5
    invoke-static {v3}, Lkf2;->n(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    return v1

    .line 148
    :cond_6
    const-string v0, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment"

    .line 149
    .line 150
    invoke-virtual {v2, v0}, Lld1;->D(Ljava/lang/String;)Lkc1;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    if-eqz v7, :cond_7

    .line 155
    .line 156
    const-string p0, "showDialog(): Route controller dialog already showing!"

    .line 157
    .line 158
    invoke-static {v5, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 159
    .line 160
    .line 161
    return v1

    .line 162
    :cond_7
    iget-object v5, p0, Lcp2;->q:Ltp2;

    .line 163
    .line 164
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    new-instance v5, Lrp2;

    .line 168
    .line 169
    invoke-direct {v5}, Lrp2;-><init>()V

    .line 170
    .line 171
    .line 172
    iget-object p0, p0, Lcp2;->p:Lrq2;

    .line 173
    .line 174
    if-eqz p0, :cond_d

    .line 175
    .line 176
    iget-object v3, v5, Lrp2;->D0:Lrq2;

    .line 177
    .line 178
    if-nez v3, :cond_a

    .line 179
    .line 180
    iget-object v3, v5, Lkc1;->s:Landroid/os/Bundle;

    .line 181
    .line 182
    if-eqz v3, :cond_9

    .line 183
    .line 184
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    const/4 v7, 0x0

    .line 189
    if-eqz v3, :cond_8

    .line 190
    .line 191
    new-instance v8, Lrq2;

    .line 192
    .line 193
    invoke-direct {v8, v3, v7}, Lrq2;-><init>(Landroid/os/Bundle;Ljava/util/ArrayList;)V

    .line 194
    .line 195
    .line 196
    move-object v7, v8

    .line 197
    goto :goto_1

    .line 198
    :cond_8
    sget-object v3, Lrq2;->c:Lrq2;

    .line 199
    .line 200
    :goto_1
    iput-object v7, v5, Lrp2;->D0:Lrq2;

    .line 201
    .line 202
    :cond_9
    iget-object v3, v5, Lrp2;->D0:Lrq2;

    .line 203
    .line 204
    if-nez v3, :cond_a

    .line 205
    .line 206
    sget-object v3, Lrq2;->c:Lrq2;

    .line 207
    .line 208
    iput-object v3, v5, Lrp2;->D0:Lrq2;

    .line 209
    .line 210
    :cond_a
    iget-object v3, v5, Lrp2;->D0:Lrq2;

    .line 211
    .line 212
    invoke-virtual {v3, p0}, Lrq2;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    if-nez v3, :cond_c

    .line 217
    .line 218
    iput-object p0, v5, Lrp2;->D0:Lrq2;

    .line 219
    .line 220
    iget-object v3, v5, Lkc1;->s:Landroid/os/Bundle;

    .line 221
    .line 222
    if-nez v3, :cond_b

    .line 223
    .line 224
    new-instance v3, Landroid/os/Bundle;

    .line 225
    .line 226
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 227
    .line 228
    .line 229
    :cond_b
    iget-object v7, p0, Lrq2;->a:Landroid/os/Bundle;

    .line 230
    .line 231
    invoke-virtual {v3, v4, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v5, v3}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 235
    .line 236
    .line 237
    iget-object v3, v5, Lrp2;->C0:Ldg;

    .line 238
    .line 239
    if-eqz v3, :cond_c

    .line 240
    .line 241
    iget-boolean v4, v5, Lrp2;->B0:Z

    .line 242
    .line 243
    if-eqz v4, :cond_c

    .line 244
    .line 245
    check-cast v3, Llq2;

    .line 246
    .line 247
    invoke-virtual {v3, p0}, Llq2;->l(Lrq2;)V

    .line 248
    .line 249
    .line 250
    :cond_c
    new-instance p0, Lpo;

    .line 251
    .line 252
    invoke-direct {p0, v2}, Lpo;-><init>(Lld1;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0, v1, v5, v0, v6}, Lpo;->g(ILkc1;Ljava/lang/String;I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p0, v6}, Lpo;->e(Z)I

    .line 259
    .line 260
    .line 261
    return v6

    .line 262
    :cond_d
    invoke-static {v3}, Lkf2;->n(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    return v1

    .line 266
    :cond_e
    const-string p0, "The activity must be a subclass of FragmentActivity"

    .line 267
    .line 268
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    return v1
.end method

.method public final d()V
    .locals 2

    .line 1
    iget v0, p0, Lcp2;->w:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const v0, 0x7f130351

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const v0, 0x7f13034f

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const v0, 0x7f130350

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    iget-boolean v1, p0, Lcp2;->A:Z

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    const/4 v0, 0x0

    .line 43
    :goto_1
    invoke-static {p0, v0}, Le35;->S(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final drawableStateChanged()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcp2;->t:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lcp2;->t:Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcp2;->t:Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v0, v0, Landroid/graphics/drawable/AnimationDrawable;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Lcp2;->t:Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    .line 34
    .line 35
    iget v1, p0, Lcp2;->w:I

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    if-eq v1, v2, :cond_1

    .line 39
    .line 40
    iget v3, p0, Lcp2;->v:I

    .line 41
    .line 42
    if-eq v3, v1, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v3, 0x2

    .line 46
    if-ne v1, v3, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->isRunning()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->getNumberOfFrames()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    sub-int/2addr v1, v2

    .line 59
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/DrawableContainer;->selectDrawable(I)Z

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->isRunning()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_2

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 70
    .line 71
    .line 72
    :cond_2
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 73
    .line 74
    .line 75
    :cond_3
    iget v0, p0, Lcp2;->w:I

    .line 76
    .line 77
    iput v0, p0, Lcp2;->v:I

    .line 78
    .line 79
    return-void
.end method

.method public getDialogFactory()Ltp2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcp2;->q:Ltp2;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRouteSelector()Lrq2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcp2;->p:Lrq2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final jumpDrawablesToCurrentState()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcp2;->t:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcp2;->r:Z

    .line 13
    .line 14
    iget-object v0, p0, Lcp2;->p:Lrq2;

    .line 15
    .line 16
    invoke-virtual {v0}, Lrq2;->c()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcp2;->p:Lrq2;

    .line 23
    .line 24
    iget-object v1, p0, Lcp2;->o:Lap2;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    iget-object v3, p0, Lcp2;->n:Lyq2;

    .line 28
    .line 29
    invoke-virtual {v3, v0, v1, v2}, Lyq2;->a(Lrq2;Luo;I)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0}, Lcp2;->b()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final onCreateDrawableState(I)[I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    add-int/2addr p1, v0

    .line 3
    invoke-super {p0, p1}, Landroid/view/View;->onCreateDrawableState(I)[I

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v1, p0, Lcp2;->n:Lyq2;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget p0, p0, Lcp2;->w:I

    .line 13
    .line 14
    if-eq p0, v0, :cond_2

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    if-eq p0, v0, :cond_1

    .line 18
    .line 19
    :goto_0
    return-object p1

    .line 20
    :cond_1
    sget-object p0, Lcp2;->C:[I

    .line 21
    .line 22
    invoke-static {p1, p0}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_2
    sget-object p0, Lcp2;->D:[I

    .line 27
    .line 28
    invoke-static {p1, p0}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    .line 29
    .line 30
    .line 31
    return-object p1
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcp2;->r:Z

    .line 9
    .line 10
    iget-object v0, p0, Lcp2;->p:Lrq2;

    .line 11
    .line 12
    invoke-virtual {v0}, Lrq2;->c()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcp2;->n:Lyq2;

    .line 19
    .line 20
    iget-object v1, p0, Lcp2;->o:Lap2;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lyq2;->e(Luo;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcp2;->t:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    sub-int/2addr v1, v2

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    sub-int/2addr v3, v4

    .line 34
    iget-object v4, p0, Lcp2;->t:Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    iget-object v5, p0, Lcp2;->t:Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    sub-int/2addr v1, v0

    .line 47
    sub-int/2addr v1, v4

    .line 48
    div-int/lit8 v1, v1, 0x2

    .line 49
    .line 50
    add-int/2addr v1, v0

    .line 51
    sub-int/2addr v3, v2

    .line 52
    sub-int/2addr v3, v5

    .line 53
    div-int/lit8 v3, v3, 0x2

    .line 54
    .line 55
    add-int/2addr v3, v2

    .line 56
    iget-object v0, p0, Lcp2;->t:Landroid/graphics/drawable/Drawable;

    .line 57
    .line 58
    add-int/2addr v4, v1

    .line 59
    add-int/2addr v5, v3

    .line 60
    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, Lcp2;->t:Landroid/graphics/drawable/Drawable;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 6

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    iget-object v2, p0, Lcp2;->t:Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    add-int/2addr v4, v2

    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    add-int/2addr v2, v4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v2, v3

    .line 38
    :goto_0
    iget v4, p0, Lcp2;->y:I

    .line 39
    .line 40
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    iget-object v4, p0, Lcp2;->t:Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    add-int/2addr v4, v3

    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    add-int/2addr v3, v4

    .line 62
    :cond_1
    iget v4, p0, Lcp2;->z:I

    .line 63
    .line 64
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    const/high16 v4, 0x40000000    # 2.0f

    .line 69
    .line 70
    const/high16 v5, -0x80000000

    .line 71
    .line 72
    if-eq p1, v5, :cond_2

    .line 73
    .line 74
    if-eq p1, v4, :cond_3

    .line 75
    .line 76
    move v0, v2

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    :cond_3
    :goto_1
    if-eq p2, v5, :cond_4

    .line 83
    .line 84
    if-eq p2, v4, :cond_5

    .line 85
    .line 86
    move v1, v3

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    :cond_5
    :goto_2
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final performClick()Z
    .locals 9

    .line 1
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/view/View;->playSoundEffect(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lcp2;->a()V

    .line 12
    .line 13
    .line 14
    iget-boolean v2, p0, Lcp2;->r:Z

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    goto/16 :goto_1

    .line 20
    .line 21
    :cond_1
    iget-object v2, p0, Lcp2;->n:Lyq2;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lyq2;->b()V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lyq2;->c()Lui1;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Lcp2;->getFragmentManager()Lld1;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_10

    .line 41
    .line 42
    invoke-static {}, Lyq2;->b()V

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lyq2;->c()Lui1;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v4}, Lui1;->g()Lwq2;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v4}, Lwq2;->d()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    const-string v5, "selector must not be null"

    .line 58
    .line 59
    const-string v6, "selector"

    .line 60
    .line 61
    const-string v7, "MediaRouteButton"

    .line 62
    .line 63
    if-eqz v4, :cond_7

    .line 64
    .line 65
    const-string v4, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment"

    .line 66
    .line 67
    invoke-virtual {v2, v4}, Lld1;->D(Ljava/lang/String;)Lkc1;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    if-eqz v8, :cond_2

    .line 72
    .line 73
    const-string p0, "showDialog(): Route chooser dialog already showing!"

    .line 74
    .line 75
    invoke-static {v7, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    iget-object v0, p0, Lcp2;->q:Ltp2;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    new-instance v0, Lfp2;

    .line 85
    .line 86
    invoke-direct {v0}, Lfp2;-><init>()V

    .line 87
    .line 88
    .line 89
    iget-object p0, p0, Lcp2;->p:Lrq2;

    .line 90
    .line 91
    if-eqz p0, :cond_6

    .line 92
    .line 93
    invoke-virtual {v0}, Lfp2;->n0()V

    .line 94
    .line 95
    .line 96
    iget-object v5, v0, Lfp2;->D0:Lrq2;

    .line 97
    .line 98
    invoke-virtual {v5, p0}, Lrq2;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-nez v5, :cond_5

    .line 103
    .line 104
    iput-object p0, v0, Lfp2;->D0:Lrq2;

    .line 105
    .line 106
    iget-object v5, v0, Lkc1;->s:Landroid/os/Bundle;

    .line 107
    .line 108
    if-nez v5, :cond_3

    .line 109
    .line 110
    new-instance v5, Landroid/os/Bundle;

    .line 111
    .line 112
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 113
    .line 114
    .line 115
    :cond_3
    iget-object v7, p0, Lrq2;->a:Landroid/os/Bundle;

    .line 116
    .line 117
    invoke-virtual {v5, v6, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v5}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 121
    .line 122
    .line 123
    iget-object v5, v0, Lfp2;->C0:Ldg;

    .line 124
    .line 125
    if-eqz v5, :cond_5

    .line 126
    .line 127
    iget-boolean v6, v0, Lfp2;->B0:Z

    .line 128
    .line 129
    if-eqz v6, :cond_4

    .line 130
    .line 131
    check-cast v5, Laq2;

    .line 132
    .line 133
    invoke-virtual {v5, p0}, Laq2;->j(Lrq2;)V

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_4
    check-cast v5, Lep2;

    .line 138
    .line 139
    invoke-virtual {v5, p0}, Lep2;->k(Lrq2;)V

    .line 140
    .line 141
    .line 142
    :cond_5
    :goto_0
    new-instance p0, Lpo;

    .line 143
    .line 144
    invoke-direct {p0, v2}, Lpo;-><init>(Lld1;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v1, v0, v4, v3}, Lpo;->g(ILkc1;Ljava/lang/String;I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v3}, Lpo;->e(Z)I

    .line 151
    .line 152
    .line 153
    goto/16 :goto_3

    .line 154
    .line 155
    :cond_6
    invoke-static {v5}, Lkf2;->n(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return v1

    .line 159
    :cond_7
    const-string v4, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment"

    .line 160
    .line 161
    invoke-virtual {v2, v4}, Lld1;->D(Ljava/lang/String;)Lkc1;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    if-eqz v8, :cond_9

    .line 166
    .line 167
    const-string p0, "showDialog(): Route controller dialog already showing!"

    .line 168
    .line 169
    invoke-static {v7, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 170
    .line 171
    .line 172
    :goto_1
    if-eqz v0, :cond_8

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_8
    return v1

    .line 176
    :cond_9
    iget-object v0, p0, Lcp2;->q:Ltp2;

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    new-instance v0, Lrp2;

    .line 182
    .line 183
    invoke-direct {v0}, Lrp2;-><init>()V

    .line 184
    .line 185
    .line 186
    iget-object p0, p0, Lcp2;->p:Lrq2;

    .line 187
    .line 188
    if-eqz p0, :cond_f

    .line 189
    .line 190
    iget-object v5, v0, Lrp2;->D0:Lrq2;

    .line 191
    .line 192
    if-nez v5, :cond_c

    .line 193
    .line 194
    iget-object v5, v0, Lkc1;->s:Landroid/os/Bundle;

    .line 195
    .line 196
    if-eqz v5, :cond_b

    .line 197
    .line 198
    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    const/4 v7, 0x0

    .line 203
    if-eqz v5, :cond_a

    .line 204
    .line 205
    new-instance v8, Lrq2;

    .line 206
    .line 207
    invoke-direct {v8, v5, v7}, Lrq2;-><init>(Landroid/os/Bundle;Ljava/util/ArrayList;)V

    .line 208
    .line 209
    .line 210
    move-object v7, v8

    .line 211
    goto :goto_2

    .line 212
    :cond_a
    sget-object v5, Lrq2;->c:Lrq2;

    .line 213
    .line 214
    :goto_2
    iput-object v7, v0, Lrp2;->D0:Lrq2;

    .line 215
    .line 216
    :cond_b
    iget-object v5, v0, Lrp2;->D0:Lrq2;

    .line 217
    .line 218
    if-nez v5, :cond_c

    .line 219
    .line 220
    sget-object v5, Lrq2;->c:Lrq2;

    .line 221
    .line 222
    iput-object v5, v0, Lrp2;->D0:Lrq2;

    .line 223
    .line 224
    :cond_c
    iget-object v5, v0, Lrp2;->D0:Lrq2;

    .line 225
    .line 226
    invoke-virtual {v5, p0}, Lrq2;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    if-nez v5, :cond_e

    .line 231
    .line 232
    iput-object p0, v0, Lrp2;->D0:Lrq2;

    .line 233
    .line 234
    iget-object v5, v0, Lkc1;->s:Landroid/os/Bundle;

    .line 235
    .line 236
    if-nez v5, :cond_d

    .line 237
    .line 238
    new-instance v5, Landroid/os/Bundle;

    .line 239
    .line 240
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 241
    .line 242
    .line 243
    :cond_d
    iget-object v7, p0, Lrq2;->a:Landroid/os/Bundle;

    .line 244
    .line 245
    invoke-virtual {v5, v6, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0, v5}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 249
    .line 250
    .line 251
    iget-object v5, v0, Lrp2;->C0:Ldg;

    .line 252
    .line 253
    if-eqz v5, :cond_e

    .line 254
    .line 255
    iget-boolean v6, v0, Lrp2;->B0:Z

    .line 256
    .line 257
    if-eqz v6, :cond_e

    .line 258
    .line 259
    check-cast v5, Llq2;

    .line 260
    .line 261
    invoke-virtual {v5, p0}, Llq2;->l(Lrq2;)V

    .line 262
    .line 263
    .line 264
    :cond_e
    new-instance p0, Lpo;

    .line 265
    .line 266
    invoke-direct {p0, v2}, Lpo;-><init>(Lld1;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0, v1, v0, v4, v3}, Lpo;->g(ILkc1;Ljava/lang/String;I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0, v3}, Lpo;->e(Z)I

    .line 273
    .line 274
    .line 275
    :goto_3
    return v3

    .line 276
    :cond_f
    invoke-static {v5}, Lkf2;->n(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    return v1

    .line 280
    :cond_10
    const-string p0, "The activity must be a subclass of FragmentActivity"

    .line 281
    .line 282
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    return v1
.end method

.method public setAlwaysVisible(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public setCheatSheetEnabled(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcp2;->A:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcp2;->A:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Lcp2;->d()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setDialogFactory(Ltp2;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcp2;->q:Ltp2;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "factory must not be null"

    .line 7
    .line 8
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setRemoteIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcp2;->u:I

    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcp2;->setRemoteIndicatorDrawableInternal(Landroid/graphics/drawable/Drawable;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setRemoteIndicatorDrawableInternal(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcp2;->s:Lbp2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcp2;->t:Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcp2;->t:Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    if-eqz p1, :cond_4

    .line 23
    .line 24
    iget-object v0, p0, Lcp2;->x:Landroid/content/res/ColorStateList;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    const/4 v0, 0x1

    .line 52
    goto :goto_0

    .line 53
    :cond_3
    move v0, v1

    .line 54
    :goto_0
    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 55
    .line 56
    .line 57
    :cond_4
    iput-object p1, p0, Lcp2;->t:Landroid/graphics/drawable/Drawable;

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public setRouteSelector(Lrq2;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Lcp2;->p:Lrq2;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lrq2;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    iget-boolean v0, p0, Lcp2;->r:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lcp2;->p:Lrq2;

    .line 16
    .line 17
    invoke-virtual {v0}, Lrq2;->c()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object v1, p0, Lcp2;->o:Lap2;

    .line 22
    .line 23
    iget-object v2, p0, Lcp2;->n:Lyq2;

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Lyq2;->e(Luo;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p1}, Lrq2;->c()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    invoke-virtual {v2, p1, v1, v0}, Lyq2;->a(Lrq2;Luo;I)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iput-object p1, p0, Lcp2;->p:Lrq2;

    .line 41
    .line 42
    invoke-virtual {p0}, Lcp2;->b()V

    .line 43
    .line 44
    .line 45
    :cond_2
    return-void

    .line 46
    :cond_3
    const-string p0, "selector must not be null"

    .line 47
    .line 48
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public setVisibility(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcp2;->t:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move p1, v0

    .line 14
    :goto_0
    invoke-virtual {p0, p1, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
.end method

.method public final verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Lcp2;->t:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    if-ne p1, p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 15
    return p0
.end method
