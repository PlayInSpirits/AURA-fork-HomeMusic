.class public Lib5;
.super Lgb5;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final v:Lpb5;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lhb5;->e()Landroid/view/WindowInsets;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v0, v1}, Lpb5;->g(Landroid/view/WindowInsets;Landroid/view/View;)Lpb5;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lib5;->v:Lpb5;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lpb5;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lgb5;-><init>(Lpb5;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public h(I)Lvz1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcb5;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lnb5;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p0, p1}, Lhb5;->c(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lvz1;->c(Landroid/graphics/Insets;)Lvz1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public i(I)Lvz1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcb5;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lnb5;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p0, p1}, Lxq2;->g(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lvz1;->c(Landroid/graphics/Insets;)Lvz1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public t(I)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcb5;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lnb5;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p0, p1}, Lhb5;->k(Landroid/view/WindowInsets;I)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
