.class public final Ley;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lu91;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lnh2;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const v1, 0x7f040342

    .line 11
    .line 12
    .line 13
    invoke-static {v1, p1, v0}, Lzz1;->F(ILandroid/content/Context;Ljava/lang/String;)Landroid/util/TypedValue;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 18
    .line 19
    sget-object v1, Lht3;->x:[I

    .line 20
    .line 21
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x4

    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {p1, v1}, Lc6;->f(Landroid/content/Context;I)Lc6;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iput-object v1, p0, Ley;->a:Ljava/lang/Object;

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {p1, v1}, Lc6;->f(Landroid/content/Context;I)Lc6;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iput-object v1, p0, Ley;->g:Ljava/lang/Object;

    .line 47
    .line 48
    const/4 v1, 0x3

    .line 49
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-static {p1, v1}, Lc6;->f(Landroid/content/Context;I)Lc6;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iput-object v1, p0, Ley;->b:Ljava/lang/Object;

    .line 58
    .line 59
    const/4 v1, 0x5

    .line 60
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-static {p1, v1}, Lc6;->f(Landroid/content/Context;I)Lc6;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iput-object v1, p0, Ley;->c:Ljava/lang/Object;

    .line 69
    .line 70
    const/4 v1, 0x7

    .line 71
    invoke-static {p1, v0, v1}, Lh12;->s(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    const/16 v3, 0x9

    .line 76
    .line 77
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-static {p1, v3}, Lc6;->f(Landroid/content/Context;I)Lc6;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    iput-object v3, p0, Ley;->d:Ljava/lang/Object;

    .line 86
    .line 87
    const/16 v3, 0x8

    .line 88
    .line 89
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    invoke-static {p1, v3}, Lc6;->f(Landroid/content/Context;I)Lc6;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    iput-object v3, p0, Ley;->e:Ljava/lang/Object;

    .line 98
    .line 99
    const/16 v3, 0xa

    .line 100
    .line 101
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    invoke-static {p1, v2}, Lc6;->f(Landroid/content/Context;I)Lc6;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iput-object p1, p0, Ley;->f:Ljava/lang/Object;

    .line 110
    .line 111
    new-instance p1, Landroid/graphics/Paint;

    .line 112
    .line 113
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 114
    .line 115
    .line 116
    iput-object p1, p0, Ley;->h:Ljava/lang/Object;

    .line 117
    .line 118
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    invoke-virtual {p1, p0}, Landroid/graphics/Paint;->setColor(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/LinearLayout;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 0

    .line 154
    iput-object p2, p0, Ley;->a:Ljava/lang/Object;

    iput-object p3, p0, Ley;->b:Ljava/lang/Object;

    iput-object p4, p0, Ley;->c:Ljava/lang/Object;

    iput-object p5, p0, Ley;->d:Ljava/lang/Object;

    iput-object p6, p0, Ley;->e:Ljava/lang/Object;

    iput-object p7, p0, Ley;->f:Ljava/lang/Object;

    iput-object p8, p0, Ley;->g:Ljava/lang/Object;

    iput-object p9, p0, Ley;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroidx/compose/ui/platform/ComposeView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/Button;)V
    .locals 0

    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 139
    iput-object p1, p0, Ley;->a:Ljava/lang/Object;

    .line 140
    iput-object p2, p0, Ley;->b:Ljava/lang/Object;

    .line 141
    iput-object p3, p0, Ley;->c:Ljava/lang/Object;

    .line 142
    iput-object p4, p0, Ley;->d:Ljava/lang/Object;

    .line 143
    iput-object p5, p0, Ley;->e:Ljava/lang/Object;

    .line 144
    iput-object p6, p0, Ley;->f:Ljava/lang/Object;

    .line 145
    iput-object p8, p0, Ley;->g:Ljava/lang/Object;

    .line 146
    iput-object p9, p0, Ley;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;Landroid/widget/CheckBox;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;)V
    .locals 0

    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 130
    iput-object p1, p0, Ley;->a:Ljava/lang/Object;

    .line 131
    iput-object p2, p0, Ley;->b:Ljava/lang/Object;

    .line 132
    iput-object p3, p0, Ley;->c:Ljava/lang/Object;

    .line 133
    iput-object p4, p0, Ley;->d:Ljava/lang/Object;

    .line 134
    iput-object p5, p0, Ley;->e:Ljava/lang/Object;

    .line 135
    iput-object p6, p0, Ley;->f:Ljava/lang/Object;

    .line 136
    iput-object p7, p0, Ley;->g:Ljava/lang/Object;

    .line 137
    iput-object p8, p0, Ley;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lra;Lra;)V
    .locals 3

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 148
    iput-object p1, p0, Ley;->a:Ljava/lang/Object;

    .line 149
    iput-object p2, p0, Ley;->b:Ljava/lang/Object;

    .line 150
    new-instance p1, Lba1;

    const/4 v0, 0x0

    const/16 v1, 0xe

    const/4 v2, 0x2

    invoke-direct {p1, v2, v0, v1}, Lba1;-><init>(ILwf1;I)V

    iput-object p1, p0, Ley;->c:Ljava/lang/Object;

    .line 151
    new-instance p1, Ls91;

    invoke-direct {p1, p0, p2}, Ls91;-><init>(Ley;Lra;)V

    iput-object p1, p0, Ley;->d:Ljava/lang/Object;

    .line 152
    new-instance p1, Lw91;

    invoke-direct {p1, p0}, Lw91;-><init>(Ley;)V

    iput-object p1, p0, Ley;->e:Ljava/lang/Object;

    .line 153
    new-instance p1, Lq03;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lq03;-><init>(I)V

    iput-object p1, p0, Ley;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Z)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Ley;->f()Lba1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_6

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Ley;->f()Lba1;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, v1}, Ley;->h(Lba1;)V

    .line 16
    .line 17
    .line 18
    if-eqz p1, :cond_c

    .line 19
    .line 20
    sget-object p0, Lz91;->n:Lz91;

    .line 21
    .line 22
    sget-object v2, Lz91;->p:Lz91;

    .line 23
    .line 24
    invoke-virtual {p1, p0, v2}, Lba1;->r0(Lz91;Lz91;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p1, Lcx2;->n:Lcx2;

    .line 28
    .line 29
    iget-boolean p0, p0, Lcx2;->A:Z

    .line 30
    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    const-string p0, "visitAncestors called on an unattached node"

    .line 34
    .line 35
    invoke-static {p0}, Lcz1;->b(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object p0, p1, Lcx2;->n:Lcx2;

    .line 39
    .line 40
    iget-object p0, p0, Lcx2;->r:Lcx2;

    .line 41
    .line 42
    invoke-static {p1}, Lj51;->O(Leo0;)Lc72;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :goto_0
    if-eqz p1, :cond_c

    .line 47
    .line 48
    iget-object v3, p1, Lc72;->Q:Lw12;

    .line 49
    .line 50
    iget-object v3, v3, Lw12;->g:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v3, Lcx2;

    .line 53
    .line 54
    iget v3, v3, Lcx2;->q:I

    .line 55
    .line 56
    and-int/lit16 v3, v3, 0x400

    .line 57
    .line 58
    if-eqz v3, :cond_a

    .line 59
    .line 60
    :goto_1
    if-eqz p0, :cond_a

    .line 61
    .line 62
    iget v3, p0, Lcx2;->p:I

    .line 63
    .line 64
    and-int/lit16 v3, v3, 0x400

    .line 65
    .line 66
    if-eqz v3, :cond_9

    .line 67
    .line 68
    move-object v3, p0

    .line 69
    move-object v4, v1

    .line 70
    :goto_2
    if-eqz v3, :cond_9

    .line 71
    .line 72
    instance-of v5, v3, Lba1;

    .line 73
    .line 74
    if-eqz v5, :cond_2

    .line 75
    .line 76
    check-cast v3, Lba1;

    .line 77
    .line 78
    sget-object v5, Lz91;->o:Lz91;

    .line 79
    .line 80
    invoke-virtual {v3, v5, v2}, Lba1;->r0(Lz91;Lz91;)V

    .line 81
    .line 82
    .line 83
    goto :goto_5

    .line 84
    :cond_2
    iget v5, v3, Lcx2;->p:I

    .line 85
    .line 86
    and-int/lit16 v5, v5, 0x400

    .line 87
    .line 88
    if-eqz v5, :cond_8

    .line 89
    .line 90
    instance-of v5, v3, Lfo0;

    .line 91
    .line 92
    if-eqz v5, :cond_8

    .line 93
    .line 94
    move-object v5, v3

    .line 95
    check-cast v5, Lfo0;

    .line 96
    .line 97
    iget-object v5, v5, Lfo0;->C:Lcx2;

    .line 98
    .line 99
    const/4 v6, 0x0

    .line 100
    :goto_3
    if-eqz v5, :cond_7

    .line 101
    .line 102
    iget v7, v5, Lcx2;->p:I

    .line 103
    .line 104
    and-int/lit16 v7, v7, 0x400

    .line 105
    .line 106
    if-eqz v7, :cond_6

    .line 107
    .line 108
    add-int/lit8 v6, v6, 0x1

    .line 109
    .line 110
    if-ne v6, v0, :cond_3

    .line 111
    .line 112
    move-object v3, v5

    .line 113
    goto :goto_4

    .line 114
    :cond_3
    if-nez v4, :cond_4

    .line 115
    .line 116
    new-instance v4, Lf13;

    .line 117
    .line 118
    const/16 v7, 0x10

    .line 119
    .line 120
    new-array v7, v7, [Lcx2;

    .line 121
    .line 122
    invoke-direct {v4, v7}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :cond_4
    if-eqz v3, :cond_5

    .line 126
    .line 127
    invoke-virtual {v4, v3}, Lf13;->b(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    move-object v3, v1

    .line 131
    :cond_5
    invoke-virtual {v4, v5}, Lf13;->b(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_6
    :goto_4
    iget-object v5, v5, Lcx2;->s:Lcx2;

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_7
    if-ne v6, v0, :cond_8

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_8
    :goto_5
    invoke-static {v4}, Lj51;->c(Lf13;)Lcx2;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    goto :goto_2

    .line 145
    :cond_9
    iget-object p0, p0, Lcx2;->r:Lcx2;

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_a
    invoke-virtual {p1}, Lc72;->t()Lc72;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    if-eqz p1, :cond_b

    .line 153
    .line 154
    iget-object p0, p1, Lc72;->Q:Lw12;

    .line 155
    .line 156
    if-eqz p0, :cond_b

    .line 157
    .line 158
    iget-object p0, p0, Lw12;->f:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p0, Lsq4;

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_b
    move-object p0, v1

    .line 164
    goto :goto_0

    .line 165
    :cond_c
    :goto_6
    return v0
.end method

.method public b(IZZ)Z
    .locals 1

    .line 1
    const/4 p1, 0x1

    .line 2
    if-nez p2, :cond_3

    .line 3
    .line 4
    iget-object v0, p0, Ley;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lba1;

    .line 7
    .line 8
    invoke-static {v0}, Luc5;->M(Lba1;)Lug0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    if-eq v0, p1, :cond_1

    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    if-eq v0, p1, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x3

    .line 25
    if-ne v0, p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {}, Ler1;->n()V

    .line 29
    .line 30
    .line 31
    return p2

    .line 32
    :cond_1
    :goto_0
    move p1, p2

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    invoke-virtual {p0, p2}, Ley;->a(Z)Z

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_3
    invoke-virtual {p0, p2}, Ley;->a(Z)Z

    .line 39
    .line 40
    .line 41
    :goto_1
    if-eqz p1, :cond_4

    .line 42
    .line 43
    if-eqz p3, :cond_4

    .line 44
    .line 45
    invoke-virtual {p0}, Ley;->c()V

    .line 46
    .line 47
    .line 48
    :cond_4
    return p1
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object p0, p0, Ley;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lra;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_3

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->clearFocus()V

    .line 34
    .line 35
    .line 36
    :cond_2
    return-void

    .line 37
    :cond_3
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->clearFocus()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public d(Landroid/view/KeyEvent;Lgf1;)Z
    .locals 12

    .line 1
    iget-object v0, p0, Ley;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lba1;

    .line 4
    .line 5
    const-string v1, "FocusOwnerImpl:dispatchKeyEvent"

    .line 6
    .line 7
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget-object v1, p0, Ley;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ls91;

    .line 13
    .line 14
    iget-boolean v1, v1, Ls91;->e:Z

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const-string p0, "FocusRelatedWarning: Dispatching key event while focus system is invalidated."

    .line 20
    .line 21
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 27
    .line 28
    .line 29
    return v2

    .line 30
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Ley;->i(Landroid/view/KeyEvent;)Z

    .line 31
    .line 32
    .line 33
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    if-nez p0, :cond_1

    .line 35
    .line 36
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 37
    .line 38
    .line 39
    return v2

    .line 40
    :cond_1
    :try_start_2
    invoke-static {v0}, Lte5;->p(Lba1;)Lba1;

    .line 41
    .line 42
    .line 43
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    const-string v1, "visitAncestors called on an unattached node"

    .line 45
    .line 46
    const/16 v3, 0x10

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    const/4 v5, 0x1

    .line 50
    if-eqz p0, :cond_7

    .line 51
    .line 52
    :try_start_3
    iget-object v6, p0, Lcx2;->n:Lcx2;

    .line 53
    .line 54
    iget-boolean v6, v6, Lcx2;->A:Z

    .line 55
    .line 56
    if-nez v6, :cond_2

    .line 57
    .line 58
    const-string v6, "visitLocalDescendants called on an unattached node"

    .line 59
    .line 60
    invoke-static {v6}, Lcz1;->b(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    iget-object v6, p0, Lcx2;->n:Lcx2;

    .line 64
    .line 65
    iget v7, v6, Lcx2;->q:I

    .line 66
    .line 67
    and-int/lit16 v7, v7, 0x2400

    .line 68
    .line 69
    if-eqz v7, :cond_5

    .line 70
    .line 71
    iget-object v6, v6, Lcx2;->s:Lcx2;

    .line 72
    .line 73
    move-object v7, v4

    .line 74
    :goto_0
    if-eqz v6, :cond_6

    .line 75
    .line 76
    iget v8, v6, Lcx2;->p:I

    .line 77
    .line 78
    and-int/lit16 v9, v8, 0x2400

    .line 79
    .line 80
    if-eqz v9, :cond_4

    .line 81
    .line 82
    and-int/lit16 v8, v8, 0x400

    .line 83
    .line 84
    if-eqz v8, :cond_3

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    move-object v7, v6

    .line 88
    :cond_4
    iget-object v6, v6, Lcx2;->s:Lcx2;

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    move-object v7, v4

    .line 92
    :cond_6
    :goto_1
    if-nez v7, :cond_22

    .line 93
    .line 94
    :cond_7
    if-eqz p0, :cond_14

    .line 95
    .line 96
    iget-object v6, p0, Lcx2;->n:Lcx2;

    .line 97
    .line 98
    iget-boolean v6, v6, Lcx2;->A:Z

    .line 99
    .line 100
    if-nez v6, :cond_8

    .line 101
    .line 102
    invoke-static {v1}, Lcz1;->b(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :cond_8
    iget-object v6, p0, Lcx2;->n:Lcx2;

    .line 106
    .line 107
    invoke-static {p0}, Lj51;->O(Leo0;)Lc72;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    :goto_2
    if-eqz p0, :cond_13

    .line 112
    .line 113
    iget-object v7, p0, Lc72;->Q:Lw12;

    .line 114
    .line 115
    iget-object v7, v7, Lw12;->g:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v7, Lcx2;

    .line 118
    .line 119
    iget v7, v7, Lcx2;->q:I

    .line 120
    .line 121
    and-int/lit16 v7, v7, 0x2000

    .line 122
    .line 123
    if-eqz v7, :cond_11

    .line 124
    .line 125
    :goto_3
    if-eqz v6, :cond_11

    .line 126
    .line 127
    iget v7, v6, Lcx2;->p:I

    .line 128
    .line 129
    and-int/lit16 v7, v7, 0x2000

    .line 130
    .line 131
    if-eqz v7, :cond_10

    .line 132
    .line 133
    move-object v8, v4

    .line 134
    move-object v7, v6

    .line 135
    :goto_4
    if-eqz v7, :cond_10

    .line 136
    .line 137
    instance-of v9, v7, Lj42;

    .line 138
    .line 139
    if-eqz v9, :cond_9

    .line 140
    .line 141
    goto :goto_7

    .line 142
    :cond_9
    iget v9, v7, Lcx2;->p:I

    .line 143
    .line 144
    and-int/lit16 v9, v9, 0x2000

    .line 145
    .line 146
    if-eqz v9, :cond_f

    .line 147
    .line 148
    instance-of v9, v7, Lfo0;

    .line 149
    .line 150
    if-eqz v9, :cond_f

    .line 151
    .line 152
    move-object v9, v7

    .line 153
    check-cast v9, Lfo0;

    .line 154
    .line 155
    iget-object v9, v9, Lfo0;->C:Lcx2;

    .line 156
    .line 157
    move v10, v2

    .line 158
    :goto_5
    if-eqz v9, :cond_e

    .line 159
    .line 160
    iget v11, v9, Lcx2;->p:I

    .line 161
    .line 162
    and-int/lit16 v11, v11, 0x2000

    .line 163
    .line 164
    if-eqz v11, :cond_d

    .line 165
    .line 166
    add-int/lit8 v10, v10, 0x1

    .line 167
    .line 168
    if-ne v10, v5, :cond_a

    .line 169
    .line 170
    move-object v7, v9

    .line 171
    goto :goto_6

    .line 172
    :cond_a
    if-nez v8, :cond_b

    .line 173
    .line 174
    new-instance v8, Lf13;

    .line 175
    .line 176
    new-array v11, v3, [Lcx2;

    .line 177
    .line 178
    invoke-direct {v8, v11}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_b
    if-eqz v7, :cond_c

    .line 182
    .line 183
    invoke-virtual {v8, v7}, Lf13;->b(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    move-object v7, v4

    .line 187
    :cond_c
    invoke-virtual {v8, v9}, Lf13;->b(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :cond_d
    :goto_6
    iget-object v9, v9, Lcx2;->s:Lcx2;

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_e
    if-ne v10, v5, :cond_f

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_f
    invoke-static {v8}, Lj51;->c(Lf13;)Lcx2;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    goto :goto_4

    .line 201
    :cond_10
    iget-object v6, v6, Lcx2;->r:Lcx2;

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_11
    invoke-virtual {p0}, Lc72;->t()Lc72;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    if-eqz p0, :cond_12

    .line 209
    .line 210
    iget-object v6, p0, Lc72;->Q:Lw12;

    .line 211
    .line 212
    if-eqz v6, :cond_12

    .line 213
    .line 214
    iget-object v6, v6, Lw12;->f:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v6, Lsq4;

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_12
    move-object v6, v4

    .line 220
    goto :goto_2

    .line 221
    :cond_13
    move-object v7, v4

    .line 222
    :goto_7
    check-cast v7, Lj42;

    .line 223
    .line 224
    if-eqz v7, :cond_14

    .line 225
    .line 226
    check-cast v7, Lcx2;

    .line 227
    .line 228
    iget-object v7, v7, Lcx2;->n:Lcx2;

    .line 229
    .line 230
    goto/16 :goto_e

    .line 231
    .line 232
    :cond_14
    iget-object p0, v0, Lcx2;->n:Lcx2;

    .line 233
    .line 234
    iget-boolean p0, p0, Lcx2;->A:Z

    .line 235
    .line 236
    if-nez p0, :cond_15

    .line 237
    .line 238
    invoke-static {v1}, Lcz1;->b(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    :cond_15
    iget-object p0, v0, Lcx2;->n:Lcx2;

    .line 242
    .line 243
    iget-object p0, p0, Lcx2;->r:Lcx2;

    .line 244
    .line 245
    invoke-static {v0}, Lj51;->O(Leo0;)Lc72;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    :goto_8
    if-eqz v0, :cond_20

    .line 250
    .line 251
    iget-object v6, v0, Lc72;->Q:Lw12;

    .line 252
    .line 253
    iget-object v6, v6, Lw12;->g:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v6, Lcx2;

    .line 256
    .line 257
    iget v6, v6, Lcx2;->q:I

    .line 258
    .line 259
    and-int/lit16 v6, v6, 0x2000

    .line 260
    .line 261
    if-eqz v6, :cond_1e

    .line 262
    .line 263
    :goto_9
    if-eqz p0, :cond_1e

    .line 264
    .line 265
    iget v6, p0, Lcx2;->p:I

    .line 266
    .line 267
    and-int/lit16 v6, v6, 0x2000

    .line 268
    .line 269
    if-eqz v6, :cond_1d

    .line 270
    .line 271
    move-object v6, p0

    .line 272
    move-object v7, v4

    .line 273
    :goto_a
    if-eqz v6, :cond_1d

    .line 274
    .line 275
    instance-of v8, v6, Lj42;

    .line 276
    .line 277
    if-eqz v8, :cond_16

    .line 278
    .line 279
    goto :goto_d

    .line 280
    :cond_16
    iget v8, v6, Lcx2;->p:I

    .line 281
    .line 282
    and-int/lit16 v8, v8, 0x2000

    .line 283
    .line 284
    if-eqz v8, :cond_1c

    .line 285
    .line 286
    instance-of v8, v6, Lfo0;

    .line 287
    .line 288
    if-eqz v8, :cond_1c

    .line 289
    .line 290
    move-object v8, v6

    .line 291
    check-cast v8, Lfo0;

    .line 292
    .line 293
    iget-object v8, v8, Lfo0;->C:Lcx2;

    .line 294
    .line 295
    move v9, v2

    .line 296
    :goto_b
    if-eqz v8, :cond_1b

    .line 297
    .line 298
    iget v10, v8, Lcx2;->p:I

    .line 299
    .line 300
    and-int/lit16 v10, v10, 0x2000

    .line 301
    .line 302
    if-eqz v10, :cond_1a

    .line 303
    .line 304
    add-int/lit8 v9, v9, 0x1

    .line 305
    .line 306
    if-ne v9, v5, :cond_17

    .line 307
    .line 308
    move-object v6, v8

    .line 309
    goto :goto_c

    .line 310
    :cond_17
    if-nez v7, :cond_18

    .line 311
    .line 312
    new-instance v7, Lf13;

    .line 313
    .line 314
    new-array v10, v3, [Lcx2;

    .line 315
    .line 316
    invoke-direct {v7, v10}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    :cond_18
    if-eqz v6, :cond_19

    .line 320
    .line 321
    invoke-virtual {v7, v6}, Lf13;->b(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    move-object v6, v4

    .line 325
    :cond_19
    invoke-virtual {v7, v8}, Lf13;->b(Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    :cond_1a
    :goto_c
    iget-object v8, v8, Lcx2;->s:Lcx2;

    .line 329
    .line 330
    goto :goto_b

    .line 331
    :cond_1b
    if-ne v9, v5, :cond_1c

    .line 332
    .line 333
    goto :goto_a

    .line 334
    :cond_1c
    invoke-static {v7}, Lj51;->c(Lf13;)Lcx2;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    goto :goto_a

    .line 339
    :cond_1d
    iget-object p0, p0, Lcx2;->r:Lcx2;

    .line 340
    .line 341
    goto :goto_9

    .line 342
    :cond_1e
    invoke-virtual {v0}, Lc72;->t()Lc72;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    if-eqz v0, :cond_1f

    .line 347
    .line 348
    iget-object p0, v0, Lc72;->Q:Lw12;

    .line 349
    .line 350
    if-eqz p0, :cond_1f

    .line 351
    .line 352
    iget-object p0, p0, Lw12;->f:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast p0, Lsq4;

    .line 355
    .line 356
    goto :goto_8

    .line 357
    :cond_1f
    move-object p0, v4

    .line 358
    goto :goto_8

    .line 359
    :cond_20
    move-object v6, v4

    .line 360
    :goto_d
    check-cast v6, Lj42;

    .line 361
    .line 362
    if-eqz v6, :cond_21

    .line 363
    .line 364
    check-cast v6, Lcx2;

    .line 365
    .line 366
    iget-object v7, v6, Lcx2;->n:Lcx2;

    .line 367
    .line 368
    goto :goto_e

    .line 369
    :cond_21
    move-object v7, v4

    .line 370
    :cond_22
    :goto_e
    if-eqz v7, :cond_44

    .line 371
    .line 372
    iget-object p0, v7, Lcx2;->n:Lcx2;

    .line 373
    .line 374
    iget-boolean p0, p0, Lcx2;->A:Z

    .line 375
    .line 376
    if-nez p0, :cond_23

    .line 377
    .line 378
    invoke-static {v1}, Lcz1;->b(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    :cond_23
    iget-object p0, v7, Lcx2;->n:Lcx2;

    .line 382
    .line 383
    iget-object p0, p0, Lcx2;->r:Lcx2;

    .line 384
    .line 385
    invoke-static {v7}, Lj51;->O(Leo0;)Lc72;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    move-object v1, v4

    .line 390
    :goto_f
    if-eqz v0, :cond_2f

    .line 391
    .line 392
    iget-object v6, v0, Lc72;->Q:Lw12;

    .line 393
    .line 394
    iget-object v6, v6, Lw12;->g:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v6, Lcx2;

    .line 397
    .line 398
    iget v6, v6, Lcx2;->q:I

    .line 399
    .line 400
    and-int/lit16 v6, v6, 0x2000

    .line 401
    .line 402
    if-eqz v6, :cond_2d

    .line 403
    .line 404
    :goto_10
    if-eqz p0, :cond_2d

    .line 405
    .line 406
    iget v6, p0, Lcx2;->p:I

    .line 407
    .line 408
    and-int/lit16 v6, v6, 0x2000

    .line 409
    .line 410
    if-eqz v6, :cond_2c

    .line 411
    .line 412
    move-object v6, p0

    .line 413
    move-object v8, v4

    .line 414
    :goto_11
    if-eqz v6, :cond_2c

    .line 415
    .line 416
    instance-of v9, v6, Lj42;

    .line 417
    .line 418
    if-eqz v9, :cond_25

    .line 419
    .line 420
    if-nez v1, :cond_24

    .line 421
    .line 422
    new-instance v1, Ljava/util/ArrayList;

    .line 423
    .line 424
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 425
    .line 426
    .line 427
    :cond_24
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move v9, v2

    .line 431
    goto :goto_12

    .line 432
    :cond_25
    move v9, v5

    .line 433
    :goto_12
    if-eqz v9, :cond_2b

    .line 434
    .line 435
    iget v9, v6, Lcx2;->p:I

    .line 436
    .line 437
    and-int/lit16 v9, v9, 0x2000

    .line 438
    .line 439
    if-eqz v9, :cond_2b

    .line 440
    .line 441
    instance-of v9, v6, Lfo0;

    .line 442
    .line 443
    if-eqz v9, :cond_2b

    .line 444
    .line 445
    move-object v9, v6

    .line 446
    check-cast v9, Lfo0;

    .line 447
    .line 448
    iget-object v9, v9, Lfo0;->C:Lcx2;

    .line 449
    .line 450
    move v10, v2

    .line 451
    :goto_13
    if-eqz v9, :cond_2a

    .line 452
    .line 453
    iget v11, v9, Lcx2;->p:I

    .line 454
    .line 455
    and-int/lit16 v11, v11, 0x2000

    .line 456
    .line 457
    if-eqz v11, :cond_29

    .line 458
    .line 459
    add-int/lit8 v10, v10, 0x1

    .line 460
    .line 461
    if-ne v10, v5, :cond_26

    .line 462
    .line 463
    move-object v6, v9

    .line 464
    goto :goto_14

    .line 465
    :cond_26
    if-nez v8, :cond_27

    .line 466
    .line 467
    new-instance v8, Lf13;

    .line 468
    .line 469
    new-array v11, v3, [Lcx2;

    .line 470
    .line 471
    invoke-direct {v8, v11}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    :cond_27
    if-eqz v6, :cond_28

    .line 475
    .line 476
    invoke-virtual {v8, v6}, Lf13;->b(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    move-object v6, v4

    .line 480
    :cond_28
    invoke-virtual {v8, v9}, Lf13;->b(Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    :cond_29
    :goto_14
    iget-object v9, v9, Lcx2;->s:Lcx2;

    .line 484
    .line 485
    goto :goto_13

    .line 486
    :cond_2a
    if-ne v10, v5, :cond_2b

    .line 487
    .line 488
    goto :goto_11

    .line 489
    :cond_2b
    invoke-static {v8}, Lj51;->c(Lf13;)Lcx2;

    .line 490
    .line 491
    .line 492
    move-result-object v6

    .line 493
    goto :goto_11

    .line 494
    :cond_2c
    iget-object p0, p0, Lcx2;->r:Lcx2;

    .line 495
    .line 496
    goto :goto_10

    .line 497
    :cond_2d
    invoke-virtual {v0}, Lc72;->t()Lc72;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    if-eqz v0, :cond_2e

    .line 502
    .line 503
    iget-object p0, v0, Lc72;->Q:Lw12;

    .line 504
    .line 505
    if-eqz p0, :cond_2e

    .line 506
    .line 507
    iget-object p0, p0, Lw12;->f:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast p0, Lsq4;

    .line 510
    .line 511
    goto :goto_f

    .line 512
    :cond_2e
    move-object p0, v4

    .line 513
    goto :goto_f

    .line 514
    :cond_2f
    if-eqz v1, :cond_31

    .line 515
    .line 516
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 517
    .line 518
    .line 519
    move-result p0

    .line 520
    add-int/lit8 p0, p0, -0x1

    .line 521
    .line 522
    if-ltz p0, :cond_31

    .line 523
    .line 524
    :goto_15
    add-int/lit8 v0, p0, -0x1

    .line 525
    .line 526
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object p0

    .line 530
    check-cast p0, Lj42;

    .line 531
    .line 532
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    if-gez v0, :cond_30

    .line 536
    .line 537
    goto :goto_16

    .line 538
    :cond_30
    move p0, v0

    .line 539
    goto :goto_15

    .line 540
    :cond_31
    :goto_16
    iget-object p0, v7, Lcx2;->n:Lcx2;

    .line 541
    .line 542
    move-object v0, v4

    .line 543
    :goto_17
    if-eqz p0, :cond_39

    .line 544
    .line 545
    instance-of v6, p0, Lj42;

    .line 546
    .line 547
    if-eqz v6, :cond_32

    .line 548
    .line 549
    check-cast p0, Lj42;

    .line 550
    .line 551
    goto :goto_1a

    .line 552
    :cond_32
    iget v6, p0, Lcx2;->p:I

    .line 553
    .line 554
    and-int/lit16 v6, v6, 0x2000

    .line 555
    .line 556
    if-eqz v6, :cond_38

    .line 557
    .line 558
    instance-of v6, p0, Lfo0;

    .line 559
    .line 560
    if-eqz v6, :cond_38

    .line 561
    .line 562
    move-object v6, p0

    .line 563
    check-cast v6, Lfo0;

    .line 564
    .line 565
    iget-object v6, v6, Lfo0;->C:Lcx2;

    .line 566
    .line 567
    move v8, v2

    .line 568
    :goto_18
    if-eqz v6, :cond_37

    .line 569
    .line 570
    iget v9, v6, Lcx2;->p:I

    .line 571
    .line 572
    and-int/lit16 v9, v9, 0x2000

    .line 573
    .line 574
    if-eqz v9, :cond_36

    .line 575
    .line 576
    add-int/lit8 v8, v8, 0x1

    .line 577
    .line 578
    if-ne v8, v5, :cond_33

    .line 579
    .line 580
    move-object p0, v6

    .line 581
    goto :goto_19

    .line 582
    :cond_33
    if-nez v0, :cond_34

    .line 583
    .line 584
    new-instance v0, Lf13;

    .line 585
    .line 586
    new-array v9, v3, [Lcx2;

    .line 587
    .line 588
    invoke-direct {v0, v9}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    :cond_34
    if-eqz p0, :cond_35

    .line 592
    .line 593
    invoke-virtual {v0, p0}, Lf13;->b(Ljava/lang/Object;)V

    .line 594
    .line 595
    .line 596
    move-object p0, v4

    .line 597
    :cond_35
    invoke-virtual {v0, v6}, Lf13;->b(Ljava/lang/Object;)V

    .line 598
    .line 599
    .line 600
    :cond_36
    :goto_19
    iget-object v6, v6, Lcx2;->s:Lcx2;

    .line 601
    .line 602
    goto :goto_18

    .line 603
    :cond_37
    if-ne v8, v5, :cond_38

    .line 604
    .line 605
    goto :goto_17

    .line 606
    :cond_38
    :goto_1a
    invoke-static {v0}, Lj51;->c(Lf13;)Lcx2;

    .line 607
    .line 608
    .line 609
    move-result-object p0

    .line 610
    goto :goto_17

    .line 611
    :cond_39
    invoke-interface {p2}, Lgf1;->invoke()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object p0

    .line 615
    check-cast p0, Ljava/lang/Boolean;

    .line 616
    .line 617
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 618
    .line 619
    .line 620
    move-result p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 621
    if-eqz p0, :cond_3a

    .line 622
    .line 623
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 624
    .line 625
    .line 626
    return v5

    .line 627
    :cond_3a
    :try_start_4
    iget-object p0, v7, Lcx2;->n:Lcx2;

    .line 628
    .line 629
    move-object p2, v4

    .line 630
    :goto_1b
    if-eqz p0, :cond_42

    .line 631
    .line 632
    instance-of v0, p0, Lj42;

    .line 633
    .line 634
    if-eqz v0, :cond_3b

    .line 635
    .line 636
    check-cast p0, Lj42;

    .line 637
    .line 638
    invoke-interface {p0, p1}, Lj42;->q(Landroid/view/KeyEvent;)Z

    .line 639
    .line 640
    .line 641
    move-result p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 642
    if-eqz p0, :cond_41

    .line 643
    .line 644
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 645
    .line 646
    .line 647
    return v5

    .line 648
    :cond_3b
    :try_start_5
    iget v0, p0, Lcx2;->p:I

    .line 649
    .line 650
    and-int/lit16 v0, v0, 0x2000

    .line 651
    .line 652
    if-eqz v0, :cond_41

    .line 653
    .line 654
    instance-of v0, p0, Lfo0;

    .line 655
    .line 656
    if-eqz v0, :cond_41

    .line 657
    .line 658
    move-object v0, p0

    .line 659
    check-cast v0, Lfo0;

    .line 660
    .line 661
    iget-object v0, v0, Lfo0;->C:Lcx2;

    .line 662
    .line 663
    move v6, v2

    .line 664
    :goto_1c
    if-eqz v0, :cond_40

    .line 665
    .line 666
    iget v7, v0, Lcx2;->p:I

    .line 667
    .line 668
    and-int/lit16 v7, v7, 0x2000

    .line 669
    .line 670
    if-eqz v7, :cond_3f

    .line 671
    .line 672
    add-int/lit8 v6, v6, 0x1

    .line 673
    .line 674
    if-ne v6, v5, :cond_3c

    .line 675
    .line 676
    move-object p0, v0

    .line 677
    goto :goto_1d

    .line 678
    :cond_3c
    if-nez p2, :cond_3d

    .line 679
    .line 680
    new-instance p2, Lf13;

    .line 681
    .line 682
    new-array v7, v3, [Lcx2;

    .line 683
    .line 684
    invoke-direct {p2, v7}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 685
    .line 686
    .line 687
    :cond_3d
    if-eqz p0, :cond_3e

    .line 688
    .line 689
    invoke-virtual {p2, p0}, Lf13;->b(Ljava/lang/Object;)V

    .line 690
    .line 691
    .line 692
    move-object p0, v4

    .line 693
    :cond_3e
    invoke-virtual {p2, v0}, Lf13;->b(Ljava/lang/Object;)V

    .line 694
    .line 695
    .line 696
    :cond_3f
    :goto_1d
    iget-object v0, v0, Lcx2;->s:Lcx2;

    .line 697
    .line 698
    goto :goto_1c

    .line 699
    :cond_40
    if-ne v6, v5, :cond_41

    .line 700
    .line 701
    goto :goto_1b

    .line 702
    :cond_41
    invoke-static {p2}, Lj51;->c(Lf13;)Lcx2;

    .line 703
    .line 704
    .line 705
    move-result-object p0

    .line 706
    goto :goto_1b

    .line 707
    :cond_42
    if-eqz v1, :cond_44

    .line 708
    .line 709
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 710
    .line 711
    .line 712
    move-result p0

    .line 713
    move p2, v2

    .line 714
    :goto_1e
    if-ge p2, p0, :cond_44

    .line 715
    .line 716
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    check-cast v0, Lj42;

    .line 721
    .line 722
    invoke-interface {v0, p1}, Lj42;->q(Landroid/view/KeyEvent;)Z

    .line 723
    .line 724
    .line 725
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 726
    if-eqz v0, :cond_43

    .line 727
    .line 728
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 729
    .line 730
    .line 731
    return v5

    .line 732
    :cond_43
    add-int/lit8 p2, p2, 0x1

    .line 733
    .line 734
    goto :goto_1e

    .line 735
    :cond_44
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 736
    .line 737
    .line 738
    return v2

    .line 739
    :catchall_0
    move-exception p0

    .line 740
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 741
    .line 742
    .line 743
    throw p0
.end method

.method public e(ILwv3;Lif1;)Ljava/lang/Boolean;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v0, Ley;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v4, Lra;

    .line 12
    .line 13
    iget-object v5, v0, Ley;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v5, Lba1;

    .line 16
    .line 17
    invoke-static {v5}, Lte5;->p(Lba1;)Lba1;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    const/4 v8, 0x4

    .line 22
    const/4 v9, 0x3

    .line 23
    const/4 v10, 0x6

    .line 24
    const/4 v11, 0x5

    .line 25
    const/4 v12, 0x2

    .line 26
    const/16 v16, 0x0

    .line 27
    .line 28
    const/16 v17, 0x0

    .line 29
    .line 30
    const/4 v15, 0x1

    .line 31
    if-eqz v6, :cond_24

    .line 32
    .line 33
    invoke-virtual {v4}, Lra;->getLayoutDirection()Lr62;

    .line 34
    .line 35
    .line 36
    move-result-object v18

    .line 37
    invoke-virtual {v6}, Lba1;->s0()Lx91;

    .line 38
    .line 39
    .line 40
    move-result-object v14

    .line 41
    iget-object v7, v14, Lx91;->h:Ly91;

    .line 42
    .line 43
    iget-object v13, v14, Lx91;->i:Ly91;

    .line 44
    .line 45
    if-ne v1, v15, :cond_0

    .line 46
    .line 47
    iget-object v7, v14, Lx91;->b:Ly91;

    .line 48
    .line 49
    goto/16 :goto_4

    .line 50
    .line 51
    :cond_0
    if-ne v1, v12, :cond_1

    .line 52
    .line 53
    iget-object v7, v14, Lx91;->c:Ly91;

    .line 54
    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_1
    if-ne v1, v11, :cond_2

    .line 58
    .line 59
    iget-object v7, v14, Lx91;->d:Ly91;

    .line 60
    .line 61
    goto/16 :goto_4

    .line 62
    .line 63
    :cond_2
    if-ne v1, v10, :cond_3

    .line 64
    .line 65
    iget-object v7, v14, Lx91;->e:Ly91;

    .line 66
    .line 67
    goto/16 :goto_4

    .line 68
    .line 69
    :cond_3
    if-ne v1, v9, :cond_7

    .line 70
    .line 71
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->ordinal()I

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    if-eqz v10, :cond_5

    .line 76
    .line 77
    if-ne v10, v15, :cond_4

    .line 78
    .line 79
    move-object v7, v13

    .line 80
    goto :goto_0

    .line 81
    :cond_4
    invoke-static {}, Ler1;->n()V

    .line 82
    .line 83
    .line 84
    return-object v17

    .line 85
    :cond_5
    :goto_0
    sget-object v10, Ly91;->b:Ly91;

    .line 86
    .line 87
    if-ne v7, v10, :cond_6

    .line 88
    .line 89
    move-object/from16 v7, v17

    .line 90
    .line 91
    :cond_6
    if-nez v7, :cond_f

    .line 92
    .line 93
    iget-object v7, v14, Lx91;->f:Ly91;

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_7
    if-ne v1, v8, :cond_b

    .line 97
    .line 98
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->ordinal()I

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    if-eqz v10, :cond_9

    .line 103
    .line 104
    if-ne v10, v15, :cond_8

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_8
    invoke-static {}, Ler1;->n()V

    .line 108
    .line 109
    .line 110
    return-object v17

    .line 111
    :cond_9
    move-object v7, v13

    .line 112
    :goto_1
    sget-object v10, Ly91;->b:Ly91;

    .line 113
    .line 114
    if-ne v7, v10, :cond_a

    .line 115
    .line 116
    move-object/from16 v7, v17

    .line 117
    .line 118
    :cond_a
    if-nez v7, :cond_f

    .line 119
    .line 120
    iget-object v7, v14, Lx91;->g:Ly91;

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_b
    const/4 v7, 0x7

    .line 124
    if-ne v1, v7, :cond_c

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_c
    const/16 v10, 0x8

    .line 128
    .line 129
    if-ne v1, v10, :cond_23

    .line 130
    .line 131
    :goto_2
    invoke-static {v6}, Lj51;->P(Leo0;)Lub3;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    check-cast v10, Lra;

    .line 136
    .line 137
    invoke-virtual {v10}, Lra;->getFocusOwner()Lu91;

    .line 138
    .line 139
    .line 140
    move-result-object v10

    .line 141
    check-cast v10, Ley;

    .line 142
    .line 143
    invoke-virtual {v10}, Ley;->f()Lba1;

    .line 144
    .line 145
    .line 146
    move-result-object v13

    .line 147
    if-ne v1, v7, :cond_d

    .line 148
    .line 149
    iget-object v7, v14, Lx91;->j:Lk2;

    .line 150
    .line 151
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_d
    iget-object v7, v14, Lx91;->k:Lk2;

    .line 156
    .line 157
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    :goto_3
    invoke-virtual {v10}, Ley;->f()Lba1;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    if-eq v13, v7, :cond_e

    .line 165
    .line 166
    sget-object v7, Ly91;->d:Ly91;

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_e
    sget-object v7, Ly91;->b:Ly91;

    .line 170
    .line 171
    :cond_f
    :goto_4
    sget-object v10, Ly91;->c:Ly91;

    .line 172
    .line 173
    invoke-static {v7, v10}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v13

    .line 177
    if-eqz v13, :cond_10

    .line 178
    .line 179
    goto/16 :goto_11

    .line 180
    .line 181
    :cond_10
    sget-object v13, Ly91;->d:Ly91;

    .line 182
    .line 183
    invoke-static {v7, v13}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v13

    .line 187
    if-eqz v13, :cond_11

    .line 188
    .line 189
    invoke-static {v5}, Lte5;->p(Lba1;)Lba1;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    if-eqz v0, :cond_30

    .line 194
    .line 195
    invoke-interface {v3, v0}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    check-cast v0, Ljava/lang/Boolean;

    .line 200
    .line 201
    return-object v0

    .line 202
    :cond_11
    sget-object v13, Ly91;->b:Ly91;

    .line 203
    .line 204
    invoke-static {v7, v13}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v14

    .line 208
    if-nez v14, :cond_25

    .line 209
    .line 210
    const-string v0, "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"

    .line 211
    .line 212
    if-eq v7, v13, :cond_22

    .line 213
    .line 214
    if-eq v7, v10, :cond_21

    .line 215
    .line 216
    iget-object v0, v7, Ly91;->a:Lf13;

    .line 217
    .line 218
    iget v1, v0, Lf13;->p:I

    .line 219
    .line 220
    if-nez v1, :cond_12

    .line 221
    .line 222
    const-string v0, "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 223
    .line 224
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 225
    .line 226
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    goto/16 :goto_c

    .line 230
    .line 231
    :cond_12
    iget-object v0, v0, Lf13;->n:[Ljava/lang/Object;

    .line 232
    .line 233
    move/from16 v2, v16

    .line 234
    .line 235
    move v4, v2

    .line 236
    :goto_5
    if-ge v2, v1, :cond_20

    .line 237
    .line 238
    aget-object v5, v0, v2

    .line 239
    .line 240
    check-cast v5, Lxo;

    .line 241
    .line 242
    iget-object v6, v5, Lcx2;->n:Lcx2;

    .line 243
    .line 244
    iget-boolean v6, v6, Lcx2;->A:Z

    .line 245
    .line 246
    if-nez v6, :cond_13

    .line 247
    .line 248
    const-string v6, "visitChildren called on an unattached node"

    .line 249
    .line 250
    invoke-static {v6}, Lcz1;->b(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    :cond_13
    new-instance v6, Lf13;

    .line 254
    .line 255
    const/16 v7, 0x10

    .line 256
    .line 257
    new-array v8, v7, [Lcx2;

    .line 258
    .line 259
    invoke-direct {v6, v8}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    iget-object v5, v5, Lcx2;->n:Lcx2;

    .line 263
    .line 264
    iget-object v7, v5, Lcx2;->s:Lcx2;

    .line 265
    .line 266
    if-nez v7, :cond_14

    .line 267
    .line 268
    invoke-static {v6, v5}, Lj51;->b(Lf13;Lcx2;)V

    .line 269
    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_14
    invoke-virtual {v6, v7}, Lf13;->b(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    :cond_15
    :goto_6
    iget v5, v6, Lf13;->p:I

    .line 276
    .line 277
    if-eqz v5, :cond_1f

    .line 278
    .line 279
    add-int/lit8 v5, v5, -0x1

    .line 280
    .line 281
    invoke-virtual {v6, v5}, Lf13;->k(I)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    check-cast v5, Lcx2;

    .line 286
    .line 287
    iget v7, v5, Lcx2;->q:I

    .line 288
    .line 289
    and-int/lit16 v7, v7, 0x400

    .line 290
    .line 291
    if-nez v7, :cond_16

    .line 292
    .line 293
    invoke-static {v6, v5}, Lj51;->b(Lf13;Lcx2;)V

    .line 294
    .line 295
    .line 296
    goto :goto_6

    .line 297
    :cond_16
    :goto_7
    if-eqz v5, :cond_15

    .line 298
    .line 299
    iget v7, v5, Lcx2;->p:I

    .line 300
    .line 301
    and-int/lit16 v7, v7, 0x400

    .line 302
    .line 303
    if-eqz v7, :cond_1e

    .line 304
    .line 305
    move-object/from16 v7, v17

    .line 306
    .line 307
    :goto_8
    if-eqz v5, :cond_15

    .line 308
    .line 309
    instance-of v8, v5, Lba1;

    .line 310
    .line 311
    if-eqz v8, :cond_17

    .line 312
    .line 313
    check-cast v5, Lba1;

    .line 314
    .line 315
    invoke-interface {v3, v5}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    check-cast v5, Ljava/lang/Boolean;

    .line 320
    .line 321
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 322
    .line 323
    .line 324
    move-result v5

    .line 325
    if-eqz v5, :cond_1d

    .line 326
    .line 327
    move v4, v15

    .line 328
    goto :goto_b

    .line 329
    :cond_17
    iget v8, v5, Lcx2;->p:I

    .line 330
    .line 331
    and-int/lit16 v8, v8, 0x400

    .line 332
    .line 333
    if-eqz v8, :cond_1d

    .line 334
    .line 335
    instance-of v8, v5, Lfo0;

    .line 336
    .line 337
    if-eqz v8, :cond_1d

    .line 338
    .line 339
    move-object v8, v5

    .line 340
    check-cast v8, Lfo0;

    .line 341
    .line 342
    iget-object v8, v8, Lfo0;->C:Lcx2;

    .line 343
    .line 344
    move/from16 v9, v16

    .line 345
    .line 346
    :goto_9
    if-eqz v8, :cond_1c

    .line 347
    .line 348
    iget v10, v8, Lcx2;->p:I

    .line 349
    .line 350
    and-int/lit16 v10, v10, 0x400

    .line 351
    .line 352
    if-eqz v10, :cond_1b

    .line 353
    .line 354
    add-int/lit8 v9, v9, 0x1

    .line 355
    .line 356
    if-ne v9, v15, :cond_18

    .line 357
    .line 358
    move-object v5, v8

    .line 359
    goto :goto_a

    .line 360
    :cond_18
    if-nez v7, :cond_19

    .line 361
    .line 362
    new-instance v7, Lf13;

    .line 363
    .line 364
    const/16 v10, 0x10

    .line 365
    .line 366
    new-array v11, v10, [Lcx2;

    .line 367
    .line 368
    invoke-direct {v7, v11}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    :cond_19
    if-eqz v5, :cond_1a

    .line 372
    .line 373
    invoke-virtual {v7, v5}, Lf13;->b(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    move-object/from16 v5, v17

    .line 377
    .line 378
    :cond_1a
    invoke-virtual {v7, v8}, Lf13;->b(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    :cond_1b
    :goto_a
    iget-object v8, v8, Lcx2;->s:Lcx2;

    .line 382
    .line 383
    goto :goto_9

    .line 384
    :cond_1c
    if-ne v9, v15, :cond_1d

    .line 385
    .line 386
    goto :goto_8

    .line 387
    :cond_1d
    invoke-static {v7}, Lj51;->c(Lf13;)Lcx2;

    .line 388
    .line 389
    .line 390
    move-result-object v5

    .line 391
    goto :goto_8

    .line 392
    :cond_1e
    iget-object v5, v5, Lcx2;->s:Lcx2;

    .line 393
    .line 394
    goto :goto_7

    .line 395
    :cond_1f
    :goto_b
    add-int/lit8 v2, v2, 0x1

    .line 396
    .line 397
    goto/16 :goto_5

    .line 398
    .line 399
    :cond_20
    move/from16 v16, v4

    .line 400
    .line 401
    :goto_c
    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    return-object v0

    .line 406
    :cond_21
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    return-object v17

    .line 410
    :cond_22
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    return-object v17

    .line 414
    :cond_23
    const-string v0, "invalid FocusDirection"

    .line 415
    .line 416
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    return-object v17

    .line 420
    :cond_24
    move-object/from16 v6, v17

    .line 421
    .line 422
    :cond_25
    invoke-virtual {v4}, Lra;->getLayoutDirection()Lr62;

    .line 423
    .line 424
    .line 425
    move-result-object v4

    .line 426
    new-instance v7, Ldd0;

    .line 427
    .line 428
    invoke-direct {v7, v6, v0, v3, v12}, Ldd0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 429
    .line 430
    .line 431
    if-ne v1, v15, :cond_26

    .line 432
    .line 433
    goto :goto_d

    .line 434
    :cond_26
    if-ne v1, v12, :cond_29

    .line 435
    .line 436
    :goto_d
    if-ne v1, v15, :cond_27

    .line 437
    .line 438
    invoke-static {v5, v7}, Lzz1;->o(Lba1;Ldd0;)Z

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    goto :goto_e

    .line 443
    :cond_27
    if-ne v1, v12, :cond_28

    .line 444
    .line 445
    invoke-static {v5, v7}, Lzz1;->f(Lba1;Ldd0;)Z

    .line 446
    .line 447
    .line 448
    move-result v0

    .line 449
    :goto_e
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    return-object v0

    .line 454
    :cond_28
    const-string v0, "This function should only be used for 1-D focus search"

    .line 455
    .line 456
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    return-object v17

    .line 460
    :cond_29
    if-ne v1, v9, :cond_2a

    .line 461
    .line 462
    goto :goto_f

    .line 463
    :cond_2a
    if-ne v1, v8, :cond_2b

    .line 464
    .line 465
    goto :goto_f

    .line 466
    :cond_2b
    if-ne v1, v11, :cond_2c

    .line 467
    .line 468
    goto :goto_f

    .line 469
    :cond_2c
    const/4 v0, 0x6

    .line 470
    if-ne v1, v0, :cond_2d

    .line 471
    .line 472
    :goto_f
    invoke-static {v1, v7, v5, v2}, Lkb4;->b0(ILdd0;Lba1;Lwv3;)Ljava/lang/Boolean;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    return-object v0

    .line 477
    :cond_2d
    const/4 v0, 0x7

    .line 478
    if-ne v1, v0, :cond_31

    .line 479
    .line 480
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    if-eqz v0, :cond_2f

    .line 485
    .line 486
    if-ne v0, v15, :cond_2e

    .line 487
    .line 488
    move v8, v9

    .line 489
    goto :goto_10

    .line 490
    :cond_2e
    invoke-static {}, Ler1;->n()V

    .line 491
    .line 492
    .line 493
    return-object v17

    .line 494
    :cond_2f
    :goto_10
    invoke-static {v5}, Lte5;->p(Lba1;)Lba1;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    if-eqz v0, :cond_30

    .line 499
    .line 500
    invoke-static {v8, v7, v0, v2}, Lkb4;->b0(ILdd0;Lba1;Lwv3;)Ljava/lang/Boolean;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    return-object v0

    .line 505
    :cond_30
    :goto_11
    return-object v17

    .line 506
    :cond_31
    const/16 v10, 0x8

    .line 507
    .line 508
    if-ne v1, v10, :cond_40

    .line 509
    .line 510
    invoke-static {v5}, Lte5;->p(Lba1;)Lba1;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    if-eqz v0, :cond_3e

    .line 515
    .line 516
    iget-object v1, v0, Lcx2;->n:Lcx2;

    .line 517
    .line 518
    iget-boolean v1, v1, Lcx2;->A:Z

    .line 519
    .line 520
    if-nez v1, :cond_32

    .line 521
    .line 522
    const-string v1, "visitAncestors called on an unattached node"

    .line 523
    .line 524
    invoke-static {v1}, Lcz1;->b(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    :cond_32
    iget-object v1, v0, Lcx2;->n:Lcx2;

    .line 528
    .line 529
    iget-object v1, v1, Lcx2;->r:Lcx2;

    .line 530
    .line 531
    invoke-static {v0}, Lj51;->O(Leo0;)Lc72;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    :goto_12
    if-eqz v0, :cond_3e

    .line 536
    .line 537
    iget-object v2, v0, Lc72;->Q:Lw12;

    .line 538
    .line 539
    iget-object v2, v2, Lw12;->g:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast v2, Lcx2;

    .line 542
    .line 543
    iget v2, v2, Lcx2;->q:I

    .line 544
    .line 545
    and-int/lit16 v2, v2, 0x400

    .line 546
    .line 547
    if-eqz v2, :cond_3c

    .line 548
    .line 549
    :goto_13
    if-eqz v1, :cond_3c

    .line 550
    .line 551
    iget v2, v1, Lcx2;->p:I

    .line 552
    .line 553
    and-int/lit16 v2, v2, 0x400

    .line 554
    .line 555
    if-eqz v2, :cond_3b

    .line 556
    .line 557
    move-object v2, v1

    .line 558
    move-object/from16 v3, v17

    .line 559
    .line 560
    :goto_14
    if-eqz v2, :cond_3b

    .line 561
    .line 562
    instance-of v4, v2, Lba1;

    .line 563
    .line 564
    if-eqz v4, :cond_34

    .line 565
    .line 566
    check-cast v2, Lba1;

    .line 567
    .line 568
    invoke-virtual {v2}, Lba1;->s0()Lx91;

    .line 569
    .line 570
    .line 571
    move-result-object v4

    .line 572
    iget-boolean v4, v4, Lx91;->a:Z

    .line 573
    .line 574
    if-eqz v4, :cond_33

    .line 575
    .line 576
    move-object v15, v2

    .line 577
    goto/16 :goto_19

    .line 578
    .line 579
    :cond_33
    const/16 v10, 0x10

    .line 580
    .line 581
    goto :goto_18

    .line 582
    :cond_34
    iget v4, v2, Lcx2;->p:I

    .line 583
    .line 584
    and-int/lit16 v4, v4, 0x400

    .line 585
    .line 586
    if-eqz v4, :cond_33

    .line 587
    .line 588
    instance-of v4, v2, Lfo0;

    .line 589
    .line 590
    if-eqz v4, :cond_33

    .line 591
    .line 592
    move-object v4, v2

    .line 593
    check-cast v4, Lfo0;

    .line 594
    .line 595
    iget-object v4, v4, Lfo0;->C:Lcx2;

    .line 596
    .line 597
    move/from16 v6, v16

    .line 598
    .line 599
    :goto_15
    if-eqz v4, :cond_39

    .line 600
    .line 601
    iget v8, v4, Lcx2;->p:I

    .line 602
    .line 603
    and-int/lit16 v8, v8, 0x400

    .line 604
    .line 605
    if-eqz v8, :cond_35

    .line 606
    .line 607
    add-int/lit8 v6, v6, 0x1

    .line 608
    .line 609
    if-ne v6, v15, :cond_36

    .line 610
    .line 611
    move-object v2, v4

    .line 612
    :cond_35
    const/16 v10, 0x10

    .line 613
    .line 614
    goto :goto_17

    .line 615
    :cond_36
    if-nez v3, :cond_37

    .line 616
    .line 617
    new-instance v3, Lf13;

    .line 618
    .line 619
    const/16 v10, 0x10

    .line 620
    .line 621
    new-array v8, v10, [Lcx2;

    .line 622
    .line 623
    invoke-direct {v3, v8}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    goto :goto_16

    .line 627
    :cond_37
    const/16 v10, 0x10

    .line 628
    .line 629
    :goto_16
    if-eqz v2, :cond_38

    .line 630
    .line 631
    invoke-virtual {v3, v2}, Lf13;->b(Ljava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    move-object/from16 v2, v17

    .line 635
    .line 636
    :cond_38
    invoke-virtual {v3, v4}, Lf13;->b(Ljava/lang/Object;)V

    .line 637
    .line 638
    .line 639
    :goto_17
    iget-object v4, v4, Lcx2;->s:Lcx2;

    .line 640
    .line 641
    goto :goto_15

    .line 642
    :cond_39
    const/16 v10, 0x10

    .line 643
    .line 644
    if-ne v6, v15, :cond_3a

    .line 645
    .line 646
    goto :goto_14

    .line 647
    :cond_3a
    :goto_18
    invoke-static {v3}, Lj51;->c(Lf13;)Lcx2;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    goto :goto_14

    .line 652
    :cond_3b
    const/16 v10, 0x10

    .line 653
    .line 654
    iget-object v1, v1, Lcx2;->r:Lcx2;

    .line 655
    .line 656
    goto :goto_13

    .line 657
    :cond_3c
    const/16 v10, 0x10

    .line 658
    .line 659
    invoke-virtual {v0}, Lc72;->t()Lc72;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    if-eqz v0, :cond_3d

    .line 664
    .line 665
    iget-object v1, v0, Lc72;->Q:Lw12;

    .line 666
    .line 667
    if-eqz v1, :cond_3d

    .line 668
    .line 669
    iget-object v1, v1, Lw12;->f:Ljava/lang/Object;

    .line 670
    .line 671
    check-cast v1, Lsq4;

    .line 672
    .line 673
    goto/16 :goto_12

    .line 674
    .line 675
    :cond_3d
    move-object/from16 v1, v17

    .line 676
    .line 677
    goto/16 :goto_12

    .line 678
    .line 679
    :cond_3e
    move-object/from16 v15, v17

    .line 680
    .line 681
    :goto_19
    if-eqz v15, :cond_3f

    .line 682
    .line 683
    if-eq v15, v5, :cond_3f

    .line 684
    .line 685
    invoke-virtual {v7, v15}, Ldd0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    check-cast v0, Ljava/lang/Boolean;

    .line 690
    .line 691
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 692
    .line 693
    .line 694
    move-result v16

    .line 695
    :cond_3f
    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    return-object v0

    .line 700
    :cond_40
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 701
    .line 702
    invoke-static {v1}, Lo91;->a(I)Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v1

    .line 706
    const-string v2, "Focus search invoked with invalid FocusDirection "

    .line 707
    .line 708
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v1

    .line 712
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 717
    .line 718
    .line 719
    throw v0
.end method

.method public f()Lba1;
    .locals 2

    .line 1
    iget-object p0, p0, Ley;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lba1;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lcx2;->A:Z

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method public g(I)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0, v0}, Ley;->b(IZZ)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    new-instance v1, Lha;

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    invoke-direct {v1, p1, v2}, Lha;-><init>(II)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p0, p1, v2, v1}, Ley;->e(ILwv3;Lif1;)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    :cond_1
    if-nez v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0}, Ley;->c()V

    .line 29
    .line 30
    .line 31
    :cond_2
    return v0
.end method

.method public h(Lba1;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ley;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lba1;

    .line 4
    .line 5
    iput-object p1, p0, Ley;->h:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, Ley;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lq03;

    .line 10
    .line 11
    iget-object v1, p0, Lq03;->a:[Ljava/lang/Object;

    .line 12
    .line 13
    iget p0, p0, Lq03;->b:I

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, p0, :cond_0

    .line 17
    .line 18
    aget-object v3, v1, v2

    .line 19
    .line 20
    check-cast v3, Lt91;

    .line 21
    .line 22
    invoke-interface {v3, v0, p1}, Lt91;->a(Lba1;Lba1;)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method public i(Landroid/view/KeyEvent;)Z
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Lfh0;->a(I)J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-static/range {p1 .. p1}, Lhw;->n(Landroid/view/KeyEvent;)I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/4 v4, 0x2

    .line 16
    const v10, -0x3361d2af    # -8.2930312E7f

    .line 17
    .line 18
    .line 19
    const-wide/16 v15, 0x0

    .line 20
    .line 21
    const-wide v17, 0x101010101010101L

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    const-wide/16 v19, 0xfe

    .line 27
    .line 28
    const/16 p1, 0x6

    .line 29
    .line 30
    const/16 v5, 0x8

    .line 31
    .line 32
    const/16 v21, 0x0

    .line 33
    .line 34
    const-wide/16 v22, 0x1

    .line 35
    .line 36
    const/4 v6, 0x3

    .line 37
    const/4 v7, 0x1

    .line 38
    if-ne v3, v4, :cond_10

    .line 39
    .line 40
    iget-object v3, v0, Ley;->f:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Ln03;

    .line 43
    .line 44
    if-nez v3, :cond_0

    .line 45
    .line 46
    new-instance v3, Ln03;

    .line 47
    .line 48
    invoke-direct {v3, v6}, Ln03;-><init>(I)V

    .line 49
    .line 50
    .line 51
    iput-object v3, v0, Ley;->f:Ljava/lang/Object;

    .line 52
    .line 53
    :cond_0
    move-object v4, v3

    .line 54
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    mul-int/2addr v0, v10

    .line 59
    shl-int/lit8 v3, v0, 0x10

    .line 60
    .line 61
    xor-int/2addr v0, v3

    .line 62
    ushr-int/lit8 v3, v0, 0x7

    .line 63
    .line 64
    and-int/lit8 v0, v0, 0x7f

    .line 65
    .line 66
    move/from16 v24, v6

    .line 67
    .line 68
    iget v6, v4, Ln03;->c:I

    .line 69
    .line 70
    and-int v25, v3, v6

    .line 71
    .line 72
    move/from16 v26, v21

    .line 73
    .line 74
    const/16 v27, 0x3f

    .line 75
    .line 76
    :goto_0
    iget-object v8, v4, Ln03;->a:[J

    .line 77
    .line 78
    shr-int/lit8 v28, v25, 0x3

    .line 79
    .line 80
    and-int/lit8 v29, v25, 0x7

    .line 81
    .line 82
    const/16 v30, 0x7

    .line 83
    .line 84
    shl-int/lit8 v9, v29, 0x3

    .line 85
    .line 86
    aget-wide v31, v8, v28

    .line 87
    .line 88
    ushr-long v31, v31, v9

    .line 89
    .line 90
    add-int/lit8 v28, v28, 0x1

    .line 91
    .line 92
    aget-wide v28, v8, v28

    .line 93
    .line 94
    rsub-int/lit8 v8, v9, 0x40

    .line 95
    .line 96
    shl-long v28, v28, v8

    .line 97
    .line 98
    int-to-long v8, v9

    .line 99
    neg-long v8, v8

    .line 100
    shr-long v8, v8, v27

    .line 101
    .line 102
    and-long v8, v28, v8

    .line 103
    .line 104
    or-long v8, v31, v8

    .line 105
    .line 106
    move/from16 v28, v10

    .line 107
    .line 108
    const-wide/16 v31, 0xff

    .line 109
    .line 110
    int-to-long v10, v0

    .line 111
    mul-long v33, v10, v17

    .line 112
    .line 113
    const-wide v35, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    xor-long v13, v8, v33

    .line 119
    .line 120
    sub-long v33, v13, v17

    .line 121
    .line 122
    not-long v12, v13

    .line 123
    and-long v12, v33, v12

    .line 124
    .line 125
    and-long v12, v12, v35

    .line 126
    .line 127
    :goto_1
    cmp-long v14, v12, v15

    .line 128
    .line 129
    if-eqz v14, :cond_2

    .line 130
    .line 131
    invoke-static {v12, v13}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 132
    .line 133
    .line 134
    move-result v14

    .line 135
    shr-int/lit8 v14, v14, 0x3

    .line 136
    .line 137
    add-int v14, v25, v14

    .line 138
    .line 139
    and-int/2addr v14, v6

    .line 140
    move-wide/from16 v33, v15

    .line 141
    .line 142
    iget-object v15, v4, Ln03;->b:[J

    .line 143
    .line 144
    aget-wide v37, v15, v14

    .line 145
    .line 146
    cmp-long v15, v37, v1

    .line 147
    .line 148
    if-nez v15, :cond_1

    .line 149
    .line 150
    move/from16 v37, v7

    .line 151
    .line 152
    goto/16 :goto_a

    .line 153
    .line 154
    :cond_1
    sub-long v14, v12, v22

    .line 155
    .line 156
    and-long/2addr v12, v14

    .line 157
    move-wide/from16 v15, v33

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_2
    move-wide/from16 v33, v15

    .line 161
    .line 162
    not-long v12, v8

    .line 163
    shl-long v12, v12, p1

    .line 164
    .line 165
    and-long/2addr v8, v12

    .line 166
    and-long v8, v8, v35

    .line 167
    .line 168
    cmp-long v8, v8, v33

    .line 169
    .line 170
    if-eqz v8, :cond_f

    .line 171
    .line 172
    invoke-virtual {v4, v3}, Ln03;->b(I)I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    iget v6, v4, Ln03;->e:I

    .line 177
    .line 178
    if-nez v6, :cond_3

    .line 179
    .line 180
    iget-object v6, v4, Ln03;->a:[J

    .line 181
    .line 182
    shr-int/lit8 v12, v0, 0x3

    .line 183
    .line 184
    aget-wide v12, v6, v12

    .line 185
    .line 186
    and-int/lit8 v6, v0, 0x7

    .line 187
    .line 188
    shl-int/lit8 v6, v6, 0x3

    .line 189
    .line 190
    shr-long/2addr v12, v6

    .line 191
    and-long v12, v12, v31

    .line 192
    .line 193
    cmp-long v6, v12, v19

    .line 194
    .line 195
    if-nez v6, :cond_4

    .line 196
    .line 197
    :cond_3
    move/from16 v37, v7

    .line 198
    .line 199
    const-wide/16 p0, 0x80

    .line 200
    .line 201
    goto/16 :goto_9

    .line 202
    .line 203
    :cond_4
    iget v0, v4, Ln03;->c:I

    .line 204
    .line 205
    if-le v0, v5, :cond_c

    .line 206
    .line 207
    iget v6, v4, Ln03;->d:I

    .line 208
    .line 209
    int-to-long v12, v6

    .line 210
    const-wide/16 v14, 0x20

    .line 211
    .line 212
    mul-long/2addr v12, v14

    .line 213
    int-to-long v14, v0

    .line 214
    const-wide/16 v16, 0x19

    .line 215
    .line 216
    mul-long v14, v14, v16

    .line 217
    .line 218
    const-wide/high16 v16, -0x8000000000000000L

    .line 219
    .line 220
    xor-long v12, v12, v16

    .line 221
    .line 222
    xor-long v14, v14, v16

    .line 223
    .line 224
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Long;->compare(JJ)I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-gtz v0, :cond_c

    .line 229
    .line 230
    iget-object v0, v4, Ln03;->a:[J

    .line 231
    .line 232
    iget v6, v4, Ln03;->c:I

    .line 233
    .line 234
    iget-object v12, v4, Ln03;->b:[J

    .line 235
    .line 236
    add-int/lit8 v13, v6, 0x7

    .line 237
    .line 238
    shr-int/lit8 v13, v13, 0x3

    .line 239
    .line 240
    move/from16 v14, v21

    .line 241
    .line 242
    :goto_2
    if-ge v14, v13, :cond_5

    .line 243
    .line 244
    aget-wide v22, v0, v14

    .line 245
    .line 246
    const-wide/16 p0, 0x80

    .line 247
    .line 248
    and-long v8, v22, v35

    .line 249
    .line 250
    move v15, v5

    .line 251
    move/from16 v18, v6

    .line 252
    .line 253
    not-long v5, v8

    .line 254
    ushr-long v8, v8, v30

    .line 255
    .line 256
    add-long/2addr v5, v8

    .line 257
    const-wide v8, -0x101010101010102L

    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    and-long/2addr v5, v8

    .line 263
    aput-wide v5, v0, v14

    .line 264
    .line 265
    add-int/lit8 v14, v14, 0x1

    .line 266
    .line 267
    move v5, v15

    .line 268
    move/from16 v6, v18

    .line 269
    .line 270
    goto :goto_2

    .line 271
    :cond_5
    move v15, v5

    .line 272
    move/from16 v18, v6

    .line 273
    .line 274
    const-wide/16 p0, 0x80

    .line 275
    .line 276
    invoke-static {v0}, Lti;->j0([J)I

    .line 277
    .line 278
    .line 279
    move-result v5

    .line 280
    add-int/lit8 v6, v5, -0x1

    .line 281
    .line 282
    aget-wide v8, v0, v6

    .line 283
    .line 284
    const-wide v13, 0xffffffffffffffL

    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    and-long/2addr v8, v13

    .line 290
    const-wide/high16 v22, -0x100000000000000L

    .line 291
    .line 292
    or-long v8, v8, v22

    .line 293
    .line 294
    aput-wide v8, v0, v6

    .line 295
    .line 296
    aget-wide v8, v0, v21

    .line 297
    .line 298
    aput-wide v8, v0, v5

    .line 299
    .line 300
    move/from16 v5, v18

    .line 301
    .line 302
    move/from16 v6, v21

    .line 303
    .line 304
    :goto_3
    if-eq v6, v5, :cond_a

    .line 305
    .line 306
    shr-int/lit8 v8, v6, 0x3

    .line 307
    .line 308
    aget-wide v22, v0, v8

    .line 309
    .line 310
    and-int/lit8 v9, v6, 0x7

    .line 311
    .line 312
    shl-int/lit8 v9, v9, 0x3

    .line 313
    .line 314
    shr-long v22, v22, v9

    .line 315
    .line 316
    and-long v22, v22, v31

    .line 317
    .line 318
    cmp-long v18, v22, p0

    .line 319
    .line 320
    if-nez v18, :cond_6

    .line 321
    .line 322
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 323
    .line 324
    goto :goto_3

    .line 325
    :cond_6
    cmp-long v18, v22, v19

    .line 326
    .line 327
    if-eqz v18, :cond_7

    .line 328
    .line 329
    goto :goto_4

    .line 330
    :cond_7
    aget-wide v22, v12, v6

    .line 331
    .line 332
    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->hashCode(J)I

    .line 333
    .line 334
    .line 335
    move-result v18

    .line 336
    mul-int v18, v18, v28

    .line 337
    .line 338
    shl-int/lit8 v22, v18, 0x10

    .line 339
    .line 340
    xor-int v18, v18, v22

    .line 341
    .line 342
    move-wide/from16 v22, v13

    .line 343
    .line 344
    ushr-int/lit8 v13, v18, 0x7

    .line 345
    .line 346
    invoke-virtual {v4, v13}, Ln03;->b(I)I

    .line 347
    .line 348
    .line 349
    move-result v14

    .line 350
    and-int/2addr v13, v5

    .line 351
    sub-int v25, v14, v13

    .line 352
    .line 353
    and-int v25, v25, v5

    .line 354
    .line 355
    move/from16 v29, v15

    .line 356
    .line 357
    div-int/lit8 v15, v25, 0x8

    .line 358
    .line 359
    sub-int v13, v6, v13

    .line 360
    .line 361
    and-int/2addr v13, v5

    .line 362
    div-int/lit8 v13, v13, 0x8

    .line 363
    .line 364
    if-ne v15, v13, :cond_8

    .line 365
    .line 366
    and-int/lit8 v13, v18, 0x7f

    .line 367
    .line 368
    int-to-long v13, v13

    .line 369
    aget-wide v25, v0, v8

    .line 370
    .line 371
    move v15, v7

    .line 372
    move/from16 v27, v8

    .line 373
    .line 374
    shl-long v7, v31, v9

    .line 375
    .line 376
    not-long v7, v7

    .line 377
    and-long v7, v25, v7

    .line 378
    .line 379
    shl-long/2addr v13, v9

    .line 380
    or-long/2addr v7, v13

    .line 381
    aput-wide v7, v0, v27

    .line 382
    .line 383
    array-length v7, v0

    .line 384
    sub-int/2addr v7, v15

    .line 385
    aget-wide v8, v0, v21

    .line 386
    .line 387
    and-long v8, v8, v22

    .line 388
    .line 389
    or-long v8, v8, v16

    .line 390
    .line 391
    aput-wide v8, v0, v7

    .line 392
    .line 393
    add-int/lit8 v6, v6, 0x1

    .line 394
    .line 395
    move v7, v15

    .line 396
    move-wide/from16 v13, v22

    .line 397
    .line 398
    move/from16 v15, v29

    .line 399
    .line 400
    goto :goto_3

    .line 401
    :cond_8
    move v15, v7

    .line 402
    move/from16 v27, v8

    .line 403
    .line 404
    shr-int/lit8 v7, v14, 0x3

    .line 405
    .line 406
    aget-wide v25, v0, v7

    .line 407
    .line 408
    and-int/lit8 v8, v14, 0x7

    .line 409
    .line 410
    shl-int/lit8 v8, v8, 0x3

    .line 411
    .line 412
    shr-long v35, v25, v8

    .line 413
    .line 414
    and-long v35, v35, v31

    .line 415
    .line 416
    cmp-long v13, v35, p0

    .line 417
    .line 418
    if-nez v13, :cond_9

    .line 419
    .line 420
    and-int/lit8 v13, v18, 0x7f

    .line 421
    .line 422
    move/from16 v35, v5

    .line 423
    .line 424
    move/from16 v36, v6

    .line 425
    .line 426
    int-to-long v5, v13

    .line 427
    move-wide/from16 v37, v5

    .line 428
    .line 429
    shl-long v5, v31, v8

    .line 430
    .line 431
    not-long v5, v5

    .line 432
    and-long v5, v25, v5

    .line 433
    .line 434
    shl-long v25, v37, v8

    .line 435
    .line 436
    or-long v5, v5, v25

    .line 437
    .line 438
    aput-wide v5, v0, v7

    .line 439
    .line 440
    aget-wide v5, v0, v27

    .line 441
    .line 442
    shl-long v7, v31, v9

    .line 443
    .line 444
    not-long v7, v7

    .line 445
    and-long/2addr v5, v7

    .line 446
    shl-long v7, p0, v9

    .line 447
    .line 448
    or-long/2addr v5, v7

    .line 449
    aput-wide v5, v0, v27

    .line 450
    .line 451
    aget-wide v5, v12, v36

    .line 452
    .line 453
    aput-wide v5, v12, v14

    .line 454
    .line 455
    aput-wide v33, v12, v36

    .line 456
    .line 457
    move/from16 v6, v36

    .line 458
    .line 459
    goto :goto_5

    .line 460
    :cond_9
    move/from16 v35, v5

    .line 461
    .line 462
    move/from16 v36, v6

    .line 463
    .line 464
    and-int/lit8 v5, v18, 0x7f

    .line 465
    .line 466
    int-to-long v5, v5

    .line 467
    move-wide/from16 v37, v5

    .line 468
    .line 469
    shl-long v5, v31, v8

    .line 470
    .line 471
    not-long v5, v5

    .line 472
    and-long v5, v25, v5

    .line 473
    .line 474
    shl-long v8, v37, v8

    .line 475
    .line 476
    or-long/2addr v5, v8

    .line 477
    aput-wide v5, v0, v7

    .line 478
    .line 479
    aget-wide v5, v12, v14

    .line 480
    .line 481
    aget-wide v7, v12, v36

    .line 482
    .line 483
    aput-wide v7, v12, v14

    .line 484
    .line 485
    aput-wide v5, v12, v36

    .line 486
    .line 487
    add-int/lit8 v6, v36, -0x1

    .line 488
    .line 489
    :goto_5
    array-length v5, v0

    .line 490
    sub-int/2addr v5, v15

    .line 491
    aget-wide v7, v0, v21

    .line 492
    .line 493
    and-long v7, v7, v22

    .line 494
    .line 495
    or-long v7, v7, v16

    .line 496
    .line 497
    aput-wide v7, v0, v5

    .line 498
    .line 499
    add-int/2addr v6, v15

    .line 500
    move v7, v15

    .line 501
    move-wide/from16 v13, v22

    .line 502
    .line 503
    move/from16 v15, v29

    .line 504
    .line 505
    move/from16 v5, v35

    .line 506
    .line 507
    goto/16 :goto_3

    .line 508
    .line 509
    :cond_a
    move v15, v7

    .line 510
    iget v0, v4, Ln03;->c:I

    .line 511
    .line 512
    invoke-static {v0}, Lv54;->a(I)I

    .line 513
    .line 514
    .line 515
    move-result v0

    .line 516
    iget v5, v4, Ln03;->d:I

    .line 517
    .line 518
    sub-int/2addr v0, v5

    .line 519
    iput v0, v4, Ln03;->e:I

    .line 520
    .line 521
    :cond_b
    move/from16 v37, v15

    .line 522
    .line 523
    goto/16 :goto_8

    .line 524
    .line 525
    :cond_c
    move v15, v7

    .line 526
    const-wide/16 p0, 0x80

    .line 527
    .line 528
    iget v0, v4, Ln03;->c:I

    .line 529
    .line 530
    invoke-static {v0}, Lv54;->b(I)I

    .line 531
    .line 532
    .line 533
    move-result v0

    .line 534
    iget-object v5, v4, Ln03;->a:[J

    .line 535
    .line 536
    iget-object v6, v4, Ln03;->b:[J

    .line 537
    .line 538
    iget v7, v4, Ln03;->c:I

    .line 539
    .line 540
    invoke-virtual {v4, v0}, Ln03;->c(I)V

    .line 541
    .line 542
    .line 543
    iget-object v0, v4, Ln03;->a:[J

    .line 544
    .line 545
    iget-object v8, v4, Ln03;->b:[J

    .line 546
    .line 547
    iget v9, v4, Ln03;->c:I

    .line 548
    .line 549
    move/from16 v12, v21

    .line 550
    .line 551
    :goto_6
    if-ge v12, v7, :cond_b

    .line 552
    .line 553
    shr-int/lit8 v13, v12, 0x3

    .line 554
    .line 555
    aget-wide v13, v5, v13

    .line 556
    .line 557
    and-int/lit8 v16, v12, 0x7

    .line 558
    .line 559
    shl-int/lit8 v16, v16, 0x3

    .line 560
    .line 561
    shr-long v13, v13, v16

    .line 562
    .line 563
    and-long v13, v13, v31

    .line 564
    .line 565
    cmp-long v13, v13, p0

    .line 566
    .line 567
    if-gez v13, :cond_d

    .line 568
    .line 569
    aget-wide v13, v6, v12

    .line 570
    .line 571
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 572
    .line 573
    .line 574
    move-result v16

    .line 575
    mul-int v16, v16, v28

    .line 576
    .line 577
    shl-int/lit8 v17, v16, 0x10

    .line 578
    .line 579
    xor-int v16, v16, v17

    .line 580
    .line 581
    move/from16 v37, v15

    .line 582
    .line 583
    ushr-int/lit8 v15, v16, 0x7

    .line 584
    .line 585
    invoke-virtual {v4, v15}, Ln03;->b(I)I

    .line 586
    .line 587
    .line 588
    move-result v15

    .line 589
    move-object/from16 v17, v0

    .line 590
    .line 591
    and-int/lit8 v0, v16, 0x7f

    .line 592
    .line 593
    move-object/from16 v16, v5

    .line 594
    .line 595
    move-object/from16 v18, v6

    .line 596
    .line 597
    int-to-long v5, v0

    .line 598
    shr-int/lit8 v0, v15, 0x3

    .line 599
    .line 600
    and-int/lit8 v19, v15, 0x7

    .line 601
    .line 602
    shl-int/lit8 v19, v19, 0x3

    .line 603
    .line 604
    aget-wide v22, v17, v0

    .line 605
    .line 606
    move-wide/from16 v25, v5

    .line 607
    .line 608
    shl-long v5, v31, v19

    .line 609
    .line 610
    not-long v5, v5

    .line 611
    and-long v5, v22, v5

    .line 612
    .line 613
    shl-long v19, v25, v19

    .line 614
    .line 615
    or-long v5, v5, v19

    .line 616
    .line 617
    aput-wide v5, v17, v0

    .line 618
    .line 619
    add-int/lit8 v0, v15, -0x7

    .line 620
    .line 621
    and-int/2addr v0, v9

    .line 622
    and-int/lit8 v19, v9, 0x7

    .line 623
    .line 624
    add-int v0, v0, v19

    .line 625
    .line 626
    shr-int/lit8 v0, v0, 0x3

    .line 627
    .line 628
    aput-wide v5, v17, v0

    .line 629
    .line 630
    aput-wide v13, v8, v15

    .line 631
    .line 632
    goto :goto_7

    .line 633
    :cond_d
    move-object/from16 v17, v0

    .line 634
    .line 635
    move-object/from16 v16, v5

    .line 636
    .line 637
    move-object/from16 v18, v6

    .line 638
    .line 639
    move/from16 v37, v15

    .line 640
    .line 641
    :goto_7
    add-int/lit8 v12, v12, 0x1

    .line 642
    .line 643
    move-object/from16 v5, v16

    .line 644
    .line 645
    move-object/from16 v0, v17

    .line 646
    .line 647
    move-object/from16 v6, v18

    .line 648
    .line 649
    move/from16 v15, v37

    .line 650
    .line 651
    goto :goto_6

    .line 652
    :goto_8
    invoke-virtual {v4, v3}, Ln03;->b(I)I

    .line 653
    .line 654
    .line 655
    move-result v0

    .line 656
    :goto_9
    move v14, v0

    .line 657
    iget v0, v4, Ln03;->d:I

    .line 658
    .line 659
    add-int/lit8 v0, v0, 0x1

    .line 660
    .line 661
    iput v0, v4, Ln03;->d:I

    .line 662
    .line 663
    iget v0, v4, Ln03;->e:I

    .line 664
    .line 665
    iget-object v3, v4, Ln03;->a:[J

    .line 666
    .line 667
    shr-int/lit8 v5, v14, 0x3

    .line 668
    .line 669
    aget-wide v6, v3, v5

    .line 670
    .line 671
    and-int/lit8 v8, v14, 0x7

    .line 672
    .line 673
    shl-int/lit8 v8, v8, 0x3

    .line 674
    .line 675
    shr-long v12, v6, v8

    .line 676
    .line 677
    and-long v12, v12, v31

    .line 678
    .line 679
    cmp-long v9, v12, p0

    .line 680
    .line 681
    if-nez v9, :cond_e

    .line 682
    .line 683
    move/from16 v21, v37

    .line 684
    .line 685
    :cond_e
    sub-int v0, v0, v21

    .line 686
    .line 687
    iput v0, v4, Ln03;->e:I

    .line 688
    .line 689
    iget v0, v4, Ln03;->c:I

    .line 690
    .line 691
    shl-long v12, v31, v8

    .line 692
    .line 693
    not-long v12, v12

    .line 694
    and-long/2addr v6, v12

    .line 695
    shl-long v8, v10, v8

    .line 696
    .line 697
    or-long/2addr v6, v8

    .line 698
    aput-wide v6, v3, v5

    .line 699
    .line 700
    add-int/lit8 v5, v14, -0x7

    .line 701
    .line 702
    and-int/2addr v5, v0

    .line 703
    and-int/lit8 v0, v0, 0x7

    .line 704
    .line 705
    add-int/2addr v5, v0

    .line 706
    shr-int/lit8 v0, v5, 0x3

    .line 707
    .line 708
    aput-wide v6, v3, v0

    .line 709
    .line 710
    :goto_a
    iget-object v0, v4, Ln03;->b:[J

    .line 711
    .line 712
    aput-wide v1, v0, v14

    .line 713
    .line 714
    return v37

    .line 715
    :cond_f
    move/from16 v29, v5

    .line 716
    .line 717
    move/from16 v37, v7

    .line 718
    .line 719
    add-int/lit8 v26, v26, 0x8

    .line 720
    .line 721
    add-int v25, v25, v26

    .line 722
    .line 723
    and-int v25, v25, v6

    .line 724
    .line 725
    move/from16 v10, v28

    .line 726
    .line 727
    move-wide/from16 v15, v33

    .line 728
    .line 729
    goto/16 :goto_0

    .line 730
    .line 731
    :cond_10
    move/from16 v29, v5

    .line 732
    .line 733
    move/from16 v24, v6

    .line 734
    .line 735
    move/from16 v28, v10

    .line 736
    .line 737
    move-wide/from16 v33, v15

    .line 738
    .line 739
    const/16 v27, 0x3f

    .line 740
    .line 741
    const/16 v30, 0x7

    .line 742
    .line 743
    const-wide/16 v31, 0xff

    .line 744
    .line 745
    const-wide v35, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    move v15, v7

    .line 751
    if-ne v3, v15, :cond_16

    .line 752
    .line 753
    iget-object v3, v0, Ley;->f:Ljava/lang/Object;

    .line 754
    .line 755
    check-cast v3, Ln03;

    .line 756
    .line 757
    if-eqz v3, :cond_15

    .line 758
    .line 759
    invoke-virtual {v3, v1, v2}, Ln03;->a(J)Z

    .line 760
    .line 761
    .line 762
    move-result v3

    .line 763
    if-ne v3, v15, :cond_15

    .line 764
    .line 765
    iget-object v0, v0, Ley;->f:Ljava/lang/Object;

    .line 766
    .line 767
    check-cast v0, Ln03;

    .line 768
    .line 769
    if-eqz v0, :cond_13

    .line 770
    .line 771
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 772
    .line 773
    .line 774
    move-result v3

    .line 775
    mul-int v3, v3, v28

    .line 776
    .line 777
    shl-int/lit8 v4, v3, 0x10

    .line 778
    .line 779
    xor-int/2addr v3, v4

    .line 780
    and-int/lit8 v4, v3, 0x7f

    .line 781
    .line 782
    iget v5, v0, Ln03;->c:I

    .line 783
    .line 784
    ushr-int/lit8 v3, v3, 0x7

    .line 785
    .line 786
    :goto_b
    and-int/2addr v3, v5

    .line 787
    iget-object v6, v0, Ln03;->a:[J

    .line 788
    .line 789
    shr-int/lit8 v7, v3, 0x3

    .line 790
    .line 791
    and-int/lit8 v8, v3, 0x7

    .line 792
    .line 793
    shl-int/lit8 v8, v8, 0x3

    .line 794
    .line 795
    aget-wide v9, v6, v7

    .line 796
    .line 797
    ushr-long/2addr v9, v8

    .line 798
    const/4 v15, 0x1

    .line 799
    add-int/2addr v7, v15

    .line 800
    aget-wide v11, v6, v7

    .line 801
    .line 802
    rsub-int/lit8 v6, v8, 0x40

    .line 803
    .line 804
    shl-long v6, v11, v6

    .line 805
    .line 806
    int-to-long v11, v8

    .line 807
    neg-long v11, v11

    .line 808
    shr-long v11, v11, v27

    .line 809
    .line 810
    and-long/2addr v6, v11

    .line 811
    or-long/2addr v6, v9

    .line 812
    int-to-long v8, v4

    .line 813
    mul-long v8, v8, v17

    .line 814
    .line 815
    xor-long/2addr v8, v6

    .line 816
    sub-long v10, v8, v17

    .line 817
    .line 818
    not-long v8, v8

    .line 819
    and-long/2addr v8, v10

    .line 820
    and-long v8, v8, v35

    .line 821
    .line 822
    :goto_c
    cmp-long v10, v8, v33

    .line 823
    .line 824
    if-eqz v10, :cond_12

    .line 825
    .line 826
    invoke-static {v8, v9}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 827
    .line 828
    .line 829
    move-result v10

    .line 830
    shr-int/lit8 v10, v10, 0x3

    .line 831
    .line 832
    add-int/2addr v10, v3

    .line 833
    and-int/2addr v10, v5

    .line 834
    iget-object v11, v0, Ln03;->b:[J

    .line 835
    .line 836
    aget-wide v12, v11, v10

    .line 837
    .line 838
    cmp-long v11, v12, v1

    .line 839
    .line 840
    if-nez v11, :cond_11

    .line 841
    .line 842
    goto :goto_d

    .line 843
    :cond_11
    sub-long v10, v8, v22

    .line 844
    .line 845
    and-long/2addr v8, v10

    .line 846
    goto :goto_c

    .line 847
    :cond_12
    not-long v8, v6

    .line 848
    shl-long v8, v8, p1

    .line 849
    .line 850
    and-long/2addr v6, v8

    .line 851
    and-long v6, v6, v35

    .line 852
    .line 853
    cmp-long v6, v6, v33

    .line 854
    .line 855
    if-eqz v6, :cond_14

    .line 856
    .line 857
    const/4 v10, -0x1

    .line 858
    :goto_d
    if-ltz v10, :cond_13

    .line 859
    .line 860
    iget v1, v0, Ln03;->d:I

    .line 861
    .line 862
    const/4 v15, 0x1

    .line 863
    sub-int/2addr v1, v15

    .line 864
    iput v1, v0, Ln03;->d:I

    .line 865
    .line 866
    iget-object v1, v0, Ln03;->a:[J

    .line 867
    .line 868
    iget v0, v0, Ln03;->c:I

    .line 869
    .line 870
    shr-int/lit8 v2, v10, 0x3

    .line 871
    .line 872
    and-int/lit8 v3, v10, 0x7

    .line 873
    .line 874
    shl-int/lit8 v3, v3, 0x3

    .line 875
    .line 876
    aget-wide v4, v1, v2

    .line 877
    .line 878
    shl-long v6, v31, v3

    .line 879
    .line 880
    not-long v6, v6

    .line 881
    and-long/2addr v4, v6

    .line 882
    shl-long v6, v19, v3

    .line 883
    .line 884
    or-long v3, v4, v6

    .line 885
    .line 886
    aput-wide v3, v1, v2

    .line 887
    .line 888
    add-int/lit8 v10, v10, -0x7

    .line 889
    .line 890
    and-int v2, v10, v0

    .line 891
    .line 892
    and-int/lit8 v0, v0, 0x7

    .line 893
    .line 894
    add-int/2addr v2, v0

    .line 895
    shr-int/lit8 v0, v2, 0x3

    .line 896
    .line 897
    aput-wide v3, v1, v0

    .line 898
    .line 899
    const/4 v15, 0x1

    .line 900
    return v15

    .line 901
    :cond_13
    const/4 v15, 0x1

    .line 902
    goto :goto_e

    .line 903
    :cond_14
    const/4 v15, 0x1

    .line 904
    add-int/lit8 v21, v21, 0x8

    .line 905
    .line 906
    add-int v3, v3, v21

    .line 907
    .line 908
    goto :goto_b

    .line 909
    :cond_15
    return v21

    .line 910
    :cond_16
    :goto_e
    return v15
.end method
