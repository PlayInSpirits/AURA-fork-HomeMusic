.class public final Llo;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;

.field public final l:Ljava/lang/Object;

.field public final m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x100

    .line 5
    .line 6
    new-array v1, v0, [Z

    .line 7
    .line 8
    iput-object v1, p0, Llo;->a:Ljava/lang/Object;

    .line 9
    .line 10
    new-array v1, v0, [B

    .line 11
    .line 12
    iput-object v1, p0, Llo;->b:Ljava/lang/Object;

    .line 13
    .line 14
    const/16 v1, 0x4652

    .line 15
    .line 16
    new-array v2, v1, [B

    .line 17
    .line 18
    iput-object v2, p0, Llo;->c:Ljava/lang/Object;

    .line 19
    .line 20
    new-array v1, v1, [B

    .line 21
    .line 22
    iput-object v1, p0, Llo;->d:Ljava/lang/Object;

    .line 23
    .line 24
    new-array v1, v0, [I

    .line 25
    .line 26
    iput-object v1, p0, Llo;->g:Ljava/lang/Object;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    new-array v2, v1, [I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/16 v4, 0x102

    .line 33
    .line 34
    aput v4, v2, v3

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, 0x6

    .line 38
    aput v6, v2, v5

    .line 39
    .line 40
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    invoke-static {v7, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, [[I

    .line 47
    .line 48
    iput-object v2, p0, Llo;->k:Ljava/lang/Object;

    .line 49
    .line 50
    new-array v2, v1, [I

    .line 51
    .line 52
    aput v4, v2, v3

    .line 53
    .line 54
    aput v6, v2, v5

    .line 55
    .line 56
    invoke-static {v7, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, [[I

    .line 61
    .line 62
    iput-object v2, p0, Llo;->l:Ljava/lang/Object;

    .line 63
    .line 64
    new-array v2, v1, [I

    .line 65
    .line 66
    aput v4, v2, v3

    .line 67
    .line 68
    aput v6, v2, v5

    .line 69
    .line 70
    invoke-static {v7, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, [[I

    .line 75
    .line 76
    iput-object v2, p0, Llo;->m:Ljava/lang/Object;

    .line 77
    .line 78
    new-array v2, v6, [I

    .line 79
    .line 80
    iput-object v2, p0, Llo;->h:Ljava/lang/Object;

    .line 81
    .line 82
    const/16 v2, 0x101

    .line 83
    .line 84
    new-array v2, v2, [I

    .line 85
    .line 86
    iput-object v2, p0, Llo;->i:Ljava/lang/Object;

    .line 87
    .line 88
    new-array v0, v0, [C

    .line 89
    .line 90
    iput-object v0, p0, Llo;->n:Ljava/lang/Object;

    .line 91
    .line 92
    new-array v0, v1, [I

    .line 93
    .line 94
    aput v4, v0, v3

    .line 95
    .line 96
    aput v6, v0, v5

    .line 97
    .line 98
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 99
    .line 100
    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, [[C

    .line 105
    .line 106
    iput-object v0, p0, Llo;->o:Ljava/lang/Object;

    .line 107
    .line 108
    new-array v0, v6, [B

    .line 109
    .line 110
    iput-object v0, p0, Llo;->e:Ljava/lang/Object;

    .line 111
    .line 112
    const v0, 0x186a0

    .line 113
    .line 114
    .line 115
    mul-int/2addr p1, v0

    .line 116
    new-array p1, p1, [B

    .line 117
    .line 118
    iput-object p1, p0, Llo;->f:Ljava/lang/Object;

    .line 119
    .line 120
    return-void
.end method

.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;)V
    .locals 0

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    iput-object p1, p0, Llo;->a:Ljava/lang/Object;

    .line 137
    iput-object p2, p0, Llo;->b:Ljava/lang/Object;

    .line 138
    iput-object p3, p0, Llo;->c:Ljava/lang/Object;

    .line 139
    iput-object p4, p0, Llo;->d:Ljava/lang/Object;

    .line 140
    iput-object p5, p0, Llo;->e:Ljava/lang/Object;

    .line 141
    iput-object p6, p0, Llo;->f:Ljava/lang/Object;

    .line 142
    iput-object p7, p0, Llo;->g:Ljava/lang/Object;

    .line 143
    iput-object p8, p0, Llo;->h:Ljava/lang/Object;

    .line 144
    iput-object p9, p0, Llo;->i:Ljava/lang/Object;

    .line 145
    iput-object p10, p0, Llo;->j:Ljava/lang/Object;

    .line 146
    iput-object p11, p0, Llo;->k:Ljava/lang/Object;

    .line 147
    iput-object p12, p0, Llo;->l:Ljava/lang/Object;

    .line 148
    iput-object p13, p0, Llo;->m:Ljava/lang/Object;

    .line 149
    iput-object p14, p0, Llo;->n:Ljava/lang/Object;

    .line 150
    iput-object p15, p0, Llo;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/search/SearchView;)V
    .locals 2

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 122
    iput-object p1, p0, Llo;->a:Ljava/lang/Object;

    .line 123
    iget-object v0, p1, Lcom/google/android/material/search/SearchView;->n:Landroid/view/View;

    iput-object v0, p0, Llo;->b:Ljava/lang/Object;

    .line 124
    iget-object v0, p1, Lcom/google/android/material/search/SearchView;->o:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    iput-object v0, p0, Llo;->c:Ljava/lang/Object;

    .line 125
    iget-object v1, p1, Lcom/google/android/material/search/SearchView;->r:Landroid/widget/FrameLayout;

    iput-object v1, p0, Llo;->d:Ljava/lang/Object;

    .line 126
    iget-object v1, p1, Lcom/google/android/material/search/SearchView;->s:Landroid/widget/FrameLayout;

    iput-object v1, p0, Llo;->e:Ljava/lang/Object;

    .line 127
    iget-object v1, p1, Lcom/google/android/material/search/SearchView;->t:Lcom/google/android/material/appbar/MaterialToolbar;

    iput-object v1, p0, Llo;->f:Ljava/lang/Object;

    .line 128
    iget-object v1, p1, Lcom/google/android/material/search/SearchView;->u:Landroidx/appcompat/widget/Toolbar;

    iput-object v1, p0, Llo;->g:Ljava/lang/Object;

    .line 129
    iget-object v1, p1, Lcom/google/android/material/search/SearchView;->v:Landroid/widget/TextView;

    iput-object v1, p0, Llo;->h:Ljava/lang/Object;

    .line 130
    iget-object v1, p1, Lcom/google/android/material/search/SearchView;->w:Landroid/widget/EditText;

    iput-object v1, p0, Llo;->i:Ljava/lang/Object;

    .line 131
    iget-object v1, p1, Lcom/google/android/material/search/SearchView;->x:Landroid/widget/ImageButton;

    iput-object v1, p0, Llo;->j:Ljava/lang/Object;

    .line 132
    iget-object v1, p1, Lcom/google/android/material/search/SearchView;->y:Landroid/view/View;

    iput-object v1, p0, Llo;->k:Ljava/lang/Object;

    .line 133
    iget-object p1, p1, Lcom/google/android/material/search/SearchView;->z:Lcom/google/android/material/internal/TouchObserverFrameLayout;

    iput-object p1, p0, Llo;->l:Ljava/lang/Object;

    .line 134
    new-instance p1, Lci2;

    invoke-direct {p1, v0}, Lci2;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Llo;->m:Ljava/lang/Object;

    return-void
.end method

.method public static a(Llo;F)V
    .locals 1

    .line 1
    iget-object v0, p0, Llo;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/ImageButton;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Llo;->k:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Llo;->l:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lcom/google/android/material/internal/TouchObserverFrameLayout;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Llo;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lcom/google/android/material/search/SearchView;

    .line 25
    .line 26
    iget-boolean v0, v0, Lcom/google/android/material/search/SearchView;->J:Z

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object p0, p0, Llo;->f:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 33
    .line 34
    invoke-static {p0}, Lgb;->y(Landroidx/appcompat/widget/Toolbar;)Landroidx/appcompat/widget/ActionMenuView;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method


# virtual methods
.method public b(Landroid/animation/AnimatorSet;)V
    .locals 7

    .line 1
    iget-object v0, p0, Llo;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 4
    .line 5
    invoke-static {v0}, Lgb;->F(Landroidx/appcompat/widget/Toolbar;)Landroid/widget/ImageButton;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object p0, p0, Llo;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lcom/google/android/material/search/SearchView;

    .line 19
    .line 20
    iget-boolean p0, p0, Lcom/google/android/material/search/SearchView;->I:Z

    .line 21
    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    instance-of p0, v0, Ldw0;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    const/4 v2, 0x1

    .line 28
    const/4 v3, 0x2

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    move-object p0, v0

    .line 32
    check-cast p0, Ldw0;

    .line 33
    .line 34
    new-array v4, v3, [F

    .line 35
    .line 36
    fill-array-data v4, :array_0

    .line 37
    .line 38
    .line 39
    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    new-instance v5, Lcn0;

    .line 44
    .line 45
    const/4 v6, 0x5

    .line 46
    invoke-direct {v5, v6, p0}, Lcn0;-><init>(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 50
    .line 51
    .line 52
    new-array p0, v2, [Landroid/animation/Animator;

    .line 53
    .line 54
    aput-object v4, p0, v1

    .line 55
    .line 56
    invoke-virtual {p1, p0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    instance-of p0, v0, Lv51;

    .line 60
    .line 61
    if-eqz p0, :cond_4

    .line 62
    .line 63
    check-cast v0, Lv51;

    .line 64
    .line 65
    new-array p0, v3, [F

    .line 66
    .line 67
    fill-array-data p0, :array_1

    .line 68
    .line 69
    .line 70
    invoke-static {p0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    new-instance v3, Lcn0;

    .line 75
    .line 76
    const/4 v4, 0x6

    .line 77
    invoke-direct {v3, v4, v0}, Lcn0;-><init>(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 81
    .line 82
    .line 83
    new-array v0, v2, [Landroid/animation/Animator;

    .line 84
    .line 85
    aput-object p0, v0, v1

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_2
    instance-of p0, v0, Ldw0;

    .line 92
    .line 93
    const/high16 p1, 0x3f800000    # 1.0f

    .line 94
    .line 95
    if-eqz p0, :cond_3

    .line 96
    .line 97
    move-object p0, v0

    .line 98
    check-cast p0, Ldw0;

    .line 99
    .line 100
    invoke-virtual {p0, p1}, Ldw0;->setProgress(F)V

    .line 101
    .line 102
    .line 103
    :cond_3
    instance-of p0, v0, Lv51;

    .line 104
    .line 105
    if-eqz p0, :cond_4

    .line 106
    .line 107
    check-cast v0, Lv51;

    .line 108
    .line 109
    invoke-virtual {v0, p1}, Lv51;->a(F)V

    .line 110
    .line 111
    .line 112
    :cond_4
    :goto_0
    return-void

    .line 113
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public c(Z)Landroid/animation/AnimatorSet;
    .locals 12

    .line 1
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Llo;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 9
    .line 10
    invoke-static {v1}, Lgb;->F(Landroidx/appcompat/widget/Toolbar;)Landroid/widget/ImageButton;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/16 v3, 0x1c

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    const/4 v5, 0x1

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v7, 0x0

    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0, v2}, Llo;->f(Landroid/view/View;)I

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    int-to-float v8, v8

    .line 28
    new-array v9, v4, [F

    .line 29
    .line 30
    aput v8, v9, v6

    .line 31
    .line 32
    aput v7, v9, v5

    .line 33
    .line 34
    invoke-static {v9}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    new-array v9, v5, [Landroid/view/View;

    .line 39
    .line 40
    aput-object v2, v9, v6

    .line 41
    .line 42
    new-instance v10, Lc30;

    .line 43
    .line 44
    new-instance v11, Lzr2;

    .line 45
    .line 46
    invoke-direct {v11, v3}, Lzr2;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v10, v11, v9}, Lc30;-><init>(Loz2;[Landroid/view/View;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v8, v10}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Llo;->g()I

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    int-to-float v9, v9

    .line 60
    new-array v10, v4, [F

    .line 61
    .line 62
    aput v9, v10, v6

    .line 63
    .line 64
    aput v7, v10, v5

    .line 65
    .line 66
    invoke-static {v10}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    new-array v10, v5, [Landroid/view/View;

    .line 71
    .line 72
    aput-object v2, v10, v6

    .line 73
    .line 74
    invoke-static {v10}, Lc30;->a([Landroid/view/View;)Lc30;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v9, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 79
    .line 80
    .line 81
    new-array v2, v4, [Landroid/animation/Animator;

    .line 82
    .line 83
    aput-object v8, v2, v6

    .line 84
    .line 85
    aput-object v9, v2, v5

    .line 86
    .line 87
    invoke-virtual {v0, v2}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 88
    .line 89
    .line 90
    :goto_0
    invoke-static {v1}, Lgb;->y(Landroidx/appcompat/widget/Toolbar;)Landroidx/appcompat/widget/ActionMenuView;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    if-nez v1, :cond_1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    invoke-virtual {p0, v1}, Llo;->e(Landroid/view/View;)I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    int-to-float v2, v2

    .line 102
    new-array v8, v4, [F

    .line 103
    .line 104
    aput v2, v8, v6

    .line 105
    .line 106
    aput v7, v8, v5

    .line 107
    .line 108
    invoke-static {v8}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    new-array v8, v5, [Landroid/view/View;

    .line 113
    .line 114
    aput-object v1, v8, v6

    .line 115
    .line 116
    new-instance v9, Lc30;

    .line 117
    .line 118
    new-instance v10, Lzr2;

    .line 119
    .line 120
    invoke-direct {v10, v3}, Lzr2;-><init>(I)V

    .line 121
    .line 122
    .line 123
    invoke-direct {v9, v10, v8}, Lc30;-><init>(Loz2;[Landroid/view/View;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v9}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Llo;->g()I

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    int-to-float p0, p0

    .line 134
    new-array v3, v4, [F

    .line 135
    .line 136
    aput p0, v3, v6

    .line 137
    .line 138
    aput v7, v3, v5

    .line 139
    .line 140
    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    new-array v3, v5, [Landroid/view/View;

    .line 145
    .line 146
    aput-object v1, v3, v6

    .line 147
    .line 148
    invoke-static {v3}, Lc30;->a([Landroid/view/View;)Lc30;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {p0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 153
    .line 154
    .line 155
    new-array v1, v4, [Landroid/animation/Animator;

    .line 156
    .line 157
    aput-object v2, v1, v6

    .line 158
    .line 159
    aput-object p0, v1, v5

    .line 160
    .line 161
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 162
    .line 163
    .line 164
    :goto_1
    if-eqz p1, :cond_2

    .line 165
    .line 166
    const-wide/16 v1, 0x12c

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_2
    const-wide/16 v1, 0xfa

    .line 170
    .line 171
    :goto_2
    invoke-virtual {v0, v1, v2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 172
    .line 173
    .line 174
    sget-object p0, Lyd;->b:La61;

    .line 175
    .line 176
    invoke-static {p1, p0}, Ld24;->a(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-virtual {v0, p0}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 181
    .line 182
    .line 183
    return-object v0
.end method

.method public d(Z)Landroid/animation/AnimatorSet;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Llo;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Landroidx/appcompat/widget/Toolbar;

    .line 8
    .line 9
    iget-object v3, v0, Llo;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Lcom/google/android/material/search/SearchView;

    .line 12
    .line 13
    new-instance v4, Landroid/animation/AnimatorSet;

    .line 14
    .line 15
    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v5, v0, Llo;->n:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v5, Landroid/animation/AnimatorSet;

    .line 21
    .line 22
    const/4 v6, 0x2

    .line 23
    const/4 v7, 0x1

    .line 24
    const/4 v8, 0x0

    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    new-instance v5, Landroid/animation/AnimatorSet;

    .line 29
    .line 30
    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v5}, Llo;->b(Landroid/animation/AnimatorSet;)V

    .line 34
    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    const-wide/16 v13, 0x12c

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const-wide/16 v13, 0xfa

    .line 42
    .line 43
    :goto_0
    invoke-virtual {v5, v13, v14}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 44
    .line 45
    .line 46
    sget-object v13, Lyd;->b:La61;

    .line 47
    .line 48
    invoke-static {v1, v13}, Ld24;->a(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 49
    .line 50
    .line 51
    move-result-object v13

    .line 52
    invoke-virtual {v5, v13}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual/range {p0 .. p1}, Llo;->c(Z)Landroid/animation/AnimatorSet;

    .line 56
    .line 57
    .line 58
    move-result-object v13

    .line 59
    new-array v14, v6, [Landroid/animation/Animator;

    .line 60
    .line 61
    aput-object v5, v14, v8

    .line 62
    .line 63
    aput-object v13, v14, v7

    .line 64
    .line 65
    invoke-virtual {v4, v14}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 66
    .line 67
    .line 68
    :goto_1
    if-eqz v1, :cond_2

    .line 69
    .line 70
    sget-object v5, Lyd;->a:Landroid/view/animation/LinearInterpolator;

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    sget-object v5, Lyd;->b:La61;

    .line 74
    .line 75
    :goto_2
    new-array v13, v6, [F

    .line 76
    .line 77
    fill-array-data v13, :array_0

    .line 78
    .line 79
    .line 80
    invoke-static {v13}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 81
    .line 82
    .line 83
    move-result-object v13

    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    const-wide/16 v14, 0x12c

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    const-wide/16 v14, 0xfa

    .line 90
    .line 91
    :goto_3
    invoke-virtual {v13, v14, v15}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v5}, Ld24;->a(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-virtual {v13, v5}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 99
    .line 100
    .line 101
    iget-object v5, v0, Llo;->b:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v5, Landroid/view/View;

    .line 104
    .line 105
    filled-new-array {v5}, [Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    new-instance v14, Lc30;

    .line 110
    .line 111
    new-instance v15, Lnz2;

    .line 112
    .line 113
    invoke-direct {v15, v7}, Lnz2;-><init>(I)V

    .line 114
    .line 115
    .line 116
    invoke-direct {v14, v15, v5}, Lc30;-><init>(Loz2;[Landroid/view/View;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v13, v14}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 120
    .line 121
    .line 122
    iget-object v5, v0, Llo;->c:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v5, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 125
    .line 126
    iget-object v14, v0, Llo;->m:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v14, Lci2;

    .line 129
    .line 130
    iget-object v15, v14, Lci2;->j:Landroid/graphics/Rect;

    .line 131
    .line 132
    iget-object v9, v14, Lci2;->k:Landroid/graphics/Rect;

    .line 133
    .line 134
    if-eqz v15, :cond_4

    .line 135
    .line 136
    move/from16 v16, v8

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_4
    new-instance v15, Landroid/graphics/Rect;

    .line 140
    .line 141
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 146
    .line 147
    .line 148
    move-result v11

    .line 149
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    .line 150
    .line 151
    .line 152
    move-result v12

    .line 153
    move/from16 v16, v8

    .line 154
    .line 155
    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    invoke-direct {v15, v10, v11, v12, v8}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 160
    .line 161
    .line 162
    :goto_4
    if-eqz v9, :cond_5

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_5
    iget-object v8, v0, Llo;->o:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v8, Lcom/google/android/material/search/SearchBar;

    .line 168
    .line 169
    invoke-static {v5, v8}, Lvr1;->c(Landroid/view/View;Landroid/view/View;)Landroid/graphics/Rect;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    :goto_5
    new-instance v8, Landroid/graphics/Rect;

    .line 174
    .line 175
    invoke-direct {v8, v9}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 176
    .line 177
    .line 178
    iget-object v10, v0, Llo;->o:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v10, Lcom/google/android/material/search/SearchBar;

    .line 181
    .line 182
    invoke-virtual {v10}, Lcom/google/android/material/search/SearchBar;->getCornerSize()F

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    invoke-virtual {v5}, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;->getCornerRadius()F

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    invoke-virtual {v14}, Lci2;->c()I

    .line 191
    .line 192
    .line 193
    move-result v11

    .line 194
    int-to-float v11, v11

    .line 195
    invoke-static {v5, v11}, Ljava/lang/Math;->max(FF)F

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    new-instance v11, Li81;

    .line 200
    .line 201
    invoke-direct {v11, v8}, Li81;-><init>(Landroid/graphics/Rect;)V

    .line 202
    .line 203
    .line 204
    filled-new-array {v9, v15}, [Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    invoke-static {v11, v9}, Landroid/animation/ValueAnimator;->ofObject(Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ValueAnimator;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    new-instance v11, La84;

    .line 213
    .line 214
    invoke-direct {v11, v0, v10, v5, v8}, La84;-><init>(Llo;FFLandroid/graphics/Rect;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v9, v11}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 218
    .line 219
    .line 220
    if-eqz v1, :cond_6

    .line 221
    .line 222
    const-wide/16 v10, 0x12c

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_6
    const-wide/16 v10, 0xfa

    .line 226
    .line 227
    :goto_6
    invoke-virtual {v9, v10, v11}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 228
    .line 229
    .line 230
    sget-object v5, Lyd;->b:La61;

    .line 231
    .line 232
    invoke-static {v1, v5}, Ld24;->a(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    invoke-virtual {v9, v8}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 237
    .line 238
    .line 239
    new-array v8, v6, [F

    .line 240
    .line 241
    fill-array-data v8, :array_1

    .line 242
    .line 243
    .line 244
    invoke-static {v8}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 245
    .line 246
    .line 247
    move-result-object v8

    .line 248
    if-eqz v1, :cond_7

    .line 249
    .line 250
    const-wide/16 v10, 0x32

    .line 251
    .line 252
    goto :goto_7

    .line 253
    :cond_7
    const-wide/16 v10, 0x2a

    .line 254
    .line 255
    :goto_7
    invoke-virtual {v8, v10, v11}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 256
    .line 257
    .line 258
    if-eqz v1, :cond_8

    .line 259
    .line 260
    const-wide/16 v14, 0xfa

    .line 261
    .line 262
    goto :goto_8

    .line 263
    :cond_8
    const-wide/16 v14, 0x0

    .line 264
    .line 265
    :goto_8
    invoke-virtual {v8, v14, v15}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 266
    .line 267
    .line 268
    sget-object v12, Lyd;->a:Landroid/view/animation/LinearInterpolator;

    .line 269
    .line 270
    invoke-static {v1, v12}, Ld24;->a(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 271
    .line 272
    .line 273
    move-result-object v14

    .line 274
    invoke-virtual {v8, v14}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 275
    .line 276
    .line 277
    iget-object v14, v0, Llo;->j:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v14, Landroid/widget/ImageButton;

    .line 280
    .line 281
    new-array v15, v7, [Landroid/view/View;

    .line 282
    .line 283
    aput-object v14, v15, v16

    .line 284
    .line 285
    new-instance v14, Lc30;

    .line 286
    .line 287
    new-instance v10, Lnz2;

    .line 288
    .line 289
    invoke-direct {v10, v7}, Lnz2;-><init>(I)V

    .line 290
    .line 291
    .line 292
    invoke-direct {v14, v10, v15}, Lc30;-><init>(Loz2;[Landroid/view/View;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v8, v14}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 296
    .line 297
    .line 298
    iget-object v10, v0, Llo;->k:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v10, Landroid/view/View;

    .line 301
    .line 302
    iget-object v11, v0, Llo;->l:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v11, Lcom/google/android/material/internal/TouchObserverFrameLayout;

    .line 305
    .line 306
    new-instance v14, Landroid/animation/AnimatorSet;

    .line 307
    .line 308
    invoke-direct {v14}, Landroid/animation/AnimatorSet;-><init>()V

    .line 309
    .line 310
    .line 311
    new-array v15, v6, [F

    .line 312
    .line 313
    fill-array-data v15, :array_2

    .line 314
    .line 315
    .line 316
    invoke-static {v15}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 317
    .line 318
    .line 319
    move-result-object v15

    .line 320
    if-eqz v1, :cond_9

    .line 321
    .line 322
    const-wide/16 v18, 0x96

    .line 323
    .line 324
    :goto_9
    move/from16 v20, v7

    .line 325
    .line 326
    move-object/from16 v21, v8

    .line 327
    .line 328
    move-wide/from16 v7, v18

    .line 329
    .line 330
    goto :goto_a

    .line 331
    :cond_9
    const-wide/16 v18, 0x53

    .line 332
    .line 333
    goto :goto_9

    .line 334
    :goto_a
    invoke-virtual {v15, v7, v8}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 335
    .line 336
    .line 337
    if-eqz v1, :cond_a

    .line 338
    .line 339
    const-wide/16 v7, 0x4b

    .line 340
    .line 341
    goto :goto_b

    .line 342
    :cond_a
    const-wide/16 v7, 0x0

    .line 343
    .line 344
    :goto_b
    invoke-virtual {v15, v7, v8}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 345
    .line 346
    .line 347
    invoke-static {v1, v12}, Ld24;->a(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 348
    .line 349
    .line 350
    move-result-object v7

    .line 351
    invoke-virtual {v15, v7}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 352
    .line 353
    .line 354
    new-array v7, v6, [Landroid/view/View;

    .line 355
    .line 356
    aput-object v10, v7, v16

    .line 357
    .line 358
    aput-object v11, v7, v20

    .line 359
    .line 360
    new-instance v8, Lc30;

    .line 361
    .line 362
    new-instance v12, Lnz2;

    .line 363
    .line 364
    move/from16 v6, v20

    .line 365
    .line 366
    invoke-direct {v12, v6}, Lnz2;-><init>(I)V

    .line 367
    .line 368
    .line 369
    invoke-direct {v8, v12, v7}, Lc30;-><init>(Loz2;[Landroid/view/View;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v15, v8}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v11}, Landroid/view/View;->getHeight()I

    .line 376
    .line 377
    .line 378
    move-result v6

    .line 379
    int-to-float v6, v6

    .line 380
    const v7, 0x3d4cccd0    # 0.050000012f

    .line 381
    .line 382
    .line 383
    mul-float/2addr v6, v7

    .line 384
    const/high16 v7, 0x40000000    # 2.0f

    .line 385
    .line 386
    div-float/2addr v6, v7

    .line 387
    const/4 v7, 0x2

    .line 388
    new-array v8, v7, [F

    .line 389
    .line 390
    aput v6, v8, v16

    .line 391
    .line 392
    const/4 v6, 0x0

    .line 393
    const/16 v20, 0x1

    .line 394
    .line 395
    aput v6, v8, v20

    .line 396
    .line 397
    invoke-static {v8}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 398
    .line 399
    .line 400
    move-result-object v6

    .line 401
    if-eqz v1, :cond_b

    .line 402
    .line 403
    const-wide/16 v7, 0x12c

    .line 404
    .line 405
    goto :goto_c

    .line 406
    :cond_b
    const-wide/16 v7, 0xfa

    .line 407
    .line 408
    :goto_c
    invoke-virtual {v6, v7, v8}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 409
    .line 410
    .line 411
    invoke-static {v1, v5}, Ld24;->a(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 412
    .line 413
    .line 414
    move-result-object v7

    .line 415
    invoke-virtual {v6, v7}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 416
    .line 417
    .line 418
    filled-new-array {v10}, [Landroid/view/View;

    .line 419
    .line 420
    .line 421
    move-result-object v7

    .line 422
    invoke-static {v7}, Lc30;->a([Landroid/view/View;)Lc30;

    .line 423
    .line 424
    .line 425
    move-result-object v7

    .line 426
    invoke-virtual {v6, v7}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 427
    .line 428
    .line 429
    const/4 v7, 0x2

    .line 430
    new-array v8, v7, [F

    .line 431
    .line 432
    fill-array-data v8, :array_3

    .line 433
    .line 434
    .line 435
    invoke-static {v8}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 436
    .line 437
    .line 438
    move-result-object v7

    .line 439
    move-object v10, v9

    .line 440
    if-eqz v1, :cond_c

    .line 441
    .line 442
    const-wide/16 v8, 0x12c

    .line 443
    .line 444
    goto :goto_d

    .line 445
    :cond_c
    const-wide/16 v8, 0xfa

    .line 446
    .line 447
    :goto_d
    invoke-virtual {v7, v8, v9}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 448
    .line 449
    .line 450
    invoke-static {v1, v5}, Ld24;->a(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 451
    .line 452
    .line 453
    move-result-object v8

    .line 454
    invoke-virtual {v7, v8}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 455
    .line 456
    .line 457
    const/4 v8, 0x1

    .line 458
    new-array v9, v8, [Landroid/view/View;

    .line 459
    .line 460
    aput-object v11, v9, v16

    .line 461
    .line 462
    new-instance v11, Lc30;

    .line 463
    .line 464
    new-instance v12, Lnz2;

    .line 465
    .line 466
    move/from16 v20, v8

    .line 467
    .line 468
    move/from16 v8, v16

    .line 469
    .line 470
    invoke-direct {v12, v8}, Lnz2;-><init>(I)V

    .line 471
    .line 472
    .line 473
    invoke-direct {v11, v12, v9}, Lc30;-><init>(Loz2;[Landroid/view/View;)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v7, v11}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 477
    .line 478
    .line 479
    const/4 v9, 0x3

    .line 480
    new-array v11, v9, [Landroid/animation/Animator;

    .line 481
    .line 482
    aput-object v15, v11, v8

    .line 483
    .line 484
    aput-object v6, v11, v20

    .line 485
    .line 486
    const/4 v6, 0x2

    .line 487
    aput-object v7, v11, v6

    .line 488
    .line 489
    invoke-virtual {v14, v11}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 490
    .line 491
    .line 492
    iget-object v7, v0, Llo;->d:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v7, Landroid/widget/FrameLayout;

    .line 495
    .line 496
    invoke-virtual {v0, v1, v8, v7}, Llo;->i(ZZLandroid/view/View;)Landroid/animation/AnimatorSet;

    .line 497
    .line 498
    .line 499
    move-result-object v7

    .line 500
    invoke-virtual {v0, v1, v8, v2}, Llo;->i(ZZLandroid/view/View;)Landroid/animation/AnimatorSet;

    .line 501
    .line 502
    .line 503
    move-result-object v11

    .line 504
    new-array v8, v6, [F

    .line 505
    .line 506
    fill-array-data v8, :array_4

    .line 507
    .line 508
    .line 509
    invoke-static {v8}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 510
    .line 511
    .line 512
    move-result-object v6

    .line 513
    move v12, v9

    .line 514
    move-object v8, v10

    .line 515
    if-eqz v1, :cond_d

    .line 516
    .line 517
    const-wide/16 v9, 0x12c

    .line 518
    .line 519
    goto :goto_e

    .line 520
    :cond_d
    const-wide/16 v9, 0xfa

    .line 521
    .line 522
    :goto_e
    invoke-virtual {v6, v9, v10}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 523
    .line 524
    .line 525
    invoke-static {v1, v5}, Ld24;->a(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 526
    .line 527
    .line 528
    move-result-object v5

    .line 529
    invoke-virtual {v6, v5}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 530
    .line 531
    .line 532
    iget-boolean v3, v3, Lcom/google/android/material/search/SearchView;->J:Z

    .line 533
    .line 534
    if-eqz v3, :cond_e

    .line 535
    .line 536
    invoke-static {v2}, Lgb;->y(Landroidx/appcompat/widget/Toolbar;)Landroidx/appcompat/widget/ActionMenuView;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    iget-object v3, v0, Llo;->f:Ljava/lang/Object;

    .line 541
    .line 542
    check-cast v3, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 543
    .line 544
    invoke-static {v3}, Lgb;->y(Landroidx/appcompat/widget/Toolbar;)Landroidx/appcompat/widget/ActionMenuView;

    .line 545
    .line 546
    .line 547
    move-result-object v3

    .line 548
    new-instance v5, Lw51;

    .line 549
    .line 550
    invoke-direct {v5, v2, v3}, Lw51;-><init>(Landroidx/appcompat/widget/ActionMenuView;Landroidx/appcompat/widget/ActionMenuView;)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v6, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 554
    .line 555
    .line 556
    :cond_e
    iget-object v2, v0, Llo;->i:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast v2, Landroid/widget/EditText;

    .line 559
    .line 560
    const/4 v3, 0x1

    .line 561
    invoke-virtual {v0, v1, v3, v2}, Llo;->i(ZZLandroid/view/View;)Landroid/animation/AnimatorSet;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    iget-object v5, v0, Llo;->h:Ljava/lang/Object;

    .line 566
    .line 567
    check-cast v5, Landroid/widget/TextView;

    .line 568
    .line 569
    invoke-virtual {v0, v1, v3, v5}, Llo;->i(ZZLandroid/view/View;)Landroid/animation/AnimatorSet;

    .line 570
    .line 571
    .line 572
    move-result-object v5

    .line 573
    const/16 v9, 0x9

    .line 574
    .line 575
    new-array v9, v9, [Landroid/animation/Animator;

    .line 576
    .line 577
    const/16 v16, 0x0

    .line 578
    .line 579
    aput-object v13, v9, v16

    .line 580
    .line 581
    aput-object v8, v9, v3

    .line 582
    .line 583
    const/16 v17, 0x2

    .line 584
    .line 585
    aput-object v21, v9, v17

    .line 586
    .line 587
    aput-object v14, v9, v12

    .line 588
    .line 589
    const/4 v3, 0x4

    .line 590
    aput-object v7, v9, v3

    .line 591
    .line 592
    const/4 v3, 0x5

    .line 593
    aput-object v11, v9, v3

    .line 594
    .line 595
    const/4 v3, 0x6

    .line 596
    aput-object v6, v9, v3

    .line 597
    .line 598
    const/4 v3, 0x7

    .line 599
    aput-object v2, v9, v3

    .line 600
    .line 601
    const/16 v2, 0x8

    .line 602
    .line 603
    aput-object v5, v9, v2

    .line 604
    .line 605
    invoke-virtual {v4, v9}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 606
    .line 607
    .line 608
    new-instance v2, Ld61;

    .line 609
    .line 610
    invoke-direct {v2, v0, v1}, Ld61;-><init>(Llo;Z)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v4, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 614
    .line 615
    .line 616
    return-object v4

    .line 617
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    :array_2
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    :array_3
    .array-data 4
        0x3f733333    # 0.95f
        0x3f800000    # 1.0f
    .end array-data

    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    :array_4
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public e(Landroid/view/View;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Llo;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lcom/google/android/material/search/SearchBar;

    .line 14
    .line 15
    invoke-static {v0}, Lvr1;->z(Landroid/view/View;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Llo;->o:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lcom/google/android/material/search/SearchBar;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    sub-int/2addr p0, p1

    .line 30
    return p0

    .line 31
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object p0, p0, Llo;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Lcom/google/android/material/search/SearchView;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    sub-int/2addr v0, p0

    .line 44
    add-int/2addr v0, p1

    .line 45
    return v0
.end method

.method public f(Landroid/view/View;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Llo;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lcom/google/android/material/search/SearchBar;

    .line 14
    .line 15
    sget-object v1, Lj65;->a:Ljava/util/WeakHashMap;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object v1, p0, Llo;->o:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lcom/google/android/material/search/SearchBar;

    .line 24
    .line 25
    invoke-static {v1}, Lvr1;->z(Landroid/view/View;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iget-object v2, p0, Llo;->o:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Lcom/google/android/material/search/SearchBar;

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget-object p0, p0, Llo;->o:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lcom/google/android/material/search/SearchBar;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    sub-int/2addr v1, p0

    .line 48
    add-int/2addr v1, p1

    .line 49
    sub-int/2addr v1, v0

    .line 50
    return v1

    .line 51
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    sub-int/2addr p0, p1

    .line 56
    add-int/2addr p0, v0

    .line 57
    return p0
.end method

.method public g()I
    .locals 2

    .line 1
    iget-object v0, p0, Llo;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/FrameLayout;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    add-int/2addr v0, v1

    .line 14
    div-int/lit8 v0, v0, 0x2

    .line 15
    .line 16
    iget-object v1, p0, Llo;->o:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lcom/google/android/material/search/SearchBar;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget-object p0, p0, Llo;->o:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lcom/google/android/material/search/SearchBar;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    add-int/2addr p0, v1

    .line 33
    div-int/lit8 p0, p0, 0x2

    .line 34
    .line 35
    sub-int/2addr p0, v0

    .line 36
    return p0
.end method

.method public h(Z)Landroid/animation/AnimatorSet;
    .locals 6

    .line 1
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Llo;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    int-to-float v2, v2

    .line 15
    const/4 v3, 0x2

    .line 16
    new-array v3, v3, [F

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    aput v2, v3, v4

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    const/4 v5, 0x0

    .line 23
    aput v5, v3, v2

    .line 24
    .line 25
    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    new-array v5, v2, [Landroid/view/View;

    .line 30
    .line 31
    aput-object v1, v5, v4

    .line 32
    .line 33
    invoke-static {v5}, Lc30;->a([Landroid/view/View;)Lc30;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v3, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 38
    .line 39
    .line 40
    new-array v1, v2, [Landroid/animation/Animator;

    .line 41
    .line 42
    aput-object v3, v1, v4

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, Llo;->b(Landroid/animation/AnimatorSet;)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lyd;->b:La61;

    .line 51
    .line 52
    invoke-static {p1, p0}, Ld24;->a(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {v0, p0}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 57
    .line 58
    .line 59
    if-eqz p1, :cond_0

    .line 60
    .line 61
    const-wide/16 p0, 0x15e

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const-wide/16 p0, 0x12c

    .line 65
    .line 66
    :goto_0
    invoke-virtual {v0, p0, p1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 67
    .line 68
    .line 69
    return-object v0
.end method

.method public i(ZZLandroid/view/View;)Landroid/animation/AnimatorSet;
    .locals 8

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p3}, Llo;->f(Landroid/view/View;)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0, p3}, Llo;->e(Landroid/view/View;)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    :goto_0
    int-to-float p2, p2

    .line 13
    const/4 v0, 0x2

    .line 14
    new-array v1, v0, [F

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    aput p2, v1, v2

    .line 18
    .line 19
    const/4 p2, 0x1

    .line 20
    const/4 v3, 0x0

    .line 21
    aput v3, v1, p2

    .line 22
    .line 23
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    filled-new-array {p3}, [Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    new-instance v5, Lc30;

    .line 32
    .line 33
    new-instance v6, Lzr2;

    .line 34
    .line 35
    const/16 v7, 0x1c

    .line 36
    .line 37
    invoke-direct {v6, v7}, Lzr2;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v5, v6, v4}, Lc30;-><init>(Loz2;[Landroid/view/View;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Llo;->g()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    int-to-float p0, p0

    .line 51
    new-array v4, v0, [F

    .line 52
    .line 53
    aput p0, v4, v2

    .line 54
    .line 55
    aput v3, v4, p2

    .line 56
    .line 57
    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    filled-new-array {p3}, [Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    invoke-static {p3}, Lc30;->a([Landroid/view/View;)Lc30;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-virtual {p0, p3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 70
    .line 71
    .line 72
    new-instance p3, Landroid/animation/AnimatorSet;

    .line 73
    .line 74
    invoke-direct {p3}, Landroid/animation/AnimatorSet;-><init>()V

    .line 75
    .line 76
    .line 77
    new-array v0, v0, [Landroid/animation/Animator;

    .line 78
    .line 79
    aput-object v1, v0, v2

    .line 80
    .line 81
    aput-object p0, v0, p2

    .line 82
    .line 83
    invoke-virtual {p3, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 84
    .line 85
    .line 86
    if-eqz p1, :cond_1

    .line 87
    .line 88
    const-wide/16 v0, 0x12c

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    const-wide/16 v0, 0xfa

    .line 92
    .line 93
    :goto_1
    invoke-virtual {p3, v0, v1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 94
    .line 95
    .line 96
    sget-object p0, Lyd;->b:La61;

    .line 97
    .line 98
    invoke-static {p1, p0}, Ld24;->a(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {p3, p0}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 103
    .line 104
    .line 105
    return-object p3
.end method

.method public j()Landroid/animation/AnimatorSet;
    .locals 3

    .line 1
    iget-object v0, p0, Llo;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/material/search/SearchBar;

    .line 4
    .line 5
    iget-object v1, p0, Llo;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcom/google/android/material/search/SearchView;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/google/android/material/search/SearchView;->h()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/google/android/material/search/SearchView;->f()V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0, v2}, Llo;->d(Z)Landroid/animation/AnimatorSet;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Lc84;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-direct {v1, p0, v2}, Lc84;-><init>(Llo;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_1
    invoke-virtual {v1}, Lcom/google/android/material/search/SearchView;->h()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/google/android/material/search/SearchView;->f()V

    .line 45
    .line 46
    .line 47
    :cond_2
    invoke-virtual {p0, v2}, Llo;->h(Z)Landroid/animation/AnimatorSet;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    new-instance v1, Lc84;

    .line 52
    .line 53
    const/4 v2, 0x3

    .line 54
    invoke-direct {v1, p0, v2}, Lc84;-><init>(Llo;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 61
    .line 62
    .line 63
    return-object v0
.end method
