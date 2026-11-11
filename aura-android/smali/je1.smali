.class public final Lje1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:I

.field public b:Lkc1;

.field public c:Z

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Lr92;

.field public i:Lr92;


# direct methods
.method public constructor <init>(ILkc1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lje1;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lje1;->b:Lkc1;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lje1;->c:Z

    .line 10
    .line 11
    sget-object p1, Lr92;->r:Lr92;

    .line 12
    .line 13
    iput-object p1, p0, Lje1;->h:Lr92;

    .line 14
    .line 15
    iput-object p1, p0, Lje1;->i:Lr92;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(ILkc1;I)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput p1, p0, Lje1;->a:I

    .line 20
    iput-object p2, p0, Lje1;->b:Lkc1;

    const/4 p1, 0x1

    .line 21
    iput-boolean p1, p0, Lje1;->c:Z

    .line 22
    sget-object p1, Lr92;->r:Lr92;

    iput-object p1, p0, Lje1;->h:Lr92;

    .line 23
    iput-object p1, p0, Lje1;->i:Lr92;

    return-void
.end method
