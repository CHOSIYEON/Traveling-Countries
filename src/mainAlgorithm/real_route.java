package mainAlgorithm;

public class real_route {

	public void all_route(int index, int count) {
		Demo Demo = new Demo();

		// Demo.cityNumber;
		int a, b, c, d, e, f, g, h, i, j;

		if (count == 3) {
			for (a = 0; a < Demo.route_num[index][0]; a++) {
				Demo.real_route[Demo.num2] = "";

				for (b = 0; b < Demo.route_num[index][1]; b++) {
					for (c = 0; c < Demo.route_num[index][2]; c++) {
						Demo.real_route[Demo.num2] = Integer.toString(a) + Integer.toString(b) + Integer.toString(c);

						Demo.branch(index, Demo.real_route[Demo.num2]);
						Demo.num2++;
					}
				}
			}
		} else if (count == 4) {

			for (a = 0; a < Demo.route_num[index][0]; a++) {
				Demo.real_route[Demo.num2] = "";

				for (b = 0; b < Demo.route_num[index][1]; b++) {
					for (c = 0; c < Demo.route_num[index][2]; c++)
						for (d = 0; d < Demo.route_num[index][3]; d++) {
							Demo.real_route[Demo.num2] = Integer.toString(a) + Integer.toString(b) + Integer.toString(c)
									+ Integer.toString(d);
							Demo.branch(index, Demo.real_route[Demo.num2]);
							Demo.num2++;
						}
				}

			}
		} else if (count == 5) {
			for (a = 0; a < Demo.route_num[index][0]; a++) {
				Demo.real_route[Demo.num2] = "";

				for (b = 0; b < Demo.route_num[index][1]; b++) {
					for (c = 0; c < Demo.route_num[index][2]; c++)
						for (d = 0; d < Demo.route_num[index][3]; d++) {
							for (e = 0; e < Demo.route_num[index][4]; e++) {
								Demo.real_route[Demo.num2] = Integer.toString(a) + Integer.toString(b)
										+ Integer.toString(c) + Integer.toString(d) + Integer.toString(e);
								Demo.branch(index, Demo.real_route[Demo.num2]);
								Demo.num2++;
							}

						}
				}

			}
		} else if (count == 6) {
			for (a = 0; a < Demo.route_num[index][0]; a++) {
				Demo.real_route[Demo.num2] = "";

				for (b = 0; b < Demo.route_num[index][1]; b++) {
					for (c = 0; c < Demo.route_num[index][2]; c++)
						for (d = 0; d < Demo.route_num[index][3]; d++) {
							for (e = 0; e < Demo.route_num[index][4]; e++) {
								for (f = 0; f < Demo.route_num[index][5]; f++) {
									Demo.real_route[Demo.num2] = Integer.toString(a) + Integer.toString(b)
											+ Integer.toString(c) + Integer.toString(d) + Integer.toString(e)
											+ Integer.toString(f);
									Demo.branch(index, Demo.real_route[Demo.num2]);
									Demo.num2++;
								}

							}

						}
				}

			}
		} else if (count == 7) {
			for (a = 0; a < Demo.route_num[index][0]; a++) {
				Demo.real_route[Demo.num2] = "";

				for (b = 0; b < Demo.route_num[index][1]; b++) {
					for (c = 0; c < Demo.route_num[index][2]; c++)
						for (d = 0; d < Demo.route_num[index][3]; d++) {
							for (e = 0; e < Demo.route_num[index][4]; e++) {
								for (f = 0; f < Demo.route_num[index][5]; f++) {
									for (g = 0; g < Demo.route_num[index][6]; g++) {
										Demo.real_route[Demo.num2] = Integer.toString(a) + Integer.toString(b)
												+ Integer.toString(c) + Integer.toString(d) + Integer.toString(e)
												+ Integer.toString(f) + Integer.toString(g);
										Demo.branch(index, Demo.real_route[Demo.num2]);
										Demo.num2++;
									}

								}

							}

						}
				}

			}
		} else if (count == 8) {

			for (a = 0; a < Demo.route_num[index][0]; a++) {
				Demo.real_route[Demo.num2] = "";

				for (b = 0; b < Demo.route_num[index][1]; b++) {
					for (c = 0; c < Demo.route_num[index][2]; c++)
						for (d = 0; d < Demo.route_num[index][3]; d++) {
							for (e = 0; e < Demo.route_num[index][4]; e++) {
								for (f = 0; f < Demo.route_num[index][5]; f++) {
									for (g = 0; g < Demo.route_num[index][6]; g++) {
										for (h = 0; h < Demo.route_num[index][7]; h++) {
											Demo.real_route[Demo.num2] = Integer.toString(a) + Integer.toString(b)
													+ Integer.toString(c) + Integer.toString(d) + Integer.toString(e)
													+ Integer.toString(f) + Integer.toString(g)+ Integer.toString(h);
											Demo.branch(index, Demo.real_route[Demo.num2]);
											Demo.num2++;
										}

									}

								}

							}

						}
				}

			}
		} else if (count == 9) {

			for (a = 0; a < Demo.route_num[index][0]; a++) {
				Demo.real_route[Demo.num2] = "";

				for (b = 0; b < Demo.route_num[index][1]; b++) {
					for (c = 0; c < Demo.route_num[index][2]; c++)
						for (d = 0; d < Demo.route_num[index][3]; d++) {
							for (e = 0; e < Demo.route_num[index][4]; e++) {
								for (f = 0; f < Demo.route_num[index][5]; f++) {
									for (g = 0; g < Demo.route_num[index][6]; g++) {
										for (h = 0; h < Demo.route_num[index][7]; h++) {
											for (i = 0; i < Demo.route_num[index][8]; i++) {
												Demo.real_route[Demo.num2] = Integer.toString(a) + Integer.toString(b)
														+ Integer.toString(c) + Integer.toString(d)
														+ Integer.toString(e) + Integer.toString(f)
														+ Integer.toString(g)+ Integer.toString(h)+ Integer.toString(i);
												Demo.branch(index, Demo.real_route[Demo.num2]);
												Demo.num2++;
											}

										}

									}

								}

							}

						}
				}

			}

		} else if (count == 10) {

			for (a = 0; a < Demo.route_num[index][0]; a++) {
				Demo.real_route[Demo.num2] = "";

				for (b = 0; b < Demo.route_num[index][1]; b++) {
					for (c = 0; c < Demo.route_num[index][2]; c++)
						for (d = 0; d < Demo.route_num[index][3]; d++) {
							for (e = 0; e < Demo.route_num[index][4]; e++) {
								for (f = 0; f < Demo.route_num[index][5]; f++) {
									for (g = 0; g < Demo.route_num[index][6]; g++) {
										for (h = 0; h < Demo.route_num[index][7]; h++) {
											for (i = 0; i < Demo.route_num[index][8]; i++) {
												for (j = 0; j < Demo.route_num[index][9]; j++) {
													Demo.real_route[Demo.num2] = Integer.toString(a)
															+ Integer.toString(b) + Integer.toString(c)
															+ Integer.toString(d) + Integer.toString(e)
															+ Integer.toString(f) + Integer.toString(g)+ Integer.toString(h)+ Integer.toString(i)
															+Integer.toString(j);
													Demo.branch(index, Demo.real_route[Demo.num2]);
													Demo.num2++;
												}

											}

										}

									}

								}

							}

						}
				}

			}

		}

	}

}
