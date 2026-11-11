.class public final Lqf;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lbg;


# direct methods
.method public synthetic constructor <init>(Lbg;I)V
    .locals 0

    .line 1
    iput p2, p0, Lqf;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lqf;->o:Lbg;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lqf;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lqf;->o:Lbg;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, v1, Lbg;->I:Landroid/widget/PopupWindow;

    .line 10
    .line 11
    iget-object v3, v1, Lbg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 12
    .line 13
    const/16 v4, 0x37

    .line 14
    .line 15
    invoke-virtual {v0, v3, v4, v2, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 16
    .line 17
    .line 18
    iget-object v0, v1, Lbg;->K:Ls75;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Ls75;->b()V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-boolean v0, v1, Lbg;->M:Z

    .line 26
    .line 27
    const/high16 v3, 0x3f800000    # 1.0f

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, v1, Lbg;->N:Landroid/view/ViewGroup;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    iget-object v0, v1, Lbg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-virtual {v0, v4}, Landroid/view/View;->setAlpha(F)V

    .line 45
    .line 46
    .line 47
    iget-object v0, v1, Lbg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 48
    .line 49
    invoke-static {v0}, Lj65;->a(Landroid/view/View;)Ls75;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0, v3}, Ls75;->a(F)V

    .line 54
    .line 55
    .line 56
    iput-object v0, v1, Lbg;->K:Ls75;

    .line 57
    .line 58
    new-instance v1, Lsf;

    .line 59
    .line 60
    invoke-direct {v1, v2, p0}, Lsf;-><init>(ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ls75;->d(Lu75;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    iget-object p0, v1, Lbg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 68
    .line 69
    invoke-virtual {p0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 70
    .line 71
    .line 72
    iget-object p0, v1, Lbg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 73
    .line 74
    invoke-virtual {p0, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 75
    .line 76
    .line 77
    :goto_0
    return-void

    .line 78
    :pswitch_0
    iget p0, v1, Lbg;->m0:I

    .line 79
    .line 80
    and-int/lit8 p0, p0, 0x1

    .line 81
    .line 82
    if-eqz p0, :cond_2

    .line 83
    .line 84
    invoke-virtual {v1, v2}, Lbg;->A(I)V

    .line 85
    .line 86
    .line 87
    :cond_2
    iget p0, v1, Lbg;->m0:I

    .line 88
    .line 89
    and-int/lit16 p0, p0, 0x1000

    .line 90
    .line 91
    if-eqz p0, :cond_3

    .line 92
    .line 93
    const/16 p0, 0x6c

    .line 94
    .line 95
    invoke-virtual {v1, p0}, Lbg;->A(I)V

    .line 96
    .line 97
    .line 98
    :cond_3
    iput-boolean v2, v1, Lbg;->l0:Z

    .line 99
    .line 100
    iput v2, v1, Lbg;->m0:I

    .line 101
    .line 102
    return-void

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
