.class public final Lgj4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/Iterator;
.implements Lx32;


# instance fields
.field public final n:Lig4;

.field public final o:I

.field public final p:Le35;

.field public final q:I

.field public r:I


# direct methods
.method public constructor <init>(Lig4;ILtg1;Le35;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgj4;->n:Lig4;

    .line 5
    .line 6
    iput p2, p0, Lgj4;->o:I

    .line 7
    .line 8
    iput-object p4, p0, Lgj4;->p:Le35;

    .line 9
    .line 10
    iget p1, p1, Lig4;->u:I

    .line 11
    .line 12
    iput p1, p0, Lgj4;->q:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public final remove()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
