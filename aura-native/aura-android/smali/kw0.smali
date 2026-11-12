.class public final Lkw0;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILandroid/view/View;Ljava/lang/Object;)V
    .locals 0

    .line 12
    iput p1, p0, Lkw0;->a:I

    iput-object p3, p0, Lkw0;->b:Ljava/lang/Object;

    iput-object p2, p0, Lkw0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public constructor <init>(Ldx4;Loi;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lkw0;->a:I

    .line 3
    .line 4
    iput-object p1, p0, Lkw0;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lkw0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget v0, p0, Lkw0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p0, p0, Lkw0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lu75;

    .line 13
    .line 14
    invoke-interface {p0}, Lu75;->a()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget v0, p0, Lkw0;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lkw0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lkw0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lta5;

    .line 11
    .line 12
    const/high16 p1, 0x3f800000    # 1.0f

    .line 13
    .line 14
    iget-object v0, p0, Lta5;->a:Lsa5;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lsa5;->e(F)V

    .line 17
    .line 18
    .line 19
    check-cast v1, Landroid/view/View;

    .line 20
    .line 21
    invoke-static {v1, p0}, Lpa5;->f(Landroid/view/View;Lta5;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    check-cast p0, Lu75;

    .line 26
    .line 27
    invoke-interface {p0}, Lu75;->c()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_1
    check-cast p0, Loi;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lyd4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    check-cast v1, Ldx4;

    .line 37
    .line 38
    iget-object p0, v1, Ldx4;->z:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_2
    check-cast p0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 45
    .line 46
    check-cast v1, Lcom/google/android/material/navigation/NavigationView;

    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    invoke-virtual {p0, v1, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->c(Landroid/view/View;Z)V

    .line 50
    .line 51
    .line 52
    const/high16 p1, -0x67000000

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->setScrimColor(I)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget v0, p0, Lkw0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p0, p0, Lkw0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lu75;

    .line 13
    .line 14
    invoke-interface {p0}, Lu75;->b()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    iget-object p0, p0, Lkw0;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Ldx4;

    .line 21
    .line 22
    iget-object p0, p0, Ldx4;->z:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
