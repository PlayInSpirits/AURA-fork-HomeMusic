.class public Ldefpackage/va5;
.super Ldefpackage/bb5;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final e:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Ldefpackage/bb5;-><init>()V

    .line 23
    invoke-static {}, Ldefpackage/ek2;->k()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, Ldefpackage/va5;->e:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(Ldefpackage/pb5;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ldefpackage/bb5;-><init>(Ldefpackage/pb5;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ldefpackage/pb5;->f()Landroid/view/WindowInsets;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Ldefpackage/lm4;->j(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {}, Ldefpackage/ek2;->k()Landroid/view/WindowInsets$Builder;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    iput-object p1, p0, Ldefpackage/va5;->e:Landroid/view/WindowInsets$Builder;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public b()Ldefpackage/pb5;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldefpackage/bb5;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/va5;->e:Landroid/view/WindowInsets$Builder;

    .line 5
    .line 6
    invoke-static {v0}, Ldefpackage/lm4;->k(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v0, v1}, Ldefpackage/pb5;->g(Landroid/view/WindowInsets;Landroid/view/View;)Ldefpackage/pb5;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v2, p0, Ldefpackage/bb5;->b:[Ldefpackage/vz1;

    .line 16
    .line 17
    iget-object v3, v0, Ldefpackage/pb5;->a:Ldefpackage/mb5;

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ldefpackage/mb5;->v([Ldefpackage/vz1;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v1}, Ldefpackage/mb5;->u(Ldefpackage/vr0;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Ldefpackage/bb5;->c:[[Landroid/graphics/Rect;

    .line 26
    .line 27
    invoke-virtual {v3, v1}, Ldefpackage/mb5;->z([[Landroid/graphics/Rect;)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Ldefpackage/bb5;->d:[[Landroid/graphics/Rect;

    .line 31
    .line 32
    invoke-virtual {v3, p0}, Ldefpackage/mb5;->A([[Landroid/graphics/Rect;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public e(Ldefpackage/vz1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/va5;->e:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Ldefpackage/vz1;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p0, p1}, Ldefpackage/lm4;->C(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public f(Ldefpackage/vz1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/va5;->e:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Ldefpackage/vz1;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p0, p1}, Ldefpackage/lm4;->A(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public g(Ldefpackage/vz1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/va5;->e:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Ldefpackage/vz1;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p0, p1}, Ldefpackage/lm4;->B(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public h(Ldefpackage/vz1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/va5;->e:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Ldefpackage/vz1;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p0, p1}, Ldefpackage/lm4;->w(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public i(Ldefpackage/vz1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/va5;->e:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Ldefpackage/vz1;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p0, p1}, Ldefpackage/lm4;->D(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
