.class public final synthetic Ldefpackage/b64;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/w21;


# instance fields
.field public final synthetic n:Ljava/util/concurrent/Executor;

.field public final synthetic o:Ljava/util/List;

.field public final synthetic p:Ldefpackage/r90;

.field public final synthetic q:Landroidx/work/impl/WorkDatabase;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Ljava/util/List;Ldefpackage/r90;Landroidx/work/impl/WorkDatabase;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/b64;->n:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/b64;->o:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/b64;->p:Ldefpackage/r90;

    .line 9
    .line 10
    iput-object p4, p0, Ldefpackage/b64;->q:Landroidx/work/impl/WorkDatabase;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Ldefpackage/rc5;Z)V
    .locals 6

    .line 1
    new-instance v0, Ldefpackage/t6;

    .line 2
    .line 3
    const/16 v5, 0x1c

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/b64;->o:Ljava/util/List;

    .line 6
    .line 7
    iget-object v3, p0, Ldefpackage/b64;->p:Ldefpackage/r90;

    .line 8
    .line 9
    iget-object v4, p0, Ldefpackage/b64;->q:Landroidx/work/impl/WorkDatabase;

    .line 10
    .line 11
    move-object v2, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Ldefpackage/t6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Ldefpackage/b64;->n:Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
