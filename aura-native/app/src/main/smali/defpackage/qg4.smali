.class public final Ldefpackage/qg4;
.super Ldefpackage/fr;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final E:[I


# instance fields
.field public final C:Landroid/view/accessibility/AccessibilityManager;

.field public D:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const v0, 0x7f04049f

    .line 2
    .line 3
    .line 4
    const v1, 0x7f0404a1

    .line 5
    .line 6
    .line 7
    filled-new-array {v0, v1}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Ldefpackage/qg4;->E:[I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/google/android/material/snackbar/SnackbarContentLayout;Lcom/google/android/material/snackbar/SnackbarContentLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Ldefpackage/fr;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;Lcom/google/android/material/snackbar/SnackbarContentLayout;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const-string p2, "accessibility"

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    .line 15
    .line 16
    iput-object p1, p0, Ldefpackage/qg4;->C:Landroid/view/accessibility/AccessibilityManager;

    .line 17
    .line 18
    return-void
.end method

.method public static h(Landroid/view/View;Ljava/lang/CharSequence;I)Ldefpackage/qg4;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, v0

    .line 3
    :cond_0
    instance-of v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 4
    .line 5
    if-eqz v2, :cond_1

    .line 6
    .line 7
    check-cast p0, Landroid/view/ViewGroup;

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_1
    instance-of v2, p0, Landroid/widget/FrameLayout;

    .line 11
    .line 12
    if-eqz v2, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const v2, 0x1020002

    .line 19
    .line 20
    .line 21
    if-ne v1, v2, :cond_2

    .line 22
    .line 23
    check-cast p0, Landroid/view/ViewGroup;

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_2
    move-object v1, p0

    .line 27
    check-cast v1, Landroid/view/ViewGroup;

    .line 28
    .line 29
    :cond_3
    if-eqz p0, :cond_5

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    instance-of v2, p0, Landroid/view/View;

    .line 36
    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    check-cast p0, Landroid/view/View;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    move-object p0, v0

    .line 43
    :cond_5
    :goto_0
    if-nez p0, :cond_0

    .line 44
    .line 45
    move-object p0, v1

    .line 46
    :goto_1
    if-eqz p0, :cond_7

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    sget-object v2, Ldefpackage/qg4;->E:[I

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    const/4 v3, 0x0

    .line 63
    const/4 v4, -0x1

    .line 64
    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    const/4 v6, 0x1

    .line 69
    invoke-virtual {v2, v6, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 74
    .line 75
    .line 76
    if-eq v5, v4, :cond_6

    .line 77
    .line 78
    if-eq v6, v4, :cond_6

    .line 79
    .line 80
    const v2, 0x7f0d00f7

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_6
    const v2, 0x7f0d0031

    .line 85
    .line 86
    .line 87
    :goto_2
    invoke-virtual {v1, v2, p0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Lcom/google/android/material/snackbar/SnackbarContentLayout;

    .line 92
    .line 93
    new-instance v2, Ldefpackage/qg4;

    .line 94
    .line 95
    invoke-direct {v2, v0, p0, v1, v1}, Ldefpackage/qg4;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/google/android/material/snackbar/SnackbarContentLayout;Lcom/google/android/material/snackbar/SnackbarContentLayout;)V

    .line 96
    .line 97
    .line 98
    iget-object p0, v2, Ldefpackage/fr;->i:Ldefpackage/er;

    .line 99
    .line 100
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    check-cast p0, Lcom/google/android/material/snackbar/SnackbarContentLayout;

    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/google/android/material/snackbar/SnackbarContentLayout;->getMessageView()Landroid/widget/TextView;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    .line 112
    .line 113
    iput p2, v2, Ldefpackage/fr;->k:I

    .line 114
    .line 115
    return-object v2

    .line 116
    :cond_7
    const-string p0, "No suitable parent found from the given view. Please provide a valid view."

    .line 117
    .line 118
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-object v0
.end method


# virtual methods
.method public final i(ILandroid/view/View$OnClickListener;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/fr;->h:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Ldefpackage/fr;->i:Ldefpackage/er;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/google/android/material/snackbar/SnackbarContentLayout;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/material/snackbar/SnackbarContentLayout;->getActionView()Landroid/widget/Button;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    iput-boolean v2, p0, Ldefpackage/qg4;->D:Z

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    new-instance p1, Ldefpackage/j8;

    .line 36
    .line 37
    const/16 v1, 0x17

    .line 38
    .line 39
    invoke-direct {p1, v1, p0, p2}, Ldefpackage/j8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    const/16 p1, 0x8

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 53
    .line 54
    .line 55
    iput-boolean v1, p0, Ldefpackage/qg4;->D:Z

    .line 56
    .line 57
    return-void
.end method

.method public final j()V
    .locals 9

    .line 1
    invoke-static {}, Ldefpackage/na4;->z()Ldefpackage/na4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ldefpackage/qg4;->C:Landroid/view/accessibility/AccessibilityManager;

    .line 6
    .line 7
    iget v2, p0, Ldefpackage/fr;->k:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x4

    .line 11
    const/4 v5, -0x2

    .line 12
    if-ne v2, v5, :cond_0

    .line 13
    .line 14
    :goto_0
    move v2, v5

    .line 15
    goto :goto_2

    .line 16
    :cond_0
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    iget-boolean v7, p0, Ldefpackage/qg4;->D:Z

    .line 19
    .line 20
    const/16 v8, 0x1d

    .line 21
    .line 22
    if-lt v6, v8, :cond_2

    .line 23
    .line 24
    if-eqz v7, :cond_1

    .line 25
    .line 26
    move v5, v4

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v5, v3

    .line 29
    :goto_1
    or-int/lit8 v5, v5, 0x3

    .line 30
    .line 31
    invoke-static {v1, v2, v5}, Ldefpackage/ek2;->d(Landroid/view/accessibility/AccessibilityManager;II)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    if-eqz v7, :cond_3

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    :goto_2
    iget-object p0, p0, Ldefpackage/fr;->v:Ldefpackage/br;

    .line 46
    .line 47
    iget-object v1, v0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 48
    .line 49
    monitor-enter v1

    .line 50
    :try_start_0
    invoke-virtual {v0, p0}, Ldefpackage/na4;->G(Ldefpackage/br;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_4

    .line 55
    .line 56
    iget-object p0, v0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Ldefpackage/rg4;

    .line 59
    .line 60
    iput v2, p0, Ldefpackage/rg4;->b:I

    .line 61
    .line 62
    iget-object v2, v0, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Landroid/os/Handler;

    .line 65
    .line 66
    invoke-virtual {v2, p0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p0, v0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p0, Ldefpackage/rg4;

    .line 72
    .line 73
    invoke-virtual {v0, p0}, Ldefpackage/na4;->P(Ldefpackage/rg4;)V

    .line 74
    .line 75
    .line 76
    monitor-exit v1

    .line 77
    return-void

    .line 78
    :catchall_0
    move-exception p0

    .line 79
    goto :goto_4

    .line 80
    :cond_4
    iget-object v5, v0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v5, Ldefpackage/rg4;

    .line 83
    .line 84
    if-eqz v5, :cond_5

    .line 85
    .line 86
    iget-object v5, v5, Ldefpackage/rg4;->a:Ljava/lang/ref/WeakReference;

    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    if-ne v5, p0, :cond_5

    .line 93
    .line 94
    const/4 v3, 0x1

    .line 95
    :cond_5
    if-eqz v3, :cond_6

    .line 96
    .line 97
    iget-object p0, v0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p0, Ldefpackage/rg4;

    .line 100
    .line 101
    iput v2, p0, Ldefpackage/rg4;->b:I

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_6
    new-instance v3, Ldefpackage/rg4;

    .line 105
    .line 106
    invoke-direct {v3, v2, p0}, Ldefpackage/rg4;-><init>(ILdefpackage/br;)V

    .line 107
    .line 108
    .line 109
    iput-object v3, v0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 110
    .line 111
    :goto_3
    iget-object p0, v0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p0, Ldefpackage/rg4;

    .line 114
    .line 115
    if-eqz p0, :cond_7

    .line 116
    .line 117
    invoke-virtual {v0, p0, v4}, Ldefpackage/na4;->j(Ldefpackage/rg4;I)Z

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    if-eqz p0, :cond_7

    .line 122
    .line 123
    monitor-exit v1

    .line 124
    return-void

    .line 125
    :cond_7
    const/4 p0, 0x0

    .line 126
    iput-object p0, v0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 127
    .line 128
    invoke-virtual {v0}, Ldefpackage/na4;->Q()V

    .line 129
    .line 130
    .line 131
    monitor-exit v1

    .line 132
    return-void

    .line 133
    :goto_4
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    throw p0
.end method
