.class public abstract Lip;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljb0;


# instance fields
.field public final a:Lxb0;


# direct methods
.method public constructor <init>(Lxb0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lip;->a:Lxb0;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Ldd5;)Z
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Ljb0;->c(Ldd5;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lip;->a:Lxb0;

    .line 8
    .line 9
    invoke-virtual {p1}, Lxb0;->a()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Lip;->e(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final b(Lmc0;)Lny;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Lp;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-direct {p1, p0, v0, v1}, Lp;-><init>(Ljava/lang/Object;Lvd0;I)V

    .line 9
    .line 10
    .line 11
    new-instance p0, Lny;

    .line 12
    .line 13
    const/4 v0, -0x2

    .line 14
    sget-object v1, Lwv;->n:Lwv;

    .line 15
    .line 16
    sget-object v2, Lq01;->n:Lq01;

    .line 17
    .line 18
    invoke-direct {p0, p1, v2, v0, v1}, Lny;-><init>(Lwf1;Lne0;ILwv;)V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public abstract d()I
.end method

.method public abstract e(Ljava/lang/Object;)Z
.end method
