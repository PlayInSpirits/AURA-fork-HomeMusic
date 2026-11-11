.class public final Lu95;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final n:I

.field public final o:Lq95;


# direct methods
.method public constructor <init>(ILq95;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lu95;->n:I

    .line 5
    .line 6
    iput-object p2, p0, Lu95;->o:Lq95;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lu95;

    .line 2
    .line 3
    iget p0, p0, Lu95;->n:I

    .line 4
    .line 5
    iget p1, p1, Lu95;->n:I

    .line 6
    .line 7
    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
