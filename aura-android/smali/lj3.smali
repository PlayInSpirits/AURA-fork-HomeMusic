.class public final Llj3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Liw4;

.field public final b:I

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljw4;IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Ljw4;->a:Lyw1;

    .line 5
    .line 6
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Liw4;

    .line 11
    .line 12
    iput-object p1, p0, Llj3;->a:Liw4;

    .line 13
    .line 14
    iput p3, p0, Llj3;->b:I

    .line 15
    .line 16
    iput-object p4, p0, Llj3;->c:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method
