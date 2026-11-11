.class public final Lvm0;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:Lxm0;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Z

.field public final synthetic d:Lpj4;

.field public final synthetic e:Ltm0;


# direct methods
.method public constructor <init>(Lxm0;Landroid/view/View;ZLpj4;Ltm0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvm0;->a:Lxm0;

    .line 2
    .line 3
    iput-object p2, p0, Lvm0;->b:Landroid/view/View;

    .line 4
    .line 5
    iput-boolean p3, p0, Lvm0;->c:Z

    .line 6
    .line 7
    iput-object p4, p0, Lvm0;->d:Lpj4;

    .line 8
    .line 9
    iput-object p5, p0, Lvm0;->e:Ltm0;

    .line 10
    .line 11
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lvm0;->a:Lxm0;

    .line 5
    .line 6
    iget-object p1, p1, Lxm0;->a:Landroid/view/ViewGroup;

    .line 7
    .line 8
    iget-object v0, p0, Lvm0;->b:Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iget-boolean p1, p0, Lvm0;->c:Z

    .line 14
    .line 15
    iget-object v1, p0, Lvm0;->d:Lpj4;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget p1, v1, Lpj4;->a:I

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {v0, p1}, Lf34;->a(Landroid/view/View;I)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object p0, p0, Lvm0;->e:Ltm0;

    .line 28
    .line 29
    invoke-virtual {p0}, Lb3;->d()V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x2

    .line 33
    invoke-static {p0}, Lld1;->I(I)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    new-instance p0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string p1, "Animator from operation "

    .line 42
    .line 43
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p1, " has ended."

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string p1, "FragmentManager"

    .line 59
    .line 60
    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method
