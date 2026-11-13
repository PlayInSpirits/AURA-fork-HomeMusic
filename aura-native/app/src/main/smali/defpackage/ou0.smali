.class public final Ldefpackage/ou0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/if1;


# instance fields
.field public final synthetic n:Ldefpackage/jx3;

.field public final synthetic o:Ldefpackage/pu0;

.field public final synthetic p:Ldefpackage/zg5;


# direct methods
.method public constructor <init>(Ldefpackage/jx3;Ldefpackage/pu0;Ldefpackage/zg5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/ou0;->n:Ldefpackage/jx3;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/ou0;->o:Ldefpackage/pu0;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/ou0;->p:Ldefpackage/zg5;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ldefpackage/rx4;

    .line 2
    .line 3
    move-object v0, p1

    .line 4
    check-cast v0, Ldefpackage/pu0;

    .line 5
    .line 6
    iget-object v1, p0, Ldefpackage/ou0;->o:Ldefpackage/pu0;

    .line 7
    .line 8
    invoke-static {v1}, Ldefpackage/j51;->P(Ldefpackage/eo0;)Ldefpackage/ub3;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ldefpackage/ra;

    .line 13
    .line 14
    invoke-virtual {v1}, Ldefpackage/ra;->getDragAndDropManager()Ldefpackage/nu0;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ldefpackage/qb;

    .line 19
    .line 20
    iget-object v1, v1, Ldefpackage/qb;->b:Ldefpackage/qi;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ldefpackage/qi;->contains(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    iget-object v1, p0, Ldefpackage/ou0;->p:Ldefpackage/zg5;

    .line 29
    .line 30
    invoke-static {v1}, Ldefpackage/su3;->u(Ldefpackage/zg5;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    invoke-static {v0, v1, v2}, Ldefpackage/ud3;->a(Ldefpackage/pu0;J)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    iget-object p0, p0, Ldefpackage/ou0;->n:Ldefpackage/jx3;

    .line 41
    .line 42
    iput-object p1, p0, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 43
    .line 44
    sget-object p0, Ldefpackage/qx4;->p:Ldefpackage/qx4;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_0
    sget-object p0, Ldefpackage/qx4;->n:Ldefpackage/qx4;

    .line 48
    .line 49
    return-object p0
.end method
