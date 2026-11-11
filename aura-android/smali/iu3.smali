.class public Liu3;
.super Lhd;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Lhh3;

.field public final d:Lk03;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lhd;-><init>(Landroid/app/Application;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lk03;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, v0}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Liu3;->d:Lk03;

    .line 11
    .line 12
    new-instance p1, Lhh3;

    .line 13
    .line 14
    const/16 v0, 0xa

    .line 15
    .line 16
    invoke-direct {p1, v0}, Lhh3;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Liu3;->c:Lhh3;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final c(Lle1;)Lk03;
    .locals 3

    .line 1
    iget-object v0, p0, Liu3;->c:Lhh3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhh3;->j()Lk03;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, Liu3;->d:Lk03;

    .line 8
    .line 9
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    new-instance v1, Lg7;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, v2}, Lg7;-><init>(Lk03;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, v1}, Lad2;->e(Lba2;La83;)V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method
