.class public final synthetic Ldefpackage/x83;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final synthetic n:Ldefpackage/ea2;

.field public final synthetic o:Ldefpackage/tl0;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/ea2;Ldefpackage/tl0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/x83;->n:Ldefpackage/ea2;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/x83;->o:Ldefpackage/tl0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/x83;->n:Ldefpackage/ea2;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/x83;->o:Ldefpackage/tl0;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ldefpackage/ea2;->f(Ldefpackage/aa2;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
