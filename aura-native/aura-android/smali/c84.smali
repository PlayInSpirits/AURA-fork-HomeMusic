.class public final Lc84;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Llo;


# direct methods
.method public synthetic constructor <init>(Llo;I)V
    .locals 0

    .line 1
    iput p2, p0, Lc84;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lc84;->b:Llo;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .line 1
    iget p1, p0, Lc84;->a:I

    .line 2
    .line 3
    sget-object v0, Ly74;->q:Ly74;

    .line 4
    .line 5
    sget-object v1, Ly74;->o:Ly74;

    .line 6
    .line 7
    const/16 v2, 0x8

    .line 8
    .line 9
    iget-object p0, p0, Lc84;->b:Llo;

    .line 10
    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Llo;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 17
    .line 18
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Llo;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lcom/google/android/material/search/SearchView;

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->h()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->f()V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p0, v1}, Lcom/google/android/material/search/SearchView;->setTransitionState(Ly74;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_0
    iget-object p1, p0, Llo;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lcom/google/android/material/search/SearchView;

    .line 41
    .line 42
    iget-object p0, p0, Llo;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lcom/google/android/material/search/SearchView;

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/google/android/material/search/SearchView;->h()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_1

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->j()V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {p0, v0}, Lcom/google/android/material/search/SearchView;->setTransitionState(Ly74;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_1
    iget-object p1, p0, Llo;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 62
    .line 63
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, Llo;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, Lcom/google/android/material/search/SearchView;

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->h()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_2

    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->f()V

    .line 77
    .line 78
    .line 79
    :cond_2
    invoke-virtual {p0, v1}, Lcom/google/android/material/search/SearchView;->setTransitionState(Ly74;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_2
    iget-object p1, p0, Llo;->a:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p1, Lcom/google/android/material/search/SearchView;

    .line 86
    .line 87
    iget-object p0, p0, Llo;->a:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, Lcom/google/android/material/search/SearchView;

    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/google/android/material/search/SearchView;->h()Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-nez p1, :cond_3

    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->j()V

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-virtual {p0, v0}, Lcom/google/android/material/search/SearchView;->setTransitionState(Ly74;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget p1, p0, Lc84;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    sget-object v1, Ly74;->n:Ly74;

    .line 5
    .line 6
    iget-object p0, p0, Lc84;->b:Llo;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Llo;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lcom/google/android/material/search/SearchView;

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lcom/google/android/material/search/SearchView;->setTransitionState(Ly74;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    iget-object p1, p0, Llo;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Llo;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Lcom/google/android/material/search/SearchView;

    .line 29
    .line 30
    sget-object p1, Ly74;->p:Ly74;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lcom/google/android/material/search/SearchView;->setTransitionState(Ly74;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_1
    iget-object p0, p0, Llo;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lcom/google/android/material/search/SearchView;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Lcom/google/android/material/search/SearchView;->setTransitionState(Ly74;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_2
    iget-object p1, p0, Llo;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Llo;->o:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Lcom/google/android/material/search/SearchBar;

    .line 54
    .line 55
    iget-object p1, p0, Lcom/google/android/material/search/SearchBar;->n0:Lhh3;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchBar;->getCenterView()Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-eqz p0, :cond_0

    .line 65
    .line 66
    const/4 p1, 0x0

    .line 67
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 68
    .line 69
    .line 70
    :cond_0
    return-void

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
