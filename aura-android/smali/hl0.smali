.class public final Lhl0;
.super Lrz0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic n:Lzd3;

.field public final synthetic o:Ld34;


# direct methods
.method public constructor <init>(Lzd3;Ld34;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhl0;->n:Lzd3;

    .line 5
    .line 6
    iput-object p2, p0, Lhl0;->o:Ld34;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object p0, p0, Lhl0;->o:Ld34;

    .line 2
    .line 3
    sget-object v0, Lfu;->t:Low1;

    .line 4
    .line 5
    iput-object v0, p0, Ld34;->o:Ljava/lang/Object;

    .line 6
    .line 7
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lhl0;->n:Lzd3;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Low1;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Low1;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lhl0;->o:Ld34;

    .line 15
    .line 16
    iput-object v0, p0, Ld34;->o:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method
