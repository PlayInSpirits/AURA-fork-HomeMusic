.class public final Lya;
.super Lz2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;
.implements Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;
.implements Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;


# static fields
.field public static final a0:Lh03;


# instance fields
.field public A:Lv3;

.field public B:Z

.field public final C:Li03;

.field public final D:Li03;

.field public final E:Lmj4;

.field public final F:Lmj4;

.field public G:I

.field public H:Ljava/lang/Integer;

.field public final I:Lqi;

.field public final J:Law;

.field public K:Z

.field public L:Lva;

.field public M:Li03;

.field public final N:Lj03;

.field public final O:Lg03;

.field public final P:Lg03;

.field public final Q:Ljava/lang/String;

.field public final R:Ljava/lang/String;

.field public final S:Lyc5;

.field public final T:Li03;

.field public U:Lj94;

.field public V:Z

.field public final W:Lg03;

.field public final X:La0;

.field public final Y:Ljava/util/ArrayList;

.field public final Z:Lsa;

.field public final q:Lra;

.field public r:I

.field public final s:Lsa;

.field public final t:Landroid/view/accessibility/AccessibilityManager;

.field public u:J

.field public v:Ljava/util/List;

.field public final w:Lua;

.field public x:I

.field public y:I

.field public z:Lv3;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sget-object v2, Lc02;->a:Lh03;

    .line 9
    .line 10
    new-instance v2, Lh03;

    .line 11
    .line 12
    invoke-direct {v2, v0}, Lh03;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iget v3, v2, Lh03;->b:I

    .line 16
    .line 17
    if-ltz v3, :cond_2

    .line 18
    .line 19
    add-int/lit8 v4, v3, 0x20

    .line 20
    .line 21
    iget-object v5, v2, Lh03;->a:[I

    .line 22
    .line 23
    array-length v6, v5

    .line 24
    if-ge v6, v4, :cond_0

    .line 25
    .line 26
    array-length v6, v5

    .line 27
    mul-int/lit8 v6, v6, 0x3

    .line 28
    .line 29
    div-int/lit8 v6, v6, 0x2

    .line 30
    .line 31
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([II)[I

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    iput-object v5, v2, Lh03;->a:[I

    .line 40
    .line 41
    :cond_0
    iget-object v5, v2, Lh03;->a:[I

    .line 42
    .line 43
    iget v6, v2, Lh03;->b:I

    .line 44
    .line 45
    if-eq v3, v6, :cond_1

    .line 46
    .line 47
    invoke-static {v4, v3, v6, v5, v5}, Lti;->Y(III[I[I)V

    .line 48
    .line 49
    .line 50
    :cond_1
    const/4 v4, 0x0

    .line 51
    const/16 v6, 0xc

    .line 52
    .line 53
    invoke-static {v3, v4, v6, v1, v5}, Lti;->b0(III[I[I)V

    .line 54
    .line 55
    .line 56
    iget v1, v2, Lh03;->b:I

    .line 57
    .line 58
    add-int/2addr v1, v0

    .line 59
    iput v1, v2, Lh03;->b:I

    .line 60
    .line 61
    sput-object v2, Lya;->a0:Lh03;

    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    const-string v0, ""

    .line 65
    .line 66
    invoke-static {v0}, Lkf2;->h(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    nop

    .line 71
    :array_0
    .array-data 4
        0x7f0a0011
        0x7f0a0012
        0x7f0a001d
        0x7f0a0028
        0x7f0a002b
        0x7f0a002c
        0x7f0a002d
        0x7f0a002e
        0x7f0a002f
        0x7f0a0030
        0x7f0a0013
        0x7f0a0014
        0x7f0a0015
        0x7f0a0016
        0x7f0a0017
        0x7f0a0018
        0x7f0a0019
        0x7f0a001a
        0x7f0a001b
        0x7f0a001c
        0x7f0a001e
        0x7f0a001f
        0x7f0a0020
        0x7f0a0021
        0x7f0a0022
        0x7f0a0023
        0x7f0a0024
        0x7f0a0025
        0x7f0a0026
        0x7f0a0027
        0x7f0a0029
        0x7f0a002a
    .end array-data
.end method

.method public constructor <init>(Lra;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lz2;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lya;->q:Lra;

    .line 5
    .line 6
    const/high16 v0, -0x80000000

    .line 7
    .line 8
    iput v0, p0, Lya;->r:I

    .line 9
    .line 10
    new-instance v1, Lsa;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p0, v2}, Lsa;-><init>(Lya;I)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lya;->s:Lsa;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v3, "accessibility"

    .line 23
    .line 24
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    .line 32
    .line 33
    iput-object v1, p0, Lya;->t:Landroid/view/accessibility/AccessibilityManager;

    .line 34
    .line 35
    const-wide/16 v3, 0x64

    .line 36
    .line 37
    iput-wide v3, p0, Lya;->u:J

    .line 38
    .line 39
    new-instance v1, Landroid/os/Handler;

    .line 40
    .line 41
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 46
    .line 47
    .line 48
    new-instance v1, Lua;

    .line 49
    .line 50
    invoke-direct {v1, p0, v2}, Lua;-><init>(Lz2;I)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lya;->w:Lua;

    .line 54
    .line 55
    iput v0, p0, Lya;->x:I

    .line 56
    .line 57
    iput v0, p0, Lya;->y:I

    .line 58
    .line 59
    new-instance v0, Li03;

    .line 60
    .line 61
    invoke-direct {v0}, Li03;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Lya;->C:Li03;

    .line 65
    .line 66
    new-instance v0, Li03;

    .line 67
    .line 68
    invoke-direct {v0}, Li03;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Lya;->D:Li03;

    .line 72
    .line 73
    new-instance v0, Lmj4;

    .line 74
    .line 75
    invoke-direct {v0, v2}, Lmj4;-><init>(I)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, Lya;->E:Lmj4;

    .line 79
    .line 80
    new-instance v0, Lmj4;

    .line 81
    .line 82
    invoke-direct {v0, v2}, Lmj4;-><init>(I)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, Lya;->F:Lmj4;

    .line 86
    .line 87
    const/4 v0, -0x1

    .line 88
    iput v0, p0, Lya;->G:I

    .line 89
    .line 90
    new-instance v0, Lqi;

    .line 91
    .line 92
    invoke-direct {v0, v2}, Lqi;-><init>(I)V

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, Lya;->I:Lqi;

    .line 96
    .line 97
    const/4 v0, 0x6

    .line 98
    const/4 v1, 0x1

    .line 99
    const/4 v2, 0x0

    .line 100
    invoke-static {v1, v0, v2}, Lsu3;->a(IILwv;)Law;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iput-object v0, p0, Lya;->J:Law;

    .line 105
    .line 106
    iput-boolean v1, p0, Lya;->K:Z

    .line 107
    .line 108
    sget-object v0, Lf02;->a:Li03;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iput-object v0, p0, Lya;->M:Li03;

    .line 114
    .line 115
    new-instance v2, Lj03;

    .line 116
    .line 117
    invoke-direct {v2}, Lj03;-><init>()V

    .line 118
    .line 119
    .line 120
    iput-object v2, p0, Lya;->N:Lj03;

    .line 121
    .line 122
    new-instance v2, Lg03;

    .line 123
    .line 124
    invoke-direct {v2}, Lg03;-><init>()V

    .line 125
    .line 126
    .line 127
    iput-object v2, p0, Lya;->O:Lg03;

    .line 128
    .line 129
    new-instance v2, Lg03;

    .line 130
    .line 131
    invoke-direct {v2}, Lg03;-><init>()V

    .line 132
    .line 133
    .line 134
    iput-object v2, p0, Lya;->P:Lg03;

    .line 135
    .line 136
    const-string v2, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL"

    .line 137
    .line 138
    iput-object v2, p0, Lya;->Q:Ljava/lang/String;

    .line 139
    .line 140
    const-string v2, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL"

    .line 141
    .line 142
    iput-object v2, p0, Lya;->R:Ljava/lang/String;

    .line 143
    .line 144
    new-instance v2, Lyc5;

    .line 145
    .line 146
    const/16 v3, 0xa

    .line 147
    .line 148
    invoke-direct {v2, v3}, Lyc5;-><init>(I)V

    .line 149
    .line 150
    .line 151
    iput-object v2, p0, Lya;->S:Lyc5;

    .line 152
    .line 153
    new-instance v2, Li03;

    .line 154
    .line 155
    invoke-direct {v2}, Li03;-><init>()V

    .line 156
    .line 157
    .line 158
    iput-object v2, p0, Lya;->T:Li03;

    .line 159
    .line 160
    new-instance v2, Lj94;

    .line 161
    .line 162
    invoke-virtual {p1}, Lra;->getSemanticsOwner()Ll94;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-virtual {v3}, Ll94;->a()Li94;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-direct {v2, v3, v0}, Lj94;-><init>(Li94;Le02;)V

    .line 171
    .line 172
    .line 173
    iput-object v2, p0, Lya;->U:Lj94;

    .line 174
    .line 175
    sget v0, La02;->a:I

    .line 176
    .line 177
    new-instance v0, Lg03;

    .line 178
    .line 179
    invoke-direct {v0}, Lg03;-><init>()V

    .line 180
    .line 181
    .line 182
    iput-object v0, p0, Lya;->W:Lg03;

    .line 183
    .line 184
    invoke-virtual {p1, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 185
    .line 186
    .line 187
    new-instance p1, La0;

    .line 188
    .line 189
    const/4 v0, 0x4

    .line 190
    invoke-direct {p1, v0, p0}, La0;-><init>(ILjava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    iput-object p1, p0, Lya;->X:La0;

    .line 194
    .line 195
    new-instance p1, Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 198
    .line 199
    .line 200
    iput-object p1, p0, Lya;->Y:Ljava/util/ArrayList;

    .line 201
    .line 202
    new-instance p1, Lsa;

    .line 203
    .line 204
    invoke-direct {p1, p0, v1}, Lsa;-><init>(Lya;I)V

    .line 205
    .line 206
    .line 207
    iput-object p1, p0, Lya;->Z:Lsa;

    .line 208
    .line 209
    return-void
.end method

.method public static synthetic E(Lya;IILjava/lang/Integer;I)V
    .locals 1

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p3, v0

    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3, v0}, Lya;->D(IILjava/lang/Integer;Ljava/util/List;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static L(Lya4;FF)Landroid/graphics/Rect;
    .locals 4

    .line 1
    instance-of v0, p0, Lnb3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p0, Lob3;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lya4;->s()Lwv3;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance v0, Landroid/graphics/Rect;

    .line 17
    .line 18
    iget v1, p0, Lwv3;->a:F

    .line 19
    .line 20
    add-float/2addr v1, p1

    .line 21
    float-to-int v1, v1

    .line 22
    iget v2, p0, Lwv3;->b:F

    .line 23
    .line 24
    add-float/2addr v2, p2

    .line 25
    float-to-int v2, v2

    .line 26
    iget v3, p0, Lwv3;->c:F

    .line 27
    .line 28
    add-float/2addr v3, p1

    .line 29
    float-to-int p1, v3

    .line 30
    iget p0, p0, Lwv3;->d:F

    .line 31
    .line 32
    add-float/2addr p0, p2

    .line 33
    float-to-int p0, p0

    .line 34
    invoke-direct {v0, v1, v2, p1, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public static N(Lya4;)[F
    .locals 13

    .line 1
    instance-of v0, p0, Lob3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lob3;

    .line 6
    .line 7
    iget-object p0, p0, Lob3;->f:Lg34;

    .line 8
    .line 9
    iget-wide v0, p0, Lg34;->h:J

    .line 10
    .line 11
    iget-wide v2, p0, Lg34;->g:J

    .line 12
    .line 13
    iget-wide v4, p0, Lg34;->f:J

    .line 14
    .line 15
    iget-wide v6, p0, Lg34;->e:J

    .line 16
    .line 17
    const/16 p0, 0x20

    .line 18
    .line 19
    shr-long v8, v6, p0

    .line 20
    .line 21
    long-to-int v8, v8

    .line 22
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 23
    .line 24
    .line 25
    move-result v8

    .line 26
    const-wide v9, 0xffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr v6, v9

    .line 32
    long-to-int v6, v6

    .line 33
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    shr-long v11, v4, p0

    .line 38
    .line 39
    long-to-int v7, v11

    .line 40
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    and-long/2addr v4, v9

    .line 45
    long-to-int v4, v4

    .line 46
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    shr-long v11, v2, p0

    .line 51
    .line 52
    long-to-int v5, v11

    .line 53
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    and-long/2addr v2, v9

    .line 58
    long-to-int v2, v2

    .line 59
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    shr-long v11, v0, p0

    .line 64
    .line 65
    long-to-int p0, v11

    .line 66
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    and-long/2addr v0, v9

    .line 71
    long-to-int v0, v0

    .line 72
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    const/16 v1, 0x8

    .line 77
    .line 78
    new-array v1, v1, [F

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    aput v8, v1, v3

    .line 82
    .line 83
    const/4 v3, 0x1

    .line 84
    aput v6, v1, v3

    .line 85
    .line 86
    const/4 v3, 0x2

    .line 87
    aput v7, v1, v3

    .line 88
    .line 89
    const/4 v3, 0x3

    .line 90
    aput v4, v1, v3

    .line 91
    .line 92
    const/4 v3, 0x4

    .line 93
    aput v5, v1, v3

    .line 94
    .line 95
    const/4 v3, 0x5

    .line 96
    aput v2, v1, v3

    .line 97
    .line 98
    const/4 v2, 0x6

    .line 99
    aput p0, v1, v2

    .line 100
    .line 101
    const/4 p0, 0x7

    .line 102
    aput v0, v1, p0

    .line 103
    .line 104
    return-object v1

    .line 105
    :cond_0
    const/4 p0, 0x0

    .line 106
    return-object p0
.end method

.method public static O(Lya4;FF)Landroid/graphics/Region;
    .locals 8

    .line 1
    instance-of v0, p0, Lmb3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Region;

    .line 7
    .line 8
    check-cast p0, Lmb3;

    .line 9
    .line 10
    invoke-virtual {p0}, Lmb3;->s()Lwv3;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2, p1, p2}, Lwv3;->e(FF)Lwv3;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    new-instance v3, Landroid/graphics/Rect;

    .line 19
    .line 20
    iget v4, v2, Lwv3;->a:F

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    add-float/2addr v4, v5

    .line 24
    float-to-int v4, v4

    .line 25
    iget v6, v2, Lwv3;->b:F

    .line 26
    .line 27
    add-float/2addr v6, v5

    .line 28
    float-to-int v6, v6

    .line 29
    iget v7, v2, Lwv3;->c:F

    .line 30
    .line 31
    add-float/2addr v7, v5

    .line 32
    float-to-int v7, v7

    .line 33
    iget v2, v2, Lwv3;->d:F

    .line 34
    .line 35
    add-float/2addr v2, v5

    .line 36
    float-to-int v2, v2

    .line 37
    invoke-direct {v3, v4, v6, v7, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v3}, Landroid/graphics/Region;-><init>(Landroid/graphics/Rect;)V

    .line 41
    .line 42
    .line 43
    new-instance v2, Landroid/graphics/Region;

    .line 44
    .line 45
    invoke-direct {v2}, Landroid/graphics/Region;-><init>()V

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Lmb3;->f:Lnc;

    .line 49
    .line 50
    instance-of v3, p0, Lnc;

    .line 51
    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    iget-object p0, p0, Lnc;->a:Landroid/graphics/Path;

    .line 55
    .line 56
    invoke-virtual {p0, p1, p2}, Landroid/graphics/Path;->offset(FF)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, p0, v0}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    .line 60
    .line 61
    .line 62
    return-object v2

    .line 63
    :cond_0
    const-string p0, "Unable to obtain android.graphics.Path"

    .line 64
    .line 65
    invoke-static {p0}, Ler1;->l(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    return-object v1
.end method

.method public static P(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const v1, 0x186a0

    .line 13
    .line 14
    .line 15
    if-gt v0, v1, :cond_1

    .line 16
    .line 17
    :goto_0
    return-object p0

    .line 18
    :cond_1
    const v0, 0x1869f

    .line 19
    .line 20
    .line 21
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v2}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    move v1, v0

    .line 42
    :cond_2
    const/4 v0, 0x0

    .line 43
    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    return-object p0
.end method

.method public static t(Li94;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    iget-object p0, p0, Li94;->d:Le94;

    .line 6
    .line 7
    iget-object v1, p0, Le94;->n:Lw03;

    .line 8
    .line 9
    sget-object v2, Ln94;->a:Lp94;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lw03;->c(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0, v2}, Le94;->d(Lp94;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/util/List;

    .line 22
    .line 23
    const-string v1, ","

    .line 24
    .line 25
    const/16 v2, 0x3e

    .line 26
    .line 27
    invoke-static {p0, v1, v0, v2}, Lgc2;->a(Ljava/util/List;Ljava/lang/String;Lk52;I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    sget-object p0, Ln94;->D:Lp94;

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Lw03;->c(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    invoke-virtual {v1, p0}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-nez p0, :cond_2

    .line 45
    .line 46
    move-object p0, v0

    .line 47
    :cond_2
    check-cast p0, Lhe;

    .line 48
    .line 49
    if-eqz p0, :cond_5

    .line 50
    .line 51
    iget-object p0, p0, Lhe;->o:Ljava/lang/String;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_3
    sget-object p0, Ln94;->z:Lp94;

    .line 55
    .line 56
    invoke-virtual {v1, p0}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-nez p0, :cond_4

    .line 61
    .line 62
    move-object p0, v0

    .line 63
    :cond_4
    check-cast p0, Ljava/util/List;

    .line 64
    .line 65
    if-eqz p0, :cond_5

    .line 66
    .line 67
    invoke-static {p0}, Lq40;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, Lhe;

    .line 72
    .line 73
    if-eqz p0, :cond_5

    .line 74
    .line 75
    iget-object p0, p0, Lhe;->o:Ljava/lang/String;

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_5
    :goto_0
    return-object v0
.end method

.method public static final x(Lh64;F)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lh64;->a:Lv82;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v2, p1, v1

    .line 5
    .line 6
    if-gez v2, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lv82;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    cmpl-float v2, v2, v1

    .line 19
    .line 20
    if-gtz v2, :cond_1

    .line 21
    .line 22
    :cond_0
    cmpl-float p1, p1, v1

    .line 23
    .line 24
    if-lez p1, :cond_2

    .line 25
    .line 26
    invoke-virtual {v0}, Lv82;->invoke()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iget-object p0, p0, Lh64;->b:Lv82;

    .line 37
    .line 38
    invoke-virtual {p0}, Lv82;->invoke()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    cmpg-float p0, p1, p0

    .line 49
    .line 50
    if-gez p0, :cond_2

    .line 51
    .line 52
    :cond_1
    const/4 p0, 0x1

    .line 53
    return p0

    .line 54
    :cond_2
    const/4 p0, 0x0

    .line 55
    return p0
.end method

.method public static final y(Lh64;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lh64;->a:Lv82;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv82;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    cmpl-float v1, v1, v2

    .line 15
    .line 16
    if-lez v1, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    invoke-virtual {v0}, Lv82;->invoke()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lh64;->b:Lv82;

    .line 30
    .line 31
    invoke-virtual {p0}, Lv82;->invoke()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return p0
.end method

.method public static final z(Lh64;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh64;->a:Lv82;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv82;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object p0, p0, Lh64;->b:Lv82;

    .line 14
    .line 15
    invoke-virtual {p0}, Lv82;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    cmpg-float p0, v1, p0

    .line 26
    .line 27
    if-gez p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    invoke-virtual {v0}, Lv82;->invoke()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return p0
.end method


# virtual methods
.method public final A(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lya;->q:Lra;

    .line 2
    .line 3
    invoke-virtual {p0}, Lra;->getSemanticsOwner()Ll94;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ll94;->a()Li94;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget p0, p0, Li94;->f:I

    .line 12
    .line 13
    if-ne p1, p0, :cond_0

    .line 14
    .line 15
    const/4 p0, -0x1

    .line 16
    return p0

    .line 17
    :cond_0
    return p1
.end method

.method public final B(Li94;Lj94;)V
    .locals 19

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
    sget-object v3, Lm02;->a:[I

    .line 8
    .line 9
    new-instance v3, Lj03;

    .line 10
    .line 11
    invoke-direct {v3}, Lj03;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x4

    .line 15
    invoke-static {v4, v1}, Li94;->j(ILi94;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    iget-object v6, v1, Li94;->c:Lc72;

    .line 20
    .line 21
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    const/4 v8, 0x0

    .line 26
    move v9, v8

    .line 27
    :goto_0
    if-ge v9, v7, :cond_2

    .line 28
    .line 29
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v10

    .line 33
    check-cast v10, Li94;

    .line 34
    .line 35
    invoke-virtual {v0}, Lya;->s()Le02;

    .line 36
    .line 37
    .line 38
    move-result-object v11

    .line 39
    iget v10, v10, Li94;->f:I

    .line 40
    .line 41
    invoke-virtual {v11, v10}, Le02;->a(I)Z

    .line 42
    .line 43
    .line 44
    move-result v11

    .line 45
    if-eqz v11, :cond_1

    .line 46
    .line 47
    iget-object v11, v2, Lj94;->b:Lj03;

    .line 48
    .line 49
    invoke-virtual {v11, v10}, Lj03;->c(I)Z

    .line 50
    .line 51
    .line 52
    move-result v11

    .line 53
    if-nez v11, :cond_0

    .line 54
    .line 55
    invoke-virtual {v0, v6}, Lya;->w(Lc72;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    invoke-virtual {v3, v10}, Lj03;->a(I)Z

    .line 60
    .line 61
    .line 62
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    iget-object v2, v2, Lj94;->b:Lj03;

    .line 66
    .line 67
    iget-object v5, v2, Lj03;->b:[I

    .line 68
    .line 69
    iget-object v2, v2, Lj03;->a:[J

    .line 70
    .line 71
    array-length v7, v2

    .line 72
    add-int/lit8 v7, v7, -0x2

    .line 73
    .line 74
    if-ltz v7, :cond_6

    .line 75
    .line 76
    move v9, v8

    .line 77
    :goto_1
    aget-wide v10, v2, v9

    .line 78
    .line 79
    not-long v12, v10

    .line 80
    const/4 v14, 0x7

    .line 81
    shl-long/2addr v12, v14

    .line 82
    and-long/2addr v12, v10

    .line 83
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    and-long/2addr v12, v14

    .line 89
    cmp-long v12, v12, v14

    .line 90
    .line 91
    if-eqz v12, :cond_5

    .line 92
    .line 93
    sub-int v12, v9, v7

    .line 94
    .line 95
    not-int v12, v12

    .line 96
    ushr-int/lit8 v12, v12, 0x1f

    .line 97
    .line 98
    const/16 v13, 0x8

    .line 99
    .line 100
    rsub-int/lit8 v12, v12, 0x8

    .line 101
    .line 102
    move v14, v8

    .line 103
    :goto_2
    if-ge v14, v12, :cond_4

    .line 104
    .line 105
    const-wide/16 v15, 0xff

    .line 106
    .line 107
    and-long/2addr v15, v10

    .line 108
    const-wide/16 v17, 0x80

    .line 109
    .line 110
    cmp-long v15, v15, v17

    .line 111
    .line 112
    if-gez v15, :cond_3

    .line 113
    .line 114
    shl-int/lit8 v15, v9, 0x3

    .line 115
    .line 116
    add-int/2addr v15, v14

    .line 117
    aget v15, v5, v15

    .line 118
    .line 119
    invoke-virtual {v3, v15}, Lj03;->c(I)Z

    .line 120
    .line 121
    .line 122
    move-result v15

    .line 123
    if-nez v15, :cond_3

    .line 124
    .line 125
    invoke-virtual {v0, v6}, Lya;->w(Lc72;)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_3
    shr-long/2addr v10, v13

    .line 130
    add-int/lit8 v14, v14, 0x1

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_4
    if-ne v12, v13, :cond_6

    .line 134
    .line 135
    :cond_5
    if-eq v9, v7, :cond_6

    .line 136
    .line 137
    add-int/lit8 v9, v9, 0x1

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_6
    invoke-static {v4, v1}, Li94;->j(ILi94;)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    :goto_3
    if-ge v8, v2, :cond_8

    .line 149
    .line 150
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    check-cast v3, Li94;

    .line 155
    .line 156
    iget-object v4, v0, Lya;->T:Li03;

    .line 157
    .line 158
    iget v5, v3, Li94;->f:I

    .line 159
    .line 160
    invoke-virtual {v4, v5}, Le02;->b(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    check-cast v4, Lj94;

    .line 165
    .line 166
    if-eqz v4, :cond_7

    .line 167
    .line 168
    invoke-virtual {v0}, Lya;->s()Le02;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    iget v6, v3, Li94;->f:I

    .line 173
    .line 174
    invoke-virtual {v5, v6}, Le02;->a(I)Z

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    if-eqz v5, :cond_7

    .line 179
    .line 180
    invoke-virtual {v0, v3, v4}, Lya;->B(Li94;Lj94;)V

    .line 181
    .line 182
    .line 183
    :cond_7
    add-int/lit8 v8, v8, 0x1

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_8
    return-void
.end method

.method public final C(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lya;->v()Z

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
    return v1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v2, 0x800

    .line 14
    .line 15
    if-eq v0, v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const v2, 0x8000

    .line 22
    .line 23
    .line 24
    if-ne v0, v2, :cond_2

    .line 25
    .line 26
    :cond_1
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, Lya;->B:Z

    .line 28
    .line 29
    :cond_2
    :try_start_0
    iget-object v0, p0, Lya;->s:Lsa;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lsa;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    iput-boolean v1, p0, Lya;->B:Z

    .line 42
    .line 43
    return p1

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    iput-boolean v1, p0, Lya;->B:Z

    .line 46
    .line 47
    throw p1
.end method

.method public final D(IILjava/lang/Integer;Ljava/util/List;)Z
    .locals 1

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-eq p1, v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Lya;->v()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0, p1, p2}, Lya;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    if-eqz p4, :cond_2

    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    const/16 p3, 0x3e

    .line 29
    .line 30
    const-string v0, ","

    .line 31
    .line 32
    invoke-static {p4, v0, p2, p3}, Lgc2;->a(Ljava/util/List;Ljava/lang/String;Lk52;I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    invoke-virtual {p0, p1}, Lya;->C(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0

    .line 44
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 45
    return p0
.end method

.method public final F(Ljava/lang/String;II)V
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, Lya;->A(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/16 v0, 0x20

    .line 6
    .line 7
    invoke-virtual {p0, p2, v0}, Lya;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2, p3}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 12
    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0, p2}, Lya;->C(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final G(I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lya;->L:Lva;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lva;->a:Li94;

    .line 6
    .line 7
    iget v2, v1, Li94;->f:I

    .line 8
    .line 9
    if-eq p1, v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    iget-wide v4, v0, Lva;->f:J

    .line 17
    .line 18
    sub-long/2addr v2, v4

    .line 19
    const-wide/16 v4, 0x3e8

    .line 20
    .line 21
    cmp-long p1, v2, v4

    .line 22
    .line 23
    if-gtz p1, :cond_1

    .line 24
    .line 25
    iget p1, v1, Li94;->f:I

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lya;->A(I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/high16 v2, 0x20000

    .line 32
    .line 33
    invoke-virtual {p0, p1, v2}, Lya;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget v2, v0, Lva;->d:I

    .line 38
    .line 39
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 40
    .line 41
    .line 42
    iget v2, v0, Lva;->e:I

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 45
    .line 46
    .line 47
    iget v2, v0, Lva;->b:I

    .line 48
    .line 49
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityEvent;->setAction(I)V

    .line 50
    .line 51
    .line 52
    iget v0, v0, Lva;->c:I

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setMovementGranularity(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v1}, Lya;->t(Li94;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lya;->C(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 69
    .line 70
    .line 71
    :cond_1
    const/4 p1, 0x0

    .line 72
    iput-object p1, p0, Lya;->L:Lva;

    .line 73
    .line 74
    return-void
.end method

.method public final H(Le02;)V
    .locals 54

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    const/16 v1, 0x40

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v7

    .line 11
    new-instance v8, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v9, v0, Lya;->Y:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 19
    .line 20
    .line 21
    iget-object v10, v6, Le02;->b:[I

    .line 22
    .line 23
    iget-object v11, v6, Le02;->a:[J

    .line 24
    .line 25
    array-length v1, v11

    .line 26
    const/4 v12, 0x2

    .line 27
    add-int/lit8 v13, v1, -0x2

    .line 28
    .line 29
    const/4 v14, 0x0

    .line 30
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-ltz v13, :cond_4e

    .line 35
    .line 36
    move v15, v14

    .line 37
    :goto_0
    aget-wide v3, v11, v15

    .line 38
    .line 39
    move/from16 v16, v12

    .line 40
    .line 41
    move/from16 v17, v13

    .line 42
    .line 43
    not-long v12, v3

    .line 44
    const/16 v18, 0x7

    .line 45
    .line 46
    shl-long v12, v12, v18

    .line 47
    .line 48
    and-long/2addr v12, v3

    .line 49
    const-wide v19, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long v12, v12, v19

    .line 55
    .line 56
    cmp-long v1, v12, v19

    .line 57
    .line 58
    if-eqz v1, :cond_4d

    .line 59
    .line 60
    sub-int v1, v15, v17

    .line 61
    .line 62
    not-int v1, v1

    .line 63
    ushr-int/lit8 v1, v1, 0x1f

    .line 64
    .line 65
    const/16 v12, 0x8

    .line 66
    .line 67
    rsub-int/lit8 v13, v1, 0x8

    .line 68
    .line 69
    move-wide/from16 v21, v3

    .line 70
    .line 71
    move v1, v14

    .line 72
    :goto_1
    if-ge v1, v13, :cond_4c

    .line 73
    .line 74
    const-wide/16 v23, 0xff

    .line 75
    .line 76
    and-long v3, v21, v23

    .line 77
    .line 78
    const-wide/16 v25, 0x80

    .line 79
    .line 80
    cmp-long v3, v3, v25

    .line 81
    .line 82
    if-gez v3, :cond_4b

    .line 83
    .line 84
    shl-int/lit8 v3, v15, 0x3

    .line 85
    .line 86
    add-int/2addr v3, v1

    .line 87
    aget v3, v10, v3

    .line 88
    .line 89
    iget-object v4, v0, Lya;->T:Li03;

    .line 90
    .line 91
    invoke-virtual {v4, v3}, Le02;->b(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    check-cast v4, Lj94;

    .line 96
    .line 97
    if-nez v4, :cond_0

    .line 98
    .line 99
    goto/16 :goto_2a

    .line 100
    .line 101
    :cond_0
    iget-object v4, v4, Lj94;->a:Le94;

    .line 102
    .line 103
    iget-object v5, v4, Le94;->n:Lw03;

    .line 104
    .line 105
    invoke-virtual {v6, v3}, Le02;->b(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v27

    .line 109
    move-object/from16 v14, v27

    .line 110
    .line 111
    check-cast v14, Lk94;

    .line 112
    .line 113
    const/16 v27, 0x0

    .line 114
    .line 115
    if-eqz v14, :cond_1

    .line 116
    .line 117
    iget-object v14, v14, Lk94;->a:Li94;

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_1
    move-object/from16 v14, v27

    .line 121
    .line 122
    :goto_2
    if-eqz v14, :cond_4a

    .line 123
    .line 124
    move/from16 v28, v12

    .line 125
    .line 126
    iget v12, v14, Li94;->f:I

    .line 127
    .line 128
    iget-object v6, v14, Li94;->d:Le94;

    .line 129
    .line 130
    move-object/from16 v29, v10

    .line 131
    .line 132
    iget-object v10, v6, Le94;->n:Lw03;

    .line 133
    .line 134
    move-object/from16 v30, v11

    .line 135
    .line 136
    iget-object v11, v10, Lw03;->b:[Ljava/lang/Object;

    .line 137
    .line 138
    move-object/from16 v31, v11

    .line 139
    .line 140
    iget-object v11, v10, Lw03;->c:[Ljava/lang/Object;

    .line 141
    .line 142
    move-object/from16 v32, v11

    .line 143
    .line 144
    iget-object v11, v10, Lw03;->a:[J

    .line 145
    .line 146
    move/from16 v33, v1

    .line 147
    .line 148
    array-length v1, v11

    .line 149
    add-int/lit8 v1, v1, -0x2

    .line 150
    .line 151
    move-object/from16 v34, v11

    .line 152
    .line 153
    if-ltz v1, :cond_44

    .line 154
    .line 155
    move/from16 v36, v12

    .line 156
    .line 157
    const/16 v35, 0x0

    .line 158
    .line 159
    const/16 v37, 0x0

    .line 160
    .line 161
    :goto_3
    aget-wide v11, v34, v37

    .line 162
    .line 163
    move/from16 v38, v13

    .line 164
    .line 165
    move-object/from16 v39, v14

    .line 166
    .line 167
    not-long v13, v11

    .line 168
    shl-long v13, v13, v18

    .line 169
    .line 170
    and-long/2addr v13, v11

    .line 171
    and-long v13, v13, v19

    .line 172
    .line 173
    cmp-long v13, v13, v19

    .line 174
    .line 175
    if-eqz v13, :cond_43

    .line 176
    .line 177
    sub-int v13, v37, v1

    .line 178
    .line 179
    not-int v13, v13

    .line 180
    ushr-int/lit8 v13, v13, 0x1f

    .line 181
    .line 182
    rsub-int/lit8 v13, v13, 0x8

    .line 183
    .line 184
    const/4 v14, 0x0

    .line 185
    :goto_4
    if-ge v14, v13, :cond_42

    .line 186
    .line 187
    and-long v40, v11, v23

    .line 188
    .line 189
    cmp-long v40, v40, v25

    .line 190
    .line 191
    if-gez v40, :cond_41

    .line 192
    .line 193
    shl-int/lit8 v40, v37, 0x3

    .line 194
    .line 195
    add-int v40, v40, v14

    .line 196
    .line 197
    aget-object v41, v31, v40

    .line 198
    .line 199
    move/from16 v42, v1

    .line 200
    .line 201
    aget-object v1, v32, v40

    .line 202
    .line 203
    move-object/from16 v40, v4

    .line 204
    .line 205
    move-object/from16 v4, v41

    .line 206
    .line 207
    check-cast v4, Lp94;

    .line 208
    .line 209
    move-wide/from16 v43, v11

    .line 210
    .line 211
    sget-object v11, Ln94;->u:Lp94;

    .line 212
    .line 213
    invoke-static {v4, v11}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v12

    .line 217
    if-nez v12, :cond_3

    .line 218
    .line 219
    sget-object v12, Ln94;->v:Lp94;

    .line 220
    .line 221
    invoke-static {v4, v12}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v12

    .line 225
    if-eqz v12, :cond_2

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_2
    move/from16 v41, v14

    .line 229
    .line 230
    const/4 v14, 0x0

    .line 231
    goto :goto_9

    .line 232
    :cond_3
    :goto_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 233
    .line 234
    .line 235
    move-result v12

    .line 236
    move/from16 v41, v14

    .line 237
    .line 238
    const/4 v14, 0x0

    .line 239
    :goto_6
    if-ge v14, v12, :cond_5

    .line 240
    .line 241
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v45

    .line 245
    move/from16 v46, v12

    .line 246
    .line 247
    move-object/from16 v12, v45

    .line 248
    .line 249
    check-cast v12, Lp64;

    .line 250
    .line 251
    iget v12, v12, Lp64;->n:I

    .line 252
    .line 253
    if-ne v12, v3, :cond_4

    .line 254
    .line 255
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v12

    .line 259
    check-cast v12, Lp64;

    .line 260
    .line 261
    goto :goto_7

    .line 262
    :cond_4
    add-int/lit8 v14, v14, 0x1

    .line 263
    .line 264
    move/from16 v12, v46

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_5
    move-object/from16 v12, v27

    .line 268
    .line 269
    :goto_7
    if-eqz v12, :cond_6

    .line 270
    .line 271
    const/4 v14, 0x0

    .line 272
    goto :goto_8

    .line 273
    :cond_6
    new-instance v12, Lp64;

    .line 274
    .line 275
    invoke-direct {v12, v3, v9}, Lp64;-><init>(ILjava/util/ArrayList;)V

    .line 276
    .line 277
    .line 278
    const/4 v14, 0x1

    .line 279
    :goto_8
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    :goto_9
    if-nez v14, :cond_9

    .line 283
    .line 284
    invoke-virtual {v5, v4}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v12

    .line 288
    if-nez v12, :cond_7

    .line 289
    .line 290
    move-object/from16 v12, v27

    .line 291
    .line 292
    :cond_7
    invoke-static {v1, v12}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v12

    .line 296
    if-eqz v12, :cond_9

    .line 297
    .line 298
    :cond_8
    :goto_a
    move-object v12, v2

    .line 299
    move-object v14, v5

    .line 300
    move-object/from16 v50, v7

    .line 301
    .line 302
    move-object/from16 v51, v8

    .line 303
    .line 304
    move/from16 v2, v36

    .line 305
    .line 306
    move/from16 v8, v42

    .line 307
    .line 308
    move v7, v3

    .line 309
    goto/16 :goto_25

    .line 310
    .line 311
    :cond_9
    sget-object v12, Ln94;->d:Lp94;

    .line 312
    .line 313
    invoke-static {v4, v12}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v14

    .line 317
    if-eqz v14, :cond_a

    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    check-cast v1, Ljava/lang/String;

    .line 323
    .line 324
    invoke-virtual {v5, v12}, Lw03;->c(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    move/from16 v12, v28

    .line 329
    .line 330
    if-eqz v4, :cond_8

    .line 331
    .line 332
    invoke-virtual {v0, v1, v3, v12}, Lya;->F(Ljava/lang/String;II)V

    .line 333
    .line 334
    .line 335
    goto :goto_a

    .line 336
    :cond_a
    move/from16 v12, v28

    .line 337
    .line 338
    sget-object v14, Ln94;->b:Lp94;

    .line 339
    .line 340
    invoke-static {v4, v14}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v14

    .line 344
    if-eqz v14, :cond_b

    .line 345
    .line 346
    invoke-virtual {v0, v3}, Lya;->A(I)I

    .line 347
    .line 348
    .line 349
    move-result v1

    .line 350
    const/16 v14, 0x800

    .line 351
    .line 352
    invoke-static {v0, v1, v14, v7, v12}, Lya;->E(Lya;IILjava/lang/Integer;I)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0, v3}, Lya;->A(I)I

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    invoke-static {v0, v1, v14, v2, v12}, Lya;->E(Lya;IILjava/lang/Integer;I)V

    .line 360
    .line 361
    .line 362
    goto :goto_a

    .line 363
    :cond_b
    const/16 v14, 0x800

    .line 364
    .line 365
    sget-object v12, Ln94;->H:Lp94;

    .line 366
    .line 367
    invoke-static {v4, v12}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v12

    .line 371
    if-eqz v12, :cond_c

    .line 372
    .line 373
    invoke-virtual {v0, v3}, Lya;->A(I)I

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    const/16 v4, 0x2000

    .line 378
    .line 379
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    const/16 v12, 0x8

    .line 384
    .line 385
    invoke-static {v0, v1, v14, v4, v12}, Lya;->E(Lya;IILjava/lang/Integer;I)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0, v3}, Lya;->A(I)I

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    invoke-static {v0, v1, v14, v2, v12}, Lya;->E(Lya;IILjava/lang/Integer;I)V

    .line 393
    .line 394
    .line 395
    goto :goto_a

    .line 396
    :cond_c
    sget-object v12, Ln94;->K:Lp94;

    .line 397
    .line 398
    invoke-static {v4, v12}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v12

    .line 402
    if-eqz v12, :cond_d

    .line 403
    .line 404
    invoke-virtual {v0, v3}, Lya;->A(I)I

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    const/16 v4, 0xc00

    .line 409
    .line 410
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 411
    .line 412
    .line 413
    move-result-object v4

    .line 414
    const/16 v12, 0x8

    .line 415
    .line 416
    invoke-static {v0, v1, v14, v4, v12}, Lya;->E(Lya;IILjava/lang/Integer;I)V

    .line 417
    .line 418
    .line 419
    goto :goto_a

    .line 420
    :cond_d
    sget-object v12, Ln94;->c:Lp94;

    .line 421
    .line 422
    invoke-static {v4, v12}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v12

    .line 426
    if-eqz v12, :cond_e

    .line 427
    .line 428
    invoke-virtual {v0, v3}, Lya;->A(I)I

    .line 429
    .line 430
    .line 431
    move-result v1

    .line 432
    const/16 v12, 0x8

    .line 433
    .line 434
    invoke-static {v0, v1, v14, v7, v12}, Lya;->E(Lya;IILjava/lang/Integer;I)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0, v3}, Lya;->A(I)I

    .line 438
    .line 439
    .line 440
    move-result v1

    .line 441
    invoke-static {v0, v1, v14, v2, v12}, Lya;->E(Lya;IILjava/lang/Integer;I)V

    .line 442
    .line 443
    .line 444
    goto/16 :goto_a

    .line 445
    .line 446
    :cond_e
    sget-object v12, Ln94;->G:Lp94;

    .line 447
    .line 448
    invoke-static {v4, v12}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result v12

    .line 452
    if-eqz v12, :cond_10

    .line 453
    .line 454
    sget-object v1, Ln94;->w:Lp94;

    .line 455
    .line 456
    invoke-virtual {v10, v1}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    if-nez v1, :cond_f

    .line 461
    .line 462
    move-object/from16 v1, v27

    .line 463
    .line 464
    :cond_f
    check-cast v1, Lm24;

    .line 465
    .line 466
    invoke-virtual {v0, v3}, Lya;->A(I)I

    .line 467
    .line 468
    .line 469
    move-result v1

    .line 470
    const/16 v12, 0x8

    .line 471
    .line 472
    const/16 v14, 0x800

    .line 473
    .line 474
    invoke-static {v0, v1, v14, v7, v12}, Lya;->E(Lya;IILjava/lang/Integer;I)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v0, v3}, Lya;->A(I)I

    .line 478
    .line 479
    .line 480
    move-result v1

    .line 481
    invoke-static {v0, v1, v14, v2, v12}, Lya;->E(Lya;IILjava/lang/Integer;I)V

    .line 482
    .line 483
    .line 484
    goto/16 :goto_a

    .line 485
    .line 486
    :cond_10
    const/16 v14, 0x800

    .line 487
    .line 488
    sget-object v12, Ln94;->a:Lp94;

    .line 489
    .line 490
    invoke-static {v4, v12}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-result v12

    .line 494
    if-eqz v12, :cond_11

    .line 495
    .line 496
    invoke-virtual {v0, v3}, Lya;->A(I)I

    .line 497
    .line 498
    .line 499
    move-result v4

    .line 500
    const/4 v11, 0x4

    .line 501
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 502
    .line 503
    .line 504
    move-result-object v11

    .line 505
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    check-cast v1, Ljava/util/List;

    .line 509
    .line 510
    invoke-virtual {v0, v4, v14, v11, v1}, Lya;->D(IILjava/lang/Integer;Ljava/util/List;)Z

    .line 511
    .line 512
    .line 513
    goto/16 :goto_a

    .line 514
    .line 515
    :cond_11
    sget-object v12, Ln94;->D:Lp94;

    .line 516
    .line 517
    invoke-static {v4, v12}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    move-result v14

    .line 521
    const-wide v45, 0xffffffffL

    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    const/16 v47, 0x20

    .line 527
    .line 528
    const-string v48, ""

    .line 529
    .line 530
    if-eqz v14, :cond_23

    .line 531
    .line 532
    sget-object v1, Ld94;->k:Lp94;

    .line 533
    .line 534
    invoke-virtual {v10, v1}, Lw03;->c(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-result v1

    .line 538
    if-eqz v1, :cond_22

    .line 539
    .line 540
    invoke-virtual {v5, v12}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    if-nez v1, :cond_12

    .line 545
    .line 546
    move-object/from16 v1, v27

    .line 547
    .line 548
    :cond_12
    check-cast v1, Lhe;

    .line 549
    .line 550
    if-eqz v1, :cond_13

    .line 551
    .line 552
    goto :goto_b

    .line 553
    :cond_13
    move-object/from16 v1, v48

    .line 554
    .line 555
    :goto_b
    invoke-virtual {v10, v12}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v4

    .line 559
    if-nez v4, :cond_14

    .line 560
    .line 561
    move-object/from16 v4, v27

    .line 562
    .line 563
    :cond_14
    check-cast v4, Lhe;

    .line 564
    .line 565
    if-eqz v4, :cond_15

    .line 566
    .line 567
    goto :goto_c

    .line 568
    :cond_15
    move-object/from16 v4, v48

    .line 569
    .line 570
    :goto_c
    invoke-static {v4}, Lya;->P(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 571
    .line 572
    .line 573
    move-result-object v11

    .line 574
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 575
    .line 576
    .line 577
    move-result v12

    .line 578
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 579
    .line 580
    .line 581
    move-result v14

    .line 582
    move-object/from16 v49, v2

    .line 583
    .line 584
    if-le v12, v14, :cond_16

    .line 585
    .line 586
    move v2, v14

    .line 587
    goto :goto_d

    .line 588
    :cond_16
    move v2, v12

    .line 589
    :goto_d
    move-object/from16 v50, v7

    .line 590
    .line 591
    const/4 v7, 0x0

    .line 592
    :goto_e
    move/from16 v48, v2

    .line 593
    .line 594
    if-ge v7, v2, :cond_18

    .line 595
    .line 596
    invoke-interface {v1, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 597
    .line 598
    .line 599
    move-result v2

    .line 600
    move-object/from16 v51, v8

    .line 601
    .line 602
    invoke-interface {v4, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 603
    .line 604
    .line 605
    move-result v8

    .line 606
    if-eq v2, v8, :cond_17

    .line 607
    .line 608
    goto :goto_f

    .line 609
    :cond_17
    add-int/lit8 v7, v7, 0x1

    .line 610
    .line 611
    move/from16 v2, v48

    .line 612
    .line 613
    move-object/from16 v8, v51

    .line 614
    .line 615
    goto :goto_e

    .line 616
    :cond_18
    move-object/from16 v51, v8

    .line 617
    .line 618
    :goto_f
    const/4 v2, 0x0

    .line 619
    :goto_10
    sub-int v8, v48, v7

    .line 620
    .line 621
    if-ge v2, v8, :cond_1a

    .line 622
    .line 623
    add-int/lit8 v8, v12, -0x1

    .line 624
    .line 625
    sub-int/2addr v8, v2

    .line 626
    invoke-interface {v1, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 627
    .line 628
    .line 629
    move-result v8

    .line 630
    add-int/lit8 v52, v14, -0x1

    .line 631
    .line 632
    move/from16 v53, v2

    .line 633
    .line 634
    sub-int v2, v52, v53

    .line 635
    .line 636
    invoke-interface {v4, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 637
    .line 638
    .line 639
    move-result v2

    .line 640
    if-eq v8, v2, :cond_19

    .line 641
    .line 642
    goto :goto_11

    .line 643
    :cond_19
    add-int/lit8 v2, v53, 0x1

    .line 644
    .line 645
    goto :goto_10

    .line 646
    :cond_1a
    move/from16 v53, v2

    .line 647
    .line 648
    :goto_11
    sub-int v12, v12, v53

    .line 649
    .line 650
    sub-int/2addr v12, v7

    .line 651
    sub-int v2, v14, v53

    .line 652
    .line 653
    sub-int/2addr v2, v7

    .line 654
    sget-object v4, Ln94;->J:Lp94;

    .line 655
    .line 656
    invoke-virtual {v5, v4}, Lw03;->c(Ljava/lang/Object;)Z

    .line 657
    .line 658
    .line 659
    move-result v8

    .line 660
    invoke-virtual {v10, v4}, Lw03;->c(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    move-result v4

    .line 664
    move/from16 v48, v4

    .line 665
    .line 666
    sget-object v4, Ln94;->D:Lp94;

    .line 667
    .line 668
    invoke-virtual {v5, v4}, Lw03;->c(Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    move-result v4

    .line 672
    if-eqz v4, :cond_1b

    .line 673
    .line 674
    if-nez v8, :cond_1b

    .line 675
    .line 676
    if-eqz v48, :cond_1b

    .line 677
    .line 678
    const/16 v52, 0x1

    .line 679
    .line 680
    goto :goto_12

    .line 681
    :cond_1b
    const/16 v52, 0x0

    .line 682
    .line 683
    :goto_12
    if-eqz v4, :cond_1c

    .line 684
    .line 685
    if-eqz v8, :cond_1c

    .line 686
    .line 687
    if-nez v48, :cond_1c

    .line 688
    .line 689
    const/4 v8, 0x1

    .line 690
    goto :goto_13

    .line 691
    :cond_1c
    const/4 v8, 0x0

    .line 692
    :goto_13
    if-nez v52, :cond_1e

    .line 693
    .line 694
    if-eqz v8, :cond_1d

    .line 695
    .line 696
    goto :goto_14

    .line 697
    :cond_1d
    invoke-virtual {v0, v3}, Lya;->A(I)I

    .line 698
    .line 699
    .line 700
    move-result v4

    .line 701
    const/16 v14, 0x10

    .line 702
    .line 703
    invoke-virtual {v0, v4, v14}, Lya;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 704
    .line 705
    .line 706
    move-result-object v4

    .line 707
    invoke-virtual {v4, v7}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v4, v12}, Landroid/view/accessibility/AccessibilityRecord;->setRemovedCount(I)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v4, v2}, Landroid/view/accessibility/AccessibilityRecord;->setAddedCount(I)V

    .line 714
    .line 715
    .line 716
    invoke-virtual {v4, v1}, Landroid/view/accessibility/AccessibilityRecord;->setBeforeText(Ljava/lang/CharSequence;)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 720
    .line 721
    .line 722
    move-result-object v1

    .line 723
    invoke-interface {v1, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 724
    .line 725
    .line 726
    move v7, v3

    .line 727
    move-object v14, v5

    .line 728
    move-object/from16 v2, v49

    .line 729
    .line 730
    goto :goto_15

    .line 731
    :cond_1e
    :goto_14
    invoke-virtual {v0, v3}, Lya;->A(I)I

    .line 732
    .line 733
    .line 734
    move-result v1

    .line 735
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 736
    .line 737
    .line 738
    move-result-object v4

    .line 739
    move v2, v3

    .line 740
    move-object/from16 v3, v49

    .line 741
    .line 742
    move v7, v2

    .line 743
    move-object v14, v5

    .line 744
    move-object v5, v11

    .line 745
    move-object/from16 v2, v49

    .line 746
    .line 747
    invoke-virtual/range {v0 .. v5}, Lya;->p(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    .line 748
    .line 749
    .line 750
    move-result-object v4

    .line 751
    :goto_15
    const-string v1, "android.widget.EditText"

    .line 752
    .line 753
    invoke-virtual {v4, v1}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 754
    .line 755
    .line 756
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 757
    .line 758
    const/16 v3, 0x25

    .line 759
    .line 760
    if-lt v1, v3, :cond_1f

    .line 761
    .line 762
    move-object/from16 v3, v39

    .line 763
    .line 764
    invoke-static {v3, v4}, Lta;->a(Li94;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 765
    .line 766
    .line 767
    goto :goto_16

    .line 768
    :cond_1f
    move-object/from16 v3, v39

    .line 769
    .line 770
    :goto_16
    invoke-virtual {v0, v4}, Lya;->C(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 771
    .line 772
    .line 773
    if-nez v52, :cond_21

    .line 774
    .line 775
    if-eqz v8, :cond_20

    .line 776
    .line 777
    goto :goto_17

    .line 778
    :cond_20
    move-object/from16 v49, v2

    .line 779
    .line 780
    goto :goto_18

    .line 781
    :cond_21
    :goto_17
    sget-object v1, Ln94;->E:Lp94;

    .line 782
    .line 783
    invoke-virtual {v6, v1}, Le94;->d(Lp94;)Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v1

    .line 787
    check-cast v1, Lss4;

    .line 788
    .line 789
    iget-wide v11, v1, Lss4;->a:J

    .line 790
    .line 791
    move-object/from16 v49, v2

    .line 792
    .line 793
    shr-long v1, v11, v47

    .line 794
    .line 795
    long-to-int v1, v1

    .line 796
    invoke-virtual {v4, v1}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 797
    .line 798
    .line 799
    and-long v1, v11, v45

    .line 800
    .line 801
    long-to-int v1, v1

    .line 802
    invoke-virtual {v4, v1}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v0, v4}, Lya;->C(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 806
    .line 807
    .line 808
    :goto_18
    move/from16 v2, v36

    .line 809
    .line 810
    move/from16 v8, v42

    .line 811
    .line 812
    move-object/from16 v12, v49

    .line 813
    .line 814
    goto/16 :goto_24

    .line 815
    .line 816
    :cond_22
    move-object/from16 v49, v2

    .line 817
    .line 818
    move-object v14, v5

    .line 819
    move-object/from16 v50, v7

    .line 820
    .line 821
    move-object/from16 v51, v8

    .line 822
    .line 823
    move v7, v3

    .line 824
    move-object/from16 v3, v39

    .line 825
    .line 826
    invoke-virtual {v0, v7}, Lya;->A(I)I

    .line 827
    .line 828
    .line 829
    move-result v1

    .line 830
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 831
    .line 832
    .line 833
    move-result-object v2

    .line 834
    const/16 v4, 0x800

    .line 835
    .line 836
    const/16 v12, 0x8

    .line 837
    .line 838
    invoke-static {v0, v1, v4, v2, v12}, Lya;->E(Lya;IILjava/lang/Integer;I)V

    .line 839
    .line 840
    .line 841
    goto :goto_18

    .line 842
    :cond_23
    move-object/from16 v49, v2

    .line 843
    .line 844
    move-object v14, v5

    .line 845
    move-object/from16 v50, v7

    .line 846
    .line 847
    move-object/from16 v51, v8

    .line 848
    .line 849
    move/from16 v8, v42

    .line 850
    .line 851
    move v7, v3

    .line 852
    move-object/from16 v3, v39

    .line 853
    .line 854
    sget-object v2, Ln94;->E:Lp94;

    .line 855
    .line 856
    invoke-static {v4, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 857
    .line 858
    .line 859
    move-result v5

    .line 860
    if-eqz v5, :cond_27

    .line 861
    .line 862
    invoke-virtual {v10, v12}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v1

    .line 866
    if-nez v1, :cond_24

    .line 867
    .line 868
    move-object/from16 v1, v27

    .line 869
    .line 870
    :cond_24
    check-cast v1, Lhe;

    .line 871
    .line 872
    if-eqz v1, :cond_26

    .line 873
    .line 874
    iget-object v1, v1, Lhe;->o:Ljava/lang/String;

    .line 875
    .line 876
    if-nez v1, :cond_25

    .line 877
    .line 878
    goto :goto_19

    .line 879
    :cond_25
    move-object/from16 v48, v1

    .line 880
    .line 881
    :cond_26
    :goto_19
    invoke-virtual {v6, v2}, Le94;->d(Lp94;)Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v1

    .line 885
    check-cast v1, Lss4;

    .line 886
    .line 887
    iget-wide v1, v1, Lss4;->a:J

    .line 888
    .line 889
    move-wide v4, v1

    .line 890
    invoke-virtual {v0, v7}, Lya;->A(I)I

    .line 891
    .line 892
    .line 893
    move-result v1

    .line 894
    shr-long v11, v4, v47

    .line 895
    .line 896
    long-to-int v2, v11

    .line 897
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 898
    .line 899
    .line 900
    move-result-object v2

    .line 901
    and-long v4, v4, v45

    .line 902
    .line 903
    long-to-int v4, v4

    .line 904
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 905
    .line 906
    .line 907
    move-result-object v4

    .line 908
    invoke-virtual/range {v48 .. v48}, Ljava/lang/String;->length()I

    .line 909
    .line 910
    .line 911
    move-result v5

    .line 912
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 913
    .line 914
    .line 915
    move-result-object v5

    .line 916
    invoke-static/range {v48 .. v48}, Lya;->P(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 917
    .line 918
    .line 919
    move-result-object v11

    .line 920
    move-object/from16 v39, v3

    .line 921
    .line 922
    move-object v3, v4

    .line 923
    move-object v4, v5

    .line 924
    move-object v5, v11

    .line 925
    move-object/from16 v12, v49

    .line 926
    .line 927
    invoke-virtual/range {v0 .. v5}, Lya;->p(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    .line 928
    .line 929
    .line 930
    move-result-object v1

    .line 931
    invoke-virtual {v0, v1}, Lya;->C(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 932
    .line 933
    .line 934
    move/from16 v2, v36

    .line 935
    .line 936
    invoke-virtual {v0, v2}, Lya;->G(I)V

    .line 937
    .line 938
    .line 939
    goto/16 :goto_25

    .line 940
    .line 941
    :cond_27
    move/from16 v2, v36

    .line 942
    .line 943
    move-object/from16 v12, v49

    .line 944
    .line 945
    invoke-static {v4, v11}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 946
    .line 947
    .line 948
    move-result v5

    .line 949
    if-nez v5, :cond_3b

    .line 950
    .line 951
    sget-object v5, Ln94;->v:Lp94;

    .line 952
    .line 953
    invoke-static {v4, v5}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 954
    .line 955
    .line 956
    move-result v5

    .line 957
    if-eqz v5, :cond_28

    .line 958
    .line 959
    goto/16 :goto_21

    .line 960
    .line 961
    :cond_28
    sget-object v5, Ln94;->l:Lp94;

    .line 962
    .line 963
    invoke-static {v4, v5}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 964
    .line 965
    .line 966
    move-result v5

    .line 967
    if-eqz v5, :cond_2a

    .line 968
    .line 969
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 970
    .line 971
    .line 972
    check-cast v1, Ljava/lang/Boolean;

    .line 973
    .line 974
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 975
    .line 976
    .line 977
    move-result v1

    .line 978
    if-eqz v1, :cond_29

    .line 979
    .line 980
    invoke-virtual {v0, v2}, Lya;->A(I)I

    .line 981
    .line 982
    .line 983
    move-result v1

    .line 984
    const/16 v4, 0x8

    .line 985
    .line 986
    invoke-virtual {v0, v1, v4}, Lya;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 987
    .line 988
    .line 989
    move-result-object v1

    .line 990
    invoke-virtual {v0, v1}, Lya;->C(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 991
    .line 992
    .line 993
    goto :goto_1a

    .line 994
    :cond_29
    const/16 v4, 0x8

    .line 995
    .line 996
    :goto_1a
    invoke-virtual {v0, v2}, Lya;->A(I)I

    .line 997
    .line 998
    .line 999
    move-result v1

    .line 1000
    const/16 v5, 0x800

    .line 1001
    .line 1002
    invoke-static {v0, v1, v5, v12, v4}, Lya;->E(Lya;IILjava/lang/Integer;I)V

    .line 1003
    .line 1004
    .line 1005
    goto/16 :goto_24

    .line 1006
    .line 1007
    :cond_2a
    sget-object v5, Ld94;->w:Lp94;

    .line 1008
    .line 1009
    invoke-static {v4, v5}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1010
    .line 1011
    .line 1012
    move-result v11

    .line 1013
    if-eqz v11, :cond_33

    .line 1014
    .line 1015
    invoke-virtual {v6, v5}, Le94;->d(Lp94;)Ljava/lang/Object;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v1

    .line 1019
    check-cast v1, Ljava/util/List;

    .line 1020
    .line 1021
    invoke-virtual {v14, v5}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v4

    .line 1025
    if-nez v4, :cond_2b

    .line 1026
    .line 1027
    move-object/from16 v4, v27

    .line 1028
    .line 1029
    :cond_2b
    check-cast v4, Ljava/util/List;

    .line 1030
    .line 1031
    if-eqz v4, :cond_30

    .line 1032
    .line 1033
    sget-object v5, Lw54;->a:Lx03;

    .line 1034
    .line 1035
    new-instance v5, Lx03;

    .line 1036
    .line 1037
    invoke-direct {v5}, Lx03;-><init>()V

    .line 1038
    .line 1039
    .line 1040
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 1041
    .line 1042
    .line 1043
    move-result v11

    .line 1044
    if-gtz v11, :cond_2f

    .line 1045
    .line 1046
    new-instance v1, Lx03;

    .line 1047
    .line 1048
    invoke-direct {v1}, Lx03;-><init>()V

    .line 1049
    .line 1050
    .line 1051
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 1052
    .line 1053
    .line 1054
    move-result v11

    .line 1055
    if-gtz v11, :cond_2e

    .line 1056
    .line 1057
    if-nez v35, :cond_2d

    .line 1058
    .line 1059
    invoke-virtual {v5, v1}, Lx03;->equals(Ljava/lang/Object;)Z

    .line 1060
    .line 1061
    .line 1062
    move-result v1

    .line 1063
    if-nez v1, :cond_2c

    .line 1064
    .line 1065
    goto :goto_1b

    .line 1066
    :cond_2c
    const/4 v1, 0x0

    .line 1067
    goto :goto_1c

    .line 1068
    :cond_2d
    :goto_1b
    const/4 v1, 0x1

    .line 1069
    :goto_1c
    const/4 v5, 0x0

    .line 1070
    :goto_1d
    move/from16 v35, v1

    .line 1071
    .line 1072
    goto/16 :goto_24

    .line 1073
    .line 1074
    :cond_2e
    const/4 v5, 0x0

    .line 1075
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1080
    .line 1081
    .line 1082
    invoke-static {}, Lkf2;->k()V

    .line 1083
    .line 1084
    .line 1085
    return-void

    .line 1086
    :cond_2f
    const/4 v5, 0x0

    .line 1087
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v0

    .line 1091
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1092
    .line 1093
    .line 1094
    invoke-static {}, Lkf2;->k()V

    .line 1095
    .line 1096
    .line 1097
    return-void

    .line 1098
    :cond_30
    const/4 v5, 0x0

    .line 1099
    if-nez v35, :cond_32

    .line 1100
    .line 1101
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1102
    .line 1103
    .line 1104
    move-result v1

    .line 1105
    if-nez v1, :cond_31

    .line 1106
    .line 1107
    goto :goto_1e

    .line 1108
    :cond_31
    move v1, v5

    .line 1109
    goto :goto_1d

    .line 1110
    :cond_32
    :goto_1e
    const/4 v1, 0x1

    .line 1111
    goto :goto_1d

    .line 1112
    :cond_33
    const/4 v5, 0x0

    .line 1113
    if-nez v35, :cond_3a

    .line 1114
    .line 1115
    instance-of v11, v1, Lw2;

    .line 1116
    .line 1117
    if-eqz v11, :cond_3a

    .line 1118
    .line 1119
    check-cast v1, Lw2;

    .line 1120
    .line 1121
    invoke-virtual {v14, v4}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v4

    .line 1125
    if-nez v4, :cond_34

    .line 1126
    .line 1127
    move-object/from16 v4, v27

    .line 1128
    .line 1129
    :cond_34
    if-ne v1, v4, :cond_35

    .line 1130
    .line 1131
    goto :goto_1f

    .line 1132
    :cond_35
    instance-of v11, v4, Lw2;

    .line 1133
    .line 1134
    if-nez v11, :cond_36

    .line 1135
    .line 1136
    goto :goto_20

    .line 1137
    :cond_36
    iget-object v11, v1, Lw2;->a:Ljava/lang/String;

    .line 1138
    .line 1139
    check-cast v4, Lw2;

    .line 1140
    .line 1141
    iget-object v5, v4, Lw2;->b:Lsf1;

    .line 1142
    .line 1143
    iget-object v4, v4, Lw2;->a:Ljava/lang/String;

    .line 1144
    .line 1145
    invoke-static {v11, v4}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1146
    .line 1147
    .line 1148
    move-result v4

    .line 1149
    if-nez v4, :cond_37

    .line 1150
    .line 1151
    goto :goto_20

    .line 1152
    :cond_37
    iget-object v1, v1, Lw2;->b:Lsf1;

    .line 1153
    .line 1154
    if-nez v1, :cond_38

    .line 1155
    .line 1156
    if-eqz v5, :cond_38

    .line 1157
    .line 1158
    goto :goto_20

    .line 1159
    :cond_38
    if-eqz v1, :cond_39

    .line 1160
    .line 1161
    if-nez v5, :cond_39

    .line 1162
    .line 1163
    goto :goto_20

    .line 1164
    :cond_39
    :goto_1f
    const/16 v35, 0x0

    .line 1165
    .line 1166
    goto :goto_24

    .line 1167
    :cond_3a
    :goto_20
    const/16 v35, 0x1

    .line 1168
    .line 1169
    goto :goto_24

    .line 1170
    :cond_3b
    :goto_21
    iget-object v1, v3, Li94;->c:Lc72;

    .line 1171
    .line 1172
    invoke-virtual {v0, v1}, Lya;->w(Lc72;)V

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1176
    .line 1177
    .line 1178
    move-result v1

    .line 1179
    const/4 v4, 0x0

    .line 1180
    :goto_22
    if-ge v4, v1, :cond_3d

    .line 1181
    .line 1182
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v5

    .line 1186
    check-cast v5, Lp64;

    .line 1187
    .line 1188
    iget v5, v5, Lp64;->n:I

    .line 1189
    .line 1190
    if-ne v5, v7, :cond_3c

    .line 1191
    .line 1192
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v1

    .line 1196
    check-cast v1, Lp64;

    .line 1197
    .line 1198
    goto :goto_23

    .line 1199
    :cond_3c
    add-int/lit8 v4, v4, 0x1

    .line 1200
    .line 1201
    goto :goto_22

    .line 1202
    :cond_3d
    move-object/from16 v1, v27

    .line 1203
    .line 1204
    :goto_23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1205
    .line 1206
    .line 1207
    invoke-virtual {v10, v11}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v4

    .line 1211
    if-nez v4, :cond_3e

    .line 1212
    .line 1213
    move-object/from16 v4, v27

    .line 1214
    .line 1215
    :cond_3e
    check-cast v4, Lh64;

    .line 1216
    .line 1217
    iput-object v4, v1, Lp64;->r:Lh64;

    .line 1218
    .line 1219
    sget-object v4, Ln94;->v:Lp94;

    .line 1220
    .line 1221
    invoke-virtual {v10, v4}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v4

    .line 1225
    if-nez v4, :cond_3f

    .line 1226
    .line 1227
    move-object/from16 v4, v27

    .line 1228
    .line 1229
    :cond_3f
    check-cast v4, Lh64;

    .line 1230
    .line 1231
    iput-object v4, v1, Lp64;->s:Lh64;

    .line 1232
    .line 1233
    iget-object v4, v1, Lp64;->o:Ljava/util/List;

    .line 1234
    .line 1235
    invoke-interface {v4, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1236
    .line 1237
    .line 1238
    move-result v4

    .line 1239
    if-nez v4, :cond_40

    .line 1240
    .line 1241
    goto :goto_24

    .line 1242
    :cond_40
    iget-object v4, v0, Lya;->q:Lra;

    .line 1243
    .line 1244
    invoke-virtual {v4}, Lra;->getSnapshotObserver()Lwb3;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v4

    .line 1248
    new-instance v5, Lfa;

    .line 1249
    .line 1250
    const/4 v11, 0x1

    .line 1251
    invoke-direct {v5, v11, v1, v0}, Lfa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1252
    .line 1253
    .line 1254
    iget-object v4, v4, Lwb3;->a:Lpp3;

    .line 1255
    .line 1256
    iget-object v11, v0, Lya;->Z:Lsa;

    .line 1257
    .line 1258
    invoke-virtual {v4, v1, v11, v5}, Lpp3;->e(Ljava/lang/Object;Lif1;Lgf1;)V

    .line 1259
    .line 1260
    .line 1261
    :goto_24
    const/16 v4, 0x8

    .line 1262
    .line 1263
    goto :goto_26

    .line 1264
    :cond_41
    move-object/from16 v40, v4

    .line 1265
    .line 1266
    move-object/from16 v50, v7

    .line 1267
    .line 1268
    move-object/from16 v51, v8

    .line 1269
    .line 1270
    move-wide/from16 v43, v11

    .line 1271
    .line 1272
    move/from16 v41, v14

    .line 1273
    .line 1274
    move v8, v1

    .line 1275
    move-object v12, v2

    .line 1276
    move v7, v3

    .line 1277
    move-object v14, v5

    .line 1278
    move/from16 v2, v36

    .line 1279
    .line 1280
    :goto_25
    move-object/from16 v3, v39

    .line 1281
    .line 1282
    goto :goto_24

    .line 1283
    :goto_26
    shr-long v42, v43, v4

    .line 1284
    .line 1285
    add-int/lit8 v1, v41, 0x1

    .line 1286
    .line 1287
    move/from16 v36, v2

    .line 1288
    .line 1289
    move-object/from16 v39, v3

    .line 1290
    .line 1291
    move/from16 v28, v4

    .line 1292
    .line 1293
    move v3, v7

    .line 1294
    move-object v2, v12

    .line 1295
    move-object v5, v14

    .line 1296
    move-object/from16 v4, v40

    .line 1297
    .line 1298
    move-wide/from16 v11, v42

    .line 1299
    .line 1300
    move-object/from16 v7, v50

    .line 1301
    .line 1302
    move v14, v1

    .line 1303
    move v1, v8

    .line 1304
    move-object/from16 v8, v51

    .line 1305
    .line 1306
    goto/16 :goto_4

    .line 1307
    .line 1308
    :cond_42
    move-object v12, v2

    .line 1309
    move-object/from16 v40, v4

    .line 1310
    .line 1311
    move-object v14, v5

    .line 1312
    move-object/from16 v50, v7

    .line 1313
    .line 1314
    move-object/from16 v51, v8

    .line 1315
    .line 1316
    move/from16 v4, v28

    .line 1317
    .line 1318
    move/from16 v2, v36

    .line 1319
    .line 1320
    move v8, v1

    .line 1321
    move v7, v3

    .line 1322
    move-object/from16 v3, v39

    .line 1323
    .line 1324
    if-ne v13, v4, :cond_45

    .line 1325
    .line 1326
    :goto_27
    move/from16 v1, v37

    .line 1327
    .line 1328
    goto :goto_28

    .line 1329
    :cond_43
    move-object v12, v2

    .line 1330
    move-object/from16 v40, v4

    .line 1331
    .line 1332
    move-object v14, v5

    .line 1333
    move-object/from16 v50, v7

    .line 1334
    .line 1335
    move-object/from16 v51, v8

    .line 1336
    .line 1337
    move/from16 v2, v36

    .line 1338
    .line 1339
    move v8, v1

    .line 1340
    move v7, v3

    .line 1341
    move-object/from16 v3, v39

    .line 1342
    .line 1343
    goto :goto_27

    .line 1344
    :goto_28
    if-eq v1, v8, :cond_45

    .line 1345
    .line 1346
    add-int/lit8 v37, v1, 0x1

    .line 1347
    .line 1348
    move/from16 v36, v2

    .line 1349
    .line 1350
    move v1, v8

    .line 1351
    move-object v2, v12

    .line 1352
    move-object v5, v14

    .line 1353
    move/from16 v13, v38

    .line 1354
    .line 1355
    move-object/from16 v4, v40

    .line 1356
    .line 1357
    move-object/from16 v8, v51

    .line 1358
    .line 1359
    const/16 v28, 0x8

    .line 1360
    .line 1361
    move-object v14, v3

    .line 1362
    move v3, v7

    .line 1363
    move-object/from16 v7, v50

    .line 1364
    .line 1365
    goto/16 :goto_3

    .line 1366
    .line 1367
    :cond_44
    move-object v12, v2

    .line 1368
    move-object/from16 v40, v4

    .line 1369
    .line 1370
    move-object/from16 v50, v7

    .line 1371
    .line 1372
    move-object/from16 v51, v8

    .line 1373
    .line 1374
    move/from16 v38, v13

    .line 1375
    .line 1376
    move v7, v3

    .line 1377
    move-object v3, v14

    .line 1378
    const/16 v35, 0x0

    .line 1379
    .line 1380
    :cond_45
    if-nez v35, :cond_48

    .line 1381
    .line 1382
    invoke-virtual/range {v40 .. v40}, Le94;->iterator()Ljava/util/Iterator;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v1

    .line 1386
    :cond_46
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1387
    .line 1388
    .line 1389
    move-result v2

    .line 1390
    if-eqz v2, :cond_47

    .line 1391
    .line 1392
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v2

    .line 1396
    check-cast v2, Ljava/util/Map$Entry;

    .line 1397
    .line 1398
    invoke-virtual {v3}, Li94;->k()Le94;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v4

    .line 1402
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v2

    .line 1406
    check-cast v2, Lp94;

    .line 1407
    .line 1408
    iget-object v4, v4, Le94;->n:Lw03;

    .line 1409
    .line 1410
    invoke-virtual {v4, v2}, Lw03;->c(Ljava/lang/Object;)Z

    .line 1411
    .line 1412
    .line 1413
    move-result v2

    .line 1414
    if-nez v2, :cond_46

    .line 1415
    .line 1416
    const/4 v11, 0x1

    .line 1417
    goto :goto_29

    .line 1418
    :cond_47
    const/4 v11, 0x0

    .line 1419
    :goto_29
    move/from16 v35, v11

    .line 1420
    .line 1421
    :cond_48
    if-eqz v35, :cond_49

    .line 1422
    .line 1423
    invoke-virtual {v0, v7}, Lya;->A(I)I

    .line 1424
    .line 1425
    .line 1426
    move-result v1

    .line 1427
    const/16 v4, 0x8

    .line 1428
    .line 1429
    const/16 v14, 0x800

    .line 1430
    .line 1431
    invoke-static {v0, v1, v14, v12, v4}, Lya;->E(Lya;IILjava/lang/Integer;I)V

    .line 1432
    .line 1433
    .line 1434
    goto :goto_2b

    .line 1435
    :cond_49
    const/16 v4, 0x8

    .line 1436
    .line 1437
    goto :goto_2b

    .line 1438
    :cond_4a
    const-string v0, "no value for specified key"

    .line 1439
    .line 1440
    invoke-static {v0}, Lxa3;->l(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v0

    .line 1444
    throw v0

    .line 1445
    :cond_4b
    :goto_2a
    move/from16 v33, v1

    .line 1446
    .line 1447
    move-object/from16 v50, v7

    .line 1448
    .line 1449
    move-object/from16 v51, v8

    .line 1450
    .line 1451
    move-object/from16 v29, v10

    .line 1452
    .line 1453
    move-object/from16 v30, v11

    .line 1454
    .line 1455
    move v4, v12

    .line 1456
    move/from16 v38, v13

    .line 1457
    .line 1458
    move-object v12, v2

    .line 1459
    :goto_2b
    shr-long v21, v21, v4

    .line 1460
    .line 1461
    add-int/lit8 v1, v33, 0x1

    .line 1462
    .line 1463
    move-object/from16 v6, p1

    .line 1464
    .line 1465
    move-object v2, v12

    .line 1466
    move-object/from16 v10, v29

    .line 1467
    .line 1468
    move-object/from16 v11, v30

    .line 1469
    .line 1470
    move/from16 v13, v38

    .line 1471
    .line 1472
    move-object/from16 v7, v50

    .line 1473
    .line 1474
    move-object/from16 v8, v51

    .line 1475
    .line 1476
    const/4 v14, 0x0

    .line 1477
    move v12, v4

    .line 1478
    goto/16 :goto_1

    .line 1479
    .line 1480
    :cond_4c
    move-object/from16 v50, v7

    .line 1481
    .line 1482
    move-object/from16 v51, v8

    .line 1483
    .line 1484
    move-object/from16 v29, v10

    .line 1485
    .line 1486
    move-object/from16 v30, v11

    .line 1487
    .line 1488
    move v4, v12

    .line 1489
    move v1, v13

    .line 1490
    move-object v12, v2

    .line 1491
    if-ne v1, v4, :cond_4e

    .line 1492
    .line 1493
    :goto_2c
    move/from16 v1, v17

    .line 1494
    .line 1495
    goto :goto_2d

    .line 1496
    :cond_4d
    move-object v12, v2

    .line 1497
    move-object/from16 v50, v7

    .line 1498
    .line 1499
    move-object/from16 v51, v8

    .line 1500
    .line 1501
    move-object/from16 v29, v10

    .line 1502
    .line 1503
    move-object/from16 v30, v11

    .line 1504
    .line 1505
    goto :goto_2c

    .line 1506
    :goto_2d
    if-eq v15, v1, :cond_4e

    .line 1507
    .line 1508
    add-int/lit8 v15, v15, 0x1

    .line 1509
    .line 1510
    move-object/from16 v6, p1

    .line 1511
    .line 1512
    move v13, v1

    .line 1513
    move-object v2, v12

    .line 1514
    move/from16 v12, v16

    .line 1515
    .line 1516
    move-object/from16 v10, v29

    .line 1517
    .line 1518
    move-object/from16 v11, v30

    .line 1519
    .line 1520
    move-object/from16 v7, v50

    .line 1521
    .line 1522
    move-object/from16 v8, v51

    .line 1523
    .line 1524
    const/4 v14, 0x0

    .line 1525
    goto/16 :goto_0

    .line 1526
    .line 1527
    :cond_4e
    return-void
.end method

.method public final I(Lc72;Lj03;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lc72;->G()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lya;->q:Lra;

    .line 10
    .line 11
    invoke-virtual {v0}, Lra;->getAndroidViewsHandler$ui()Lid;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lid;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_1
    iget-object v0, p1, Lc72;->Q:Lw12;

    .line 28
    .line 29
    const/16 v1, 0x8

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lw12;->d(I)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v2, 0x0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-virtual {p1}, Lc72;->t()Lc72;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :goto_0
    if-eqz p1, :cond_4

    .line 44
    .line 45
    iget-object v0, p1, Lc72;->Q:Lw12;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lw12;->d(I)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-virtual {p1}, Lc72;->t()Lc72;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    goto :goto_0

    .line 59
    :cond_4
    move-object p1, v2

    .line 60
    :goto_1
    if-eqz p1, :cond_a

    .line 61
    .line 62
    invoke-virtual {p1}, Lc72;->v()Le94;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-nez v0, :cond_5

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_5
    iget-boolean v0, v0, Le94;->p:Z

    .line 70
    .line 71
    const/4 v3, 0x1

    .line 72
    if-nez v0, :cond_8

    .line 73
    .line 74
    invoke-virtual {p1}, Lc72;->t()Lc72;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :goto_2
    if-eqz v0, :cond_7

    .line 79
    .line 80
    invoke-virtual {v0}, Lc72;->v()Le94;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    if-eqz v4, :cond_6

    .line 85
    .line 86
    iget-boolean v4, v4, Le94;->p:Z

    .line 87
    .line 88
    if-ne v4, v3, :cond_6

    .line 89
    .line 90
    move-object v2, v0

    .line 91
    goto :goto_3

    .line 92
    :cond_6
    invoke-virtual {v0}, Lc72;->t()Lc72;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    goto :goto_2

    .line 97
    :cond_7
    :goto_3
    if-eqz v2, :cond_8

    .line 98
    .line 99
    move-object p1, v2

    .line 100
    :cond_8
    iget p1, p1, Lc72;->o:I

    .line 101
    .line 102
    invoke-virtual {p2, p1}, Lj03;->a(I)Z

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    if-nez p2, :cond_9

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_9
    invoke-virtual {p0, p1}, Lya;->A(I)I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    const/16 p2, 0x800

    .line 114
    .line 115
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {p0, p1, p2, v0, v1}, Lya;->E(Lya;IILjava/lang/Integer;I)V

    .line 120
    .line 121
    .line 122
    :cond_a
    :goto_4
    return-void
.end method

.method public final J(Lc72;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lc72;->G()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lya;->q:Lra;

    .line 9
    .line 10
    invoke-virtual {v0}, Lra;->getAndroidViewsHandler$ui()Lid;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lid;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget p1, p1, Lc72;->o:I

    .line 26
    .line 27
    iget-object v0, p0, Lya;->C:Li03;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Le02;->b(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lh64;

    .line 34
    .line 35
    iget-object v1, p0, Lya;->D:Li03;

    .line 36
    .line 37
    invoke-virtual {v1, p1}, Le02;->b(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lh64;

    .line 42
    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    :goto_0
    return-void

    .line 48
    :cond_2
    const/16 v2, 0x1000

    .line 49
    .line 50
    invoke-virtual {p0, p1, v2}, Lya;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    iget-object v2, v0, Lh64;->a:Lv82;

    .line 57
    .line 58
    invoke-virtual {v2}, Lv82;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Ljava/lang/Number;

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    float-to-int v2, v2

    .line 69
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setScrollX(I)V

    .line 70
    .line 71
    .line 72
    iget-object v0, v0, Lh64;->b:Lv82;

    .line 73
    .line 74
    invoke-virtual {v0}, Lv82;->invoke()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    float-to-int v0, v0

    .line 85
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollX(I)V

    .line 86
    .line 87
    .line 88
    :cond_3
    if-eqz v1, :cond_4

    .line 89
    .line 90
    iget-object v0, v1, Lh64;->a:Lv82;

    .line 91
    .line 92
    invoke-virtual {v0}, Lv82;->invoke()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Ljava/lang/Number;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    float-to-int v0, v0

    .line 103
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setScrollY(I)V

    .line 104
    .line 105
    .line 106
    iget-object v0, v1, Lh64;->b:Lv82;

    .line 107
    .line 108
    invoke-virtual {v0}, Lv82;->invoke()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Ljava/lang/Number;

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    float-to-int v0, v0

    .line 119
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollY(I)V

    .line 120
    .line 121
    .line 122
    :cond_4
    invoke-virtual {p0, p1}, Lya;->C(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public final K(Li94;IIZ)Z
    .locals 10

    .line 1
    iget-object v0, p1, Li94;->d:Le94;

    .line 2
    .line 3
    iget v1, p1, Li94;->f:I

    .line 4
    .line 5
    sget-object v2, Ld94;->j:Lp94;

    .line 6
    .line 7
    iget-object v0, v0, Le94;->n:Lw03;

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Lw03;->c(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lxl;->b(Li94;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object p0, p1, Li94;->d:Le94;

    .line 23
    .line 24
    invoke-virtual {p0, v2}, Le94;->d(Lp94;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lw2;

    .line 29
    .line 30
    iget-object p0, p0, Lw2;->b:Lsf1;

    .line 31
    .line 32
    check-cast p0, Lxf1;

    .line 33
    .line 34
    if-eqz p0, :cond_2

    .line 35
    .line 36
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    invoke-interface {p0, p1, p2, p3}, Lxf1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    return p0

    .line 59
    :cond_0
    if-ne p2, p3, :cond_1

    .line 60
    .line 61
    iget p4, p0, Lya;->G:I

    .line 62
    .line 63
    if-ne p3, p4, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-static {p1}, Lya;->t(Li94;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    if-nez v9, :cond_3

    .line 71
    .line 72
    :cond_2
    :goto_0
    return v3

    .line 73
    :cond_3
    if-ltz p2, :cond_4

    .line 74
    .line 75
    if-ne p2, p3, :cond_4

    .line 76
    .line 77
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-gt p3, p1, :cond_4

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    const/4 p2, -0x1

    .line 85
    :goto_1
    iput p2, p0, Lya;->G:I

    .line 86
    .line 87
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    const/4 p2, 0x1

    .line 92
    if-lez p1, :cond_5

    .line 93
    .line 94
    move v3, p2

    .line 95
    :cond_5
    invoke-virtual {p0, v1}, Lya;->A(I)I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    const/4 p1, 0x0

    .line 100
    if-eqz v3, :cond_6

    .line 101
    .line 102
    iget p3, p0, Lya;->G:I

    .line 103
    .line 104
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    move-object v6, p3

    .line 109
    goto :goto_2

    .line 110
    :cond_6
    move-object v6, p1

    .line 111
    :goto_2
    if-eqz v3, :cond_7

    .line 112
    .line 113
    iget p3, p0, Lya;->G:I

    .line 114
    .line 115
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    move-object v7, p3

    .line 120
    goto :goto_3

    .line 121
    :cond_7
    move-object v7, p1

    .line 122
    :goto_3
    if-eqz v3, :cond_8

    .line 123
    .line 124
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    :cond_8
    move-object v4, p0

    .line 133
    move-object v8, p1

    .line 134
    invoke-virtual/range {v4 .. v9}, Lya;->p(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {v4, p0}, Lya;->C(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4, v1}, Lya;->G(I)V

    .line 142
    .line 143
    .line 144
    return p2
.end method

.method public final M(FFFF)Landroid/graphics/Rect;
    .locals 7

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-long v0, p1

    .line 6
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    int-to-long p1, p1

    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    shl-long/2addr v0, v2

    .line 14
    const-wide v3, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr p1, v3

    .line 20
    or-long/2addr p1, v0

    .line 21
    iget-object p0, p0, Lya;->q:Lra;

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Lra;->p(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    int-to-long v0, p3

    .line 32
    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    int-to-long p3, p3

    .line 37
    shl-long/2addr v0, v2

    .line 38
    and-long/2addr p3, v3

    .line 39
    or-long/2addr p3, v0

    .line 40
    invoke-virtual {p0, p3, p4}, Lra;->p(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide p3

    .line 44
    new-instance p0, Landroid/graphics/Rect;

    .line 45
    .line 46
    shr-long v0, p1, v2

    .line 47
    .line 48
    long-to-int v0, v0

    .line 49
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    shr-long v5, p3, v2

    .line 54
    .line 55
    long-to-int v2, v5

    .line 56
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    invoke-static {v1, v5}, Ljava/lang/Math;->min(FF)F

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    float-to-double v5, v1

    .line 65
    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    .line 66
    .line 67
    .line 68
    move-result-wide v5

    .line 69
    double-to-float v1, v5

    .line 70
    float-to-int v1, v1

    .line 71
    and-long/2addr p1, v3

    .line 72
    long-to-int p1, p1

    .line 73
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    and-long/2addr p3, v3

    .line 78
    long-to-int p3, p3

    .line 79
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 80
    .line 81
    .line 82
    move-result p4

    .line 83
    invoke-static {p2, p4}, Ljava/lang/Math;->min(FF)F

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    float-to-double v3, p2

    .line 88
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 89
    .line 90
    .line 91
    move-result-wide v3

    .line 92
    double-to-float p2, v3

    .line 93
    float-to-int p2, p2

    .line 94
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 95
    .line 96
    .line 97
    move-result p4

    .line 98
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    invoke-static {p4, v0}, Ljava/lang/Math;->max(FF)F

    .line 103
    .line 104
    .line 105
    move-result p4

    .line 106
    float-to-double v2, p4

    .line 107
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 108
    .line 109
    .line 110
    move-result-wide v2

    .line 111
    double-to-float p4, v2

    .line 112
    float-to-int p4, p4

    .line 113
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 118
    .line 119
    .line 120
    move-result p3

    .line 121
    invoke-static {p1, p3}, Ljava/lang/Math;->max(FF)F

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    float-to-double v2, p1

    .line 126
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 127
    .line 128
    .line 129
    move-result-wide v2

    .line 130
    double-to-float p1, v2

    .line 131
    float-to-int p1, p1

    .line 132
    invoke-direct {p0, v1, p2, p4, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 133
    .line 134
    .line 135
    return-object p0
.end method

.method public final Q()V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lj03;

    .line 4
    .line 5
    invoke-direct {v1}, Lj03;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lya;->N:Lj03;

    .line 9
    .line 10
    iget-object v3, v2, Lj03;->b:[I

    .line 11
    .line 12
    iget-object v4, v2, Lj03;->a:[J

    .line 13
    .line 14
    array-length v5, v4

    .line 15
    add-int/lit8 v5, v5, -0x2

    .line 16
    .line 17
    iget-object v6, v0, Lya;->T:Li03;

    .line 18
    .line 19
    const/16 v14, 0x8

    .line 20
    .line 21
    if-ltz v5, :cond_8

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    const-wide/16 v16, 0x80

    .line 25
    .line 26
    const-wide/16 v18, 0xff

    .line 27
    .line 28
    :goto_0
    aget-wide v9, v4, v7

    .line 29
    .line 30
    const/4 v8, 0x7

    .line 31
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    not-long v11, v9

    .line 37
    shl-long/2addr v11, v8

    .line 38
    and-long/2addr v11, v9

    .line 39
    and-long v11, v11, v20

    .line 40
    .line 41
    cmp-long v11, v11, v20

    .line 42
    .line 43
    if-eqz v11, :cond_7

    .line 44
    .line 45
    sub-int v11, v7, v5

    .line 46
    .line 47
    not-int v11, v11

    .line 48
    ushr-int/lit8 v11, v11, 0x1f

    .line 49
    .line 50
    rsub-int/lit8 v11, v11, 0x8

    .line 51
    .line 52
    const/4 v12, 0x0

    .line 53
    :goto_1
    if-ge v12, v11, :cond_6

    .line 54
    .line 55
    and-long v22, v9, v18

    .line 56
    .line 57
    cmp-long v13, v22, v16

    .line 58
    .line 59
    if-gez v13, :cond_4

    .line 60
    .line 61
    shl-int/lit8 v13, v7, 0x3

    .line 62
    .line 63
    add-int/2addr v13, v12

    .line 64
    aget v13, v3, v13

    .line 65
    .line 66
    move/from16 v22, v8

    .line 67
    .line 68
    invoke-virtual {v0}, Lya;->s()Le02;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-virtual {v8, v13}, Le02;->b(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    check-cast v8, Lk94;

    .line 77
    .line 78
    const/16 v23, 0x0

    .line 79
    .line 80
    if-eqz v8, :cond_0

    .line 81
    .line 82
    iget-object v8, v8, Lk94;->a:Li94;

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_0
    move-object/from16 v8, v23

    .line 86
    .line 87
    :goto_2
    if-eqz v8, :cond_1

    .line 88
    .line 89
    iget-object v8, v8, Li94;->d:Le94;

    .line 90
    .line 91
    sget-object v15, Ln94;->d:Lp94;

    .line 92
    .line 93
    iget-object v8, v8, Le94;->n:Lw03;

    .line 94
    .line 95
    invoke-virtual {v8, v15}, Lw03;->c(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-nez v8, :cond_5

    .line 100
    .line 101
    :cond_1
    invoke-virtual {v1, v13}, Lj03;->a(I)Z

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6, v13}, Le02;->b(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    check-cast v8, Lj94;

    .line 109
    .line 110
    if-eqz v8, :cond_3

    .line 111
    .line 112
    iget-object v8, v8, Lj94;->a:Le94;

    .line 113
    .line 114
    sget-object v15, Ln94;->d:Lp94;

    .line 115
    .line 116
    iget-object v8, v8, Le94;->n:Lw03;

    .line 117
    .line 118
    invoke-virtual {v8, v15}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    if-nez v8, :cond_2

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_2
    move-object/from16 v23, v8

    .line 126
    .line 127
    :goto_3
    check-cast v23, Ljava/lang/String;

    .line 128
    .line 129
    :cond_3
    move-object/from16 v8, v23

    .line 130
    .line 131
    const/16 v15, 0x20

    .line 132
    .line 133
    invoke-virtual {v0, v8, v13, v15}, Lya;->F(Ljava/lang/String;II)V

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_4
    move/from16 v22, v8

    .line 138
    .line 139
    :cond_5
    :goto_4
    shr-long/2addr v9, v14

    .line 140
    add-int/lit8 v12, v12, 0x1

    .line 141
    .line 142
    move/from16 v8, v22

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_6
    move/from16 v22, v8

    .line 146
    .line 147
    if-ne v11, v14, :cond_9

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_7
    move/from16 v22, v8

    .line 151
    .line 152
    :goto_5
    if-eq v7, v5, :cond_9

    .line 153
    .line 154
    add-int/lit8 v7, v7, 0x1

    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_8
    const-wide/16 v16, 0x80

    .line 159
    .line 160
    const-wide/16 v18, 0xff

    .line 161
    .line 162
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    const/16 v22, 0x7

    .line 168
    .line 169
    :cond_9
    iget-object v3, v1, Lj03;->b:[I

    .line 170
    .line 171
    iget-object v1, v1, Lj03;->a:[J

    .line 172
    .line 173
    array-length v4, v1

    .line 174
    add-int/lit8 v4, v4, -0x2

    .line 175
    .line 176
    if-ltz v4, :cond_11

    .line 177
    .line 178
    const/4 v5, 0x0

    .line 179
    :goto_6
    aget-wide v7, v1, v5

    .line 180
    .line 181
    not-long v9, v7

    .line 182
    shl-long v9, v9, v22

    .line 183
    .line 184
    and-long/2addr v9, v7

    .line 185
    and-long v9, v9, v20

    .line 186
    .line 187
    cmp-long v9, v9, v20

    .line 188
    .line 189
    if-eqz v9, :cond_10

    .line 190
    .line 191
    sub-int v9, v5, v4

    .line 192
    .line 193
    not-int v9, v9

    .line 194
    ushr-int/lit8 v9, v9, 0x1f

    .line 195
    .line 196
    rsub-int/lit8 v9, v9, 0x8

    .line 197
    .line 198
    const/4 v10, 0x0

    .line 199
    :goto_7
    if-ge v10, v9, :cond_f

    .line 200
    .line 201
    and-long v11, v7, v18

    .line 202
    .line 203
    cmp-long v11, v11, v16

    .line 204
    .line 205
    if-gez v11, :cond_d

    .line 206
    .line 207
    shl-int/lit8 v11, v5, 0x3

    .line 208
    .line 209
    add-int/2addr v11, v10

    .line 210
    aget v11, v3, v11

    .line 211
    .line 212
    invoke-static {v11}, Ljava/lang/Integer;->hashCode(I)I

    .line 213
    .line 214
    .line 215
    move-result v12

    .line 216
    const v13, -0x3361d2af    # -8.293031E7f

    .line 217
    .line 218
    .line 219
    mul-int/2addr v12, v13

    .line 220
    shl-int/lit8 v13, v12, 0x10

    .line 221
    .line 222
    xor-int/2addr v12, v13

    .line 223
    and-int/lit8 v13, v12, 0x7f

    .line 224
    .line 225
    iget v15, v2, Lj03;->c:I

    .line 226
    .line 227
    ushr-int/lit8 v12, v12, 0x7

    .line 228
    .line 229
    and-int/2addr v12, v15

    .line 230
    move/from16 v24, v14

    .line 231
    .line 232
    const/16 v23, 0x0

    .line 233
    .line 234
    :goto_8
    iget-object v14, v2, Lj03;->a:[J

    .line 235
    .line 236
    shr-int/lit8 v25, v12, 0x3

    .line 237
    .line 238
    and-int/lit8 v26, v12, 0x7

    .line 239
    .line 240
    move-object/from16 v27, v1

    .line 241
    .line 242
    shl-int/lit8 v1, v26, 0x3

    .line 243
    .line 244
    aget-wide v28, v14, v25

    .line 245
    .line 246
    ushr-long v28, v28, v1

    .line 247
    .line 248
    add-int/lit8 v25, v25, 0x1

    .line 249
    .line 250
    aget-wide v25, v14, v25

    .line 251
    .line 252
    rsub-int/lit8 v14, v1, 0x40

    .line 253
    .line 254
    shl-long v25, v25, v14

    .line 255
    .line 256
    move-wide/from16 v30, v7

    .line 257
    .line 258
    int-to-long v7, v1

    .line 259
    neg-long v7, v7

    .line 260
    const/16 v1, 0x3f

    .line 261
    .line 262
    shr-long/2addr v7, v1

    .line 263
    and-long v7, v25, v7

    .line 264
    .line 265
    or-long v7, v28, v7

    .line 266
    .line 267
    move v1, v15

    .line 268
    int-to-long v14, v13

    .line 269
    const-wide v25, 0x101010101010101L

    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    mul-long v14, v14, v25

    .line 275
    .line 276
    xor-long/2addr v14, v7

    .line 277
    sub-long v25, v14, v25

    .line 278
    .line 279
    not-long v14, v14

    .line 280
    and-long v14, v25, v14

    .line 281
    .line 282
    and-long v14, v14, v20

    .line 283
    .line 284
    :goto_9
    const-wide/16 v25, 0x0

    .line 285
    .line 286
    cmp-long v28, v14, v25

    .line 287
    .line 288
    if-eqz v28, :cond_b

    .line 289
    .line 290
    invoke-static {v14, v15}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 291
    .line 292
    .line 293
    move-result v25

    .line 294
    shr-int/lit8 v25, v25, 0x3

    .line 295
    .line 296
    add-int v25, v12, v25

    .line 297
    .line 298
    and-int v25, v25, v1

    .line 299
    .line 300
    move/from16 v28, v1

    .line 301
    .line 302
    iget-object v1, v2, Lj03;->b:[I

    .line 303
    .line 304
    aget v1, v1, v25

    .line 305
    .line 306
    if-ne v1, v11, :cond_a

    .line 307
    .line 308
    :goto_a
    move/from16 v1, v25

    .line 309
    .line 310
    goto :goto_b

    .line 311
    :cond_a
    const-wide/16 v25, 0x1

    .line 312
    .line 313
    sub-long v25, v14, v25

    .line 314
    .line 315
    and-long v14, v14, v25

    .line 316
    .line 317
    move/from16 v1, v28

    .line 318
    .line 319
    goto :goto_9

    .line 320
    :cond_b
    move/from16 v28, v1

    .line 321
    .line 322
    not-long v14, v7

    .line 323
    const/4 v1, 0x6

    .line 324
    shl-long/2addr v14, v1

    .line 325
    and-long/2addr v7, v14

    .line 326
    and-long v7, v7, v20

    .line 327
    .line 328
    cmp-long v1, v7, v25

    .line 329
    .line 330
    if-eqz v1, :cond_c

    .line 331
    .line 332
    const/16 v25, -0x1

    .line 333
    .line 334
    goto :goto_a

    .line 335
    :goto_b
    if-ltz v1, :cond_e

    .line 336
    .line 337
    invoke-virtual {v2, v1}, Lj03;->g(I)V

    .line 338
    .line 339
    .line 340
    goto :goto_c

    .line 341
    :cond_c
    add-int/lit8 v23, v23, 0x8

    .line 342
    .line 343
    add-int v12, v12, v23

    .line 344
    .line 345
    and-int v12, v12, v28

    .line 346
    .line 347
    move-object/from16 v1, v27

    .line 348
    .line 349
    move/from16 v15, v28

    .line 350
    .line 351
    move-wide/from16 v7, v30

    .line 352
    .line 353
    goto :goto_8

    .line 354
    :cond_d
    move-object/from16 v27, v1

    .line 355
    .line 356
    move-wide/from16 v30, v7

    .line 357
    .line 358
    move/from16 v24, v14

    .line 359
    .line 360
    :cond_e
    :goto_c
    shr-long v7, v30, v24

    .line 361
    .line 362
    add-int/lit8 v10, v10, 0x1

    .line 363
    .line 364
    move/from16 v14, v24

    .line 365
    .line 366
    move-object/from16 v1, v27

    .line 367
    .line 368
    goto/16 :goto_7

    .line 369
    .line 370
    :cond_f
    move-object/from16 v27, v1

    .line 371
    .line 372
    move v1, v14

    .line 373
    if-ne v9, v1, :cond_11

    .line 374
    .line 375
    goto :goto_d

    .line 376
    :cond_10
    move-object/from16 v27, v1

    .line 377
    .line 378
    :goto_d
    if-eq v5, v4, :cond_11

    .line 379
    .line 380
    add-int/lit8 v5, v5, 0x1

    .line 381
    .line 382
    move-object/from16 v1, v27

    .line 383
    .line 384
    const/16 v14, 0x8

    .line 385
    .line 386
    goto/16 :goto_6

    .line 387
    .line 388
    :cond_11
    invoke-virtual {v6}, Li03;->c()V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0}, Lya;->s()Le02;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    iget-object v3, v1, Le02;->b:[I

    .line 396
    .line 397
    iget-object v4, v1, Le02;->c:[Ljava/lang/Object;

    .line 398
    .line 399
    iget-object v1, v1, Le02;->a:[J

    .line 400
    .line 401
    array-length v5, v1

    .line 402
    add-int/lit8 v5, v5, -0x2

    .line 403
    .line 404
    if-ltz v5, :cond_16

    .line 405
    .line 406
    const/4 v7, 0x0

    .line 407
    :goto_e
    aget-wide v8, v1, v7

    .line 408
    .line 409
    not-long v10, v8

    .line 410
    shl-long v10, v10, v22

    .line 411
    .line 412
    and-long/2addr v10, v8

    .line 413
    and-long v10, v10, v20

    .line 414
    .line 415
    cmp-long v10, v10, v20

    .line 416
    .line 417
    if-eqz v10, :cond_15

    .line 418
    .line 419
    sub-int v10, v7, v5

    .line 420
    .line 421
    not-int v10, v10

    .line 422
    ushr-int/lit8 v10, v10, 0x1f

    .line 423
    .line 424
    const/16 v24, 0x8

    .line 425
    .line 426
    rsub-int/lit8 v14, v10, 0x8

    .line 427
    .line 428
    const/4 v10, 0x0

    .line 429
    :goto_f
    if-ge v10, v14, :cond_14

    .line 430
    .line 431
    and-long v11, v8, v18

    .line 432
    .line 433
    cmp-long v11, v11, v16

    .line 434
    .line 435
    if-gez v11, :cond_13

    .line 436
    .line 437
    shl-int/lit8 v11, v7, 0x3

    .line 438
    .line 439
    add-int/2addr v11, v10

    .line 440
    aget v12, v3, v11

    .line 441
    .line 442
    aget-object v11, v4, v11

    .line 443
    .line 444
    check-cast v11, Lk94;

    .line 445
    .line 446
    iget-object v11, v11, Lk94;->a:Li94;

    .line 447
    .line 448
    iget-object v13, v11, Li94;->d:Le94;

    .line 449
    .line 450
    sget-object v15, Ln94;->d:Lp94;

    .line 451
    .line 452
    iget-object v13, v13, Le94;->n:Lw03;

    .line 453
    .line 454
    invoke-virtual {v13, v15}, Lw03;->c(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v13

    .line 458
    if-eqz v13, :cond_12

    .line 459
    .line 460
    invoke-virtual {v2, v12}, Lj03;->a(I)Z

    .line 461
    .line 462
    .line 463
    move-result v13

    .line 464
    if-eqz v13, :cond_12

    .line 465
    .line 466
    iget-object v13, v11, Li94;->d:Le94;

    .line 467
    .line 468
    invoke-virtual {v13, v15}, Le94;->d(Lp94;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v13

    .line 472
    check-cast v13, Ljava/lang/String;

    .line 473
    .line 474
    const/16 v15, 0x10

    .line 475
    .line 476
    invoke-virtual {v0, v13, v12, v15}, Lya;->F(Ljava/lang/String;II)V

    .line 477
    .line 478
    .line 479
    :cond_12
    new-instance v13, Lj94;

    .line 480
    .line 481
    invoke-virtual {v0}, Lya;->s()Le02;

    .line 482
    .line 483
    .line 484
    move-result-object v15

    .line 485
    invoke-direct {v13, v11, v15}, Lj94;-><init>(Li94;Le02;)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v6, v12, v13}, Li03;->i(ILjava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    :cond_13
    const/16 v11, 0x8

    .line 492
    .line 493
    shr-long/2addr v8, v11

    .line 494
    add-int/lit8 v10, v10, 0x1

    .line 495
    .line 496
    goto :goto_f

    .line 497
    :cond_14
    const/16 v11, 0x8

    .line 498
    .line 499
    if-ne v14, v11, :cond_16

    .line 500
    .line 501
    goto :goto_10

    .line 502
    :cond_15
    const/16 v11, 0x8

    .line 503
    .line 504
    :goto_10
    if-eq v7, v5, :cond_16

    .line 505
    .line 506
    add-int/lit8 v7, v7, 0x1

    .line 507
    .line 508
    goto :goto_e

    .line 509
    :cond_16
    new-instance v1, Lj94;

    .line 510
    .line 511
    iget-object v2, v0, Lya;->q:Lra;

    .line 512
    .line 513
    invoke-virtual {v2}, Lra;->getSemanticsOwner()Ll94;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    invoke-virtual {v2}, Ll94;->a()Li94;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    invoke-virtual {v0}, Lya;->s()Le02;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    invoke-direct {v1, v2, v3}, Lj94;-><init>(Li94;Le02;)V

    .line 526
    .line 527
    .line 528
    iput-object v1, v0, Lya;->U:Lj94;

    .line 529
    .line 530
    return-void
.end method

.method public final b(Landroid/view/View;)Lzh0;
    .locals 0

    .line 1
    iget-object p0, p0, Lya;->w:Lua;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j(ILv3;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p2

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    iget-object v3, v3, Lv3;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 12
    .line 13
    invoke-virtual {v0}, Lya;->s()Le02;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {v5, v1}, Le02;->b(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    check-cast v5, Lk94;

    .line 22
    .line 23
    if-eqz v5, :cond_26

    .line 24
    .line 25
    iget-object v5, v5, Lk94;->a:Li94;

    .line 26
    .line 27
    if-nez v5, :cond_0

    .line 28
    .line 29
    goto/16 :goto_14

    .line 30
    .line 31
    :cond_0
    iget-object v6, v5, Li94;->c:Lc72;

    .line 32
    .line 33
    iget-object v7, v5, Li94;->d:Le94;

    .line 34
    .line 35
    iget-object v8, v7, Le94;->n:Lw03;

    .line 36
    .line 37
    invoke-static {v5}, Lya;->t(Li94;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    iget-object v10, v0, Lya;->Q:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v2, v10}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    const/4 v11, -0x1

    .line 48
    if-eqz v10, :cond_1

    .line 49
    .line 50
    iget-object v0, v0, Lya;->O:Lg03;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lg03;->d(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eq v0, v11, :cond_26

    .line 57
    .line 58
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    iget-object v10, v0, Lya;->R:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v2, v10}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    if-eqz v10, :cond_2

    .line 73
    .line 74
    iget-object v0, v0, Lya;->P:Lg03;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Lg03;->d(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eq v0, v11, :cond_26

    .line 81
    .line 82
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    sget-object v1, Ld94;->a:Lp94;

    .line 91
    .line 92
    invoke-virtual {v8, v1}, Lw03;->c(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    iget-object v10, v0, Lya;->q:Lra;

    .line 97
    .line 98
    if-eqz v1, :cond_18

    .line 99
    .line 100
    if-eqz v4, :cond_18

    .line 101
    .line 102
    const-string v1, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    .line 103
    .line 104
    invoke-static {v2, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_18

    .line 109
    .line 110
    const-string v0, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX"

    .line 111
    .line 112
    invoke-virtual {v4, v0, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    const-string v1, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH"

    .line 117
    .line 118
    invoke-virtual {v4, v1, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-lez v1, :cond_17

    .line 123
    .line 124
    if-ltz v0, :cond_17

    .line 125
    .line 126
    if-eqz v9, :cond_3

    .line 127
    .line 128
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    goto :goto_0

    .line 133
    :cond_3
    const v4, 0x7fffffff

    .line 134
    .line 135
    .line 136
    :goto_0
    if-lt v0, v4, :cond_4

    .line 137
    .line 138
    goto/16 :goto_e

    .line 139
    .line 140
    :cond_4
    invoke-static {v7}, Lgh0;->p(Le94;)Lms4;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    if-nez v4, :cond_6

    .line 145
    .line 146
    :cond_5
    const/4 v12, 0x0

    .line 147
    goto/16 :goto_d

    .line 148
    .line 149
    :cond_6
    iget-object v6, v6, Lc72;->Q:Lw12;

    .line 150
    .line 151
    iget-object v6, v6, Lw12;->d:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v6, Liz1;

    .line 154
    .line 155
    iget-object v7, v6, Liz1;->n0:Lsq4;

    .line 156
    .line 157
    iget-boolean v7, v7, Lcx2;->A:Z

    .line 158
    .line 159
    if-eqz v7, :cond_7

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_7
    const/4 v6, 0x0

    .line 163
    :goto_1
    if-eqz v6, :cond_5

    .line 164
    .line 165
    const-wide/16 v7, 0x0

    .line 166
    .line 167
    invoke-virtual {v6, v7, v8}, Lf63;->K0(J)J

    .line 168
    .line 169
    .line 170
    move-result-wide v6

    .line 171
    invoke-virtual {v5}, Li94;->g()Lwv3;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    new-array v8, v1, [Landroid/graphics/RectF;

    .line 176
    .line 177
    const/4 v9, 0x0

    .line 178
    :goto_2
    if-ge v9, v1, :cond_15

    .line 179
    .line 180
    add-int v11, v0, v9

    .line 181
    .line 182
    iget-object v15, v4, Lms4;->a:Lls4;

    .line 183
    .line 184
    iget-object v15, v15, Lls4;->a:Lhe;

    .line 185
    .line 186
    iget-object v15, v15, Lhe;->o:Ljava/lang/String;

    .line 187
    .line 188
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 189
    .line 190
    .line 191
    move-result v15

    .line 192
    if-lt v11, v15, :cond_8

    .line 193
    .line 194
    move/from16 p0, v0

    .line 195
    .line 196
    move/from16 p4, v1

    .line 197
    .line 198
    move-object/from16 v16, v4

    .line 199
    .line 200
    move-object v12, v8

    .line 201
    move v15, v9

    .line 202
    goto/16 :goto_c

    .line 203
    .line 204
    :cond_8
    iget-object v15, v4, Lms4;->b:Lfd;

    .line 205
    .line 206
    iget-object v12, v15, Lfd;->c:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v12, Lbq4;

    .line 209
    .line 210
    iget-object v12, v12, Lbq4;->n:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v12, Lhe;

    .line 213
    .line 214
    const-string v13, ")"

    .line 215
    .line 216
    const-string v14, "offset("

    .line 217
    .line 218
    move/from16 p0, v0

    .line 219
    .line 220
    if-ltz v11, :cond_9

    .line 221
    .line 222
    iget-object v0, v12, Lhe;->o:Ljava/lang/String;

    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-ge v11, v0, :cond_9

    .line 229
    .line 230
    move/from16 p4, v1

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_9
    iget-object v0, v12, Lhe;->o:Ljava/lang/String;

    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    new-instance v12, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v12, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    move/from16 p4, v1

    .line 248
    .line 249
    const-string v1, ") is out of bounds [0, "

    .line 250
    .line 251
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-static {v0}, Ldz1;->a(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    :goto_3
    iget-object v0, v15, Lfd;->e:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v0, Ljava/util/ArrayList;

    .line 270
    .line 271
    invoke-static {v0, v11}, Lrr2;->C(Ljava/util/List;I)I

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    check-cast v0, Lod3;

    .line 280
    .line 281
    iget-object v1, v0, Lod3;->a:Lic;

    .line 282
    .line 283
    invoke-virtual {v0, v11}, Lod3;->a(I)I

    .line 284
    .line 285
    .line 286
    move-result v11

    .line 287
    iget-object v12, v1, Lic;->e:Ljava/lang/CharSequence;

    .line 288
    .line 289
    if-ltz v11, :cond_a

    .line 290
    .line 291
    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    .line 292
    .line 293
    .line 294
    move-result v15

    .line 295
    if-ge v11, v15, :cond_a

    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_a
    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    .line 299
    .line 300
    .line 301
    move-result v12

    .line 302
    new-instance v15, Ljava/lang/StringBuilder;

    .line 303
    .line 304
    invoke-direct {v15, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    const-string v14, ") is out of bounds [0,"

    .line 311
    .line 312
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v12

    .line 325
    invoke-static {v12}, Ldz1;->a(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    :goto_4
    iget-object v1, v1, Lic;->d:Lks4;

    .line 329
    .line 330
    invoke-virtual {v1, v11}, Lks4;->f(I)I

    .line 331
    .line 332
    .line 333
    move-result v12

    .line 334
    invoke-virtual {v1, v12}, Lks4;->g(I)F

    .line 335
    .line 336
    .line 337
    move-result v13

    .line 338
    invoke-virtual {v1, v12}, Lks4;->d(I)F

    .line 339
    .line 340
    .line 341
    move-result v14

    .line 342
    iget-object v15, v1, Lks4;->e:Landroid/text/Layout;

    .line 343
    .line 344
    invoke-virtual {v15, v12}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 345
    .line 346
    .line 347
    move-result v12

    .line 348
    move-object/from16 v16, v4

    .line 349
    .line 350
    const/4 v4, 0x1

    .line 351
    if-ne v12, v4, :cond_b

    .line 352
    .line 353
    move v12, v4

    .line 354
    goto :goto_5

    .line 355
    :cond_b
    const/4 v12, 0x0

    .line 356
    :goto_5
    invoke-virtual {v15, v11}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 357
    .line 358
    .line 359
    move-result v15

    .line 360
    if-eqz v12, :cond_c

    .line 361
    .line 362
    if-nez v15, :cond_c

    .line 363
    .line 364
    const/4 v4, 0x0

    .line 365
    invoke-virtual {v1, v11, v4}, Lks4;->h(IZ)F

    .line 366
    .line 367
    .line 368
    move-result v12

    .line 369
    add-int/lit8 v11, v11, 0x1

    .line 370
    .line 371
    const/4 v15, 0x1

    .line 372
    invoke-virtual {v1, v11, v15}, Lks4;->h(IZ)F

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    goto :goto_6

    .line 377
    :cond_c
    const/4 v4, 0x0

    .line 378
    if-eqz v12, :cond_d

    .line 379
    .line 380
    if-eqz v15, :cond_d

    .line 381
    .line 382
    invoke-virtual {v1, v11, v4}, Lks4;->i(IZ)F

    .line 383
    .line 384
    .line 385
    move-result v12

    .line 386
    add-int/lit8 v11, v11, 0x1

    .line 387
    .line 388
    const/4 v15, 0x1

    .line 389
    invoke-virtual {v1, v11, v15}, Lks4;->i(IZ)F

    .line 390
    .line 391
    .line 392
    move-result v1

    .line 393
    move/from16 v22, v12

    .line 394
    .line 395
    move v12, v1

    .line 396
    move/from16 v1, v22

    .line 397
    .line 398
    goto :goto_6

    .line 399
    :cond_d
    const/4 v12, 0x1

    .line 400
    if-eqz v15, :cond_e

    .line 401
    .line 402
    invoke-virtual {v1, v11, v4}, Lks4;->h(IZ)F

    .line 403
    .line 404
    .line 405
    move-result v15

    .line 406
    add-int/lit8 v11, v11, 0x1

    .line 407
    .line 408
    invoke-virtual {v1, v11, v12}, Lks4;->h(IZ)F

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    move v12, v1

    .line 413
    move v1, v15

    .line 414
    goto :goto_6

    .line 415
    :cond_e
    invoke-virtual {v1, v11, v4}, Lks4;->i(IZ)F

    .line 416
    .line 417
    .line 418
    move-result v15

    .line 419
    add-int/lit8 v11, v11, 0x1

    .line 420
    .line 421
    invoke-virtual {v1, v11, v12}, Lks4;->i(IZ)F

    .line 422
    .line 423
    .line 424
    move-result v1

    .line 425
    move v12, v15

    .line 426
    :goto_6
    new-instance v4, Landroid/graphics/RectF;

    .line 427
    .line 428
    invoke-direct {v4, v12, v13, v1, v14}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 429
    .line 430
    .line 431
    iget v1, v4, Landroid/graphics/RectF;->left:F

    .line 432
    .line 433
    iget v11, v4, Landroid/graphics/RectF;->top:F

    .line 434
    .line 435
    const/4 v12, 0x0

    .line 436
    add-float/2addr v11, v12

    .line 437
    iget v13, v4, Landroid/graphics/RectF;->right:F

    .line 438
    .line 439
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 440
    .line 441
    add-float/2addr v4, v12

    .line 442
    iget v0, v0, Lod3;->f:F

    .line 443
    .line 444
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 445
    .line 446
    .line 447
    move-result v12

    .line 448
    int-to-long v14, v12

    .line 449
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    move v12, v1

    .line 454
    int-to-long v0, v0

    .line 455
    const/16 v17, 0x20

    .line 456
    .line 457
    shl-long v14, v14, v17

    .line 458
    .line 459
    const-wide v18, 0xffffffffL

    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    and-long v0, v0, v18

    .line 465
    .line 466
    or-long/2addr v0, v14

    .line 467
    new-instance v14, Lwv3;

    .line 468
    .line 469
    move-wide/from16 v20, v0

    .line 470
    .line 471
    shr-long v0, v20, v17

    .line 472
    .line 473
    long-to-int v0, v0

    .line 474
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 475
    .line 476
    .line 477
    move-result v1

    .line 478
    add-float/2addr v1, v12

    .line 479
    move-object v12, v8

    .line 480
    move v15, v9

    .line 481
    and-long v8, v20, v18

    .line 482
    .line 483
    long-to-int v8, v8

    .line 484
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 485
    .line 486
    .line 487
    move-result v9

    .line 488
    add-float/2addr v9, v11

    .line 489
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    add-float/2addr v0, v13

    .line 494
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 495
    .line 496
    .line 497
    move-result v8

    .line 498
    add-float/2addr v8, v4

    .line 499
    invoke-direct {v14, v1, v9, v0, v8}, Lwv3;-><init>(FFFF)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v14, v6, v7}, Lwv3;->f(J)Lwv3;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    iget v1, v0, Lwv3;->a:F

    .line 507
    .line 508
    iget v4, v5, Lwv3;->c:F

    .line 509
    .line 510
    cmpg-float v1, v1, v4

    .line 511
    .line 512
    if-gez v1, :cond_f

    .line 513
    .line 514
    const/4 v4, 0x1

    .line 515
    goto :goto_7

    .line 516
    :cond_f
    const/4 v4, 0x0

    .line 517
    :goto_7
    iget v1, v5, Lwv3;->a:F

    .line 518
    .line 519
    iget v8, v0, Lwv3;->c:F

    .line 520
    .line 521
    cmpg-float v1, v1, v8

    .line 522
    .line 523
    if-gez v1, :cond_10

    .line 524
    .line 525
    const/4 v1, 0x1

    .line 526
    goto :goto_8

    .line 527
    :cond_10
    const/4 v1, 0x0

    .line 528
    :goto_8
    and-int/2addr v1, v4

    .line 529
    iget v4, v0, Lwv3;->b:F

    .line 530
    .line 531
    iget v8, v5, Lwv3;->d:F

    .line 532
    .line 533
    cmpg-float v4, v4, v8

    .line 534
    .line 535
    if-gez v4, :cond_11

    .line 536
    .line 537
    const/4 v4, 0x1

    .line 538
    goto :goto_9

    .line 539
    :cond_11
    const/4 v4, 0x0

    .line 540
    :goto_9
    and-int/2addr v1, v4

    .line 541
    iget v4, v5, Lwv3;->b:F

    .line 542
    .line 543
    iget v8, v0, Lwv3;->d:F

    .line 544
    .line 545
    cmpg-float v4, v4, v8

    .line 546
    .line 547
    if-gez v4, :cond_12

    .line 548
    .line 549
    const/4 v4, 0x1

    .line 550
    goto :goto_a

    .line 551
    :cond_12
    const/4 v4, 0x0

    .line 552
    :goto_a
    and-int/2addr v1, v4

    .line 553
    if-eqz v1, :cond_13

    .line 554
    .line 555
    invoke-virtual {v0, v5}, Lwv3;->c(Lwv3;)Lwv3;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    goto :goto_b

    .line 560
    :cond_13
    const/4 v0, 0x0

    .line 561
    :goto_b
    if-eqz v0, :cond_14

    .line 562
    .line 563
    iget v1, v0, Lwv3;->a:F

    .line 564
    .line 565
    iget v4, v0, Lwv3;->b:F

    .line 566
    .line 567
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 568
    .line 569
    .line 570
    move-result v1

    .line 571
    int-to-long v8, v1

    .line 572
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 573
    .line 574
    .line 575
    move-result v1

    .line 576
    int-to-long v13, v1

    .line 577
    shl-long v8, v8, v17

    .line 578
    .line 579
    and-long v13, v13, v18

    .line 580
    .line 581
    or-long/2addr v8, v13

    .line 582
    invoke-virtual {v10, v8, v9}, Lra;->p(J)J

    .line 583
    .line 584
    .line 585
    move-result-wide v8

    .line 586
    iget v1, v0, Lwv3;->c:F

    .line 587
    .line 588
    iget v0, v0, Lwv3;->d:F

    .line 589
    .line 590
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 591
    .line 592
    .line 593
    move-result v1

    .line 594
    int-to-long v13, v1

    .line 595
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 596
    .line 597
    .line 598
    move-result v0

    .line 599
    int-to-long v0, v0

    .line 600
    shl-long v13, v13, v17

    .line 601
    .line 602
    and-long v0, v0, v18

    .line 603
    .line 604
    or-long/2addr v0, v13

    .line 605
    invoke-virtual {v10, v0, v1}, Lra;->p(J)J

    .line 606
    .line 607
    .line 608
    move-result-wide v0

    .line 609
    new-instance v4, Landroid/graphics/RectF;

    .line 610
    .line 611
    shr-long v13, v8, v17

    .line 612
    .line 613
    long-to-int v11, v13

    .line 614
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 615
    .line 616
    .line 617
    move-result v13

    .line 618
    move-wide/from16 v20, v0

    .line 619
    .line 620
    shr-long v0, v20, v17

    .line 621
    .line 622
    long-to-int v0, v0

    .line 623
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 624
    .line 625
    .line 626
    move-result v1

    .line 627
    invoke-static {v13, v1}, Ljava/lang/Math;->min(FF)F

    .line 628
    .line 629
    .line 630
    move-result v1

    .line 631
    and-long v8, v8, v18

    .line 632
    .line 633
    long-to-int v8, v8

    .line 634
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 635
    .line 636
    .line 637
    move-result v9

    .line 638
    and-long v13, v20, v18

    .line 639
    .line 640
    long-to-int v13, v13

    .line 641
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 642
    .line 643
    .line 644
    move-result v14

    .line 645
    invoke-static {v9, v14}, Ljava/lang/Math;->min(FF)F

    .line 646
    .line 647
    .line 648
    move-result v9

    .line 649
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 650
    .line 651
    .line 652
    move-result v11

    .line 653
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    invoke-static {v11, v0}, Ljava/lang/Math;->max(FF)F

    .line 658
    .line 659
    .line 660
    move-result v0

    .line 661
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 662
    .line 663
    .line 664
    move-result v8

    .line 665
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 666
    .line 667
    .line 668
    move-result v11

    .line 669
    invoke-static {v8, v11}, Ljava/lang/Math;->max(FF)F

    .line 670
    .line 671
    .line 672
    move-result v8

    .line 673
    invoke-direct {v4, v1, v9, v0, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 674
    .line 675
    .line 676
    aput-object v4, v12, v15

    .line 677
    .line 678
    :cond_14
    :goto_c
    add-int/lit8 v9, v15, 0x1

    .line 679
    .line 680
    move/from16 v0, p0

    .line 681
    .line 682
    move/from16 v1, p4

    .line 683
    .line 684
    move-object v8, v12

    .line 685
    move-object/from16 v4, v16

    .line 686
    .line 687
    goto/16 :goto_2

    .line 688
    .line 689
    :cond_15
    move-object v12, v8

    .line 690
    :goto_d
    if-nez v12, :cond_16

    .line 691
    .line 692
    goto/16 :goto_14

    .line 693
    .line 694
    :cond_16
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    check-cast v12, [Landroid/os/Parcelable;

    .line 699
    .line 700
    invoke-virtual {v0, v2, v12}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 701
    .line 702
    .line 703
    return-void

    .line 704
    :cond_17
    :goto_e
    const-string v0, "AccessibilityDelegate"

    .line 705
    .line 706
    const-string v1, "Invalid arguments for accessibility character locations"

    .line 707
    .line 708
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 709
    .line 710
    .line 711
    return-void

    .line 712
    :cond_18
    sget-object v1, Ln94;->x:Lp94;

    .line 713
    .line 714
    invoke-virtual {v8, v1}, Lw03;->c(Ljava/lang/Object;)Z

    .line 715
    .line 716
    .line 717
    move-result v7

    .line 718
    if-eqz v7, :cond_1a

    .line 719
    .line 720
    if-eqz v4, :cond_1a

    .line 721
    .line 722
    const-string v4, "androidx.compose.ui.semantics.testTag"

    .line 723
    .line 724
    invoke-static {v2, v4}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 725
    .line 726
    .line 727
    move-result v4

    .line 728
    if-eqz v4, :cond_1a

    .line 729
    .line 730
    invoke-virtual {v8, v1}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v0

    .line 734
    if-nez v0, :cond_19

    .line 735
    .line 736
    const/4 v12, 0x0

    .line 737
    goto :goto_f

    .line 738
    :cond_19
    move-object v12, v0

    .line 739
    :goto_f
    check-cast v12, Ljava/lang/String;

    .line 740
    .line 741
    if-eqz v12, :cond_26

    .line 742
    .line 743
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    invoke-virtual {v0, v2, v12}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 748
    .line 749
    .line 750
    return-void

    .line 751
    :cond_1a
    const-string v1, "androidx.compose.ui.semantics.id"

    .line 752
    .line 753
    invoke-static {v2, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 754
    .line 755
    .line 756
    move-result v1

    .line 757
    if-eqz v1, :cond_1b

    .line 758
    .line 759
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    iget v1, v5, Li94;->f:I

    .line 764
    .line 765
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 766
    .line 767
    .line 768
    return-void

    .line 769
    :cond_1b
    const-string v1, "androidx.compose.ui.semantics.shapeType"

    .line 770
    .line 771
    invoke-static {v2, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 772
    .line 773
    .line 774
    move-result v4

    .line 775
    const-string v7, "androidx.compose.ui.semantics.shapeRegion"

    .line 776
    .line 777
    const-string v9, "androidx.compose.ui.semantics.shapeCorners"

    .line 778
    .line 779
    const-string v11, "androidx.compose.ui.semantics.shapeRect"

    .line 780
    .line 781
    if-eqz v4, :cond_20

    .line 782
    .line 783
    sget-object v2, Ln94;->O:Lp94;

    .line 784
    .line 785
    invoke-virtual {v8, v2}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v2

    .line 789
    if-nez v2, :cond_1c

    .line 790
    .line 791
    const/4 v12, 0x0

    .line 792
    goto :goto_10

    .line 793
    :cond_1c
    move-object v12, v2

    .line 794
    :goto_10
    check-cast v12, Lac4;

    .line 795
    .line 796
    if-eqz v12, :cond_26

    .line 797
    .line 798
    new-instance v2, Landroid/graphics/Rect;

    .line 799
    .line 800
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v3, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 804
    .line 805
    .line 806
    invoke-virtual {v0, v5, v2, v12}, Lya;->u(Li94;Landroid/graphics/Rect;Lac4;)Lwv3;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    iget v2, v0, Lwv3;->b:F

    .line 811
    .line 812
    iget v4, v0, Lwv3;->a:F

    .line 813
    .line 814
    invoke-virtual {v0}, Lwv3;->b()J

    .line 815
    .line 816
    .line 817
    move-result-wide v13

    .line 818
    iget-object v0, v6, Lc72;->K:Lr62;

    .line 819
    .line 820
    invoke-virtual {v10}, Lra;->getDensity()Loo0;

    .line 821
    .line 822
    .line 823
    move-result-object v5

    .line 824
    invoke-interface {v12, v13, v14, v0, v5}, Lac4;->a(JLr62;Loo0;)Lya4;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    instance-of v5, v0, Lnb3;

    .line 829
    .line 830
    if-eqz v5, :cond_1d

    .line 831
    .line 832
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 833
    .line 834
    .line 835
    move-result-object v5

    .line 836
    const/4 v6, 0x0

    .line 837
    invoke-virtual {v5, v1, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 841
    .line 842
    .line 843
    move-result-object v1

    .line 844
    invoke-static {v0, v4, v2}, Lya;->L(Lya4;FF)Landroid/graphics/Rect;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    invoke-virtual {v1, v11, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 849
    .line 850
    .line 851
    return-void

    .line 852
    :cond_1d
    instance-of v5, v0, Lob3;

    .line 853
    .line 854
    if-eqz v5, :cond_1e

    .line 855
    .line 856
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 857
    .line 858
    .line 859
    move-result-object v5

    .line 860
    const/4 v15, 0x1

    .line 861
    invoke-virtual {v5, v1, v15}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 862
    .line 863
    .line 864
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 865
    .line 866
    .line 867
    move-result-object v1

    .line 868
    invoke-static {v0, v4, v2}, Lya;->L(Lya4;FF)Landroid/graphics/Rect;

    .line 869
    .line 870
    .line 871
    move-result-object v2

    .line 872
    invoke-virtual {v1, v11, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 873
    .line 874
    .line 875
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 876
    .line 877
    .line 878
    move-result-object v1

    .line 879
    invoke-static {v0}, Lya;->N(Lya4;)[F

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    invoke-virtual {v1, v9, v0}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    .line 884
    .line 885
    .line 886
    return-void

    .line 887
    :cond_1e
    instance-of v5, v0, Lmb3;

    .line 888
    .line 889
    if-eqz v5, :cond_1f

    .line 890
    .line 891
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 892
    .line 893
    .line 894
    move-result-object v5

    .line 895
    const/4 v6, 0x2

    .line 896
    invoke-virtual {v5, v1, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 900
    .line 901
    .line 902
    move-result-object v1

    .line 903
    invoke-static {v0, v4, v2}, Lya;->O(Lya4;FF)Landroid/graphics/Region;

    .line 904
    .line 905
    .line 906
    move-result-object v0

    .line 907
    invoke-virtual {v1, v7, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 908
    .line 909
    .line 910
    return-void

    .line 911
    :cond_1f
    invoke-static {}, Ler1;->n()V

    .line 912
    .line 913
    .line 914
    return-void

    .line 915
    :cond_20
    invoke-static {v2, v11}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 916
    .line 917
    .line 918
    move-result v1

    .line 919
    if-eqz v1, :cond_22

    .line 920
    .line 921
    sget-object v1, Ln94;->O:Lp94;

    .line 922
    .line 923
    invoke-virtual {v8, v1}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v1

    .line 927
    if-nez v1, :cond_21

    .line 928
    .line 929
    const/4 v12, 0x0

    .line 930
    goto :goto_11

    .line 931
    :cond_21
    move-object v12, v1

    .line 932
    :goto_11
    check-cast v12, Lac4;

    .line 933
    .line 934
    if-eqz v12, :cond_26

    .line 935
    .line 936
    new-instance v1, Landroid/graphics/Rect;

    .line 937
    .line 938
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 939
    .line 940
    .line 941
    invoke-virtual {v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 942
    .line 943
    .line 944
    invoke-virtual {v0, v5, v1, v12}, Lya;->u(Li94;Landroid/graphics/Rect;Lac4;)Lwv3;

    .line 945
    .line 946
    .line 947
    move-result-object v0

    .line 948
    invoke-virtual {v0}, Lwv3;->b()J

    .line 949
    .line 950
    .line 951
    move-result-wide v1

    .line 952
    iget-object v4, v6, Lc72;->K:Lr62;

    .line 953
    .line 954
    invoke-virtual {v10}, Lra;->getDensity()Loo0;

    .line 955
    .line 956
    .line 957
    move-result-object v5

    .line 958
    invoke-interface {v12, v1, v2, v4, v5}, Lac4;->a(JLr62;Loo0;)Lya4;

    .line 959
    .line 960
    .line 961
    move-result-object v1

    .line 962
    iget v2, v0, Lwv3;->a:F

    .line 963
    .line 964
    iget v0, v0, Lwv3;->b:F

    .line 965
    .line 966
    invoke-static {v1, v2, v0}, Lya;->L(Lya4;FF)Landroid/graphics/Rect;

    .line 967
    .line 968
    .line 969
    move-result-object v0

    .line 970
    if-eqz v0, :cond_26

    .line 971
    .line 972
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 973
    .line 974
    .line 975
    move-result-object v1

    .line 976
    invoke-virtual {v1, v11, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 977
    .line 978
    .line 979
    return-void

    .line 980
    :cond_22
    invoke-static {v2, v9}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 981
    .line 982
    .line 983
    move-result v1

    .line 984
    if-eqz v1, :cond_24

    .line 985
    .line 986
    sget-object v1, Ln94;->O:Lp94;

    .line 987
    .line 988
    invoke-virtual {v8, v1}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 989
    .line 990
    .line 991
    move-result-object v1

    .line 992
    if-nez v1, :cond_23

    .line 993
    .line 994
    const/4 v12, 0x0

    .line 995
    goto :goto_12

    .line 996
    :cond_23
    move-object v12, v1

    .line 997
    :goto_12
    check-cast v12, Lac4;

    .line 998
    .line 999
    if-eqz v12, :cond_26

    .line 1000
    .line 1001
    new-instance v1, Landroid/graphics/Rect;

    .line 1002
    .line 1003
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v0, v5, v1, v12}, Lya;->u(Li94;Landroid/graphics/Rect;Lac4;)Lwv3;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    invoke-virtual {v0}, Lwv3;->b()J

    .line 1014
    .line 1015
    .line 1016
    move-result-wide v0

    .line 1017
    iget-object v2, v6, Lc72;->K:Lr62;

    .line 1018
    .line 1019
    invoke-virtual {v10}, Lra;->getDensity()Loo0;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v4

    .line 1023
    invoke-interface {v12, v0, v1, v2, v4}, Lac4;->a(JLr62;Loo0;)Lya4;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v0

    .line 1027
    invoke-static {v0}, Lya;->N(Lya4;)[F

    .line 1028
    .line 1029
    .line 1030
    move-result-object v0

    .line 1031
    if-eqz v0, :cond_26

    .line 1032
    .line 1033
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v1

    .line 1037
    invoke-virtual {v1, v9, v0}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    .line 1038
    .line 1039
    .line 1040
    return-void

    .line 1041
    :cond_24
    invoke-static {v2, v7}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1042
    .line 1043
    .line 1044
    move-result v1

    .line 1045
    if-eqz v1, :cond_26

    .line 1046
    .line 1047
    sget-object v1, Ln94;->O:Lp94;

    .line 1048
    .line 1049
    invoke-virtual {v8, v1}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v1

    .line 1053
    if-nez v1, :cond_25

    .line 1054
    .line 1055
    const/4 v12, 0x0

    .line 1056
    goto :goto_13

    .line 1057
    :cond_25
    move-object v12, v1

    .line 1058
    :goto_13
    check-cast v12, Lac4;

    .line 1059
    .line 1060
    if-eqz v12, :cond_26

    .line 1061
    .line 1062
    new-instance v1, Landroid/graphics/Rect;

    .line 1063
    .line 1064
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v0, v5, v1, v12}, Lya;->u(Li94;Landroid/graphics/Rect;Lac4;)Lwv3;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v0

    .line 1074
    invoke-virtual {v0}, Lwv3;->b()J

    .line 1075
    .line 1076
    .line 1077
    move-result-wide v1

    .line 1078
    iget-object v4, v6, Lc72;->K:Lr62;

    .line 1079
    .line 1080
    invoke-virtual {v10}, Lra;->getDensity()Loo0;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v5

    .line 1084
    invoke-interface {v12, v1, v2, v4, v5}, Lac4;->a(JLr62;Loo0;)Lya4;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v1

    .line 1088
    iget v2, v0, Lwv3;->a:F

    .line 1089
    .line 1090
    iget v0, v0, Lwv3;->b:F

    .line 1091
    .line 1092
    invoke-static {v1, v2, v0}, Lya;->O(Lya4;FF)Landroid/graphics/Region;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v0

    .line 1096
    if-eqz v0, :cond_26

    .line 1097
    .line 1098
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v1

    .line 1102
    invoke-virtual {v1, v7, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1103
    .line 1104
    .line 1105
    :cond_26
    :goto_14
    return-void
.end method

.method public final k(Lk94;)Landroid/graphics/Rect;
    .locals 3

    .line 1
    iget-object p1, p1, Lk94;->b:Lk02;

    .line 2
    .line 3
    iget v0, p1, Lk02;->a:I

    .line 4
    .line 5
    int-to-float v0, v0

    .line 6
    iget v1, p1, Lk02;->b:I

    .line 7
    .line 8
    int-to-float v1, v1

    .line 9
    iget v2, p1, Lk02;->c:I

    .line 10
    .line 11
    int-to-float v2, v2

    .line 12
    iget p1, p1, Lk02;->d:I

    .line 13
    .line 14
    int-to-float p1, p1

    .line 15
    invoke-virtual {p0, v0, v1, v2, p1}, Lya;->M(FFFF)Landroid/graphics/Rect;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final l(Lwd0;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p1, Lwa;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lwa;

    .line 7
    .line 8
    iget v1, v0, Lwa;->r:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lwa;->r:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lwa;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lwa;-><init>(Lya;Lwd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lwa;->p:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lwa;->r:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    iget-object v3, p0, Lya;->I:Lqi;

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    sget-object v5, Lxe0;->n:Lxe0;

    .line 34
    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    if-eq v1, v4, :cond_3

    .line 38
    .line 39
    if-ne v1, v2, :cond_2

    .line 40
    .line 41
    iget-object v1, v0, Lwa;->o:Lxv;

    .line 42
    .line 43
    iget-object v6, v0, Lwa;->n:Lj03;

    .line 44
    .line 45
    :try_start_0
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    :cond_1
    move-object p1, v6

    .line 49
    move-object v6, v1

    .line 50
    goto :goto_1

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    goto/16 :goto_7

    .line 53
    .line 54
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return-object p0

    .line 61
    :cond_3
    iget-object v1, v0, Lwa;->o:Lxv;

    .line 62
    .line 63
    iget-object v6, v0, Lwa;->n:Lj03;

    .line 64
    .line 65
    :try_start_1
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :try_start_2
    new-instance p1, Lj03;

    .line 73
    .line 74
    invoke-direct {p1}, Lj03;-><init>()V

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, Lya;->J:Law;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-instance v6, Lxv;

    .line 83
    .line 84
    invoke-direct {v6, v1}, Lxv;-><init>(Law;)V

    .line 85
    .line 86
    .line 87
    :goto_1
    iput-object p1, v0, Lwa;->n:Lj03;

    .line 88
    .line 89
    iput-object v6, v0, Lwa;->o:Lxv;

    .line 90
    .line 91
    iput v4, v0, Lwa;->r:I

    .line 92
    .line 93
    invoke-virtual {v6, v0}, Lxv;->b(Lwd0;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    if-ne v1, v5, :cond_5

    .line 98
    .line 99
    goto/16 :goto_6

    .line 100
    .line 101
    :cond_5
    move-object v9, v6

    .line 102
    move-object v6, p1

    .line 103
    move-object p1, v1

    .line 104
    move-object v1, v9

    .line 105
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_8

    .line 112
    .line 113
    invoke-virtual {v1}, Lxv;->c()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Lya;->v()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p1, :cond_7

    .line 121
    .line 122
    const-string p1, "Compose:semantics:boundUpdates"

    .line 123
    .line 124
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 125
    .line 126
    .line 127
    :try_start_3
    iget p1, v3, Lqi;->p:I

    .line 128
    .line 129
    const/4 v7, 0x0

    .line 130
    :goto_3
    if-ge v7, p1, :cond_6

    .line 131
    .line 132
    iget-object v8, v3, Lqi;->o:[Ljava/lang/Object;

    .line 133
    .line 134
    aget-object v8, v8, v7

    .line 135
    .line 136
    check-cast v8, Lc72;

    .line 137
    .line 138
    invoke-virtual {p0, v8, v6}, Lya;->I(Lc72;Lj03;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v8}, Lya;->J(Lc72;)V

    .line 142
    .line 143
    .line 144
    add-int/lit8 v7, v7, 0x1

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :catchall_1
    move-exception p0

    .line 148
    goto :goto_4

    .line 149
    :cond_6
    invoke-virtual {v6}, Lj03;->b()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 150
    .line 151
    .line 152
    :try_start_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 153
    .line 154
    .line 155
    iget-object p1, p0, Lya;->q:Lra;

    .line 156
    .line 157
    invoke-virtual {p1}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    iget-boolean v7, p0, Lya;->V:Z

    .line 162
    .line 163
    if-nez v7, :cond_7

    .line 164
    .line 165
    if-eqz p1, :cond_7

    .line 166
    .line 167
    iput-boolean v4, p0, Lya;->V:Z

    .line 168
    .line 169
    iget-object v7, p0, Lya;->X:La0;

    .line 170
    .line 171
    invoke-virtual {p1, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 172
    .line 173
    .line 174
    goto :goto_5

    .line 175
    :goto_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 176
    .line 177
    .line 178
    throw p0

    .line 179
    :cond_7
    :goto_5
    invoke-virtual {v3}, Lqi;->clear()V

    .line 180
    .line 181
    .line 182
    iget-object p1, p0, Lya;->C:Li03;

    .line 183
    .line 184
    invoke-virtual {p1}, Li03;->c()V

    .line 185
    .line 186
    .line 187
    iget-object p1, p0, Lya;->D:Li03;

    .line 188
    .line 189
    invoke-virtual {p1}, Li03;->c()V

    .line 190
    .line 191
    .line 192
    iget-wide v7, p0, Lya;->u:J

    .line 193
    .line 194
    iput-object v6, v0, Lwa;->n:Lj03;

    .line 195
    .line 196
    iput-object v1, v0, Lwa;->o:Lxv;

    .line 197
    .line 198
    iput v2, v0, Lwa;->r:I

    .line 199
    .line 200
    invoke-static {v7, v8, v0}, Lau0;->j(JLwd0;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 204
    if-ne p1, v5, :cond_1

    .line 205
    .line 206
    :goto_6
    return-object v5

    .line 207
    :cond_8
    invoke-virtual {v3}, Lqi;->clear()V

    .line 208
    .line 209
    .line 210
    sget-object p0, Lj15;->a:Lj15;

    .line 211
    .line 212
    return-object p0

    .line 213
    :goto_7
    invoke-virtual {v3}, Lqi;->clear()V

    .line 214
    .line 215
    .line 216
    throw p0
.end method

.method public final m(IJZ)Z
    .locals 21

    .line 1
    move-wide/from16 v0, p2

    .line 2
    .line 3
    move/from16 v2, p4

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-virtual {v3}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-static {v3, v4}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    :cond_0
    const/16 v16, 0x0

    .line 24
    .line 25
    goto/16 :goto_a

    .line 26
    .line 27
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lya;->s()Le02;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1, v5, v6}, Lg83;->b(JJ)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-nez v5, :cond_0

    .line 41
    .line 42
    const-wide v5, 0x7fffffff7fffffffL

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    and-long/2addr v5, v0

    .line 48
    const-wide v7, 0x7fffff007fffffL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    add-long/2addr v5, v7

    .line 54
    const-wide v7, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    and-long/2addr v5, v7

    .line 60
    const-wide/16 v7, 0x0

    .line 61
    .line 62
    cmp-long v5, v5, v7

    .line 63
    .line 64
    if-nez v5, :cond_0

    .line 65
    .line 66
    const/4 v5, 0x1

    .line 67
    if-ne v2, v5, :cond_2

    .line 68
    .line 69
    sget-object v2, Ln94;->v:Lp94;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    if-nez v2, :cond_11

    .line 73
    .line 74
    sget-object v2, Ln94;->u:Lp94;

    .line 75
    .line 76
    :goto_0
    iget-object v6, v3, Le02;->c:[Ljava/lang/Object;

    .line 77
    .line 78
    iget-object v3, v3, Le02;->a:[J

    .line 79
    .line 80
    array-length v7, v3

    .line 81
    add-int/lit8 v7, v7, -0x2

    .line 82
    .line 83
    if-ltz v7, :cond_0

    .line 84
    .line 85
    const/4 v8, 0x0

    .line 86
    const/4 v9, 0x0

    .line 87
    :goto_1
    aget-wide v10, v3, v8

    .line 88
    .line 89
    not-long v12, v10

    .line 90
    const/4 v14, 0x7

    .line 91
    shl-long/2addr v12, v14

    .line 92
    and-long/2addr v12, v10

    .line 93
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    and-long/2addr v12, v14

    .line 99
    cmp-long v12, v12, v14

    .line 100
    .line 101
    if-eqz v12, :cond_f

    .line 102
    .line 103
    sub-int v12, v8, v7

    .line 104
    .line 105
    not-int v12, v12

    .line 106
    ushr-int/lit8 v12, v12, 0x1f

    .line 107
    .line 108
    const/16 v13, 0x8

    .line 109
    .line 110
    rsub-int/lit8 v12, v12, 0x8

    .line 111
    .line 112
    const/4 v14, 0x0

    .line 113
    :goto_2
    if-ge v14, v12, :cond_d

    .line 114
    .line 115
    const-wide/16 v15, 0xff

    .line 116
    .line 117
    and-long/2addr v15, v10

    .line 118
    const-wide/16 v17, 0x80

    .line 119
    .line 120
    cmp-long v15, v15, v17

    .line 121
    .line 122
    if-gez v15, :cond_b

    .line 123
    .line 124
    shl-int/lit8 v15, v8, 0x3

    .line 125
    .line 126
    add-int/2addr v15, v14

    .line 127
    aget-object v15, v6, v15

    .line 128
    .line 129
    check-cast v15, Lk94;

    .line 130
    .line 131
    const/16 v16, 0x0

    .line 132
    .line 133
    iget-object v4, v15, Lk94;->b:Lk02;

    .line 134
    .line 135
    iget v5, v4, Lk02;->a:I

    .line 136
    .line 137
    int-to-float v5, v5

    .line 138
    move/from16 p4, v13

    .line 139
    .line 140
    iget v13, v4, Lk02;->b:I

    .line 141
    .line 142
    int-to-float v13, v13

    .line 143
    iget v0, v4, Lk02;->c:I

    .line 144
    .line 145
    int-to-float v0, v0

    .line 146
    iget v1, v4, Lk02;->d:I

    .line 147
    .line 148
    int-to-float v1, v1

    .line 149
    const/16 v4, 0x20

    .line 150
    .line 151
    move/from16 v17, v0

    .line 152
    .line 153
    move/from16 v18, v1

    .line 154
    .line 155
    shr-long v0, p2, v4

    .line 156
    .line 157
    long-to-int v0, v0

    .line 158
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    const-wide v19, 0xffffffffL

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    move v4, v0

    .line 168
    and-long v0, p2, v19

    .line 169
    .line 170
    long-to-int v0, v0

    .line 171
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    cmpl-float v1, v4, v5

    .line 176
    .line 177
    if-ltz v1, :cond_3

    .line 178
    .line 179
    const/4 v1, 0x1

    .line 180
    goto :goto_3

    .line 181
    :cond_3
    move/from16 v1, v16

    .line 182
    .line 183
    :goto_3
    cmpg-float v4, v4, v17

    .line 184
    .line 185
    if-gez v4, :cond_4

    .line 186
    .line 187
    const/4 v4, 0x1

    .line 188
    goto :goto_4

    .line 189
    :cond_4
    move/from16 v4, v16

    .line 190
    .line 191
    :goto_4
    and-int/2addr v1, v4

    .line 192
    cmpl-float v4, v0, v13

    .line 193
    .line 194
    if-ltz v4, :cond_5

    .line 195
    .line 196
    const/4 v4, 0x1

    .line 197
    goto :goto_5

    .line 198
    :cond_5
    move/from16 v4, v16

    .line 199
    .line 200
    :goto_5
    and-int/2addr v1, v4

    .line 201
    cmpg-float v0, v0, v18

    .line 202
    .line 203
    if-gez v0, :cond_6

    .line 204
    .line 205
    const/4 v0, 0x1

    .line 206
    goto :goto_6

    .line 207
    :cond_6
    move/from16 v0, v16

    .line 208
    .line 209
    :goto_6
    and-int/2addr v0, v1

    .line 210
    if-nez v0, :cond_7

    .line 211
    .line 212
    goto :goto_8

    .line 213
    :cond_7
    iget-object v0, v15, Lk94;->a:Li94;

    .line 214
    .line 215
    iget-object v0, v0, Li94;->d:Le94;

    .line 216
    .line 217
    iget-object v0, v0, Le94;->n:Lw03;

    .line 218
    .line 219
    invoke-virtual {v0, v2}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    if-nez v0, :cond_8

    .line 224
    .line 225
    const/4 v0, 0x0

    .line 226
    :cond_8
    check-cast v0, Lh64;

    .line 227
    .line 228
    if-nez v0, :cond_9

    .line 229
    .line 230
    goto :goto_8

    .line 231
    :cond_9
    iget-object v1, v0, Lh64;->a:Lv82;

    .line 232
    .line 233
    if-gez p1, :cond_a

    .line 234
    .line 235
    invoke-virtual {v1}, Lv82;->invoke()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    check-cast v0, Ljava/lang/Number;

    .line 240
    .line 241
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    const/4 v1, 0x0

    .line 246
    cmpl-float v0, v0, v1

    .line 247
    .line 248
    if-lez v0, :cond_c

    .line 249
    .line 250
    :goto_7
    const/4 v9, 0x1

    .line 251
    goto :goto_8

    .line 252
    :cond_a
    invoke-virtual {v1}, Lv82;->invoke()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    check-cast v1, Ljava/lang/Number;

    .line 257
    .line 258
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    iget-object v0, v0, Lh64;->b:Lv82;

    .line 263
    .line 264
    invoke-virtual {v0}, Lv82;->invoke()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    check-cast v0, Ljava/lang/Number;

    .line 269
    .line 270
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    cmpg-float v0, v1, v0

    .line 275
    .line 276
    if-gez v0, :cond_c

    .line 277
    .line 278
    goto :goto_7

    .line 279
    :cond_b
    move/from16 p4, v13

    .line 280
    .line 281
    const/16 v16, 0x0

    .line 282
    .line 283
    :cond_c
    :goto_8
    shr-long v10, v10, p4

    .line 284
    .line 285
    add-int/lit8 v14, v14, 0x1

    .line 286
    .line 287
    move-wide/from16 v0, p2

    .line 288
    .line 289
    move/from16 v13, p4

    .line 290
    .line 291
    const/4 v5, 0x1

    .line 292
    goto/16 :goto_2

    .line 293
    .line 294
    :cond_d
    move v0, v13

    .line 295
    const/16 v16, 0x0

    .line 296
    .line 297
    if-ne v12, v0, :cond_e

    .line 298
    .line 299
    goto :goto_9

    .line 300
    :cond_e
    return v9

    .line 301
    :cond_f
    const/16 v16, 0x0

    .line 302
    .line 303
    :goto_9
    if-eq v8, v7, :cond_10

    .line 304
    .line 305
    add-int/lit8 v8, v8, 0x1

    .line 306
    .line 307
    move-wide/from16 v0, p2

    .line 308
    .line 309
    const/4 v5, 0x1

    .line 310
    goto/16 :goto_1

    .line 311
    .line 312
    :cond_10
    return v9

    .line 313
    :cond_11
    const/16 v16, 0x0

    .line 314
    .line 315
    invoke-static {}, Ler1;->n()V

    .line 316
    .line 317
    .line 318
    :goto_a
    return v16
.end method

.method public final n()V
    .locals 2

    .line 1
    const-string v0, "Compose:semantics:sendAccessibilitySemanticsStructureChangeEvents"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Lya;->v()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lya;->q:Lra;

    .line 13
    .line 14
    invoke-virtual {v0}, Lra;->getSemanticsOwner()Ll94;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ll94;->a()Li94;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lya;->U:Lj94;

    .line 23
    .line 24
    invoke-virtual {p0, v0, v1}, Lya;->B(Li94;Lj94;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 28
    .line 29
    .line 30
    const-string v0, "Compose:semantics:sendSemanticsPropertyChangeEvents"

    .line 31
    .line 32
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :try_start_1
    invoke-virtual {p0}, Lya;->s()Le02;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0, v0}, Lya;->H(Le02;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    .line 41
    .line 42
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 43
    .line 44
    .line 45
    const-string v0, "Compose:semantics:updateSemanticsNodesCopyAndPanes"

    .line 46
    .line 47
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :try_start_2
    invoke-virtual {p0}, Lya;->Q()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    .line 52
    .line 53
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 59
    .line 60
    .line 61
    throw p0

    .line 62
    :catchall_1
    move-exception p0

    .line 63
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 64
    .line 65
    .line 66
    throw p0

    .line 67
    :catchall_2
    move-exception p0

    .line 68
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 69
    .line 70
    .line 71
    throw p0
.end method

.method public final o(II)Landroid/view/accessibility/AccessibilityEvent;
    .locals 2

    .line 1
    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setEnabled(Z)V

    .line 7
    .line 8
    .line 9
    const-string v0, "android.view.View"

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lya;->q:Lra;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, v0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setSource(Landroid/view/View;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lya;->v()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Lya;->s()Le02;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0, p1}, Le02;->b(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lk94;

    .line 45
    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    iget-object p0, p0, Lk94;->a:Li94;

    .line 49
    .line 50
    iget-object p1, p0, Li94;->d:Le94;

    .line 51
    .line 52
    sget-object v0, Ln94;->J:Lp94;

    .line 53
    .line 54
    iget-object p1, p1, Le94;->n:Lw03;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lw03;->c(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setPassword(Z)V

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, Li94;->d:Le94;

    .line 64
    .line 65
    sget-object p1, Ln94;->n:Lp94;

    .line 66
    .line 67
    iget-object p0, p0, Le94;->n:Lw03;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    if-nez p0, :cond_0

    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    :cond_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-static {p0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 83
    .line 84
    const/16 v0, 0x22

    .line 85
    .line 86
    if-lt p1, v0, :cond_1

    .line 87
    .line 88
    invoke-static {p2, p0}, La3;->m(Landroid/view/accessibility/AccessibilityEvent;Z)V

    .line 89
    .line 90
    .line 91
    :cond_1
    return-object p2
.end method

.method public final onAccessibilityStateChanged(Z)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lya;->v:Ljava/util/List;

    .line 3
    .line 4
    return-void
.end method

.method public final onTouchExplorationStateChanged(Z)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lya;->v:Ljava/util/List;

    .line 3
    .line 4
    return-void
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lya;->t:Landroid/view/accessibility/AccessibilityManager;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lya;->v:Ljava/util/List;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityManager;->addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lya;->q:Lra;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lya;->X:La0;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lya;->t:Landroid/view/accessibility/AccessibilityManager;

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityManager;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final p(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;
    .locals 1

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lya;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    if-eqz p3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    if-eqz p4, :cond_2

    .line 26
    .line 27
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    .line 32
    .line 33
    .line 34
    :cond_2
    if-eqz p5, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p1, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_3
    return-object p0
.end method

.method public final q(Li94;)I
    .locals 2

    .line 1
    iget-object p1, p1, Li94;->d:Le94;

    .line 2
    .line 3
    sget-object v0, Ln94;->a:Lp94;

    .line 4
    .line 5
    iget-object v1, p1, Le94;->n:Lw03;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lw03;->c(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Ln94;->E:Lp94;

    .line 14
    .line 15
    iget-object v1, p1, Le94;->n:Lw03;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lw03;->c(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Le94;->d(Lp94;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lss4;

    .line 28
    .line 29
    iget-wide p0, p0, Lss4;->a:J

    .line 30
    .line 31
    const-wide v0, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr p0, v0

    .line 37
    long-to-int p0, p0

    .line 38
    return p0

    .line 39
    :cond_0
    iget p0, p0, Lya;->G:I

    .line 40
    .line 41
    return p0
.end method

.method public final r(Li94;)I
    .locals 2

    .line 1
    iget-object p1, p1, Li94;->d:Le94;

    .line 2
    .line 3
    sget-object v0, Ln94;->a:Lp94;

    .line 4
    .line 5
    iget-object v1, p1, Le94;->n:Lw03;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lw03;->c(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Ln94;->E:Lp94;

    .line 14
    .line 15
    iget-object v1, p1, Le94;->n:Lw03;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lw03;->c(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Le94;->d(Lp94;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lss4;

    .line 28
    .line 29
    iget-wide p0, p0, Lss4;->a:J

    .line 30
    .line 31
    const/16 v0, 0x20

    .line 32
    .line 33
    shr-long/2addr p0, v0

    .line 34
    long-to-int p0, p0

    .line 35
    return p0

    .line 36
    :cond_0
    iget p0, p0, Lya;->G:I

    .line 37
    .line 38
    return p0
.end method

.method public final s()Le02;
    .locals 7

    .line 1
    iget-boolean v0, p0, Lya;->K:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lya;->K:Z

    .line 7
    .line 8
    iget-object v1, p0, Lya;->q:Lra;

    .line 9
    .line 10
    invoke-virtual {v1}, Lra;->getSemanticsOwner()Ll94;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v3, Lk2;

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    invoke-direct {v3, v4, v0}, Lk2;-><init>(IB)V

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v3}, Lwr1;->o(Ll94;Lif1;)Li03;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lya;->M:Li03;

    .line 25
    .line 26
    invoke-virtual {p0}, Lya;->v()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lya;->M:Li03;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v2, p0, Lya;->O:Lg03;

    .line 43
    .line 44
    invoke-virtual {v2}, Lg03;->a()V

    .line 45
    .line 46
    .line 47
    iget-object v3, p0, Lya;->P:Lg03;

    .line 48
    .line 49
    invoke-virtual {v3}, Lg03;->a()V

    .line 50
    .line 51
    .line 52
    const/4 v4, -0x1

    .line 53
    invoke-virtual {v0, v4}, Le02;->b(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    check-cast v4, Lk94;

    .line 58
    .line 59
    if-eqz v4, :cond_0

    .line 60
    .line 61
    iget-object v4, v4, Lk94;->a:Li94;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const/4 v4, 0x0

    .line 65
    :goto_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance v5, Lx;

    .line 69
    .line 70
    const/4 v6, 0x5

    .line 71
    invoke-direct {v5, v6, v0}, Lx;-><init>(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    new-instance v0, Lx;

    .line 75
    .line 76
    const/4 v6, 0x6

    .line 77
    invoke-direct {v0, v6, v1}, Lx;-><init>(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v4}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {v4, v5, v0, v1}, Lr94;->b(Li94;Lx;Lx;Ljava/util/List;)Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    const/4 v4, 0x1

    .line 93
    sub-int/2addr v1, v4

    .line 94
    if-gt v4, v1, :cond_1

    .line 95
    .line 96
    :goto_1
    add-int/lit8 v5, v4, -0x1

    .line 97
    .line 98
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    check-cast v5, Li94;

    .line 103
    .line 104
    iget v5, v5, Li94;->f:I

    .line 105
    .line 106
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    check-cast v6, Li94;

    .line 111
    .line 112
    iget v6, v6, Li94;->f:I

    .line 113
    .line 114
    invoke-virtual {v2, v5, v6}, Lg03;->f(II)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, v6, v5}, Lg03;->f(II)V

    .line 118
    .line 119
    .line 120
    if-eq v4, v1, :cond_1

    .line 121
    .line 122
    add-int/lit8 v4, v4, 0x1

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_1
    iget-object p0, p0, Lya;->M:Li03;

    .line 126
    .line 127
    return-object p0
.end method

.method public final u(Li94;Landroid/graphics/Rect;Lac4;)Lwv3;
    .locals 9

    .line 1
    new-instance v0, Lxa;

    .line 2
    .line 3
    invoke-direct {v0, p3}, Lxa;-><init>(Lac4;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Li94;->c:Lc72;

    .line 7
    .line 8
    iget-object p3, p1, Lc72;->Q:Lw12;

    .line 9
    .line 10
    iget-object p3, p3, Lw12;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p3, Lcx2;

    .line 13
    .line 14
    iget v1, p3, Lcx2;->q:I

    .line 15
    .line 16
    and-int/lit8 v1, v1, 0x8

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x1

    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v1, :cond_8

    .line 22
    .line 23
    :goto_0
    if-eqz p3, :cond_8

    .line 24
    .line 25
    iget v1, p3, Lcx2;->p:I

    .line 26
    .line 27
    and-int/lit8 v1, v1, 0x8

    .line 28
    .line 29
    if-eqz v1, :cond_7

    .line 30
    .line 31
    move-object v1, p3

    .line 32
    move-object v5, v2

    .line 33
    :goto_1
    if-eqz v1, :cond_7

    .line 34
    .line 35
    instance-of v6, v1, Lg94;

    .line 36
    .line 37
    if-eqz v6, :cond_0

    .line 38
    .line 39
    move-object v6, v1

    .line 40
    check-cast v6, Lg94;

    .line 41
    .line 42
    invoke-interface {v6, v0}, Lg94;->c0(Lq94;)V

    .line 43
    .line 44
    .line 45
    iget-boolean v6, v0, Lxa;->n:Z

    .line 46
    .line 47
    if-eqz v6, :cond_6

    .line 48
    .line 49
    move-object v2, v1

    .line 50
    goto :goto_4

    .line 51
    :cond_0
    iget v6, v1, Lcx2;->p:I

    .line 52
    .line 53
    and-int/lit8 v6, v6, 0x8

    .line 54
    .line 55
    if-eqz v6, :cond_6

    .line 56
    .line 57
    instance-of v6, v1, Lfo0;

    .line 58
    .line 59
    if-eqz v6, :cond_6

    .line 60
    .line 61
    move-object v6, v1

    .line 62
    check-cast v6, Lfo0;

    .line 63
    .line 64
    iget-object v6, v6, Lfo0;->C:Lcx2;

    .line 65
    .line 66
    move v7, v4

    .line 67
    :goto_2
    if-eqz v6, :cond_5

    .line 68
    .line 69
    iget v8, v6, Lcx2;->p:I

    .line 70
    .line 71
    and-int/lit8 v8, v8, 0x8

    .line 72
    .line 73
    if-eqz v8, :cond_4

    .line 74
    .line 75
    add-int/lit8 v7, v7, 0x1

    .line 76
    .line 77
    if-ne v7, v3, :cond_1

    .line 78
    .line 79
    move-object v1, v6

    .line 80
    goto :goto_3

    .line 81
    :cond_1
    if-nez v5, :cond_2

    .line 82
    .line 83
    new-instance v5, Lf13;

    .line 84
    .line 85
    const/16 v8, 0x10

    .line 86
    .line 87
    new-array v8, v8, [Lcx2;

    .line 88
    .line 89
    invoke-direct {v5, v8}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    if-eqz v1, :cond_3

    .line 93
    .line 94
    invoke-virtual {v5, v1}, Lf13;->b(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    move-object v1, v2

    .line 98
    :cond_3
    invoke-virtual {v5, v6}, Lf13;->b(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_4
    :goto_3
    iget-object v6, v6, Lcx2;->s:Lcx2;

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    if-ne v7, v3, :cond_6

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_6
    invoke-static {v5}, Lj51;->c(Lf13;)Lcx2;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    goto :goto_1

    .line 112
    :cond_7
    iget v1, p3, Lcx2;->q:I

    .line 113
    .line 114
    and-int/lit8 v1, v1, 0x8

    .line 115
    .line 116
    if-eqz v1, :cond_8

    .line 117
    .line 118
    iget-object p3, p3, Lcx2;->s:Lcx2;

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_8
    :goto_4
    check-cast v2, Lg94;

    .line 122
    .line 123
    if-eqz v2, :cond_9

    .line 124
    .line 125
    move-object p3, v2

    .line 126
    check-cast p3, Lcx2;

    .line 127
    .line 128
    iget-object p3, p3, Lcx2;->n:Lcx2;

    .line 129
    .line 130
    iget-boolean p3, p3, Lcx2;->A:Z

    .line 131
    .line 132
    if-ne p3, v3, :cond_9

    .line 133
    .line 134
    invoke-static {v2}, Lj51;->N(Leo0;)Lf63;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {p1}, Lwr1;->n(Lq62;)Lq62;

    .line 139
    .line 140
    .line 141
    move-result-object p3

    .line 142
    invoke-interface {p3, p1, v4}, Lq62;->C(Lq62;Z)Lwv3;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    iget p3, p1, Lwv3;->a:F

    .line 147
    .line 148
    iget v0, p1, Lwv3;->b:F

    .line 149
    .line 150
    iget v1, p1, Lwv3;->c:F

    .line 151
    .line 152
    iget p1, p1, Lwv3;->d:F

    .line 153
    .line 154
    invoke-virtual {p0, p3, v0, v1, p1}, Lya;->M(FFFF)Landroid/graphics/Rect;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    iget p1, p0, Landroid/graphics/Rect;->left:I

    .line 159
    .line 160
    iget p3, p2, Landroid/graphics/Rect;->left:I

    .line 161
    .line 162
    sub-int/2addr p1, p3

    .line 163
    int-to-float p1, p1

    .line 164
    iget p3, p0, Landroid/graphics/Rect;->top:I

    .line 165
    .line 166
    iget p2, p2, Landroid/graphics/Rect;->top:I

    .line 167
    .line 168
    sub-int/2addr p3, p2

    .line 169
    int-to-float p2, p3

    .line 170
    new-instance p3, Lwv3;

    .line 171
    .line 172
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    int-to-float v0, v0

    .line 177
    add-float/2addr v0, p1

    .line 178
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    int-to-float p0, p0

    .line 183
    add-float/2addr p0, p2

    .line 184
    invoke-direct {p3, p1, p2, v0, p0}, Lwv3;-><init>(FFFF)V

    .line 185
    .line 186
    .line 187
    return-object p3

    .line 188
    :cond_9
    iget-object p0, p1, Lc72;->Q:Lw12;

    .line 189
    .line 190
    iget-object p0, p0, Lw12;->e:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast p0, Lf63;

    .line 193
    .line 194
    invoke-static {p0, v4}, Lwr1;->d(Lq62;Z)Lwv3;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    return-object p0
.end method

.method public final v()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lya;->t:Landroid/view/accessibility/AccessibilityManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, Lya;->v:Ljava/util/List;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iput-object v1, p0, Lya;->v:Ljava/util/List;

    .line 19
    .line 20
    :cond_0
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public final w(Lc72;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lya;->I:Lqi;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lqi;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lya;->J:Law;

    .line 10
    .line 11
    sget-object p1, Lj15;->a:Lj15;

    .line 12
    .line 13
    invoke-interface {p0, p1}, Ly94;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
