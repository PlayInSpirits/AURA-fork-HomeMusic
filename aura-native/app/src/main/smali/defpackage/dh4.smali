.class public final Ldefpackage/dh4;
.super Ldefpackage/jz4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final j:Ldefpackage/a13;


# direct methods
.method public constructor <init>(Ldefpackage/a13;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/dh4;->j:Ldefpackage/a13;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final l()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/dh4;->j:Ldefpackage/a13;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/a13;->c()V

    .line 4
    .line 5
    .line 6
    new-instance p0, Landroidx/compose/runtime/snapshots/SnapshotApplyConflictException;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p0
.end method
