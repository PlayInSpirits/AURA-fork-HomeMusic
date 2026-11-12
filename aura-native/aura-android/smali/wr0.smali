.class public final Lwr0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lvy3;


# instance fields
.field public final n:Lif1;

.field public o:Lxr0;


# direct methods
.method public constructor <init>(Lif1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwr0;->n:Lif1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lwr0;->o:Lxr0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lxr0;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lwr0;->o:Lxr0;

    .line 10
    .line 11
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lwr0;->n:Lif1;

    .line 2
    .line 3
    sget-object v1, Lbu;->b:Lyr0;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lxr0;

    .line 10
    .line 11
    iput-object v0, p0, Lwr0;->o:Lxr0;

    .line 12
    .line 13
    return-void
.end method
