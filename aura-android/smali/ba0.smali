.class public final Lba0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lyk;

.field public final c:Ljava/util/ArrayDeque;

.field public d:Lwa4;

.field public e:Lmi3;

.field public f:Z

.field public g:Lmi3;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lyk;Lwa4;Lmi3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lba0;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lba0;->b:Lyk;

    .line 7
    .line 8
    iput-object p3, p0, Lba0;->d:Lwa4;

    .line 9
    .line 10
    iput-object p4, p0, Lba0;->e:Lmi3;

    .line 11
    .line 12
    new-instance p1, Ljava/util/ArrayDeque;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lba0;->c:Ljava/util/ArrayDeque;

    .line 18
    .line 19
    sget-object p1, Lmi3;->b:Lmi3;

    .line 20
    .line 21
    iput-object p1, p0, Lba0;->g:Lmi3;

    .line 22
    .line 23
    return-void
.end method
