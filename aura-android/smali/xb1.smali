.class public abstract Lxb1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lm84;


# instance fields
.field public final a:Lm84;


# direct methods
.method public constructor <init>(Lm84;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxb1;->a:Lm84;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxb1;->a:Lm84;

    .line 2
    .line 3
    invoke-interface {p0}, Lm84;->b()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final d()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxb1;->a:Lm84;

    .line 2
    .line 3
    invoke-interface {p0}, Lm84;->d()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public e(J)Ll84;
    .locals 0

    .line 1
    iget-object p0, p0, Lxb1;->a:Lm84;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lm84;->e(J)Ll84;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public g()J
    .locals 2

    .line 1
    iget-object p0, p0, Lxb1;->a:Lm84;

    .line 2
    .line 3
    invoke-interface {p0}, Lm84;->g()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method
