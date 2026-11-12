.class public abstract Lfr;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final A:[I

.field public static final B:Ljava/lang/String;

.field public static final w:La61;

.field public static final x:Landroid/view/animation/LinearInterpolator;

.field public static final y:La61;

.field public static final z:Landroid/os/Handler;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:Landroid/animation/TimeInterpolator;

.field public final e:Landroid/animation/TimeInterpolator;

.field public final f:Landroid/animation/TimeInterpolator;

.field public final g:Landroid/view/ViewGroup;

.field public final h:Landroid/content/Context;

.field public final i:Ler;

.field public final j:Lcom/google/android/material/snackbar/SnackbarContentLayout;

.field public k:I

.field public l:Lcr;

.field public final m:Lzq;

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:Z

.field public final u:Landroid/view/accessibility/AccessibilityManager;

.field public final v:Lbr;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lyd;->b:La61;

    .line 2
    .line 3
    sput-object v0, Lfr;->w:La61;

    .line 4
    .line 5
    sget-object v0, Lyd;->a:Landroid/view/animation/LinearInterpolator;

    .line 6
    .line 7
    sput-object v0, Lfr;->x:Landroid/view/animation/LinearInterpolator;

    .line 8
    .line 9
    sget-object v0, Lyd;->d:La61;

    .line 10
    .line 11
    sput-object v0, Lfr;->y:La61;

    .line 12
    .line 13
    const v0, 0x7f0404a0

    .line 14
    .line 15
    .line 16
    filled-new-array {v0}, [I

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lfr;->A:[I

    .line 21
    .line 22
    const-class v0, Lfr;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lfr;->B:Ljava/lang/String;

    .line 29
    .line 30
    new-instance v0, Landroid/os/Handler;

    .line 31
    .line 32
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    new-instance v2, Lyq;

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-direct {v2, v3}, Lyq;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lfr;->z:Landroid/os/Handler;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;Lcom/google/android/material/snackbar/SnackbarContentLayout;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lzq;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lzq;-><init>(Lfr;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lfr;->m:Lzq;

    .line 11
    .line 12
    new-instance v0, Lbr;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lbr;-><init>(Lfr;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lfr;->v:Lbr;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    if-eqz p3, :cond_4

    .line 21
    .line 22
    if-eqz p4, :cond_3

    .line 23
    .line 24
    iput-object p2, p0, Lfr;->g:Landroid/view/ViewGroup;

    .line 25
    .line 26
    iput-object p4, p0, Lfr;->j:Lcom/google/android/material/snackbar/SnackbarContentLayout;

    .line 27
    .line 28
    iput-object p1, p0, Lfr;->h:Landroid/content/Context;

    .line 29
    .line 30
    sget-object p4, Luc5;->g:[I

    .line 31
    .line 32
    const-string v0, "Theme.AppCompat"

    .line 33
    .line 34
    invoke-static {p1, p4, v0}, Luc5;->h(Landroid/content/Context;[ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 38
    .line 39
    .line 40
    move-result-object p4

    .line 41
    sget-object v0, Lfr;->A:[I

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/4 v2, -0x1

    .line 48
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 53
    .line 54
    .line 55
    if-eq v3, v2, :cond_0

    .line 56
    .line 57
    const v0, 0x7f0d00f6

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const v0, 0x7f0d0030

    .line 62
    .line 63
    .line 64
    :goto_0
    invoke-virtual {p4, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    check-cast p2, Ler;

    .line 69
    .line 70
    iput-object p2, p0, Lfr;->i:Ler;

    .line 71
    .line 72
    invoke-static {p2, p0}, Ler;->a(Ler;Lfr;)V

    .line 73
    .line 74
    .line 75
    instance-of p4, p3, Lcom/google/android/material/snackbar/SnackbarContentLayout;

    .line 76
    .line 77
    if-eqz p4, :cond_2

    .line 78
    .line 79
    move-object p4, p3

    .line 80
    check-cast p4, Lcom/google/android/material/snackbar/SnackbarContentLayout;

    .line 81
    .line 82
    invoke-virtual {p2}, Ler;->getActionTextColorAlpha()F

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    const/high16 v2, 0x3f800000    # 1.0f

    .line 87
    .line 88
    cmpl-float v2, v0, v2

    .line 89
    .line 90
    if-eqz v2, :cond_1

    .line 91
    .line 92
    iget-object v2, p4, Lcom/google/android/material/snackbar/SnackbarContentLayout;->o:Landroid/widget/Button;

    .line 93
    .line 94
    invoke-virtual {v2}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    const v3, 0x7f04013b

    .line 99
    .line 100
    .line 101
    invoke-static {p4, v3}, Lg12;->t(Landroid/view/View;I)I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    invoke-static {v3, v0, v2}, Lg12;->H(IFI)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    iget-object v2, p4, Lcom/google/android/material/snackbar/SnackbarContentLayout;->o:Landroid/widget/Button;

    .line 110
    .line 111
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 112
    .line 113
    .line 114
    :cond_1
    invoke-virtual {p2}, Ler;->getMaxInlineActionWidth()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-virtual {p4, v0}, Lcom/google/android/material/snackbar/SnackbarContentLayout;->setMaxInlineActionWidth(I)V

    .line 119
    .line 120
    .line 121
    :cond_2
    invoke-virtual {p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 122
    .line 123
    .line 124
    sget-object p3, Lj65;->a:Ljava/util/WeakHashMap;

    .line 125
    .line 126
    const/4 p3, 0x1

    .line 127
    invoke-virtual {p2, p3}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2, p3}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2, p3}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 134
    .line 135
    .line 136
    new-instance p3, Lhg3;

    .line 137
    .line 138
    const/4 p4, 0x7

    .line 139
    invoke-direct {p3, p4, p0}, Lhg3;-><init>(ILjava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-static {p2, p3}, La65;->c(Landroid/view/View;Lr83;)V

    .line 143
    .line 144
    .line 145
    new-instance p3, Lar;

    .line 146
    .line 147
    invoke-direct {p3, v1, p0}, Lar;-><init>(ILjava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    invoke-static {p2, p3}, Lj65;->o(Landroid/view/View;Lz2;)V

    .line 151
    .line 152
    .line 153
    const-string p2, "accessibility"

    .line 154
    .line 155
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    check-cast p2, Landroid/view/accessibility/AccessibilityManager;

    .line 160
    .line 161
    iput-object p2, p0, Lfr;->u:Landroid/view/accessibility/AccessibilityManager;

    .line 162
    .line 163
    const/16 p2, 0xfa

    .line 164
    .line 165
    const p3, 0x7f04038f

    .line 166
    .line 167
    .line 168
    invoke-static {p1, p3, p2}, Lg12;->N(Landroid/content/Context;II)I

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    iput p2, p0, Lfr;->c:I

    .line 173
    .line 174
    const/16 p2, 0x96

    .line 175
    .line 176
    invoke-static {p1, p3, p2}, Lg12;->N(Landroid/content/Context;II)I

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    iput p2, p0, Lfr;->a:I

    .line 181
    .line 182
    const p2, 0x7f040392

    .line 183
    .line 184
    .line 185
    const/16 p3, 0x4b

    .line 186
    .line 187
    invoke-static {p1, p2, p3}, Lg12;->N(Landroid/content/Context;II)I

    .line 188
    .line 189
    .line 190
    move-result p2

    .line 191
    iput p2, p0, Lfr;->b:I

    .line 192
    .line 193
    sget-object p2, Lfr;->x:Landroid/view/animation/LinearInterpolator;

    .line 194
    .line 195
    const p3, 0x7f04039f

    .line 196
    .line 197
    .line 198
    invoke-static {p1, p3, p2}, Lg12;->O(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    iput-object p2, p0, Lfr;->d:Landroid/animation/TimeInterpolator;

    .line 203
    .line 204
    sget-object p2, Lfr;->y:La61;

    .line 205
    .line 206
    invoke-static {p1, p3, p2}, Lg12;->O(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    iput-object p2, p0, Lfr;->f:Landroid/animation/TimeInterpolator;

    .line 211
    .line 212
    sget-object p2, Lfr;->w:La61;

    .line 213
    .line 214
    invoke-static {p1, p3, p2}, Lg12;->O(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    iput-object p1, p0, Lfr;->e:Landroid/animation/TimeInterpolator;

    .line 219
    .line 220
    return-void

    .line 221
    :cond_3
    const-string p0, "Transient bottom bar must have non-null callback"

    .line 222
    .line 223
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw v0

    .line 227
    :cond_4
    const-string p0, "Transient bottom bar must have non-null content"

    .line 228
    .line 229
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw v0
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .line 1
    invoke-static {}, Lna4;->z()Lna4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Lfr;->v:Lbr;

    .line 6
    .line 7
    iget-object v1, v0, Lna4;->n:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    invoke-virtual {v0, p0}, Lna4;->G(Lbr;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object p0, v0, Lna4;->p:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lrg4;

    .line 19
    .line 20
    invoke-virtual {v0, p0, p1}, Lna4;->j(Lrg4;I)Z

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_2

    .line 26
    :cond_0
    iget-object v2, v0, Lna4;->q:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Lrg4;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    iget-object v2, v2, Lrg4;->a:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-ne v2, p0, :cond_1

    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 p0, 0x0

    .line 43
    :goto_0
    if-eqz p0, :cond_2

    .line 44
    .line 45
    iget-object p0, v0, Lna4;->q:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, Lrg4;

    .line 48
    .line 49
    invoke-virtual {v0, p0, p1}, Lna4;->j(Lrg4;I)Z

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_1
    monitor-exit v1

    .line 53
    return-void

    .line 54
    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    throw p0
.end method

.method public final b()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lfr;->l:Lcr;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    iget-object p0, p0, Lcr;->o:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Landroid/view/View;

    .line 14
    .line 15
    return-object p0
.end method

.method public final c()V
    .locals 3

    .line 1
    invoke-static {}, Lna4;->z()Lna4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lfr;->v:Lbr;

    .line 6
    .line 7
    iget-object v2, v0, Lna4;->n:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v2

    .line 10
    :try_start_0
    invoke-virtual {v0, v1}, Lna4;->G(Lbr;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-object v1, v0, Lna4;->p:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v1, v0, Lna4;->q:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lrg4;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Lna4;->Q()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    iget-object v0, p0, Lfr;->i:Ler;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    check-cast v0, Landroid/view/ViewGroup;

    .line 43
    .line 44
    iget-object p0, p0, Lfr;->i:Ler;

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    return-void

    .line 50
    :goto_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    throw p0
.end method

.method public final d()V
    .locals 2

    .line 1
    invoke-static {}, Lna4;->z()Lna4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Lfr;->v:Lbr;

    .line 6
    .line 7
    iget-object v1, v0, Lna4;->n:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    invoke-virtual {v0, p0}, Lna4;->G(Lbr;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    iget-object p0, v0, Lna4;->p:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lrg4;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Lna4;->P(Lrg4;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    monitor-exit v1

    .line 27
    return-void

    .line 28
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw p0
.end method

.method public final e(Landroid/widget/FrameLayout;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lfr;->l:Lcr;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcr;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-nez p1, :cond_1

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    new-instance v0, Lcr;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1}, Lcr;-><init>(Lfr;Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    sget-object v1, Lj65;->a:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 30
    .line 31
    .line 32
    :cond_2
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 33
    .line 34
    .line 35
    move-object p1, v0

    .line 36
    :goto_0
    iput-object p1, p0, Lfr;->l:Lcr;

    .line 37
    .line 38
    return-void
.end method

.method public final f()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lfr;->u:Landroid/view/accessibility/AccessibilityManager;

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v2, v1}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move v1, v0

    .line 22
    :goto_0
    iget-object v2, p0, Lfr;->i:Ler;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    new-instance v0, Lzq;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {v0, p0, v1}, Lzq;-><init>(Lfr;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    :cond_3
    invoke-virtual {p0}, Lfr;->d()V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final g()V
    .locals 7

    .line 1
    iget-object v0, p0, Lfr;->i:Ler;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    instance-of v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 8
    .line 9
    sget-object v3, Lfr;->B:Ljava/lang/String;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    const-string p0, "Unable to update margins because layout params are not MarginLayoutParams"

    .line 14
    .line 15
    invoke-static {v3, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v2, v0, Ler;->w:Landroid/graphics/Rect;

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    const-string p0, "Unable to update margins because original view margins are not set"

    .line 24
    .line 25
    invoke-static {v3, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_2
    invoke-virtual {p0}, Lfr;->b()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    iget v2, p0, Lfr;->q:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    iget v2, p0, Lfr;->n:I

    .line 46
    .line 47
    :goto_0
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 48
    .line 49
    iget-object v3, v0, Ler;->w:Landroid/graphics/Rect;

    .line 50
    .line 51
    iget v4, v3, Landroid/graphics/Rect;->bottom:I

    .line 52
    .line 53
    add-int/2addr v4, v2

    .line 54
    iget v2, v3, Landroid/graphics/Rect;->left:I

    .line 55
    .line 56
    iget v5, p0, Lfr;->o:I

    .line 57
    .line 58
    add-int/2addr v2, v5

    .line 59
    iget v5, v3, Landroid/graphics/Rect;->right:I

    .line 60
    .line 61
    iget v6, p0, Lfr;->p:I

    .line 62
    .line 63
    add-int/2addr v5, v6

    .line 64
    iget v3, v3, Landroid/graphics/Rect;->top:I

    .line 65
    .line 66
    iget v6, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 67
    .line 68
    if-ne v6, v4, :cond_5

    .line 69
    .line 70
    iget v6, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 71
    .line 72
    if-ne v6, v2, :cond_5

    .line 73
    .line 74
    iget v6, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 75
    .line 76
    if-ne v6, v5, :cond_5

    .line 77
    .line 78
    iget v6, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 79
    .line 80
    if-eq v6, v3, :cond_4

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    const/4 v6, 0x0

    .line 84
    goto :goto_2

    .line 85
    :cond_5
    :goto_1
    const/4 v6, 0x1

    .line 86
    :goto_2
    if-eqz v6, :cond_6

    .line 87
    .line 88
    iput v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 89
    .line 90
    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 91
    .line 92
    iput v5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 93
    .line 94
    iput v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 97
    .line 98
    .line 99
    :cond_6
    if-nez v6, :cond_7

    .line 100
    .line 101
    iget v1, p0, Lfr;->s:I

    .line 102
    .line 103
    iget v2, p0, Lfr;->r:I

    .line 104
    .line 105
    if-eq v1, v2, :cond_8

    .line 106
    .line 107
    :cond_7
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 108
    .line 109
    const/16 v2, 0x1d

    .line 110
    .line 111
    if-lt v1, v2, :cond_8

    .line 112
    .line 113
    iget v1, p0, Lfr;->r:I

    .line 114
    .line 115
    if-lez v1, :cond_8

    .line 116
    .line 117
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    instance-of v2, v1, Lge0;

    .line 122
    .line 123
    if-eqz v2, :cond_8

    .line 124
    .line 125
    check-cast v1, Lge0;

    .line 126
    .line 127
    iget-object v1, v1, Lge0;->a:Lde0;

    .line 128
    .line 129
    instance-of v1, v1, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    .line 130
    .line 131
    if-eqz v1, :cond_8

    .line 132
    .line 133
    iget-object p0, p0, Lfr;->m:Lzq;

    .line 134
    .line 135
    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 139
    .line 140
    .line 141
    :cond_8
    :goto_3
    return-void
.end method
