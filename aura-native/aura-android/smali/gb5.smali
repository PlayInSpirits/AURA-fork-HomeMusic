.class public Lgb5;
.super Leb5;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public s:Lvz1;

.field public t:Lvz1;

.field public u:Lvz1;


# direct methods
.method public constructor <init>(Lpb5;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Leb5;-><init>(Lpb5;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lgb5;->s:Lvz1;

    .line 6
    .line 7
    iput-object p1, p0, Lgb5;->t:Lvz1;

    .line 8
    .line 9
    iput-object p1, p0, Lgb5;->u:Lvz1;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public j()Lvz1;
    .locals 1

    .line 1
    iget-object v0, p0, Lgb5;->t:Lvz1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcb5;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Llm4;->x(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lvz1;->c(Landroid/graphics/Insets;)Lvz1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lgb5;->t:Lvz1;

    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, Lgb5;->t:Lvz1;

    .line 18
    .line 19
    return-object p0
.end method

.method public l()Lvz1;
    .locals 1

    .line 1
    iget-object v0, p0, Lgb5;->s:Lvz1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcb5;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lfb5;->b(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lvz1;->c(Landroid/graphics/Insets;)Lvz1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lgb5;->s:Lvz1;

    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, Lgb5;->s:Lvz1;

    .line 18
    .line 19
    return-object p0
.end method

.method public n()Lvz1;
    .locals 1

    .line 1
    iget-object v0, p0, Lgb5;->u:Lvz1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcb5;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Llm4;->b(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lvz1;->c(Landroid/graphics/Insets;)Lvz1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lgb5;->u:Lvz1;

    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, Lgb5;->u:Lvz1;

    .line 18
    .line 19
    return-object p0
.end method

.method public q(IIII)Lpb5;
    .locals 0

    .line 1
    iget-object p0, p0, Lcb5;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Llm4;->l(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-static {p0, p1}, Lpb5;->g(Landroid/view/WindowInsets;Landroid/view/View;)Lpb5;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public x(Lvz1;)V
    .locals 0

    .line 1
    return-void
.end method
